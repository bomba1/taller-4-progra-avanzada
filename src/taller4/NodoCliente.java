package taller4;

public class NodoCliente {
	private Cliente cliente;
	private NodoCliente next;
	/**
	 * @param cliente
	 * @param next
	 */
	public NodoCliente(Cliente cliente) {

		this.cliente = cliente;
		this.next = null;
	}
	/**
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}
	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	/**
	 * @return the next
	 */
	public NodoCliente getNext() {
		return next;
	}
	/**
	 * @param next the next to set
	 */
	public void setNext(NodoCliente next) {
		this.next = next;
	}
	
}
