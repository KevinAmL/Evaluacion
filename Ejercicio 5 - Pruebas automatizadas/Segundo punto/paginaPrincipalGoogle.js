var paginaPrincipal = function(){

	var paginaAcceder = 'https://www.google.com/'; 
	var inputBusqueda =  element(by.xpath("//input[@name='q']"));
	var botonConSuerte = element(by.xpath("//div[3]/center/input[2]"));

	browser.waitForAngularEnabled(false);

	this.getNavegador = function(){
		browser.get(paginaAcceder);
		this.hacerDelay();
	}

	this.getPaginaAcceder = function(){
		return paginaAcceder;
	}

	this.setBusqueda = function(busqueda){
		inputBusqueda.sendKeys(busqueda);
		this.hacerDelay();
		inputBusqueda.sendKeys(protractor.Key.ESCAPE);
		this.hacerDelay();
	}

	this.hacerClick = function(){
		this.hacerDelay();
		botonConSuerte.click();
		this.hacerDelay();
	}

	this.hacerDelay = function(){
		browser.sleep(2000);
	}
}

module.exports = new paginaPrincipal();