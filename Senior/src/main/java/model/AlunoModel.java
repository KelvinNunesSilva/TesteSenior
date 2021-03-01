package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.sun.istack.NotNull;

@Entity
public class AlunoModel {

	public AlunoModel() {
		super();
	}

	@Id
	@NotNull
	@Column(name = "id_aluno")
	private Integer alunoId = 0;
	
	@Column
	@NotNull
	private String nomeAluno;

	@Column
	private String emailAluno;

	@Column
	@NotNull
	private String salaAluno;
	
	//Getters and Setters
	
	public Integer getAlunoId() {
		return alunoId;
	}

	public void setAlunoId(Integer alunoId) {
		this.alunoId = alunoId;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public String setNomeAluno(String nomeAluno) {
		return this.nomeAluno = nomeAluno;
	}

	public String getEmailAluno() {
		return emailAluno;
	}

	public void setEmailAluno(String emailAluno) {
		this.emailAluno = emailAluno;
	}

	public String getSalaAluno() {
		return salaAluno;
	}

	public void setSalaAluno(String salaAluno) {
		this.salaAluno = salaAluno;
	}
	
	
	
	
	

}