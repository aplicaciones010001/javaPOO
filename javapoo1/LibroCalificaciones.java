package javapoo1;

public class LibroCalificaciones {
	
	private String nombreDelCurso;
	private String instructorCurso;
	
	//constructor que inicializa al nombre del curso con el objeto	String
	//que provee como argumento
	public LibroCalificaciones(String nombre ) {
		//
		nombreDelCurso = nombre;
		//segunda variable para el nombre del instructor
		instructorCurso = nombre;
		}
	//metodo para establecer el nombre del curso
	public void establecerNombreDelCurso(String nombre) {
		//almacena el nombre del curso
		nombreDelCurso = nombre;
	}
	
	public void establecerNombreDelInstructor(String nombre) {
		//almacena el nombre del curso
		instructorCurso = nombre;
	}
	
	
	//metodo obtener el nombre del curso
	public String obtenerNombreDelCurso() {
		return nombreDelCurso;
	}
	
	public String obtenerNombreDelInstructor() {
		return instructorCurso;
	}
	
	public void mostrarMensaje(){
		//llamamos al metodo obtenernombredelcurso
		System.out.println("Bienvenido al libro de calificaciones para: "+
				obtenerNombreDelCurso() );
		
		System.out.println("Este curso es presentado por: "+
				obtenerNombreDelInstructor() );
	}
		

	

}
