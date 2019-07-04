package EejemploClases;

public class Principal {

	public static void main(String[] args) {
		Avioneta avioneta1 = new Avioneta(3, 2, "Si", 4);
		Avioneta avioneta2 = new Avioneta();
		
		Avion avion1 = new Avion(10, 2, 100, 150);
		Avion avion2 = new Avion();
		Globo_Aeroestatico globo1 = new Globo_Aeroestatico(0, 0, 4, 45);
		Globo_Aeroestatico globo2 = new Globo_Aeroestatico();
		
		avioneta2.ImprimirDatos();
		
			
	}

}
