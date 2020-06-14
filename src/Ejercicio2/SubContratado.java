package Ejercicio2;

public class SubContratado extends Empleado{

	private float   cantHoras;
	private float   precioHora;

	public SubContratado(){		
	}



	public SubContratado(String nombre, int edad, float cantHoras,float   precioHora) {
		super(nombre, edad);
		this.setCantHoras(cantHoras);
		this.setPrecioHora(precioHora);
	}

	@Override
	public float calcularPago() {
		return this.getPrecioHora() * this.getCantHoras();
	}


	public float getCantHoras() {

		return cantHoras;

	}

	public void setCantHoras(float cantHoras) {
		this.cantHoras = cantHoras;

	}

	public float getPrecioHora() {
		return precioHora;

	}

	public void setPrecioHora(float precioHora) {
		this.precioHora = precioHora;
	}

	//Extiende al comportamiento de la Super clase
	@Override
	public String toString() {
		return super.toString() + " gana: "+ this.calcularPago();  		 

	}
}
