package taller4;

public class ListaPedidoEntregado {
	private NodoCliente head;
	private int cantActual;
	/**
	 * @param head
	 * @param cantActual
	 */
	public ListaPedidoEntregado() {
		super();
		this.head = null;
		this.cantActual = 0;
	}
	/**
	 * @return the head
	 */
	public NodoCliente getHead() {
		return head;
	}
	/**
	 * @param head the head to set
	 */
	public void setHead(NodoCliente head) {
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
	
	public void agregarFinal(Cliente cliente){	
		if(this.head == null){
			NodoCliente nodo = new NodoCliente(cliente);
			this.head = nodo;
			this.cantActual ++;
		}else{
			NodoCliente aux = this.head;
			while(aux.getNext() != null){
				aux = aux.getNext();
			}
			NodoCliente nodo = new NodoCliente(cliente);
			aux.setNext(nodo);
			this.cantActual ++;
		}
		
	}
}
