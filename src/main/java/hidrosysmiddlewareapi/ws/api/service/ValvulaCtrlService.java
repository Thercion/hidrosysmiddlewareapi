package hidrosysmiddlewareapi.ws.api.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import hidrosysmiddlewareapi.ws.vo.CoordenadorVO;

@Path("ValvulaCtrlService")
public class ValvulaCtrlService {
	
	@POST
	@Path("/desativarAbastecimento")
	@Consumes({MediaType.APPLICATION_JSON})
	public void desativarAbastecimento(CoordenadorVO coordenadorVO){
		System.out.println(coordenadorVO.getMacCoordenador());
		coordenadorVO.getEmpresaId();
	}

	@POST
	@Path("/ativarAbastecimento")
	@Consumes({MediaType.APPLICATION_JSON})	
	public void ativarAbastecimento(CoordenadorVO coordenadorVO){
		System.out.println(coordenadorVO.getMacCoordenador());
	}

}
