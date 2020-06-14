package Ejercicio3;

public class Lavarropa extends Electrodomestico{

	private int cargaMax;
	private TipoLavarropas tipo;
		
	public Lavarropa(String marca, String modelo, float voltaje, boolean estado, float precio,int cargaMax,TipoLavarropas tipo) {
		super(marca, modelo, voltaje, estado, precio);
		this.setCargaMax(cargaMax);
		this.setTipo(tipo);
	}
	
	
	public int getCargaMax() {
		return cargaMax;
	}
	public void setCargaMax(int cargaMax) {
		this.cargaMax = cargaMax;
	}
	public TipoLavarropas getTipo() {
		return tipo;
	}
	public void setTipo(TipoLavarropas tipo) {
		this.tipo = tipo;
	}
	
	public String toString() {
		return "Lavarropa "+ super.toString()+" Litros: $"+this.getPrecio();
	}
	
	
}
