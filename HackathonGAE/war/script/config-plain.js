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