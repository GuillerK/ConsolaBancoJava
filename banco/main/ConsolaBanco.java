package banco.main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import banco.mensajes.Mensaje;
import banco.modelos.Cliente;
import banco.modelos.Gestor;
import banco.transferencia.Transferencia;
import banco.util.Utiles;

public class ConsolaBanco {

	private List<Gestor> gestores;
	private List<Cliente> clientes;
	private List<Mensaje> mensajes;
	private List<Transferencia> transferencias;
	private Integer siguienteIdTransferencia;
	private Integer siguienteIdCliente;
	private Integer siguienteIdGestor;
	private Integer siguienteIdMensaje;
	private Scanner teclado;

	ConsolaBanco() {
		this.gestores = new ArrayList<>();
		this.clientes = new ArrayList<>();
		this.mensajes = new ArrayList<>();
		this.transferencias = new ArrayList<>();

		this.siguienteIdGestor = 1;
		this.siguienteIdTransferencia = 1;
		this.siguienteIdCliente = 1;
		this.siguienteIdMensaje = 1;
		this.teclado = new Scanner(System.in);
	}

	public static void main(String[] args) {

		ConsolaBanco consola = new ConsolaBanco();

		consola.iniciar();

	}

	private void mostrarMenu() {
		System.out.println("1. Insertar gestor");
		System.out.println("2. Insertar gestores de prueba");
		System.out.println("3. Consultar Gestor");
		System.out.println("4. Ver todos los gestores");
		System.out.println("5. Actualizar Gestores");
		System.out.println("6. Eliminar gestores");
		System.out.println("7. Insertar Clientes");
		System.out.println("8. Ver todos los clientes");
		System.out.println("9. Obtener Cliente");
		System.out.println("10. Actualizar Cliente");
		System.out.println("11. Eliminar Cliente");
		System.out.println("12. Obtener Mensaje");
		System.out.println("13. Ver todos los mensajes");
		System.out.println("14. Enviar mensaje");
		System.out.println("15. Obtener transferencia");
		System.out.println("16. Obtener todas las transferencias");
		System.out.println("17. Enviar transferencia");
		System.out.println("18. Iniciar Sesion");
		System.out.println("0. Salir\n");
	}

	private void insertarGestor() {
		System.out.println("ID: ");
		siguienteIdGestor = teclado.nextInt();
		System.out.println("Nombre: ");
		String nombre = teclado.next();
		System.out.println("Correo: ");
		String email = teclado.next();
		System.out.println("Contraseña: ");
		String password = teclado.next();
		System.out.println("Oficina: ");
		String oficina = teclado.next();
		Gestor nuevoGestor = new Gestor(siguienteIdGestor, nombre, password, email, oficina);
		gestores.add(nuevoGestor);
		siguienteIdGestor++;
		System.out.println("¡Gestor creado con exito!");
	}

	private void insertarGestoresDePrueba() {
		System.out.println("Número de gestores: ");
		int numeroGestores = teclado.nextInt();

		for (int i = 0; i < 10; i++) {
			String usuario = Utiles.nombreAleatorio();
			String correo = Utiles.correoAleatorio();
			Gestor gestor = new Gestor(siguienteIdGestor, usuario, " ", correo);
			gestores.add(gestor);
			siguienteIdGestor++;
		}
	}

	private void obtenerCliente() {
		System.out.println("Id del cliente a consultar: ");
		int idCliente = teclado.nextInt();
		Cliente clienteResultado = buscarClientePorId(idCliente);
		if (clienteResultado != null) {
			System.out.println(clienteResultado);
		} else {
			System.out.println("No se puedo encontrar el gestor" + idCliente);
		}
	}

	private Mensaje buscarMensajePorId(Integer idMensaje) {
		Mensaje mensajeResultado = null;
		for (int i = 0; i < mensajes.size(); i++) {
			Mensaje mensaje = mensajes.get(i);
			if (mensaje.getId() == idMensaje) {
				mensajeResultado = mensaje;
				return mensajeResultado;
			}
		}
		return null;
	}

