/**
 * File to handle general script functions to process various actions across the
 * application.
 */
function changeStyle(elementId) {
	$('#menu>ul>li>a').removeClass('selected');
	sessionStorage.setItem('selectedItem', elementId);
}

function setStyle() {
	if(sessionStorage.getItem('selectedItem') != null){
		var elementId = sessionStorage.getItem('selectedItem');
		$('#menu>ul>li>a').removeClass('selected');
		$('#' + elementId).addClass('selected');
		sessionStorage.clear();
	}
}