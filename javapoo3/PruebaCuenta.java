package javapoo3;

import java.util.Scanner;

import javapoo2.Cuenta;


public class PruebaCuenta {
	

	
	
	//inicia el metodo main de la ejecucion
	public static void main(String args[]) {
		//objetos
		Cuenta cuenta1 = new Cuenta(50.00);
		Cuenta cuenta2 = new Cuenta(100);
		
		
		
	
		
		//salida inicial
		System.out.println("Saldo de cuenta 1:"+ cuenta1.obtenerSaldo());
		System.out.println("Saldo de cuenta 2:"+ cuenta2.obtenerSaldo());
		
		//objeto scanner para obtener la entrada de la ventana de comandos
		Scanner entrada =  new Scanner(System.in);


		double montoDeposito;
		double montoDeposito2;
		double saldo;
		double saldo2;
		int opcion;
		

		
		System.out.println("Eliga una opcion para la cuenta 1:"
				+ "			1 : deposito"
				+ "			2 : cargo ");
		opcion = entrada.nextInt();
		
		
		switch (opcion) {
			case 1:
			System.out.println("Escriba el monto a depositar en la cuenta1: ");
			montoDeposito = entrada.nextDouble();
			System.out.println("sumado al saldo de cuenta 1: " + montoDeposito);
			cuenta1.abonar(montoDeposito);
			
			break;
			
			case 2:
			System.out.println("Escriba el monto a cargar en la cuenta 1: ");
			double carCuenta = entrada.nextDouble();
			System.out.println("cargo a cuenta cuenta 2: " + carCuenta);
			cuenta1.cargarCuenta(carCuenta);
			break;
			
			default:
				System.out.println("Opcion no valida");
				
			
		}
		System.out.println("saldo de cuenta 1: " + cuenta1.obtenerSaldo());
		System.out.println("saldo de cuenta 2: " + cuenta2.obtenerSaldo());
		
		System.out.println("Eliga una opcion para la cuenta 2:"
				+ "			1 : deposito"
				+ "			2 : cargo ");
		opcion = entrada.nextInt();
		
		
		switch (opcion) {
			case 1:
			System.out.println("Escriba el monto a depositar en la cuenta 2: ");
			montoDeposito = entrada.nextDouble();
			System.out.println("sumado al saldo de cuenta 1: " + montoDeposito);
			cuenta2.abonar(montoDeposito);
			
			break;
			
			case 2:
			System.out.println("Escriba el monto a cargar en la cuenta 1: ");
			double carCuenta = entrada.nextDouble();
			System.out.println("cargo a cuenta cuenta 2: " + carCuenta);
			cuenta2.cargarCuenta(carCuenta);
			break;
			
			default:
				System.out.println("Opcion no valida");
				
			
		}
		System.out.println("saldo de cuenta 1: " + cuenta1.obtenerSaldo());
		System.out.println("saldo de cuenta 2: " + cuenta2.obtenerSaldo());
		
		
		
	}
	
	
}