	private void obtenerMensaje() {
		System.out.println("Id mensaje del Gestor a consultar: ");
		int idMensaje = teclado.nextInt();
		Mensaje mensajeResultado = buscarMensajePorId(idMensaje);
		if (mensajeResultado != null) {
			System.out.println(mensajeResultado);
		} else {
			System.out.println("No se puedo encontrar el mensaje del Gestor" + idMensaje);
		}

	}

	private void insertarCliente() {
		System.out.println("Nombre: ");
		String nombre = teclado.next();
		System.out.println("Correo: ");
		String email = teclado.next();
		System.out.println("Oficina: ");
		String oficina = teclado.next();
		Cliente nuevoCliente = new Cliente(siguienteIdCliente, nombre, email, oficina);
		clientes.add(nuevoCliente);
		siguienteIdCliente++;
		System.out.println("¡Cliente creado con éxtio!");
	}

	private void consultarGestor() {
		System.out.println("Id del gestor a consultar: ");
		int idGestor = teclado.nextInt();
		Gestor gestorResultado = buscarGestorPorId(idGestor);
		if (gestorResultado != null) {
			System.out.println(gestorResultado);
		} else {
			System.out.println("No se puedo encontrar el gestor" + idGestor);
		}
	}

	private Gestor buscarGestorPorId(int idGestor) {
		Gestor gestorResultado = null;
		for (int i = 0; i < gestores.size(); i++) {
			Gestor gestor = gestores.get(i);
			if (gestor.getId() == idGestor) {
				gestorResultado = gestor;
				return gestorResultado;
			}
		}
		return null;
	}

	private Cliente buscarClientePorId(int idCliente) {
		Cliente clienteResultado = null;
		for (int i = 0; i < clientes.size(); i++) {
			Cliente cliente = clientes.get(i);
			if (cliente.getId() == idCliente) {
				clienteResultado = cliente;
				return clienteResultado;
			}
		}
		return null;
	}
	
	private Transferencia buscarTransferenciaPorId(int idTransferencia) {
		Transferencia transferenciaResultado = null;
		for (int i = 0; i < transferencias.size(); i++) {
			Transferencia transferencia = transferencias.get(i);
			if (transferencia.getId() == idTransferencia) {
				transferenciaResultado = transferencia;
				return transferenciaResultado;
			}
		}
		return null;
	}
	
	

	private void verTodosLosGestores() {
		if (gestores.isEmpty()) {
			System.out.println("Todavia no hay gestores.");
		}
		gestores.forEach(gestor -> {
			System.out.println(gestor);
		});
	}

	private void verTodoLosClientes() {
		if (clientes.isEmpty()) {
			System.out.println("Todavia no hay clientes...");
		}
		clientes.forEach(cliente -> {
			System.out.println(cliente);
		});
	}

	private void actualizarGestores() {
		System.out.println("Id del gestor a actualizacion: ");
		int idGestor = teclado.nextInt();
		Gestor gestorResultado = buscarGestorPorId(idGestor);

		if (gestorResultado != null) {
			System.out.println("[n] Nombre ");
			System.out.println("[e] Email ");
			System.out.println("[c] Contraseña ");
			System.out.println("[o] Oficina ");
			System.out.println("[x] Cancelar ");
			System.out.println("Campo a actualizar: ");
			char opcionActualizar = teclado.next().charAt(0);
			switch (opcionActualizar) {
			case 'n':
				System.out.println("Nombre: ");
				String nombre = teclado.next();
				gestorResultado.setUsuario(nombre);
				break;
			case 'e':
				System.out.println("Email: ");
				String email = teclado.next();
				gestorResultado.setCorreo(email);
				break;
			case 'c':
				System.out.println("Contraseña: ");
				String password = teclado.next();
				gestorResultado.setPassword(password);
				break;
			case 'o':
				System.out.println("Oficina: ");
				String oficina = teclado.next();
				gestorResultado.setOficina(oficina);
				break;
			case 'x':
				System.out.println("Cancelar actualización... ");
				break;
			default:
				System.out.println("Opcion no valida");
			}
			if (opcionActualizar != 'x') {
				System.out.println("Se actualizó el gestor con el id" + idGestor);
			}
		} else {
			System.out.println("No se puedo encontrar el gestor" + idGestor);
		}

	}

