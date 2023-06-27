package banco.util;

import java.util.Random;

public class Utiles {

	public static final String[] NOMBRES = { "Juan", "Antonia", "Larry", "Andrea" };

	public static final String[] APELLIDOS = { "Perez", "Martin", "Capija", "Mendoza" };

	public static final String nombreAleatorio(String[] nombres, String[] apellidos) {

		Random random = new Random();

		int indiceNombre = random.nextInt(nombres.length);
		String nombre = nombres[indiceNombre];

		int indiceApellido = random.nextInt(apellidos.length);
		String apellido = apellidos[indiceApellido];

		return nombre + " " + apellido;
	}

	public static String nombreAleatorio() {
		return nombreAleatorio(NOMBRES, APELLIDOS);

	}

	public static final String[] USUARIOS = { "Juan", "Antonia", "Larry", "Andrea" };
	public static final String[] DOMINIOS = { "@gmail.com", "@yahoo.com", "@hotmail.com", "@outlook.com" };

	public static final String correoAleatorio(String[] usuarios, String[] dominios) {

		Random random = new Random();

		int indiceUsuario = random.nextInt(usuarios.length);
		String usuario = usuarios[indiceUsuario];

		int indiceDominio = random.nextInt(dominios.length);
		String correo = dominios[indiceDominio];

		return usuario + correo;
	}

	public static String correoAleatorio() {
		return correoAleatorio(USUARIOS, DOMINIOS);
	}
	
	public static final String[] NOMBRESCLIENTE = {"Mike", "Sofía", "Pedro", "Laura", "Gabriel" };

	public static final String[] APELLIDOSCLEINTE = {"López", "Towers", "Torres", "Rodríguez", "Hernández" };

	public static final String nombreAleatorioCliente(String[] nombres, String[] apellidos) {

		Random random = new Random();

		int indiceNombre = random.nextInt(nombres.length);
		String nombre = nombres[indiceNombre];

		int indiceApellido = random.nextInt(apellidos.length);
		String apellido = apellidos[indiceApellido];

		return nombre + " " + apellido;
	}

	public static String nombreAleatorioCliente() {
		return nombreAleatorioCliente(NOMBRES, APELLIDOS);

	}
}
