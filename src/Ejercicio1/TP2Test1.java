package Ejercicio1;

public class TP2Test1 {

	public static void main(String[] args) {
		Empleado asalariado = new Asalariado("Jose", 30,  10000);
		Empleado subContratado = new SubContratado("Carlos", 23, 50, 100);
		
		System.out.println("Asalariado: "+asalariado.toString() );
		System.out.println("SubContratado: " + subContratado.toString());
		
	}

}
