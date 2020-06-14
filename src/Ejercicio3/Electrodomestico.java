package Ejercicio3;

public class Electrodomestico {
	private String marca;	
	private String modelo;
	private float voltaje;
	private boolean estado;
	private float precio;

	public Electrodomestico() {};
	public Electrodomestico(String marca, String modelo, float voltaje, boolean estado, float precio) {		
		this.marca = marca;
		this.modelo = modelo;
		this.voltaje = voltaje;
		this.estado = estado;
		this.precio = precio;
	}


	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public float getVoltaje() {
		return voltaje;
	}
	public void setVoltaje(float voltaje) {
		this.voltaje = voltaje;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return this.getMarca()+" modelo "+this.getModelo();
	}


}
