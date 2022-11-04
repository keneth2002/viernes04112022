package viernes04112022;

public class Computadora {
  private Case elCase;
  private Monitor monitor;
  private TarjetaMadre tarjetaMadre;
public Computadora(Case elCase, Monitor monitor, TarjetaMadre tarjetaMadre) {
	super();
	this.elCase = elCase;
	this.monitor = monitor;
	this.tarjetaMadre = tarjetaMadre;
}
public void arrancarPC() {
	elCase.presionarBotonEncendido();
	dibujarLogo();
}
private void dibujarLogo() {
	monitor.dibujarPixelEn(1200, 50, "negro");
}





private Case getElCase() {
	return elCase;
}
public void setElCase(Case elCase) {
	this.elCase = elCase;
}
private Monitor getMonitor() {
	return monitor;
}
public void setMonitor(Monitor monitor) {
	this.monitor = monitor;
}
private TarjetaMadre getTarjetaMadre() {
	return tarjetaMadre;
}
public void setTarjetaMadre(TarjetaMadre tarjetaMadre) {
	this.tarjetaMadre = tarjetaMadre;
}
  
  
}
