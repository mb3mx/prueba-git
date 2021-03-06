package mx.com.teclo.siye.api.rest.ordenServicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import mx.com.teclo.arquitectura.ortogonales.exception.BusinessException;

import mx.com.teclo.arquitectura.ortogonales.exception.NotFoundException;
import mx.com.teclo.siye.negocio.service.ordenServicio.OrdenServicioService;
import mx.com.teclo.siye.persistencia.vo.proceso.OrdenServicioVO;

@RestController
@RequestMapping("/ordenServicio")
public class OrdenServicioRestController {

	@Autowired
	private OrdenServicioService ordenServicioService;

	@RequestMapping(value = "/consultaOrden", method = RequestMethod.GET)
	@PreAuthorize("hasAnyAuthority('CONSULTA_SOLICITUD')")
	public ResponseEntity<List<OrdenServicioVO>> consultaOrden(@RequestParam(value="cdTipoBusqueda") String cdTipoBusqueda, @RequestParam(value="valor") String valor) throws NotFoundException {
		List<OrdenServicioVO> listOrdenServicioVO = ordenServicioService.consultaOrden(cdTipoBusqueda, valor);
		return new ResponseEntity<List<OrdenServicioVO>>(listOrdenServicioVO, HttpStatus.OK);
	}
	
	@RequestMapping(value ="/updateOrden", method = RequestMethod.PUT)
	@PreAuthorize("hasAnyAuthority('ACTUALIZACION_ORDEN_SERVICIO')")
	public ResponseEntity<OrdenServicioVO> updateOrden(@RequestBody OrdenServicioVO osVO) throws NotFoundException, BusinessException{
		Boolean  status = ordenServicioService.actualizaOrdenServicio(osVO);
		OrdenServicioVO osVOr = new OrdenServicioVO();
		if (status) {
			osVOr = ordenServicioService.findOrdenServicio(osVO.getIdOrdenServicio());
		}
		return new ResponseEntity<OrdenServicioVO>(osVOr,  HttpStatus.OK);
	}
	
	@RequestMapping(value = "/getOrdenServicio", method = RequestMethod.GET)
	@PreAuthorize("hasAnyAuthority('ACTUALIZACION_ORDEN_SERVICIO')")
	public ResponseEntity<OrdenServicioVO> getOrdenServicio(@RequestParam(value="idOrdenservicio", required=true) Long id) throws NotFoundException, BusinessException{
		OrdenServicioVO osVO = ordenServicioService.findOrdenServicio(id);
		
		return new ResponseEntity<OrdenServicioVO>(osVO,HttpStatus.OK);
	}
	
	

}
