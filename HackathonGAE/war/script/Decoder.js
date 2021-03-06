/**
 * File to invoke the barcode decoder-worker. 
 */
var takePicture = document.querySelector("#Take-Picture"), showPicture = document
		.querySelector("#picture");
Result = document.querySelector("#decodedValue");
DecodeError = document.querySelector("#decodeError");
Canvas = document.createElement("canvas");
Canvas.width = 640;
Canvas.height = 480;
var resultArray = [];
ctx = Canvas.getContext("2d");
var workerCount = 0;
function receiveMessage(e) {
	if (e.data.success === "log") {
		console.log(e.data.result);
		return;
	}
	workerCount--;
	if (e.data.success) {
		var tempArray = e.data.result;
		for ( var i = 0; i < tempArray.length; i++) {
			if (resultArray.indexOf(tempArray[i]) == -1) {
				resultArray.push(tempArray[i]);
			}
		}
		Result.value = resultArray[0];
		location.href = "home.hck?barCode=" + resultArray[0];
	} else {
		if (resultArray.length === 0 && workerCount === 0) {
			DecodeError.innerHTML = "Sorry, the captured image cannot be decoded. Please try again."
			Result.value = "Sorry, the captured image cannot be decoded. Please try again.";
		}
	}
}
var DecodeWorker = new Worker("script/DecoderWorker.js");
var RightWorker = new Worker("script/DecoderWorker.js");
var LeftWorker = new Worker("script/DecoderWorker.js");
var FlipWorker = new Worker("script/DecoderWorker.js");
DecodeWorker.onmessage = receiveMessage;
RightWorker.onmessage = receiveMessage;
LeftWorker.onmessage = receiveMessage;
FlipWorker.onmessage = receiveMessage;
if (takePicture && showPicture) {
	takePicture.onchange = function(event) {
		var files = event.target.files
		if (files && files.length > 0) {
			file = files[0];
			try {
				var URL = window.URL || window.webkitURL;
				var imgURL = URL.createObjectURL(file);
				showPicture.style.display = "block";
				showPicture.src = imgURL;
				URL.revokeObjectURL(imgURL);
				DecodeBar()
			} catch (e) {
				try {
					var fileReader = new FileReader();
					fileReader.onload = function(event) {
						showPicture.src = event.target.result;
					};
					fileReader.readAsDataURL(file);
					DecodeBar()
				} catch (e) {
					DecodeError.innerHTML = "Sorry, your browser does not support this feature.";
					Result.value = "Sorry, your browser does not support this feature.";
				}
			}
		}
	};
}
function DecodeBar() {
	showPicture.onload = function() {
		ctx.drawImage(showPicture, 0, 0, Canvas.width, Canvas.height);
		resultArray = [];
		workerCount = 4;
		Result.innerHTML = "";
		DecodeWorker.postMessage({
			pixels : ctx.getImageData(0, 0, Canvas.width, Canvas.height).data,
			width : Canvas.width,
			height : Canvas.height,
			cmd : "normal"
		});
		RightWorker.postMessage({
			pixels : ctx.getImageData(0, 0, Canvas.width, Canvas.height).data,
			width : Canvas.width,
			height : Canvas.height,
			cmd : "right"
		});
		LeftWorker.postMessage({
			pixels : ctx.getImageData(0, 0, Canvas.width, Canvas.height).data,
			width : Canvas.width,
			height : Canvas.height,
			cmd : "left"
		});
		FlipWorker.postMessage({
			pixels : ctx.getImageData(0, 0, Canvas.width, Canvas.height).data,
			width : Canvas.width,
			height : Canvas.height,
			cmd : "flip"
		});
	}
}