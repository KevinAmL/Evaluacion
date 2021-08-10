exports.config = {
	seleniumAddress: 'http://localhost:4444/wd/hub',
	specs: ['busquedaConSuerte.js'],

	'goog:chromeOptions': {
      w3c: false
    },
};