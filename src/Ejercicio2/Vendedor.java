package Ejercicio2;

public class Vendedor extends SubContratado {

	private float porcentaje;

	public Vendedor(String nombre, int edad, float cantHoras,float   precioHora, float porcentaje) {
		super(nombre, edad, cantHoras, precioHora);
		this.setPorcentaje(porcentaje);
	}
	
	
	public float calcularPago() {	
		float porcentaje = super.calcularPago() * (this.getPorcentaje()/100);
		return super.calcularPago() + porcentaje;
	}
	
	public float getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(float porcentaje) {
		this.porcentaje = porcentaje;
	}


	@Override
	public String toString() {
		return this.getNombre() + " gana: "+ this.calcularPago();
	}
}
