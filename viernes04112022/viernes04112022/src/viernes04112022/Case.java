package viernes04112022;

public class Case {
  private String modelo;
  private String fabricante;
  private String fuenteDepoder;
  private Dimensiones dimensiones;
public Case(String modelo, String fabricante, String fuenteDepoder, Dimensiones dimensiones) {
	super();
	this.modelo = modelo;
	this.fabricante = fabricante;
	this.fuenteDepoder = fuenteDepoder;
	this.dimensiones = dimensiones;
}
  public void presionarBotonEncendido() {
	  System.out.println("Boton de encendido presionado");
  }
public String getModelo() {
	return modelo;
}
public void setModelo(String modelo) {
	this.modelo = modelo;
}
public String getFabricante() {
	return fabricante;
}
public void setFabricante(String fabricante) {
	this.fabricante = fabricante;
}
public String getFuenteDepoder() {
	return fuenteDepoder;
}
public void setFuenteDepoder(String fuenteDepoder) {
	this.fuenteDepoder = fuenteDepoder;
}
public Dimensiones getDimensiones() {
	return dimensiones;
}
public void setDimensiones(Dimensiones dimensiones) {
	this.dimensiones = dimensiones;
}
  
}
