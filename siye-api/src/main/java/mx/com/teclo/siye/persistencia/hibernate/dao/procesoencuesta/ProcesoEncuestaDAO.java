package mx.com.teclo.siye.persistencia.hibernate.dao.procesoencuesta;

import java.util.List;

import mx.com.teclo.arquitectura.persistencia.comun.dao.BaseDao;
import mx.com.teclo.siye.persistencia.hibernate.dto.procesoencuesta.ProcesoEncuestaDTO;

public interface ProcesoEncuestaDAO extends BaseDao<ProcesoEncuestaDTO>{
	
	/**
	 * Obtiene las encuestas del proceso
	 * 
	 * @param idProceso
	 * @return List<PlanProcesoDTO>
	 * David Guerra
	 */
	public List<ProcesoEncuestaDTO> obtenerEncuestasProceso(Long idProceso);

}
