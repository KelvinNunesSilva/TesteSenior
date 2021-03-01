package model;

import java.sql.Time;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
	
public class Sala {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer numeroSala;
	
	@Column
	private LocalDateTime horaCadastro;
	
	@Column
	private String professorSala;
	
	@Column
	private Time intervalo;
	
	@Column
	private Time horaInicioAula;
	
	@Column
	private Time horaFinalAula;

	@ManyToOne
	@JoinColumn
	@Column
	private Aluno Aluno;

	public Aluno getAluno() {
		return Aluno;
	}

	public void setAluno(Aluno aluno) {
		Aluno = aluno;
	}

	

	public Integer getNumeroSala() {
		return numeroSala;
	}

	public void setNumeroSala(Integer numeroSala) {
		this.numeroSala = numeroSala;
	}

	public LocalDateTime getHoraCadastro() {
		return horaCadastro;
	}

	public void setHoraCadastro(LocalDateTime horaCadastro) {
		this.horaCadastro = horaCadastro;
	}

	public String getProfessorSala() {
		return professorSala;
	}

	public void setProfessorSala(String professorSala) {
		this.professorSala = professorSala;
	}

	public Time getIntervalo() {
		return intervalo;
	}

	public void setIntervalo(Time intervalo) {
		this.intervalo = intervalo;
	}

	public Time getHoraInicioAula() {
		return horaInicioAula;
	}

	public void setHoraInicioAula(Time horaInicioAula) {
		this.horaInicioAula = horaInicioAula;
	}

	public Time getHoraFinalAula() {
		return horaFinalAula;
	}

	public void setHoraFinalAula(Time horaFinalAula) {
		this.horaFinalAula = horaFinalAula;
	}

	
	
	
}
