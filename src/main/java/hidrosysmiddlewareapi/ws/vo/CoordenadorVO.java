package hidrosysmiddlewareapi.ws.vo;

public class CoordenadorVO {
	
	private String macCoordenador;
	private String macDispositivo;
	private String endPoint;
	private String empresaId;
	
	
	public String getMacCoordenador() {
		return macCoordenador;
	}
	public void setMacCoordenador(String macCoordenador) {
		this.macCoordenador = macCoordenador;
	}
	public String getMacDispositivo() {
		return macDispositivo;
	}
	public void setMacDispositivo(String macDispositivo) {
		this.macDispositivo = macDispositivo;
	}
	public String getEndPoint() {
		return endPoint;
	}
	public void setEndPoint(String endPoint) {
		this.endPoint = endPoint;
	}
	public String getEmpresaId() {
		return empresaId;
	}
	public void setEmpresaId(String empresaId) {
		this.empresaId = empresaId;
	}
}
