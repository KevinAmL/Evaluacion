var paginaBusquedaGoogle = function(){

	var segundoResultadoSegundaPagina;

	browser.waitForAngularEnabled(false);

	this.setSegundoResultado = function(){
		segundoResultadoSegundaPagina = element(by.xpath("//div[@id='rso']/div[2]/div/div/div/a/h3"));
	}
	this.getSegundoResultado = function(){
		return segundoResultadoSegundaPagina;
	}

	this.hacerDelay = function(){
		browser.sleep(1000);
	}
}

module.exports = new paginaBusquedaGoogle();