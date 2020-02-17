package javapoo4;

public class Empleado {
	
	//variables
	String nombre;
	String apellido;
	double salario_mensual;
	
	public Empleado() {
		
	}
	
	public Empleado( String Cnombre, String Capellido, double Csalario_mesual ) {
		
		nombre = Cnombre;
	      apellido = Capellido;
	       if( Csalario_mesual > 0.0 )
	        {
	            salario_mensual = Csalario_mesual;
	        }
		
	}
	
	public void establecer_nombre(String nombre){
	     this.nombre = nombre;
	  }
	  public String obtener_nombre(){ 
	     
	     return nombre;
	 }
	  
	  public void establecer_apellido(String apellido){
		     this.apellido = apellido;
		 }
		  public String obtener_apellido(){ 
		     
		     return apellido;
		 }
	
		  public void establecerSalarioMensual( double salario )
		    {
		        if( salario < 0.0 )
		        {
		            System.out.print( "\nEl salario escrito no es válido." );
		            return;
		        }
		        salario_mensual = salario;
		    }
		  public double obtenersalario_mensual()
		    {
		        return salario_mensual;
		    }
		  public double obtenersalario_anual()
		    {
		        return obtenersalario_mensual() * 12;
		    }
		   public double obtenerAumento()
		    {
		        return obtenersalario_anual() * 1.10;
		    }

	
	

}
