package state;

public class Candidato {
	private String nome;
	private EstadoCandidato estado;
	
	public Candidato() {
		this.estado = EstadoCandidatoEmAnalise.getInstance();
	}
		
	public boolean colocarEmAnalise() {
		return estado.colocarEmAnalise(this);
	}
	
	public boolean reprovar() {
		return estado.reprovar(this);
	}
	
	public boolean colocarEmExcedente() {
		return estado.colocarEmExcedente(this);
	}
	
	public boolean aprovar() {
		return estado.aprovar(this);
	}
	
	public boolean colocarEmRecurso() {
		return estado.colocarEmRecurso(this);
	}
	
	public boolean homologar() {
		return estado.homologar(this);
	}
	
	public boolean eliminar() {
		return estado.eliminar(this);
	}
	
	public void setEstado(EstadoCandidato estado) {
		this.estado = estado;
	}
	
	public String getNomeEstado() {
        return estado.getEstado();
    }
	
	public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public EstadoCandidato getEstado() {
    	return estado;
    }
	
}
