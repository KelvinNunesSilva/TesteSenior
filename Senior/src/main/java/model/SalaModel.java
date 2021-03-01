package model;

import java.util.ArrayList;

public class SalaModel {
	private AlunoModel aluno;
	private String materia;
	private String nomeSala;
	private ProfessorModel professor;
	public ArrayList alunosDaSala = new ArrayList<AlunoModel>();
	public Integer numero;
	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}


	private AlunoModel alunoSala;
	private String professorSala;

	private Integer idSala;
	
	public Integer getIdSala() {
		return idSala;
	}

	public void setIdSala(Integer idSala) {
		this.idSala = idSala;
	}

	public String getNomeSala() {
		return nomeSala;
	}

	public void setNomeSala(String nomeSala) {
		this.nomeSala = nomeSala;
	}

	public ArrayList getAlunosDaSala() {
		return alunosDaSala;
	}

	public void adicionaAlunos	(AlunoModel aluno) {
		alunosDaSala.add(aluno);
	}

	public AlunoModel getAlunoSala() {
		return alunoSala;
	}

	public void setAlunoSala(AlunoModel alunoSala) {
		this.alunoSala = alunoSala;
	}

	public String getProfessorSala() {
		return professorSala;
	}

	public void setProfessorSala(String professorSala2) {
		professorSala = professorSala2;
	}

	
	public Integer getQuantidadeAlunos() {
		int quantidadeAlunos = alunosDaSala.size();
		return quantidadeAlunos;
	}
	
	public SalaModel(Integer id, String nome, ArrayList alunosSala, AlunoModel alunoSala, String professor) {
		super();
		this.idSala = id;
		this.nomeSala = nome;
		this.alunoSala = alunoSala;
		professorSala = professor;
	}

	public SalaModel() {
		// TODO Auto-generated constructor stub
	}
	
			




}	

