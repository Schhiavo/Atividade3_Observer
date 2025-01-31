package state;

public class EstadoCandidatoEliminado extends EstadoCandidato {
	private EstadoCandidatoEliminado() {};
	private static EstadoCandidatoEliminado instance = new EstadoCandidatoEliminado();
	
	public static EstadoCandidatoEliminado getInstance() {
		return instance;
	}
	
	public String getEstado() {
		return "Eliminado";
	}
	
}
