package Ejercicio3;

public class Program {

	public static void main(String[] args) {

		Deposito deposito = new Deposito();
		boolean ingresarProducto = true; 

		System.out.println("---DEPOSITO ABIERTO | LISTO PARA INGRESAR SOCK---");

		while(ingresarProducto) {
			ingresarProducto = deposito.ingresarProducto();			
		}

		deposito.harcode();		
		deposito.mostrarProductos();
		deposito.comprar();
		deposito.mostrarTicketVenta();

		System.out.println("-- FIN DEL PROGRAMA --");
	}

}
