package controller;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.AlunoModel;

public class AlunoController {
	 private ArrayList<AlunoModel> listagemAlunos = new ArrayList<AlunoModel>();
	private AlunoModel aluno;
	
	public AlunoModel cadastraAluno(AlunoModel aluno) {
		String nome;
		String email;
		String nomeSala;
		
		int id = aluno.getAlunoId() + 1;
		aluno.setAlunoId(id);
		
		nome = JOptionPane.showInputDialog("Digite o nome do aluno");
		if (nome != null) {
			aluno.setNomeAluno(nome);
		}else if(nome == null) {
			JOptionPane.showMessageDialog(null,"Campo obrigatório");
		}

		email = JOptionPane.showInputDialog("Digite o email do aluno");
		if (email != null) {

			aluno.setEmailAluno(email);
		}else {
			JOptionPane.showMessageDialog(null,"Campo obrigatório");
		}

		nomeSala = JOptionPane.showInputDialog("Digite o nome da Sala");
		
		if (nomeSala != null) {
			SalaController Sala = new SalaController();
			aluno.setSalaAluno(nomeSala);
			 
			int quantidadeSala = Sala.getQuantidadeSalas();
			
			
		}else{
			JOptionPane.showMessageDialog(null,"Campo obrigatório");
		}
		
		
		
		listagemAlunos.add(aluno);
		
		return aluno;
		
	}

	

}
