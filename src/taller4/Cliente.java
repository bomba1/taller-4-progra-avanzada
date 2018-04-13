package taller4;
import ucn.StdOut;
public class Cliente {
	private NodoPlato head;
	private int cantActual;
	private String rut;
	private String nombre;
	private String numTelefono;
	private String direccion;
	private int distancia;
	private int cantDescuentos;
	/**
	 * @param head
	 * @param cantActual
	 * @param rut
	 * @param nombre
	 * @param numTelefono
	 * @param direccion
	 * @param distancia
	 */
	public Cliente(String rut, String nombre, String numTelefono, String direccion,
			int distancia) {
		
		this.head = null;
		this.cantActual = 0;
		this.rut = rut;
		this.nombre = nombre;
		this.numTelefono = numTelefono;
		this.direccion = direccion;
		this.distancia = distancia;
	}
	/**
	 * @return the 
	 * head
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
	/**
	 * @return the rut
	 */
	public String getRut() {
		return rut;
	}
	/**
	 * @param rut the rut to set
	 */
	public void setRut(String rut) {
		this.rut = rut;
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
	 * @return the numTelefono
	 */
	public String getNumTelefono() {
		return numTelefono;
	}
	/**
	 * @param numTelefono the numTelefono to set
	 */
	public void setNumTelefono(String numTelefono) {
		this.numTelefono = numTelefono;
	}
	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}
	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	/**
	 * @return the distancia
	 */
	public int getDistancia() {
		return distancia;
	}
	/**
	 * @param distancia the distancia to set
	 */
	public void setDistancia(int distancia) {
		this.distancia = distancia;
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
	
	public String desplegarPlatos(){
		String menu = "";
		NodoPlato aux = this.head;
		while(aux!= null){
			menu = menu + aux.getPlato().toString() + "\n";
			
			aux = aux.getSiguiente();
			
		}
		return menu;
	}
	public int calcularTotal(){
		NodoPlato aux = this.head;
		int total = 0;
		int postres =0;
		int entradas=0;
		int aperitivos=0;
		int principal=0;
		while(aux!= null){
			if(aux.getPlato().getTipo().equalsIgnoreCase("postre")){
				postres++;
				
			}
			else if(aux.getPlato().getTipo().equalsIgnoreCase("principal")){
				principal++;
			}
			else if(aux.getPlato().getTipo().equalsIgnoreCase("entrada")){
				entradas++;
			}
			else if(aux.getPlato().getTipo().equalsIgnoreCase("aperitivo")){
				aperitivos++;
			}
			total = total + aux.getPlato().getPrecio();
			StdOut.println(aux.getPlato().getPrecio());
			
			aux = aux.getSiguiente();
			
		}
		if(postres!=0 && entradas!=0 && aperitivos!=0 && principal!=0 ){
			total = (total*85)/100;
			StdOut.println("DESCUENTO POR TENER TODOS LOS PLATOS!!!");
			this.cantDescuentos++;
		}
		if(postres!=0 && entradas==0 && aperitivos==0 && principal==0 ){
			StdOut.println("Felicidades se lleva un descuento de 3000 pesos en su proxima compra!");
			this.cantDescuentos++;
		}
		if(this.distancia<=300){
			total = (total*95)/100;
			StdOut.println("Descuento por estar en un radio de 300 metros!");
			this.cantDescuentos++;
		}
		return total;
	}
	/**
	 * @return the cantDescuentos
	 */
	public int getCantDescuentos() {
		return cantDescuentos;
	}
	/**
	 * @param cantDescuentos the cantDescuentos to set
	 */
	public void setCantDescuentos(int cantDescuentos) {
		this.cantDescuentos = cantDescuentos;
	}

}


