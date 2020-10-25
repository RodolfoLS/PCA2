package dominio;

import java.util.Date;

public class Evento {

	private Date dataEvento;
	private String nomeEvento;
	private String descricaoEvento;
	private String qtdVagas;
	private Aluno aluno;
	public Date getDataEvento() {
		return dataEvento;
	}
	public void setDataEvento(Date dataEvento) {
		this.dataEvento = dataEvento;
	}
	public String getNomeEvento() {
		return nomeEvento;
	}
	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}
	public String getDescricaoEvento() {
		return descricaoEvento;
	}
	public void setDescricaoEvento(String descricaoEvento) {
		this.descricaoEvento = descricaoEvento;
	}
	public String getQtdVagas() {
		return qtdVagas;
	}
	public void setQtdVagas(String qtdVagas) {
		this.qtdVagas = qtdVagas;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public Evento(Date dataEvento, String nomeEvento, String descricaoEvento, String qtdVagas, Aluno aluno) {
		super();
		this.dataEvento = dataEvento;
		this.nomeEvento = nomeEvento;
		this.descricaoEvento = descricaoEvento;
		this.qtdVagas = qtdVagas;
		this.aluno = aluno;
	}
	
	
	
}
