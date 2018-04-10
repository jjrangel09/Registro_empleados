
public class Empleado extends Persona {

	private String nombres, apellidos;
	int altura;
	private int edad;
	private static int acum = 0;

	public Empleado() {
		// TODO Auto-generated constructor stub

	}

	/**
	 * @return la edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad
	 *            para guardar.
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * @param apellidos
	 *            para guardar
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return el nombre completo.
	 */
	public String getNombreC() {
		String cadena = nombres + " " + apellidos;
		return cadena;
	}

	/**
	 * @param nombres
	 *            para guardar
	 */
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}


	@Override
	public String toString() {
		String cadena = "\n*************************************\n";
		return cadena;
	}

	@Override
	public int getAltura() {
		// TODO Auto-generated method stub
		return altura;
	}

	@Override
	public void setAltura(int alt) {
		// TODO Auto-generated method stub
		altura = alt;
	}

}
