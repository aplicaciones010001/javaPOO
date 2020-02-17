package javapoo2;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cuenta tarjeta = new Cuenta(100);
		
		tarjeta.cargarCuenta(60);
		
		System.out.println(tarjeta.obtenerSaldo());
		System.out.println(tarjeta.obtenerSaldo());
		
		
	}

}
