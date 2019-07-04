package EejemploClases;

public  class Avion extends Aeronave{
	
	private int PesoCarga;
	
	public Avion() {
		
	}
	
	public Avion(int NoElises,int NoAlas, int NoPasajeros,int PesoCarga) {
		super(NoElises, NoAlas, NoPasajeros);
		this.PesoCarga=PesoCarga;
	}
	
	public void ImprimirDatos(){
		System.out.println("N�mero de elises: "+NoElises);
		System.out.println("N�mero de alas: "+NoAlas);
		System.out.println("N�mero de pasajeros: "+NoPasajeros);
		System.out.println("Peso de la carga: "+PesoCarga+" Kgm");
	}
	
	public void SetPesoCarga(int pesocarga) {
		this.PesoCarga=pesocarga;
	}
	public void SetPesoCarga(String pesocarga) {
		this.PesoCarga=Integer.parseInt(pesocarga);
	}
	
	public int GetPesoCarga(){
		return PesoCarga;
	}	
	
}
