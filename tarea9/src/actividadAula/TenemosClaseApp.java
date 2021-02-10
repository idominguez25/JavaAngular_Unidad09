/**
 * 
 */
package actividadAula;

/**
 * @author viach
 * Clase ejecutable que se encarga de instanciar todos los objetos de las clases Aula, Profesor
 * y Estudiante, y despu�s comprueba si tenemos clase llamando al m�todo consultaClase. En caso
 * de que sea as�, llamamos al m�todo alumnesAprobados y mostramos cuantos alumnos y cuantas
 * alumnas han aprobado.
 */
class TenemosClaseApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Variables
		boolean tenemosClase;
		Profesor profesorHoy;
		Aula aulaHoy;
		
		//Creamos objetos
		Estudiante claseHoy[] = new Estudiante[10];
		claseHoy[0] = new Estudiante("Raquel", 19, "mujer", 8);
		claseHoy[1] = new Estudiante("Marta", 18, "mujer", 9);
		claseHoy[2] = new Estudiante("Jose", 18, "hombre", 7);
		claseHoy[3] = new Estudiante("Alvaro", 20, "hombre", 8);
		claseHoy[4] = new Estudiante("Miguel", 18, "hombre", 5);
		claseHoy[5] = new Estudiante("Alba", 18, "mujer", 4);
		claseHoy[6] = new Estudiante("Lucia", 19, "mujer", 10);
		claseHoy[7] = new Estudiante("Edgard", 19, "hombre", 4);
		claseHoy[8] = new Estudiante("Francisco", 18, "hombre", 9);
		claseHoy[9] = new Estudiante("Ana", 20, "mujer", 7);

		profesorHoy = new Profesor("Ana", 20, "mujer", "filosofia");
		
		aulaHoy = new Aula(123, 15, "filosofia");
		
		
		//Llamada al m�todo consultaClase
		tenemosClase = consultaClase(claseHoy, profesorHoy, aulaHoy);
		System.out.println(tenemosClase);
		
		//Si hay clase llamamos al m�todo para mostrar aprobados
		if (tenemosClase)
			estudiantesAprobados(claseHoy);
			
	}
	
	//M�todo para comprobar si tenemos clase
	public static boolean consultaClase (Estudiante claseHoy[], Profesor profesorHoy, Aula aulaHoy) {
		//Variables
		boolean tenemosClase = true;
		final int ASISTENCIA_MIN_PORC = 50;
		int numAsistentesHoy = 0;
		
		//Comprobamos que el profesorHoy asiste, que profesorHoy.materia y
		//aulaHoy.materia coinciden, y recorremos el vector claseHoy y comprobamos que los
		//alumnos asistentes son m�s del 50% de la ocupacionMax del aulaHoy
		if (!profesorHoy.asistencia) 
			tenemosClase = false;
		
		if (!profesorHoy.getMateria().equals(aulaHoy.getMateria()))
			tenemosClase = false;
		
		for (Estudiante estudiante : claseHoy) {
			if (estudiante.asistencia)
				numAsistentesHoy++;
		}
		
		if (((double)aulaHoy.getOcupacionMax() * ASISTENCIA_MIN_PORC / 100) < numAsistentesHoy)
			tenemosClase = false;
		
		return tenemosClase;
	}
	
	//M�todo para mostrar cuantos alumnos y alumnas han aprobado
	public static void estudiantesAprobados(Estudiante claseHoy[]) {
		//Variables
		int calificacion;
		Estudiante hombresAprobados[] = new Estudiante[claseHoy.length];
		Estudiante mujeresAprobadas[] = new Estudiante[claseHoy.length];
		
		//Recorremos el vector de estudiantes
		for (Estudiante estudiante : claseHoy) {
			calificacion = estudiante.getCalificacion();
			if (calificacion >= 5) {	//Est�n aprobados
				
			}
		}
		
	}

}
