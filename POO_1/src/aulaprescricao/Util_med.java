import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Util_med {
	public static Paciente selecionaPaciente (ArrayList<Paciente> lista) {
		String menuP = "";
		int cont = 1;
		for (Paciente d : lista) {
			menuP = cont + " - " + d.getNome()+"\n";
			cont ++;
		}
		int escolha = Integer.parseInt(JOptionPane.showInputDialog(menuP));
		return lista.get(escolha-1);
	}
	public static Medicamento selecionaMedicamento (ArrayList<Medicamento> lista) {
		String menuM = "";
		int cont = 1;
		for (Medicamento m : lista) {
			menuM = cont + " - " + m.getNome()+"\n";
			cont ++;
		}
		int escolha = Integer.parseInt(JOptionPane.showInputDialog(menuM));
		return lista.get(escolha-1);
	}
}
