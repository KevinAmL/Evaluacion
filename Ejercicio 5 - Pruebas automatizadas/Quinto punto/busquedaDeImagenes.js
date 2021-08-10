var paginaPrincipalGoogle = require('./paginaPrincipalGoogle');
var paginaBusquedaGoogle = require('./paginaBusquedaGoogle'); 

describe('Realizar una búsqueda, seleccionar la pestaña de imágenes, seleccionar una imagen de los resultados, validar que se muestre la ventana de visualización de imagen, presionar el botón X y validar que se haya cerrado.',function(){
	it('Deberia realizar la busqueda en Google, cambiar a la tab Imágenes, abrir la imagen y cerar el cuadro, al final validando que se haya cerrado el cuadro.', function(){
		var busqueda = 'perro';
		
		paginaPrincipalGoogle.getNavegador();  //Abre y obtiene la pagina para el navegador

		paginaPrincipalGoogle.setBusqueda(busqueda); //Ubica y pone en en input de la busqueda el contenido a buscar

		paginaPrincipalGoogle.hacerClick(); //Ubica el botón y le hace click

		paginaBusquedaGoogle.abrirTabImagen(); //Ubica la Tab imagen en la pantalla y le hace click

		paginaBusquedaGoogle.abrirImagen(); //Ubica una imagen y le hace click para abrirla y verla mejor

		paginaBusquedaGoogle.cerrarCuadro(); //Cierra el cuadro de la imagen 

		expect(element(by.xpath("//div[@id='Sva75c']")).isDisplayed()).toBe(false); //Resultado esperado que el identificador del cuadro
		//y al buscarlo sea una respuesta falsa
	})
})