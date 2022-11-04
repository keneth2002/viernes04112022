package viernes04112022;

public class App {

	public static void main(String[] args) {
		Dimensiones dimensiones = new Dimensiones(20,20,5);
		Case cajon = new Case("220B","Dell","460",dimensiones);
		Monitor monitor = new Monitor("Beast de 27","Beast",27,new Resolucion(2540,1440));
		TarjetaMadre tarjetamadre = new TarjetaMadre ("BJ-200","Asus",4,6,"v2.44");
		
		 Computadora pc = new Computadora(cajon,monitor,tarjetamadre);
		// pc.getMonitor().dibujarPixelEn(1500, 1200, "rojo");
		// pc.getTarjetaMadre().cargarPrograma("Windows 10");
		// pc.getElCase().presionarBotonEncendido();
	pc.arrancarPC();
	}
     
}
