package state;

public class EstadoCandidatoHomologado extends EstadoCandidato {
	private EstadoCandidatoHomologado() {};
	private static EstadoCandidatoHomologado instance = new EstadoCandidatoHomologado();
	
	public static EstadoCandidatoHomologado getInstance() {
		return instance;
	}
	
	public String getEstado() {
		return "Homologado";
	}
}
