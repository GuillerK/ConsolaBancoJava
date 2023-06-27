package banco.pruebas;

import banco.modelos.Cliente;

public class PruebasCliente {
	
	public static void main(String[] args) {
		Cliente cliente = new Cliente (1, "Andrea", "1234" , "correo@correo.es");
		System.out.println(cliente);
	}


}
