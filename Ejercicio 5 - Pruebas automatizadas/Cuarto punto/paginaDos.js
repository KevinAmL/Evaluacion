var paginaPrincipalGoogle = require('./paginaPrincipalGoogle');
var paginaBusquedaGoogle = require('./paginaBusquedaGoogle'); 

describe('Realizar una búsqueda y cambiar de página de resultados y validar que efectivamente sea una página con resultados diferentes.',function(){
	it('Deberia realizar la busqueda en Google y buscar en la segunda pagina de resultados.', function(){
		var busqueda = 'perro';
		
		paginaPrincipalGoogle.getNavegador();

		paginaPrincipalGoogle.setBusqueda(busqueda);

		paginaPrincipalGoogle.hacerClick();

		paginaPrincipalGoogle.setPrimerResultado();

		paginaPrincipalGoogle.botonSiguiente();

		paginaBusquedaGoogle.setSegundoResultado();

		expect(paginaPrincipalGoogle.getPrimerResultado() != paginaBusquedaGoogle.getSegundoResultado());
	})
})