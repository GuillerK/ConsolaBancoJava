package banco.mensajes;

import java.util.Date;

public class Mensaje {
	
	private Integer id;
	private Integer id_origen;
	private Integer id_destino;
	private String concepto;
	private Date fecha;
	

	public Mensaje(Integer id, Integer id_origen, Integer id_destino, String concepto) {
		this.id = id;
		this.id_origen = id_origen;
		this.id_destino = id_destino;
		this.concepto = concepto;
		this.fecha = new Date();
	}

	public Integer getId_transferencia() {
		return id;
	}


	public void setId_transferencia(Integer id) {
		this.id = id;
	}


	public Integer getId() {
		return id_origen;
	}


	public void setId(Integer id) {
		this.id_origen = id_origen;
	}


	public Integer getId_destino() {
		return id_destino;
	}


	public void setId_destino(Integer id_destino) {
		this.id_destino = id_destino;
	}


	public String getConcepto() {
		return concepto;
	}


	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	public String toString() {
		return  "La transferencia " + id + " ha sido enviada desde la cuenta " 
	+ id_origen + " con destino a " + id_destino + " bajo el concepto" + concepto;
	}
}
