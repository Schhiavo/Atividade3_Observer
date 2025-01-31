package state;

public class EstadoCandidatoAprovado extends EstadoCandidato{
	private EstadoCandidatoAprovado() {};
	private static EstadoCandidatoAprovado instance = new EstadoCandidatoAprovado();
	
	public static EstadoCandidatoAprovado getInstance() {
		return instance;
	}
	
	public String getEstado() {
		return "Aprovado";
	}
	
	public boolean colocarEmAnalise(Candidato candidato) {
		candidato.setEstado(EstadoCandidatoAprovado.getInstance());
		return true;
	}
	
	public boolean homologar(Candidato candidato) {
		candidato.setEstado(EstadoCandidatoHomologado.getInstance());
		return true;
	}
}
