package mx.com.teclo.siye.persistencia.hibernate.dto.proceso;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TIE030D_IE_KIT_INSTALACION")
public class KitInstalacionDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8058271907510016963L;

	@Id
	@Column(name = "ID_KIT_INSTALACION", unique = true, nullable = false, precision = 11, scale = 0)
	private Long idKitInstalacion;

	@Column(name = "CD_KIT_INSTALACION", nullable = false, length = 15)
	private String cdKitInstalacion;

	@Column(name = "ST_ACTIVO", nullable = false, precision = 1, scale = 0)
	private Boolean stActivo;

	@Column(name = "ID_USR_CREACION", nullable = false, precision = 11, scale = 0)
	private Long idUsrCreacion;

	@Column(name = "FH_CREACION", nullable = false, length = 7)
	private Date fhCreacion;

	@Column(name = "ID_USR_MODIFICA", nullable = false, precision = 11, scale = 0)
	private Long idUsrModifica;

	@Column(name = "FH_MODIFICACION", nullable = false, length = 7)
	private Date fhModificacion;

	/**
	 * @return the idKitInstalacion
	 */
	public Long getIdKitInstalacion() {
		return idKitInstalacion;
	}

	/**
	 * @param idKitInstalacion the idKitInstalacion to set
	 */
	public void setIdKitInstalacion(Long idKitInstalacion) {
		this.idKitInstalacion = idKitInstalacion;
	}

	/**
	 * @return the cdKitInstalacion
	 */
	public String getCdKitInstalacion() {
		return cdKitInstalacion;
	}

	/**
	 * @param cdKitInstalacion the cdKitInstalacion to set
	 */
	public void setCdKitInstalacion(String cdKitInstalacion) {
		this.cdKitInstalacion = cdKitInstalacion;
	}

	/**
	 * @return the stActivo
	 */
	public Boolean getStActivo() {
		return stActivo;
	}

	/**
	 * @param stActivo the stActivo to set
	 */
	public void setStActivo(Boolean stActivo) {
		this.stActivo = stActivo;
	}

	/**
	 * @return the idUsrCreacion
	 */
	public Long getIdUsrCreacion() {
		return idUsrCreacion;
	}

	/**
	 * @param idUsrCreacion the idUsrCreacion to set
	 */
	public void setIdUsrCreacion(Long idUsrCreacion) {
		this.idUsrCreacion = idUsrCreacion;
	}

	/**
	 * @return the fhCreacion
	 */
	public Date getFhCreacion() {
		return fhCreacion;
	}

	/**
	 * @param fhCreacion the fhCreacion to set
	 */
	public void setFhCreacion(Date fhCreacion) {
		this.fhCreacion = fhCreacion;
	}

	/**
	 * @return the idUsrModifica
	 */
	public Long getIdUsrModifica() {
		return idUsrModifica;
	}

	/**
	 * @param idUsrModifica the idUsrModifica to set
	 */
	public void setIdUsrModifica(Long idUsrModifica) {
		this.idUsrModifica = idUsrModifica;
	}

	/**
	 * @return the fhModificacion
	 */
	public Date getFhModificacion() {
		return fhModificacion;
	}

	/**
	 * @param fhModificacion the fhModificacion to set
	 */
	public void setFhModificacion(Date fhModificacion) {
		this.fhModificacion = fhModificacion;
	}


	

}
