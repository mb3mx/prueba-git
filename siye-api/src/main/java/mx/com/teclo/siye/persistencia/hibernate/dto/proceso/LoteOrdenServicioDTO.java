package mx.com.teclo.siye.persistencia.hibernate.dto.proceso;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "TIE025D_IE_LOTE_ODS")
public class LoteOrdenServicioDTO implements Serializable {

	private static final long serialVersionUID = 4814258386727191940L;
	
	@Id
	@Column(name = "ID_LOTE_ODS", unique = true, nullable = false)
	private Long idLoteOds;
	@Column(name = "CD_LOTE_ODS")
	private String cdLoteOds;
	@Column(name = "NB_LOTE_ODS")
	private String nbLoteOds;
	@Column(name = "ID_ST_SEGUIMIENTO")
	private Long idStSeguimiento;
	@Column(name = "NU_ODS_REPORTADOS")
	private Long nuOdsReportados;
	@Column(name = "NU_ODS_CARGADOS")
	private Long nuOdsCargados;
	@Column(name = "NU_ODS_ATENDIDOS")
	private Long nuOdsAtendidos;
	@Column(name = "NU_ODS_PENDIENTES")
	private Long nuOdsPendientes;
	@Column(name = "NU_ODS_INCIDENCIA")
	private Long nuOdsIncidencia;
	@Column(name = "TX_LOTE_ODS")
	private String txLoteOds;
	@Column(name = "ST_ACTIVO")
	private Boolean stActivo;
	@Column(name = "ID_USR_CREACION")
	private Long idUsrCreacion;
	@Column(name = "FH_CREACION")	
	private Date fhCreacion;
	@Column(name = "ID_USR_MODIFICA")
	private Long idUsrModifica;
	@Column(name = "FH_MODIFICACION")	
	private Date fhModificacion;
	
	public Long getIdLoteOds() {
		return idLoteOds;
	}
	public void setIdLoteOds(Long idLoteOds) {
		this.idLoteOds = idLoteOds;
	}
	public String getCdLoteOds() {
		return cdLoteOds;
	}
	public void setCdLoteOds(String cdLoteOds) {
		this.cdLoteOds = cdLoteOds;
	}
	public String getNbLoteOds() {
		return nbLoteOds;
	}
	public void setNbLoteOds(String nbLoteOds) {
		this.nbLoteOds = nbLoteOds;
	}
	public Long getIdStSeguimiento() {
		return idStSeguimiento;
	}
	public void setIdStSeguimiento(Long idStSeguimiento) {
		this.idStSeguimiento = idStSeguimiento;
	}
	public Long getNuOdsReportados() {
		return nuOdsReportados;
	}
	public void setNuOdsReportados(Long nuOdsReportados) {
		this.nuOdsReportados = nuOdsReportados;
	}
	public Long getNuOdsCargados() {
		return nuOdsCargados;
	}
	public void setNuOdsCargados(Long nuOdsCargados) {
		this.nuOdsCargados = nuOdsCargados;
	}
	public Long getNuOdsAtendidos() {
		return nuOdsAtendidos;
	}
	public void setNuOdsAtendidos(Long nuOdsAtendidos) {
		this.nuOdsAtendidos = nuOdsAtendidos;
	}
	public Long getNuOdsPendientes() {
		return nuOdsPendientes;
	}
	public void setNuOdsPendientes(Long nuOdsPendientes) {
		this.nuOdsPendientes = nuOdsPendientes;
	}
	public Long getNuOdsIncidencia() {
		return nuOdsIncidencia;
	}
	public void setNuOdsIncidencia(Long nuOdsIncidencia) {
		this.nuOdsIncidencia = nuOdsIncidencia;
	}
	public String getTxLoteOds() {
		return txLoteOds;
	}
	public void setTxLoteOds(String txLoteOds) {
		this.txLoteOds = txLoteOds;
	}
	public Boolean getStActivo() {
		return stActivo;
	}
	public void setStActivo(Boolean stActivo) {
		this.stActivo = stActivo;
	}
	public Long getIdUsrCreacion() {
		return idUsrCreacion;
	}
	public void setIdUsrCreacion(Long idUsrCreacion) {
		this.idUsrCreacion = idUsrCreacion;
	}
	public Date getFhCreacion() {
		return fhCreacion;
	}
	public void setFhCreacion(Date fhCreacion) {
		this.fhCreacion = fhCreacion;
	}
	public Long getIdUsrModifica() {
		return idUsrModifica;
	}
	public void setIdUsrModifica(Long idUsrModifica) {
		this.idUsrModifica = idUsrModifica;
	}
	public Date getFhModificacion() {
		return fhModificacion;
	}
	public void setFhModificacion(Date fhModificacion) {
		this.fhModificacion = fhModificacion;
	}
	
	
	

}