	private void actualizarClientes() {
		System.out.println("Id del cliente a actualizacion: ");
		int idCliente = teclado.nextInt();
		Cliente clienteResultado = buscarClientePorId(idCliente);

		if (clienteResultado != null) {
			System.out.println("[n] Nombre ");
			System.out.println("[e] Email ");
			System.out.println("[c] Contraseña ");
			System.out.println("[x] Cancelar ");
			System.out.println("Campo a actualizar: ");
			char opcionActualizar = teclado.next().charAt(0);
			switch (opcionActualizar) {
			case 'n':
				System.out.println("Nombre: ");
				String nombre = teclado.next();
				clienteResultado.setUsuario(nombre);
				break;
			case 'e':
				System.out.println("Email: ");
				String email = teclado.next();
				clienteResultado.setCorreo(email);
				break;
			case 'c':
				System.out.println("Contraseña: ");
				String password = teclado.next();
				clienteResultado.setPassword(password);
				break;
			case 'x':
				System.out.println("Cancelar actualización... ");
				break;
			default:
				System.out.println("Opcion no valida");
			}
			if (opcionActualizar != 'x') {
				System.out.println("Se actualizó el cliente con el id" + idCliente);
			}
		} else {
			System.out.println("No se puedo encontrar el cliente" + idCliente);
		}
	}

	private void login() {
		System.out.println("Id gestor: ");
		int idGestor = teclado.nextInt();
		System.out.println("Contraseña: ");
		String password = teclado.next();
		Gestor gestor = buscarGestorPorId(idGestor);
		if (gestor != null) {
			if (gestor.getPassword().equals(password)) {
				System.out.println("¡Accedido a la plataforma!");
			} else {
				System.out.println("¡Datos incorrectos!...");
			}
		} else {
			System.out.println("¡El usuario no existe!...");
		}
	}

	private void eliminarCliente() {
		System.out.println("Id del Cliente a eliminar: ");
		int idCliente = teclado.nextInt();
		Cliente clienteResultado = null;
		int posicionCliente = -1;

		for (int i = 0; i < clientes.size(); i++) {
			Cliente cliente = clientes.get(i);
			if (cliente.getId() == idCliente) {
				clienteResultado = cliente;
				posicionCliente = i;
				break;
			}
		}
		if (clienteResultado != null) {
			clientes.remove(clienteResultado);
			System.out.println("Se elimino el cliente con el id " + idCliente);
		} else {
			System.out.println("No se puedo encontrar el cliente " + idCliente);
		}
	}

	private void eliminarGestor() {
		System.out.println("Id del gestor a eliminar: ");
		int idGestor = teclado.nextInt();
		Gestor gestorResultado = null;
		int posicionGestor = -1;

		for (int i = 0; i < gestores.size(); i++) {
			Gestor gestor = gestores.get(i);
			if (gestor.getId() == idGestor) {
				gestorResultado = gestor;
				posicionGestor = i;
				break;
			}
		}
		if (gestorResultado != null) {
			gestores.remove(posicionGestor);
			System.out.println("Se elimino el gestor con el id" + idGestor);
		} else {
			System.out.println("No se puedo encontrar el gestor" + idGestor);
		}
	}

	private void cerrar() {
		teclado.close();
		System.out.println("¡Hasta pronto!");
	}

