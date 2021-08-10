var paginaPrincipal = function(){

	var paginaAcceder = 'https://www.google.com/'; 
	var inputBusqueda =  element(by.xpath("//input[@name='q']"));
	var botonBuscar = element(by.xpath("//input[@name='btnK']"));

	browser.waitForAngularEnabled(false);

	this.getNavegador = function(){
		browser.get(paginaAcceder);
		this.hacerDelay();
	}

	this.getPaginaAcceder = function(){
		return paginaAcceder;
	}

	this.setBusqueda = function(busqueda){
		inputBusqueda.sendKeys(protractor.Key.ESCAPE);
		this.hacerDelay()
		inputBusqueda.sendKeys(busqueda);
		this.hacerDelay();
	}

	this.hacerClick = function(){
		botonBuscar.click();
		this.hacerDelay();
	}

	this.hacerDelay = function(){
		browser.sleep(1000);
	}
}

module.exports = new paginaPrincipal();