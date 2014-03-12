<div data-role="page">

	<div data-role="header" data-theme="d" data-position="inline">
		<h1>Scan Bar Code</h1>
	</div>

	<div data-role="content" data-theme="c">
		<div>
			<img width="320" height="240" src="about:blank" alt="" id="picture"
				style="display: none">
		</div>
		<div>
			<input id="Take-Picture" type="file" accept="image/*;capture=camera" />
			<p id="decodeError"></p>
			<input type="hidden" id="decodedValue">
		</div>
		<a href="#" data-role="button" data-rel="back" data-theme="c">Cancel</a>
		<script src="script/Decoder.js"></script>
	</div>
</div>