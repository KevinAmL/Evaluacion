var paginaPrincipal = function(){

	var paginaAcceder = 'https://www.google.com/'; 
	var inputBusqueda =  element(by.xpath("//input[@name='q']"));
	var botonBuscar = element(by.xpath("//input[@name='btnK']"));
	var botonDeListaResultados;
	var spanBusqueda;

	browser.waitForAngularEnabled(false);

	this.getNavegador = function(){
		browser.get(paginaAcceder);
	}

	this.getPaginaAcceder = function(){
		return paginaAcceder;
	}

	this.setBusqueda = function(busqueda){
		inputBusqueda.sendKeys(busqueda);
	}

	this.hacerClick = function(textoSpan){
		spanBusqueda = element(by.xpath("//ul/li[1]/div/div[2]/div[2]"));
		spanBusqueda.click();
	}

	this.hacerDelay = function(){
		browser.sleep(1000);
	}
}

module.exports = new paginaPrincipal();