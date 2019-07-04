package EejemploClases;

public class Avioneta extends Aeronave{
	
	private String AterrisajeAgua;
	
	public Avioneta() {
			
	}
	
	public Avioneta(int NoElises,int NoAlas,String AterrisajeAgua, int NoPasajeros) {
		super(NoElises, NoAlas, NoPasajeros);
		this.AterrisajeAgua=AterrisajeAgua;		
	}
	
	public void ImprimirDatos(){
		System.out.println("Número de elises: "+NoElises);
		System.out.println("Número de alas: "+NoAlas);
		System.out.println("Número de pasajeros: "+NoPasajeros);
		System.out.println("Puede Aterrisar en el agua: "+AterrisajeAgua);
	}
	
	public void SetAterrisajeAgua(String aterrisajeagua) {
		this.AterrisajeAgua=aterrisajeagua;
	}
	
	public String GetAterrisajeAgua(){
		return AterrisajeAgua;
	}

}
