package banco.modelos;

public class Cliente extends Usuario {
	
	private Integer idGestor;
	private double saldo;

	public Cliente(Integer id, String usuario, String password, String correo) {
		super(id, usuario, password, correo);

	}
	
	public Cliente(Integer id, String usuario, String password, String correo, Double saldo, Integer idGestor) {
		super(id, usuario, password, correo);
		this.idGestor = idGestor;
		this.saldo = saldo;
	}

	public Integer getIdGestor() {
		return idGestor;
	}

	public void setIdGestor(Integer idGestor) {
		this.idGestor = idGestor;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String toString() {
		return "Cliente{id: " + this.id + ", usuario" + this.usuario + " saldo " + this.saldo + "}";
	}

}
