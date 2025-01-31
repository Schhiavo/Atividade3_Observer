package state;

public class EstadoCandidatoEmRecurso extends EstadoCandidato{
	private EstadoCandidatoEmRecurso() {};
	private static EstadoCandidatoEmRecurso instance = new EstadoCandidatoEmRecurso();
	
	public static EstadoCandidatoEmRecurso getInstance() {
		return instance;
	}
	
	public String getEstado() {
		return "Em Recurso";
	}
	
	public boolean homologar(Candidato candidato) {
		candidato.setEstado(EstadoCandidatoHomologado.getInstance());
		return true;
	}
	
	public boolean eliminar(Candidato candidato) {
		candidato.setEstado(EstadoCandidatoEliminado.getInstance());
		return true;
	}
}
