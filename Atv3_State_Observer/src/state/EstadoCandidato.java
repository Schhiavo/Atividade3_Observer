package state;

public abstract class EstadoCandidato {
	public abstract String getEstado();
	
	public boolean colocarEmAnalise(Candidato candidato) {
		return false;
	}
	
	public boolean reprovar(Candidato candidato) {
		return false;
	}
	
	public boolean colocarEmExcedente(Candidato candidato) {
		return false;
	}
	
	public boolean aprovar(Candidato candidato) {
		return false;
	}
	
	public boolean colocarEmRecurso(Candidato candidato) {
		return false;
	}
	
	public boolean homologar(Candidato candidato) {
		return false;
	}
	
	public boolean eliminar(Candidato candidato) {
		return false;
	}
}
