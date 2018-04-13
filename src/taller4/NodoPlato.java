package taller4;

public class NodoPlato {
	private Plato plato;
	private NodoPlato siguiente;
	
	/**
	 * @param plato
	 * @param siguiente
	 */
	public NodoPlato(Plato plato) {
		this.plato = plato;
		this.siguiente = null;
	}

	/**
	 * @return the plato
	 */
	public Plato getPlato() {
		return plato;
	}

	/**
	 * @param plato the plato to set
	 */
	public void setPlato(Plato plato) {
		this.plato = plato;
	}

	/**
	 * @return the siguiente
	 */
	public NodoPlato getSiguiente() {
		return siguiente;
	}

	/**
	 * @param siguiente the siguiente to set
	 */
	public void setSiguiente(NodoPlato siguiente) {
		this.siguiente = siguiente;
	}
	
	
}
