package Ejercicio3;
import java.util.ArrayList;
import java.util.Scanner;

public class Deposito {
	Scanner input;
	ArrayList<Electrodomestico> electrodomesticos;
	ArrayList<Electrodomestico> electrodomesticosComprados;
	

	public Deposito() {
		input = new Scanner(System.in);
		electrodomesticos = new ArrayList<Electrodomestico>();		
		electrodomesticosComprados = new ArrayList<Electrodomestico>();
	}

	public boolean ingresarProducto(){
		boolean continuarIngresando = false;
		int dato;
		int tipoElectrodomestico;
		System.out.println("Indique el producto a ingresar: (1)Heladera, (2)Lavarropas, (3)Licuadora, (4)Televisor.");
		tipoElectrodomestico = input.nextInt();
		while(!(tipoElectrodomestico > 0 && tipoElectrodomestico < 5)) {
			System.out.println("El dato ingresado es incorrecto.Ingrese: (1)Heladera, (2)Lavarropas, (3)Licuadora, (4)Televisor.");
			tipoElectrodomestico = input.nextInt();			
		}
		ingresarPorTipoProducto(tipoElectrodomestico);

		do {			
			dato = this.validarNumeroEntero("Deseas ingresar otro Producto (1)Si, (2)No:");
		}while(!(dato==1 || dato==2));
		switch(dato) {
		case 1:
			continuarIngresando = true;
			break;
		case 2:
			continuarIngresando = false;
			break;
		}
		
		this.harcode();
		this.mostrarProductos();
		return continuarIngresando;
	}

	private void ingresarPorTipoProducto(int tipoElectrodomestico) {

		String marca = this.validarTexto("Ingrese Marca");
		String modelo = this.validarTexto("Ingrese Modelo:");
		float voltaje = this.validarNumeroDecimal("Ingrese Voltaje:");
		boolean estado = this.validarBooleano("Ingrese Si está (1) Encendido, (2) Apagado");
		float precio = this.validarNumeroDecimal("Ingrese Precio:");

		ingresarProducto(marca, modelo, voltaje, estado, precio,tipoElectrodomestico);		
	}

	private void ingresarProducto(String marca,String modelo,float voltaje,boolean estado,float precio, int tipoElectrodomestico) {

		switch(tipoElectrodomestico){
		case 1:
			ingresarHeladera(marca, modelo, voltaje, estado, precio);
			break;
		case 2:
			ingresarLavarropa(marca, modelo, voltaje, estado, precio);			
			break;
		case 3:
			ingresarLicuadora(marca, modelo, voltaje, estado, precio);
			break;
		case 4:
			ingresarTelevisor(marca, modelo, voltaje, estado, precio);
			break;			
		}
		System.out.println( "Producto Cargado" );
	}

	private void ingresarHeladera(String marca,String modelo,float voltaje,boolean estado,float precio){			
		float capacidadLitros = this.validarNumeroDecimal("Ingrese Cantidad de Listros:");
		boolean noFrost = this.validarBooleano("Ingrese si la heladera (1)es NoFrost, (2) no es nofrost");				
		Heladera heladera = new Heladera( marca,  modelo,  voltaje,  estado,  precio, capacidadLitros, noFrost);
		this.electrodomesticos.add(heladera);
	}

	private void ingresarLavarropa(String marca,String modelo,float voltaje,boolean estado,float precio) {
		TipoLavarropas tipo = null;

		int cargaMax = this.validarNumeroEntero("Ingrese la Carga Maxima:");
		int controlTipo;
		do {			
			controlTipo= this.validarNumeroEntero("Ingrese (1) AUTOMATICO, (2) SEMI_AUTOMATICO:");
		}while(!(controlTipo == 1 || controlTipo==2));

		switch(controlTipo) {
		case 1 :
			tipo = TipoLavarropas.AUTOMATICO;
			break;
		case 2 :
			tipo = TipoLavarropas.SEMI_AUTOMATICO;
			break;
		}

		Lavarropa lavarropa = new Lavarropa(marca,  modelo,  voltaje,  estado,  precio, cargaMax, tipo);
		this.electrodomesticos.add(lavarropa);
	}

	private void ingresarLicuadora(String marca,String modelo,float voltaje,boolean estado,float precio) {
		int potencia = this.validarNumeroEntero("Ingrese la Potencia:");
		int velocidades = this.validarNumeroEntero("Ingrese la velocidad Maxima:");
		Licuadora licuadora = new Licuadora(marca,  modelo,  voltaje,  estado,  precio, potencia, velocidades);
		this.electrodomesticos.add(licuadora);
	}

