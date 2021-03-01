package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Builder;

@Entity
@Builder	
public class Aluno {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	

	@Column
	private String nome;

	@Column
	private String emailAluno;

	@Column
	private Integer salaAluno;

	@Column
	private Integer cpf_aluno;
	
	
	public String getNome() {
		return nome;
	}

	public String setNome() {
		this.nome = nome;
		return nome;
	}


	public Aluno() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmailAluno() {
		return emailAluno;
	}

	public void setEmailAluno(String emailAluno) {
		this.emailAluno = emailAluno;
	}

	public Integer getSalaAluno() {
		return salaAluno;
	}

	public void setSalaAluno(Integer salaAluno) {
		this.salaAluno = salaAluno;
	}

	public Integer getCpf_aluno() {
		return cpf_aluno;
	}

	public void setCpf_aluno(Integer cpf_aluno) {
		this.cpf_aluno = cpf_aluno;
	}

	public Aluno(Integer id, String nome, String emailAluno, Integer salaAluno, Integer cpf_aluno) {
		super();
		this.id = id;
		this.nome = nome;
		this.emailAluno = emailAluno;
		this.salaAluno = salaAluno;
		this.cpf_aluno = cpf_aluno;
	}

	public static void setNome(String string) {
		// TODO Auto-generated method stub
		
	}
}
