package javapoo2;

public class Cuenta {
	//constructor para inicializar la variable saldo
	private double saldo;

	//constructor
	public Cuenta(double saldoInicial) {
		//vaidar el saldo inicial sea mayor a  0.0, si no lo es valor 0.0
		if(saldoInicial > 0.0) 
			saldo = saldoInicial;
	}
	
	//abona suma del monto a la cuenta
	public void abonar(double monto) {
		saldo = saldo + monto;
	}
	
	public void retirar(double monto) {
		
		saldo = saldo - monto;
	}
	
	public void cargarCuenta(double monto) {
		
		if(monto <= saldo) {
			System.out.println("cargo perfecto");
			saldo = saldo - monto;
			
		}else {
			System.out.println("El monto a cargar excede el saldo de la cuenta");
		}
			
		
	}
	
	//muestra el saldo de la cuenta
	public double obtenerSaldo() {
		return saldo;
	}
	

}
