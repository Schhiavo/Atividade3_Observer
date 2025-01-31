package state;

import java.util.Observable;

public class Candidato extends Observable {
	private String nome;
	private EstadoCandidato estado;
	
	public Candidato() {
		this.estado = EstadoCandidatoEmAnalise.getInstance();
	}
		
	public boolean colocarEmAnalise() {
		setChanged();
        notifyObservers();
		return estado.colocarEmAnalise(this);
	}
	
	public boolean reprovar() {
		setChanged();
        notifyObservers();
		return estado.reprovar(this);
	}
	
	public boolean colocarEmExcedente() {
		setChanged();
        notifyObservers();
		return estado.colocarEmExcedente(this);
	}
	
	public boolean aprovar() {
		setChanged();
        notifyObservers();
		return estado.aprovar(this);
	}
	
	public boolean colocarEmRecurso() {
		setChanged();
        notifyObservers();
		return estado.colocarEmRecurso(this);
	}
	
	public boolean homologar() {
		setChanged();
        notifyObservers();
		return estado.homologar(this);
	}
	
	public boolean eliminar() {
		setChanged();
        notifyObservers();
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