	private void verTodosLosMensajes() {
		if (mensajes.isEmpty()) {
			System.out.println("Todavia no tienes mensajes a mostrar...");
		}
		mensajes.forEach(mensaje -> {
			System.out.println(mensaje);
		});
	}

	private void enviarMensaje() {
		System.out.println("ID: ");
		Integer id = teclado.nextInt();
		System.out.println("ID Origen: ");
		Integer idOrigen = teclado.nextInt();
		System.out.println("ID Origen: ");
		Integer idDestino = teclado.nextInt();
		System.out.println("Concepto del Mensaje: ");
		String concepto = teclado.next();
		Mensaje nuevoMensaje = new Mensaje(id, idOrigen, idDestino, concepto);
		mensajes.add(nuevoMensaje);
		siguienteIdMensaje++;
		System.out.println("¡Mensaje enviado con éxito!");
	}
	
	private void obtenerTransferencia() {
		System.out.println("Id de la transferencia a consultar: ");
		int idTransferencia = teclado.nextInt();
		Transferencia transferenciaResultado = buscarTransferenciaPorId(idTransferencia);
		if (transferenciaResultado != null) {
			System.out.println(transferenciaResultado);
		} else {
			System.out.println("No se puedo encontrar la transferencia con numero de referencia " + idTransferencia);
		}
	}
	
	private void obtenerTodasLasTransferencia() {
		if (transferencias.isEmpty()) {
			System.out.println("No hay transferencias elaboradas...");
		}
		transferencias.forEach(transferencia -> {
			System.out.println(transferencia);
		});
	}
	
	private void enviarTransferencia() {
	System.out.println("ID: ");
	Integer id = teclado.nextInt();
	System.out.println("ID del beneficiario: ");
	Integer idBeneficiario = teclado.nextInt();
	System.out.println("ID del beneficiario: ");
	Integer idOrdenante = teclado.nextInt();
	System.out.println("Importe a enviar: ");
	double importe = teclado.nextDouble();
	System.out.println("Concepto(Opcional): ");
	String concepto = teclado.next();
	Transferencia nuevaTransferencia = new Transferencia(id, idBeneficiario, idOrdenante, importe, concepto);
	transferencias.add(nuevaTransferencia);
	siguienteIdTransferencia++;
	System.out.println("¡La transferencia ha sido enviada!");
}
	
	private void iniciar() {

		List<Gestor> gestores = new ArrayList<>();
		Integer siguienteIdGestor = 1;

		Scanner teclado = new Scanner(System.in);

		int opcion = -1;

		do {
			mostrarMenu();

			System.out.println("Selecciona una opcion: ");
			try {
				opcion = teclado.nextInt();
			} catch (Exception e) {
				opcion = 0;
			}

			switch (opcion) {
			case 1:
				insertarGestor();
				break;
			case 2:
				insertarGestoresDePrueba();
				break;
			case 3:
				consultarGestor();
				break;
			case 6:
				eliminarGestor();
				break;
			case 5:
				actualizarGestores();
				break;
			case 4:
				verTodosLosGestores();
				break;
			case 7:
				insertarCliente();
				break;
			case 8:
				verTodoLosClientes();
				break;
			case 9:
				obtenerCliente();
				break;
			case 10:
				actualizarClientes();
				break;
			case 11:
				eliminarCliente();
				break;
			case 13:
				verTodosLosMensajes();
				break;
			case 14:
				enviarMensaje();
				break;
			case 15:
				obtenerTransferencia();
				break;
			case 16:
				obtenerTodasLasTransferencia();
				break;
			case 17:
				enviarTransferencia();
				break;
			case 12:
				obtenerMensaje();
				break;
			case 18:
				login();
				break;
			case 0:
				cerrar();
				break;
			default:
				System.out.println("Opcion desconocida...");
			}
		} while (opcion != 0);
		{

		}

	}

}
