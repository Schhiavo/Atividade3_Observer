package state;

public class EstadoCandidatoExcedente extends EstadoCandidato {
	private EstadoCandidatoExcedente() {};
	private static EstadoCandidatoExcedente instance = new EstadoCandidatoExcedente();
	
	public static EstadoCandidatoExcedente getInstance() {
		return instance;
	}
	
	public String getEstado() {
		return "Excedente";
	}
	
	public boolean colocarEmAnalise(Candidato candidato) {
		candidato.setEstado(EstadoCandidatoAprovado.getInstance());
		return true;
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
