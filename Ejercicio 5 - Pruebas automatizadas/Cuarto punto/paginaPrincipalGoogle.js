var paginaPrincipal = function(){

	var paginaAcceder = 'https://www.google.com/'; 
	var inputBusqueda =  element(by.xpath("//input[@name='q']"));
	var botonBuscar = element(by.xpath("//input[@name='btnK']"));
	var botonSiguiente = element(by.xpath("//a[@id='pnnext']/span[2]"));
	var primerResultadoPrimerPagina;

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

	this.botonSiguiente = function(){
		browser.actions().mouseMove(botonSiguiente).perform();
		this.hacerDelay();
		botonSiguiente.click();
		this.hacerDelay();
	}

	this.hacerDelay = function(){
		browser.sleep(1000);
	}

	this.setPrimerResultado = function(){
		primerResultadoPrimerPagina = element(by.xpath("//div[@id='rso']/div[2]/div/div/div/a/h3"));
	}
	this.getPrimerResultado = function(){
		return primerResultadoPrimerPagina;
	}
}

module.exports = new paginaPrincipal();