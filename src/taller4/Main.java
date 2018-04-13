package taller4;

import java.io.IOException;

import ucn.*;

public class Main {

	public static void main(String[] args) throws IOException {
		ListaCliente listaC = new ListaCliente();
		ListaPlato listaP = new ListaPlato();
		ListaPedidoEntregado listaEntrega = new ListaPedidoEntregado();
		lecturaPlato(listaP);
		menuPrincipal(listaC,listaP,listaEntrega);

	}

	/**
	 * Subprograma que lee el archivo menu.txt
	 * 
	 * @param listaP
	 * @throws IOException
	 */
	public static void lecturaPlato(ListaPlato listaP) throws IOException {
		In arch1 = new In("Menu.txt");

		for (int i = 0; !arch1.isEmpty(); i++) {
			int cont = 0;
			String[] line = arch1.readLine().split(",");

			String identificador = line[0];
			String nombre = line[1];
			String tipo = line[2];
			int precio = Integer.parseInt(line[3]);

			Plato plato = new Plato(identificador, nombre, tipo, precio);
			listaP.agregarFinal(plato);

		} // Fin del cilo
		arch1.close();
	}

	/**
	 * Subprograma que corre el menu principal
	 * 
	 * @throws IOException
	 */
	public static void menuPrincipal(ListaCliente listaC,ListaPlato listaP,ListaPedidoEntregado listaEntrega) throws IOException {
		boolean menu = true;
		StdOut.println("Bienvenido a la cocina de Don Walter");
		while (menu) {
			StdOut.println("Menu Principal :");
			StdOut.println("1.-Tomar Un Pedido\n2.-Administrar Base de Datos\n3.-Salir");
			StdOut.println("Escriba el numero de la opcion que desee y presion enter:");
			String opcion = StdIn.readString() + StdIn.readLine();
			try {
				Integer.parseInt(opcion);
			} catch (NumberFormatException ex) {
				StdOut.println("Error,No escribio un numero, Escoja una numero entre 1 y 3 porfavor");
				continue;
			}
			int opcionDef = Integer.parseInt(opcion);
			if (opcionDef >= 4 || opcionDef <= 0) {
				StdOut.println("Error, Escoja una numero entre 1 y 3 porfavor");
				continue;
			}
			switch (opcionDef) {
			case 1:
				tomarPedido(listaC,listaP,listaEntrega);
				break;
			case 2:
				subMenu(listaEntrega);
				break;
			case 3:
				StdOut.println("Adios :)");

				return;

			}

		} // Fin del while

	}// Menu Principal
/**
 * subprograma que corre el submenu
 * @throws IOException
 */
	public static void subMenu(ListaPedidoEntregado listaEntrega) throws IOException {
		boolean menu = true;
		StdOut.println("¿Que desea hacer Don Walter?");
		while (menu) {

			StdOut.println(
					"1.-Desplegar lista de pedidos pendientes\n2.-Desplegar cantidad de pedidos realizados\n3.-Desplegar descuentos por rut\n4.-Desplegar ingresos totales\n5.-Ordenar pedidos por cantidad de platos\n6.-Ordenar pedidos por distancia al local\n7.-Salir");
			StdOut.println("Escriba el numero de la opcion que desee y presion enter:");
			String opcion = StdIn.readString() + StdIn.readLine();
			try {
				Integer.parseInt(opcion);
			} catch (NumberFormatException ex) {
				StdOut.println("Error,No escribio un numero, Escoja una numero entre 1 y 7 porfavor");
				continue;
			}
			int opcionDef = Integer.parseInt(opcion);
			if (opcionDef >= 8 || opcionDef <= 0) {
				StdOut.println("Error, Escoja una numero entre 1 y 7 porfavor");
				continue;
			}
			switch (opcionDef) {
			case 1:

				break;
			case 2:
				StdOut.println(listaEntrega.getCantActual());
				break;
			case 3:

				break;
			case 4:

				break;
			case 5:

				break;
			case 6:

				break;
			case 7:
				StdOut.println("Volviendo...");
				return;

			}

		} // Fin del while

	}// Menu Principal
/**
 * subprograma que toma el pedido del cliente
 * @param listaC
 * @param listaP
 * @param listaEntrega
 */
	public static void tomarPedido(ListaCliente listaC, ListaPlato listaP,ListaPedidoEntregado listaEntrega) {
		boolean x = true;
		String rut = null;
		String nombre = null;
		String numTelefono = null;
		String direccion = null;
		int distancia = 0;

		StdOut.println("Antes de elegir el plato debe darnos su informacion");
		StdOut.println("Ingrese su rut");
		while (x) {
			rut = StdIn.readString() + StdIn.readLine();
			try {
				Integer.parseInt(rut);
				StdOut.println("Error, escriba el rut con un - antes del ultimo numero");
				StdOut.println("Ingrese su rut");
				continue;

			} catch (NumberFormatException ex) {
				StdOut.println("Rut Ingresado!");
				break;
			}
		} // Fin del while que valida al rut

		StdOut.println("Ingrese su nombre");
		while (x) {
			nombre = StdIn.readString() + StdIn.readLine();
			try {
				Integer.parseInt(nombre);
				StdOut.println("Error, escribio un numero");
				StdOut.println("Ingrese su nombre");
				continue;

			} catch (NumberFormatException ex) {
				StdOut.println("Nombre Ingresado!");
				break;
			}
		} // Fin del while que valida al nombre
		
		StdOut.println("Ingrese su numero de telefono");
		while (x) {
			numTelefono = StdIn.readString() + StdIn.readLine();
			try {
				Integer.parseInt(numTelefono);
				StdOut.println("Error, escriba su numero con un + al principio");
				StdOut.println("Ingrese su numero de telefono");
				continue;

			} catch (NumberFormatException ex) {
				StdOut.println("Numero de telefono Ingresado!");
				break;
			}
		} // Fin del while que valida

		StdOut.println("Ingrese su direccion(ejemplo: CalleFalsa#123)");
		while (x) {
			direccion = StdIn.readString() + StdIn.readLine();
			try {
				Integer.parseInt(numTelefono);
				StdOut.println("Error");
				StdOut.println("Ingrese su direccion(ejemplo: CalleFalsa#123)");
				continue;

			} catch (NumberFormatException ex) {
				StdOut.println("Direccion Ingresada!");
				break;
			}
		} // Fin del while que valida

		StdOut.println("Ingrese la distancia");
			 String aux;
			 while (x) {
				 aux = StdIn.readString() + StdIn.readLine();
				 try {
					 distancia = Integer.parseInt(aux);
					 if (distancia <= 0) {
						 StdOut.println("Escriba un numero positivo mayor que 0 porfavor");
						 StdOut.println("Ingrese la distancia");
						 continue;
					 }
					 StdOut.println("Distancia ingresada!");
					 break;
				 } catch (NumberFormatException ex) {
					 StdOut.println("Error, escriba con numeros porfavor");
					 StdOut.println("Ingrese la distancia");
					 continue;
				 }
			 } // Fin del while que valida la distancia
			 Cliente c = new Cliente(rut,nombre,numTelefono,direccion,distancia);
			 listaC.agregarFinal(c);

			 	 
			 
			 while(true){
				 StdOut.println("Ahora se desplegara el menu disponible\nEjemplo:(Nombre-Tipo de plato-Precio)\nSeleccione su plato segun su nombre porfavor");
				StdOut.println(listaP.desplegarMenu());
				 String nombreMenu = StdIn.readString() + StdIn.readLine();
				 Plato plato = listaP.buscarPlato(nombreMenu);
				 if(plato == null){
					 StdOut.println("No se ha encontrado el plato que escribio, elija nuevamente");
					 continue;
				 }
				 c.agregarFinal(plato);
				 StdOut.println("Estos son los platos que usted a ordenado actualmente:");
				 StdOut.println(c.desplegarPlatos());
				 StdOut.println("Desea ordenar algo mas?\n1.-Si\n2.-No");
				 
				 int opcion = StdIn.readInt();
				 if(opcion == 1){
					 continue;
				 }
				 if(opcion == 2){
					 StdOut.println("El total a pagar de su cuenta es:" + listaC.calcularTotal(c) + "pesos");
					 StdOut.println("Desea confirmar su orden?\n1.-Si\n2.-No");
					 int confirmar = StdIn.readInt();
					 if(confirmar == 1){
						listaEntrega.agregarFinal(c);
						StdOut.println("A confirmado su orden\nVolviendo al menu");
						 break;
					 }
					 if(confirmar == 2){
						 StdOut.println("A rechazado su orden\nVolviendo al menu");
						 break;
					 }
					 
					 
	
				 }
				 
				 
				 
				 
			 }
			 
	}

}
