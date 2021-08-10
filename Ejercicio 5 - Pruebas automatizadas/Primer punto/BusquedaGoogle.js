var paginaPrincipalGoogle = require('./paginaPrincipalGoogle');
describe('Realizar una búsqueda con el botón Buscar con Google. Validar el cambio de Página.',function(){
	it('Deberia realizar la busqueda en Google y esperar el cambio de página.', function(){
		var busquedaARealizar = 'perro';
		
		paginaPrincipalGoogle.getNavegador();
		
		paginaPrincipalGoogle.hacerDelay();

		paginaPrincipalGoogle.setBusqueda(busquedaARealizar.toString());

		paginaPrincipalGoogle.hacerDelay();

		paginaPrincipalGoogle.hacerClick();

		paginaPrincipalGoogle.hacerDelay();

		expect(browser.getCurrentUrl() != paginaPrincipalGoogle.getPaginaAcceder());
	})
})