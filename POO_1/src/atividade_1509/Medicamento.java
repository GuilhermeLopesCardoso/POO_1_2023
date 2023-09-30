package atividade_1509;

import javax.swing.JOptionPane;

public class Medicamento {
	String nome;
	char contraind;
	char ind;
	char adm;
	
	
	
	
	void cadastra() {
		nome = JOptionPane.showInputDialog("informe o nome");
		adm = JOptionPane.showInputDialog("informe a administração(injetável,tópico ou oral)").toUpperCase().charAt(0);
		ind = JOptionPane.showInputDialog("informe a indicação(gripe,febre ou nausea)").toUpperCase().charAt(0);
		contraind = JOptionPane.showInputDialog("Informe a contraindicação(gripe,febre ou nausea)").toUpperCase().charAt(0);
	}
	String exibirDadosMed() {

		return "(NÚMERO QUE VAI AUMENTANDO) - " + nome + "|indicado a:" + ind + "|Contraindicado a:" + contraind + "\n";
	}
		
}
