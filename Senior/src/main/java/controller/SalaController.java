package controller;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.AlunoModel;
import model.SalaModel;

public class SalaController {

	private SalaModel sala;

	public Integer getQuantidadeSalas() {
		int quantidadeSalas = salasCadastradas.size();
		return quantidadeSalas;
	}

	public SalaModel cadastraSala(SalaModel sala) {

		String nomeSala = JOptionPane.showInputDialog("Digite o nome da sala");
		if (nomeSala == null) {
			JOptionPane.showMessageDialog(null, "Campo obrigatório");
		} else {
			sala.setNomeSala(nomeSala);
		}
		String materiaSala = JOptionPane.showInputDialog("Digite o nome da matéria que será apresentada");

		if (materiaSala == null) {
			JOptionPane.showMessageDialog(null, "Campo obrigatório");
		} else {

			sala.setMateria(materiaSala);

		}

		String professorSala = JOptionPane.showInputDialog("Digite o nome do professor da matéria " + materiaSala);
		if (professorSala == null) {
			JOptionPane.showMessageDialog(null, "Campo obrigatório");

		} else {
			sala.setProfessorSala(professorSala);
		}

		return sala;

	}

}
