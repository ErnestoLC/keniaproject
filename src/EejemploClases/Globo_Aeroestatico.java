package EejemploClases;

public class Globo_Aeroestatico extends Aeronave{
	
	private int TamanoGlobo;
	
	public Globo_Aeroestatico() {
		
	}
	
	public Globo_Aeroestatico(int NoElises,int NoAlas, int NoPasajeros, int TamanoGlobo) {
		super(NoElises, NoAlas, NoPasajeros);
		this.TamanoGlobo=TamanoGlobo;
	}
	
	public void ImprimirDatos(){
		System.out.println("Número de elises: "+NoElises);
		System.out.println("Número de alas: "+NoAlas);
		System.out.println("Número de pasajeros: "+NoPasajeros);
		System.out.println("Tamaño del globo: "+TamanoGlobo+" metros cuadrados");
	}
	
	public void SetTamanoGlobo(int tamanoglobo) {
		this.TamanoGlobo=tamanoglobo;
	}
	public void SetTamanoGlobo(String tamanoglobo) {
		this.TamanoGlobo=Integer.parseInt(tamanoglobo);
	}
	
	public int GetTamanoGlobo(){
		return TamanoGlobo;
	}
}
