package state;

public class EstadoCandidatoEmAnalise extends EstadoCandidato {
	private EstadoCandidatoEmAnalise() {};
	private static EstadoCandidatoEmAnalise instance = new EstadoCandidatoEmAnalise();
	
	public static EstadoCandidatoEmAnalise getInstance() {
		return instance;
	}
	
	public String getEstado() {
		return "Em Análise";
	}
	
	public boolean reprovar(Candidato candidato) {
		candidato.setEstado(EstadoCandidatoReprovado.getInstance());
		return true;
	}
	
	public boolean colocarEmExcedente(Candidato candidato) {
		candidato.setEstado(EstadoCandidatoExcedente.getInstance());
		return true;
	}
	
	public boolean aprovar(Candidato candidato) {
		candidato.setEstado(EstadoCandidatoAprovado.getInstance());
		return true;
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
