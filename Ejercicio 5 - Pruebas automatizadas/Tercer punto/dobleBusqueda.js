var paginaPrincipalGoogle = require('./paginaPrincipalGoogle');
var paginaBusquedaGoogle = require('./paginaBusquedaGoogle'); 

describe('Realizar una búsqueda y, en seguida, una segunda búsqueda.',function(){
	it('Deberia realizar la busqueda en Google y una segunda.', function(){
		var primeraBusqueda = 'perro';
		var segundaBusqueda = 'gato';
		var urlPrimerBusqueda;
		var urlSegundaBusqueda;
		
		paginaPrincipalGoogle.getNavegador();

		paginaPrincipalGoogle.setBusqueda(primeraBusqueda);

		paginaPrincipalGoogle.hacerClick();

		urlPrimerBusqueda = browser.getCurrentUrl();

		paginaBusquedaGoogle.setBusqueda(segundaBusqueda);

		urlSegundaBusqueda = browser.getCurrentUrl();

		expect(urlPrimerBusqueda != urlSegundaBusqueda);
	})
})