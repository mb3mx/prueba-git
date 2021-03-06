package mx.com.teclo.siye.negocio.service.proceso;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.com.teclo.arquitectura.ortogonales.exception.BusinessException;
import mx.com.teclo.arquitectura.ortogonales.util.ResponseConverter;
import mx.com.teclo.siye.persistencia.hibernate.dao.encuesta.UsuarioEncuentaDAO;
import mx.com.teclo.siye.persistencia.hibernate.dao.proceso.DispositivosDAO;
import mx.com.teclo.siye.persistencia.hibernate.dao.proceso.OrdenServicioDAO;
import mx.com.teclo.siye.persistencia.hibernate.dao.proceso.PlanProcesoDAO;
import mx.com.teclo.siye.persistencia.hibernate.dao.procesoencuesta.ProcesoEncuestaDAO;
import mx.com.teclo.siye.persistencia.hibernate.dto.encuesta.UsuarioEncuestaDTO;
import mx.com.teclo.siye.persistencia.hibernate.dto.proceso.KitDispositivoDTO;
import mx.com.teclo.siye.persistencia.hibernate.dto.proceso.OrdenServicioDTO;
import mx.com.teclo.siye.persistencia.hibernate.dto.proceso.PlanProcesoDTO;
import mx.com.teclo.siye.persistencia.hibernate.dto.procesoencuesta.ProcesoEncuestaDTO;
import mx.com.teclo.siye.persistencia.vo.proceso.DispositivosVO;

import mx.com.teclo.siye.persistencia.vo.proceso.PlanProcesoVO;
import mx.com.teclo.siye.util.enumerados.RespuestaHttp;




@Service
public class ProcesoServiceImpl implements ProcesoService {

	@Autowired
	private OrdenServicioDAO ordenServicioDAO;

	@Autowired
	private PlanProcesoDAO planProcesoDAO;
	
	@Autowired
	private ProcesoEncuestaDAO procesoEncuestaDAO;
	
	@Autowired
	private DispositivosDAO dispositivosDAO;
	
	@Autowired
	private UsuarioEncuentaDAO usuarioEncuentaDAO;
	

	@Override
	@Transactional
	public OrdenServicioDTO getInfoBasicaOrdenServicio(Long idSolicitud) {
		return ordenServicioDAO.obtenerOrdenServicio(idSolicitud);
	}

	@Override
	@Transactional
	public List<PlanProcesoDTO> getPlanOrdenServicio(Long idPlan) {
		return planProcesoDAO.obtenerPorcesosPlan(idPlan);	
	}

	@Override
	@Transactional
    public List<ProcesoEncuestaDTO> getEncuestasProceso(Long idProceso) {
	return procesoEncuestaDAO.obtenerEncuestasProceso(idProceso);
    }

	@Override
	@Transactional
	public List<DispositivosVO> getKitDispositivo(Long idTpKit) throws BusinessException {
		
		List<KitDispositivoDTO> listaDispositivosDTO = dispositivosDAO.getListDispositivos(idTpKit);
		if(listaDispositivosDTO.isEmpty())
			throw new BusinessException("No se encontrarón dispositivos");
			
		List<DispositivosVO> listaDispositivosVO = ResponseConverter.converterLista
				(new ArrayList<>(), listaDispositivosDTO, DispositivosVO.class);
		
		return listaDispositivosVO;
	}
	
	@Override
	@Transactional
	public List<UsuarioEncuestaDTO> obtenerEncuestas(Long orden) {

		return usuarioEncuentaDAO.getEncuestasPorOrden(orden);
	}
	
	@Override
	public List<PlanProcesoVO> revisarEncuestasCompletas(List<UsuarioEncuestaDTO> encuestasByUsuario,List<PlanProcesoVO> plan, Long idencuesta)
	{
    	List<ProcesoEncuestaDTO> procesoEncuestaDTO = new ArrayList<ProcesoEncuestaDTO>();
		if(encuestasByUsuario.size()>0)
		{
			
		}else
		{
			for(PlanProcesoVO actual:plan)
			{
			procesoEncuestaDTO=procesoEncuestaDAO.obtenerEncuestasProceso(actual.getIdPlanProceso());
				
			}
			

			
		}
		return null;
	}
		
		
		

}