	private void ingresarTelevisor(String marca,String modelo,float voltaje,boolean estado,float precio) {
		float dimension = this.validarNumeroDecimal("Ingrese la dimension:");
		boolean smart = this.validarBooleano("Ingrese (1)si es Smart, (2) si no lo es:");
		Televisor televisor = new Televisor(marca,  modelo,  voltaje,  estado,  precio, dimension, smart);
		this.electrodomesticos.add(televisor);
	}

	private boolean validarBooleano(String mensaje) {
		boolean bool = false;
		do{
			int dato = 0;

			while (!(dato == 1 || dato == 2)) {							
				dato = this.validarNumeroEntero(mensaje);				
			}

			switch(dato) {
			case 1:
				bool = true;
				break;
			case 2:
				bool = false;
				break;
			}

		}while(!(bool == true || bool == false));
		return bool;
	}

	private float validarNumeroDecimal(String mensaje) {
		float dato = 0;

		do{
			System.out.println(mensaje);
			String x = input.next();
			input.nextLine();
			
			try {
				dato =  Float.parseFloat(x);
				
			}catch (NumberFormatException e) {
				System.out.println("Ha ingresado un dato Erroneo");			      
			}

		}while(!(dato>0));
		return dato;
	}

	private int validarNumeroEntero(String mensaje) {
		int dato = 0;

		do{
			System.out.println(mensaje);
			String x = input.next();
			input.nextLine();
			try {
				dato =  Integer.parseInt(x);				
			}catch(NumberFormatException e) {
				System.out.println("Ha ingresado un dato Erroneo");
			}			
		}while(!(dato>=0));
		return dato;
	}

	private String validarTexto(String mensaje) {
		String dato;
		do{
			System.out.println(mensaje);
			dato = input.nextLine();
			input.next();
		}while(!(dato != null));
		return dato;
	}
	
	public void harcode() {
		Heladera heladera = new Heladera( "Wirpool ",  "H2745",  10,  true,  12000, 20, true);
		Lavarropa lavarropa = new Lavarropa("samsung",  "BB",  200,  true,  3500, 2, TipoLavarropas.AUTOMATICO);
		Licuadora licuadora = new Licuadora("samsung",  "CC",  20,  false,  65000, 200, 5);
		Televisor televisor = new Televisor("samsung",  "DD",  50,  false,  15500, 15, false);
		this.electrodomesticos.add(lavarropa);
		this.electrodomesticos.add(heladera);
		this.electrodomesticos.add(licuadora);
		this.electrodomesticos.add(televisor);	
		
	}
	
	
	private void mostrar(ArrayList<Electrodomestico> e) {
		Electrodomestico aux;
		Heladera heladeraAux;
		Lavarropa lavarropaAux;
		Licuadora licuadoraAux;
		Televisor televisorAux;
		
		for (int i = 0; i < e.size(); i++){
			
			aux = e.get(i);
			System.out.println("Opcion -> "+ (i+1));
			if (aux instanceof Heladera){
				heladeraAux = (Heladera)aux;				
				System.out.println(heladeraAux.toString());
			}else if(aux instanceof Lavarropa) {
				lavarropaAux = (Lavarropa)aux;				
				System.out.println(lavarropaAux.toString());
			}else if(aux instanceof Licuadora) {
				licuadoraAux = (Licuadora)aux;				
				System.out.println(licuadoraAux.toString());
			}else {
				televisorAux = (Televisor)aux;				
				System.out.println(televisorAux.toString());
			}
		}
		System.out.println("");

	}
	
	public void mostrarProductos() {
		this.mostrar(this.electrodomesticos);
	}

	
	public void mostrarTicketVenta() {		
		System.out.println("Ticket de venta");
		System.out.println("Articulos:");
		this.mostrar(this.electrodomesticosComprados);		
		this.sumarVentas();
	}
	
	public void sumarVentas() {
		float total = 0;
		for(int i = 0;i<this.electrodomesticosComprados.size(); i++) {
			total += this.electrodomesticosComprados.get(i).getPrecio();
		}
		System.out.println("Total: "+total);
	}
	
	public void comprar() {
		
		int finalizar=0;
		do {
			int opcion = this.validarNumeroEntero("Ingresa una opcion del 1 al " + this.electrodomesticos.size() + " Inclusive para comprar");
			while(!(opcion >0 && opcion < this.electrodomesticos.size()+1 )) {
				opcion = this.validarNumeroEntero("Error! \nIngresa una opcion del 1 al " + this.electrodomesticos.size() + " Inclusive para comprar");
			}
			
			this.electrodomesticosComprados.add(this.electrodomesticos.get( opcion-1 ));
			
			finalizar = this.validarNumeroEntero("Para finalizar su compra ingrese 0, o cualquier numero para continuar:");
		}while(finalizar!=0);
		
	}
	
}
