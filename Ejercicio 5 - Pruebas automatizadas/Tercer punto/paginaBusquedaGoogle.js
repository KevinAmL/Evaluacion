var paginaBusquedaGoogle = function(){

	var inputBusqueda =  element(by.xpath("//input[@name='q']"));

	browser.waitForAngularEnabled(false);

	this.setBusqueda = function(busqueda){
		inputBusqueda.clear();
		this.hacerDelay();
		inputBusqueda.sendKeys(busqueda);
		this.hacerDelay();
		inputBusqueda.sendKeys(protractor.Key.ENTER);
		this.hacerDelay();
	}

	this.hacerDelay = function(){
		browser.sleep(1000);
	}
}

module.exports = new paginaBusquedaGoogle();