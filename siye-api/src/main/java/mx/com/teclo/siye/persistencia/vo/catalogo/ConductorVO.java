package mx.com.teclo.siye.persistencia.vo.catalogo;

import java.io.Serializable;
/*
 * 
 * Clase que representa un Conductor o Transportista
 * 
 * @author josec.castillo48@gmail.com
 *
 */
public class ConductorVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -621002232129680385L;
	
	private Integer idConductor;
	private String nbConductor;
	private String nbApepatConductor;
	private String nbApematConductor;
	
	public Integer getIdConductor() {
		return idConductor;
	}
	public void setIdConductor(Integer idConductor) {
		this.idConductor = idConductor;
	}
	public String getNbConductor() {
		return nbConductor;
	}
	public void setNbConductor(String nbConductor) {
		this.nbConductor = nbConductor;
	}
	public String getNbApepatConductor() {
		return nbApepatConductor;
	}
	public void setNbApepatConductor(String nbApepatConductor) {
		this.nbApepatConductor = nbApepatConductor;
	}
	public String getNbApematConductor() {
		return nbApematConductor;
	}
	public void setNbApematConductor(String nbApematConductor) {
		this.nbApematConductor = nbApematConductor;
	}
}
