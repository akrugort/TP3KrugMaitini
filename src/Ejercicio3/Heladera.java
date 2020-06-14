package Ejercicio3;

public class Heladera extends Electrodomestico{

	private float capacidadLitros;
	private boolean noFrost;
	
	public Heladera() {};
	public Heladera(String marca, String modelo, float voltaje, boolean estado, float precio,float capacidadLitros,boolean noFrost) {
		super(marca, modelo, voltaje, estado, precio);
		this.setCapacidadLitros(capacidadLitros);
		this.setNoFrost(noFrost);
	}
	public float getCapacidadLitros() {
		return capacidadLitros;
	}
	public void setCapacidadLitros(float capacidadLitros) {
		this.capacidadLitros = capacidadLitros;
	}
	public boolean isNoFrost() {
		return noFrost;
	}
	
	private String isNF() {
		String NF ="";
		if(this.isNoFrost()) {
			NF="No Frost";
		}
		return NF;
	}
	public void setNoFrost(boolean noFrost) {
		this.noFrost = noFrost;
	}
	
	
	public String toString() {
		return "Heladera "+ super.toString()+", "+this.isNF()+", Capacidad "+this.getCapacidadLitros()+" Litros: $"+this.getPrecio();
	}
	
	
}
