package state;

import java.util.Observable;
import java.util.Observer;

public class RH implements Observer{
	private String nome;
	private String ultimaNotificacao;
	
	public RH(String nome) {
		this.nome = nome;
	}
	
	public String getUltimaNotificacao() {
		return this.ultimaNotificacao;
	}
	
	public void update(Observable candidato, Object arg1) {
		this.ultimaNotificacao = candidato.toString(); 
	}
}
