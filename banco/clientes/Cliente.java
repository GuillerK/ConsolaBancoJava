package banco.clientes;

public class Cliente {
	
	private Integer id;
	private Integer id_gestor;
	private String usuario;
	private String password;
	private String correo;
	private double saldo;
	
	public Cliente(Integer id, Integer id_gestor, String usuario, String password, String correo, double saldo) {
		this.id = id;
		this.id_gestor = id_gestor;
		this.usuario = usuario;
		this.password = password;
		this.correo = correo;
		this.saldo = saldo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId_gestor() {
		return id_gestor;
	}

	public void setId_gestor(Integer id_gestor) {
		this.id_gestor = id_gestor;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String toString() {
		return  "Hola, bienvenido/a " + this.usuario + ", tu saldo actual es: " + this.saldo;
	}
	public boolean equals(Object o) {
		Cliente c = (Cliente) o;
		boolean mismoId = this.id == c.id;
		return mismoId;
	}
}
