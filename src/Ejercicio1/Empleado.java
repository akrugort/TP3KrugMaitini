package Ejercicio1;

public class Empleado {
	private String nombre;
	private int edad;
	
	public Empleado() {}
	public Empleado(String nombre, int edad) {
		this.setNombre(nombre);
		this.setEdad(edad);
	}
	
	
	
	public float calcularPago(){
		return 0.0f; 
	}	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		return nombre;  		 
	}
}
