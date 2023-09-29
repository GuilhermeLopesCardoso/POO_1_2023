package exercicio1;
import java.util.ArrayList;

import javax.swing.*;
public class Cadastra_carro {
public static void main(String[] args) {
	ArrayList<Carro> carros = new ArrayList<Carro>();
	String menu = "1 - Cadastrar \n"
			    + "2 - Listar Todos os Carros \n"
			    + "3 - Listar por Cor \n"
			    + "4 - Listar por Marca \n"
			    + "5 - Listar por Ano \n"
			    + "6 - Sair";
	int op = 0;
	do {
		op = Integer.parseInt(JOptionPane.showInputDialog(menu));
		
		//Cadastro Carro
		if(op==1) {
			Carro c = new Carro();
			c.cadastro();
			carros.add(c);
		}
		//Listar carros cadastrados
		
		if(op==2) {
			String todos = "Carros Cadastrados \n \n";
			for (Carro c : carros) {
				todos += c.exibirdados();
			}
			JOptionPane.showInputDialog(todos);
		})
	}
	
	
        
	
	}

}

