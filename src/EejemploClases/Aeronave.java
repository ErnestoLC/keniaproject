package EejemploClases;

public abstract class Aeronave {
	
	protected int NoElises; //declaramos la variable 
	protected int NoAlas;
	protected int NoPasajeros;
	
	//Creamos el constructor vacío para crear un objeto sin datos de entrada
	public Aeronave() {
		
	}
	//Creamos el constructor para crear un objeto con datos de entrada
	public Aeronave(int NoElises,int NoAlas, int NoPasajeros) {
		super();
		this.NoElises=NoElises;
		this.NoAlas=NoAlas;
		this.NoPasajeros=NoPasajeros;
	}
	
	//metodos para imprimir los datos
	public void ImprimirDatos(){
		System.out.println("Número de elises: "+NoElises);
		System.out.println("Número de alas: "+NoAlas);
		System.out.println("Número de pasajeros: "+NoPasajeros);
	}
	
	//metodo set para insertar datos enteros en la variable NoElises
	public void SetNoElises(int noelises) {
		this.NoElises=noelises;
	}
	
	public void SetNoElises(String noelises) {
		this.NoElises=Integer.parseInt(noelises);
	}
	
	public void SetNoAlas(int noalas) {
		this.NoAlas=noalas;
	}
	
	public void SetNoAlas(String noalas) {
		this.NoAlas=Integer.parseInt(noalas);
	}
	
	//metodo set para insertar datos enteros en la variable NoPasajeros con un exception NumberFormatException
	public void SetNoPasajeros(int nopasajeros) {
		try {
			this.NoPasajeros=nopasajeros;
		} catch (NumberFormatException e) {
			this.NoPasajeros=0;
		}
	}
	
	public void SetNoPasajeros(String nopasajeros) {
		try {
			this.NoPasajeros=Integer.parseInt(nopasajeros);
		} catch (NumberFormatException e) {
			this.NoPasajeros=0;
		}
	}
	
	//metodo Get para obtener los datos de NoElises
	public int GetNoElises(){
		return NoElises;
	}
	public int GetNoAlas()	{
		return NoAlas;
	}
	public int GetNoPasajeros()	{
		return NoPasajeros;
	}
	
}
