package Ejercicio3;

public class Licuadora extends Electrodomestico{
	private int potencia;
	private int velocidades;
	
	public Licuadora() {};
	public Licuadora(String marca, String modelo, float voltaje, boolean estado, float precio,int potencia,int velocidades) {
		super(marca, modelo, voltaje, estado, precio);
		this.setPotencia(potencia);
		this.setVelocidades(velocidades);
	}
	
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public int getVelocidades() {
		return velocidades;
	}
	public void setVelocidades(int velocidades) {
		this.velocidades = velocidades;
	}
	
	public String toString() {
		return "Licuadora "+ super.toString()+" Litros: $"+this.getPrecio();
	}
	
	
}
