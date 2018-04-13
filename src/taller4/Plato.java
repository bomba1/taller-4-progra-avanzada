package taller4;

public class Plato {
	private String identificador;
	private String nombre;
	private String tipo;
	private int precio;
	/**
	 * @param identificador
	 * @param nombre
	 * @param tipo
	 * @param precio
	 */
	public Plato(String identificador, String nombre, String tipo, int precio) {
		this.identificador = identificador;
		this.nombre = nombre;
		this.tipo = tipo;
		this.precio = precio;
	}
	/**
	 * @return the identificador
	 */
	public String getIdentificador() {
		return identificador;
	}
	/**
	 * @param identificador the identificador to set
	 */
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	/**
	 * @return the precio
	 */
	public int getPrecio() {
		return precio;
	}
	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	@Override
	public String toString(){
		return this.nombre + " - " + this.tipo + " - " + this.precio + ".";
	}
	
}
