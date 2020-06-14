package Ejercicio2;

public class Asalariado extends Empleado{

	private  float   sueldo;

	public Asalariado() {	}

	public Asalariado(String nombre, int edad, float sueldo) {
		super(nombre, edad);
		this.setSueldo(sueldo);
	}

	@Override
	public float calcularPago() {
		return this.getSueldo();
	}

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

	//Extiende al comportamiento de la Super clase
	@Override
	public String toString() {
		return super.toString() + " gana: " + this.calcularPago();  		 
	}




}
