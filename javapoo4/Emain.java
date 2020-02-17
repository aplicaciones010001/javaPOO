package javapoo4;

public class Emain {
	
	public static void main(String[] args) {
		
	Empleado empl = new Empleado();
    empl.establecer_nombre("Said");
    empl.establecer_apellido("Osorio");
    empl.establecerSalarioMensual(80.53);
    System.out.println("El salario anual de "+empl.obtener_nombre()
            + " "+empl.obtener_apellido()+ " es de "+ String.format("%.2f", empl.obtenersalario_anual()));
    System.out.println("El salario anual de "+empl.obtener_nombre()+ " mas el 10% es de "
            +String.format("%.2f", empl.obtenerAumento()));
    
    Empleado emp2 = new Empleado ("Roman","Cruz", 80.75);
     System.out.println("El salario anual de "+emp2.obtener_nombre()
            + " "+emp2.obtener_apellido()+ " es de "+ String.format("%.2f", emp2.obtenersalario_anual()));
    System.out.println("El salario anual de "+emp2.obtener_nombre()+ " mas el 10% es de "
            +String.format("%.2f", emp2.obtenerAumento()));
	}

}
