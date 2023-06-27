package banco.pruebas;

import banco.modelos.Gestor;

public class PruebasGestor {

	public static void main(String[] args) {
		Gestor gestor = new Gestor(1, "Guiller", "1234", "guiller@correo.com");
		
//		Gestor gestorb = new Gestor(2, "Ana", "1235", "ana@correo.com");
		System.out.println(gestor);
		
//		Gestor gestorb = new Gestor();
//		gestorb.setId(2);
//		gestorb.setUsuario("Ana");
//		gestorb.setPassword("1235");
//		gestorb.setCorreo("ana@correo.com");
//		
		if(gestor.equals(gestor)) {
			System.out.println("Son el mismo gestor"); 
		} else {
			System.out.println("Son gestores distintos"); 
		}
	}

}
