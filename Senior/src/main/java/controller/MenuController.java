package controller;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.AlunoModel;
import model.SalaModel;

public class MenuController {

	public void Menu() {
		String resposta = JOptionPane.showInputDialog("Menu: " + "/N" + "Digite 'Aluno' para cadastrar um novo aluno"
				+ "/N" + "Digite 'Sala' para cadastrar nova Sala" + "/N"	
				+ "Digite 'Alunos' para ver os alunos cadastrados" + "/N"
				+ "Digite 'Salas' para ver salas cadastradas");
		switch (resposta) {
		
		case "Aluno":
			ArrayList<AlunoModel> alunosCadastrados = new ArrayList();
			AlunoController aluno = new AlunoController();
			AlunoModel alunoModelo = new AlunoModel();
			aluno.cadastraAluno(alunoModelo);
			alunosCadastrados.add(alunoModelo);
			String respostaAluno = JOptionPane
					.showInputDialog("Deseja adicionar mais um Aluno?" + "N/" + "Responda com 'Sim' ou 'Não'");
			
				switch(respostaAluno){
					case "Sim": 
						aluno.cadastraAluno(alunoModelo);
				
					case "Não": 	
						Menu();
				}
			Menu();

		case "Sala":
			ArrayList<SalaModel> salasCadastradas = new ArrayList();
				SalaModel salaModelo = new SalaModel();
				SalaController sala = new SalaController();
				sala.cadastraSala(salaModelo);
				salasCadastradas.add(salaModelo);
				
				String respostaSala = JOptionPane
						.showInputDialog("Deseja adicionar mais uma sala?" + "N/" + "Responda com 'Sim' ou 'Não'");
				
					switch(respostaSala) {
						case "Sim": 
							sala.cadastraSala(salaModelo);
							salasCadastradas.add(salaModelo);
							
							System.out.println("Detalhes da sala cadastrada: " + "N/" + "Nome da sala: " + salaModelo.getNomeSala()
							+ "N/" + "Professor: " + salaModelo.getProfessorSala() + "N/" + "Matéria: "
							+ salaModelo.getMateria());
						case "Não": 	
							Menu();
					}
				
			}
			Menu();

		case "Alunos" != null:
			for (AlunoModelo aluno: alunosCadastrados) {
				System.out.println("Nome aluno: " + alunoModelo1.getNomeAluno()

				);
			}
			Menu();
		}

}
