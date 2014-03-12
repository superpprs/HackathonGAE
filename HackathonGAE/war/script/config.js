window._skel_config = {
	prefix: 'style/style',
	preloadStyleSheets: true,
	resetCSS: false,
	boxModel: 'border',
	grid: { gutters: 30 },
	breakpoints: {
		wide: { range: '1200-', containers: 1140, grid: { gutters: 50 } },
		narrow: { range: '481-1199', containers: 960 },
		narrower: { range: '481-960', containers: 'fluid' },
		mobile: { range: '-480', containers: 'fluid', lockViewport: true, grid: { collapse: true, gutters: 20 } }
	}
};

window._skel_panels_config = {
	panels: {
		leftPanel: {
			breakpoints: 'narrower,mobile',
			position: 'left',
			size: 250,
			html: '<div data-action="moveCell" data-args="left-sidebar,content"></div>'
		}
	},
	overlays: {
		titleBar: {
			breakpoints: 'mobile',
			position: 'top-center',
			width: '100%',
			height: 44,
			html: '<div data-action="copyHTML" data-args="title"></div>'
		},
		leftPanelButton: {
			breakpoints: 'narrower,mobile',
			position: 'top-left',
			width: 80,
			height: 60,
			html: '<div class="toggle icon-angle-right" data-action="togglePanel" data-args="leftPanel"></div>'
		}
	}
};