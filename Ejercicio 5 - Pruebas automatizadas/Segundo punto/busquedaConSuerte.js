var paginaPrincipalGoogle = require('./paginaPrincipalGoogle.js');

describe('Realizar una búsqueda con el botón "Me siento con suerte".', function(){
	it('Busqueda me siento con suerte', function(){
		var busquedaRealizar = 'gatos';

		paginaPrincipalGoogle.getNavegador();
	
		paginaPrincipalGoogle.setBusqueda(busquedaRealizar);

		paginaPrincipalGoogle.hacerClick();

		expect(browser.getCurrentUrl != paginaPrincipalGoogle.getPaginaAcceder());
	})
});