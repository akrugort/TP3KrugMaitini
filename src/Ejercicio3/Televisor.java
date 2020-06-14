package Ejercicio3;

public class Televisor extends Electrodomestico {

	private float dimension;
	private boolean smart;	
	
	
	public Televisor() {};
	public Televisor(String marca, String modelo, float voltaje, boolean estado, float precio, float dimension,boolean smart) {
		super(marca, modelo, voltaje, estado, precio);
		this.setDimension(dimension);
		this.setSmart(smart);		
	}
	
	
	public float getDimension() {
		return dimension;
	}
	public void setDimension(float dimension) {
		this.dimension = dimension;
	}
	public boolean isSmart() {
		return smart;
	}
	public void setSmart(boolean smart) {
		this.smart = smart;
	}
	
	
	public String toString() {
		return "Televisor "+ super.toString()+" Litros: $"+this.getPrecio();
	}
	
	
}
