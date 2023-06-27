package banco.transferencia;

import java.util.Date;

public class Transferencia {

	private Integer id;
	private Integer id_ordenante;
	private Integer id_beneficiario;
	private double importe;
	private String concepto;
	private Date fecha;

	public Transferencia(Integer id, Integer idOrdenante, Integer idBeneficiario, double importe, String concepto) {
		this.id = id;
		this.id_ordenante = idOrdenante;
		this.id_beneficiario = idBeneficiario;
		this.importe = importe;
		this.concepto = concepto;
		this.fecha = new Date();
	}

	public Transferencia(int idBeneficiario, int idOrdenante, String concepto2, double importe2) {
		this.id_ordenante = idOrdenante;
		this.id_beneficiario = idBeneficiario;
		this.importe = importe2;
		this.concepto = concepto2;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId_ordenante() {
		return id_ordenante;
	}

	public void setId_ordenante(Integer id_ordenante) {
		this.id_ordenante = id_ordenante;
	}

	public Integer getId_beneficiario() {
		return id_beneficiario;
	}

	public void setId_beneficiario(Integer id_beneficiario) {
		this.id_beneficiario = id_beneficiario;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
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
		return "El beneficiario " + id_beneficiario + " ha sido enviada desde la cuenta " + id_ordenante
				+ " bajo el concepto " + concepto + " por la cantidad de " + importe + ". Nro de Referencia " + id;
	}

}
