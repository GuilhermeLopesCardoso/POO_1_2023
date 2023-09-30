package exercicioCondominio;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal_condominio {
	
	
	private static ArrayList <Apartamento> apartamentos = new ArrayList<Apartamento>();
	private static ArrayList <Despesa> despesas = new ArrayList<Despesa>();
	
	
	public static void main(String[] args) {
		int op = 0;
		do {
			op = menu();
			switch (op) {
			case 1:
				apartamentos.add(new Apartamento());
				break;
			case 2:
				despesas.add(new Despesa());
				break;
			case 3:
				Listagem1();
				break;
			case 4:
				Listagem2();
				break;
			}
			}while(op != 99);
	}
	public static int menu() {
		String menu = "1 - Cadastrar Apartamento\n"
				+ "2 - Cadastrar Despesa\n"
				+ "3 - Listagem 1\n"
				+ "4 - Listagem 2\n"
				+ "99 - Sair";
		return Integer.parseInt(JOptionPane.showInputDialog(menu));
	}
	
		public static int numeroAp() {
		int con = 0;
		for(Apartamento a: apartamentos) {		
			con ++;
		}
		return con;
	}
	
	
	public static void Listagem1() {
		Double totaldesp = 0.0;
		int selecmes;
		int selecano;
		selecano = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o ano"));
		selecmes = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o mes"));
		
		for(Despesa d: despesas) {
			if (d.getMes()== selecmes && d.getAno()== selecano){
				Double valorporap = d.getVal()/numeroAp();
				totaldesp+=valorporap;
			}
		}
		for(Apartamento a: apartamentos) {
			Double valortot = a.getVal_fix()+totaldesp;
			JOptionPane.showMessageDialog(null,"O proprietario "+a.getPropri()+" deve: "+ valortot +"\n");
		}
	}
	public static void Listagem2() {
		Double totaldesp = 0.0;
		Double soma = 0.0;
		int selecmes;
		int selecano;
		int selecap;
		selecano = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o ano"));
		selecmes = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o mes"));
		selecap = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o Apartamento;"));
		for(Despesa d: despesas) {
			if (d.getMes()== selecmes && d.getAno()== selecano){
				Double valorporap = d.getVal()/numeroAp();
				totaldesp+=valorporap;
			}
		}
		for (Apartamento a: apartamentos) {
			if (a.getNum()== selecap) {
				soma = a.getVal_fix()+totaldesp;
			}
		}
		JOptionPane.showMessageDialog(null,"Esse Apartamento tem R$ "+soma+" de despesa total");
	}

}