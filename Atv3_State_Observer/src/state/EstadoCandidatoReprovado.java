package state;

public class EstadoCandidatoReprovado extends EstadoCandidato{
	private EstadoCandidatoReprovado() {};
	private static EstadoCandidatoReprovado instance = new EstadoCandidatoReprovado();
	
	public static EstadoCandidatoReprovado getInstance() {
		return instance;
	}
	
	public String getEstado() {
		return "Reprovado";
	}
	
	public boolean colocarEmRecurso(Candidato candidato) {
		candidato.setEstado(EstadoCandidatoEmRecurso.getInstance());
		return true;
	}
	
	public boolean eliminar(Candidato candidato) {
		candidato.setEstado(EstadoCandidatoEliminado.getInstance());
		return true;
	}
}
