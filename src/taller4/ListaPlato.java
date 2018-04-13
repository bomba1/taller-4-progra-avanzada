package taller4;

public class ListaPlato {

	private NodoPlato head;
	private int cantActual;

	// no me lo quiero cortar, es paja
	/**
	 * @param plato
	 * @param head
	 */
	public ListaPlato() {
		this.head = null;
		this.cantActual = 0;
	}

	/**
	 * @return the head
	 */
	public NodoPlato getHead() {
		return head;
	}

	/**
	 * @param head the head to set
	 */
	public void setHead(NodoPlato head) {
		this.head = head;
	}

	/**
	 * @return the cantActual
	 */
	public int getCantActual() {
		return cantActual;
	}

	/**
	 * @param cantActual the cantActual to set
	 */
	public void setCantActual(int cantActual) {
		this.cantActual = cantActual;
	}
	
	public void agregarFinal(Plato plato){	
		if(this.head == null){
			NodoPlato nodo = new NodoPlato(plato);
			this.head = nodo;
			this.cantActual ++;
		}else{
			NodoPlato aux = this.head;
			while(aux.getSiguiente() != null){
				aux = aux.getSiguiente();
			}
			NodoPlato nodo = new NodoPlato(plato);
			aux.setSiguiente(nodo);
			this.cantActual ++;
		}
		
	}
	
	public String desplegarMenu(){
		String menu = "";
		NodoPlato aux = this.head;
		while(aux!= null){
			menu = menu + aux.getPlato().toString() + "\n";
			
			aux = aux.getSiguiente();
			
		}
		return menu;
	}
	public Plato buscarPlato(String nombrePlato){
		if(this.head == null){
			return null;
		}
		
		NodoPlato aux = this.head;
		while(aux!= null){
			
			if(nombrePlato.equalsIgnoreCase(aux.getPlato().getNombre())){
				return aux.getPlato();
			}
			
			aux = aux.getSiguiente();
			
		}

		return null;
	}
}