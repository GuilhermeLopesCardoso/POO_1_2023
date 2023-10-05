package aula170823;
import javax.swing.*;
public class Carro {
	String marca;
	String cor;
	int ano;
	
	void cadastro() {
		marca = JOptionPane.showInputDialog("Informe a marca do carro: ");
		cor = JOptionPane.showInputDialog("Informe a cor do carro: ");
		ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de fabricação do carro"));
	}
	String exibirdados() {
		return marca + " - " + ano + " - " + cor+"\n";
	}
}
