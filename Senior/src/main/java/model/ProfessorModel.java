package model;

import javax.persistence.Column;
import javax.persistence.Id;

import com.sun.istack.NotNull;

public class ProfessorModel {
	
	@NotNull
	@Column
	private String nome;
	
	@Id
	@Column 
	@NotNull
	private Integer Id;
	
	@NotNull
	@Column
	private SalaModel salaProfessor;	
	
		
}
