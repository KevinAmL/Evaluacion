var paginaBusquedaGoogle = function(){

	var segundoResultadoSegundaPagina;
	var botonTabImagenes = element(by.xpath("//a[contains(text(),'Imágenes')]"));
	var imagenAbrir = element(by.xpath("//div[2]/a/div/img")); //El numero de la llave del div se refiere a la imagen a elegir
	var cuadroImagen;
	var botonCerrar = element(by.css('div.ggjbN > svg > path')) //Identificador del botón X para cerrar el cuadro

	browser.waitForAngularEnabled(false);

	this.abrirTabImagen = function(){
		botonTabImagenes.click();
		this.hacerDelay
	}

	this.abrirImagen = function(){
		imagenAbrir.click();
		this.hacerDelay();
	}

	
	this.cuadroAbierto = function(){
		try{
			cuadroImagen = element(by.xpath("//div[@id='Sva75c']")) // Se identifica el cuadro donde esta la imagen
			if(cuadroImagen.isVisible()){
				console.log("true");
				return true;
			}
		}
		catch(Exception){
			console.log("false");
			return false;
		}
	}

	this.cerrarCuadro = function(){
		botonCerrar.click();
		this.hacerDelay();
	}
	

	this.hacerDelay = function(){
		browser.sleep(2000);
	}
}

module.exports = new paginaBusquedaGoogle();