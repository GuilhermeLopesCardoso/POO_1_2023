import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal_Prescrição {
	
	private static ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
	private static ArrayList<Medicamento> medicamentos = new ArrayList<Medicamento>();


	public static void main(String[] args) {
		int op = 0;
		do {
			op = menu();
			switch (op) {
			case 1:
				pacientes.add(new Paciente());
				break;
			case 2:
				medicamentos.add(new Medicamento());
				break;
			case 3:
				prescrição();
				break;
			case 4:
				listar();
				break;
			}
			}while(op != 99);
		
			}
			public static int menu() {
				String menu = "1 - Cadastrar Paciente\n"
						+ "2 - Cadastrar Medicamento\n"
						+ "3 - Fazer Prescrição\n"
						+ "4 - Listar Pacientes\n"
						+ "99 - Sair";
				return Integer.parseInt(JOptionPane.showInputDialog(menu));
			}
	
			public static void prescrição() {
				Paciente p = Util_med.selecionaPaciente(pacientes);
				Medicamento m =  Util_med.selecionaMedicamento(medicamentos);
				if((p.getSin())== (m.getContraind())) {
					JOptionPane.showMessageDialog(null, "Esse medicamento é contraindicado a essa pessoa ");
					menu();
				}
				else if ((p.getSin())!= (m.getInd())) {
					JOptionPane.showMessageDialog(null, "Esse medicamento não é indicado a esse sintoma ");
					menu();
				}
				else {
					p.getMedPresc().add(m);
				}
			}
			public static void listar() {
				for (Paciente p : pacientes) {
					JOptionPane.showMessageDialog(null, p.exibirDadosPac());
				}
			}
	public static ArrayList<Paciente> getPacientes() {
		return pacientes;
	}


	public static void setPacientes(ArrayList<Paciente> pacientes) {
		Principal_Prescrição.pacientes = pacientes;
	}


	public static ArrayList<Medicamento> getMedicamentos() {
		return medicamentos;
	}

	public static void setMedicamentos(ArrayList<Medicamento> medicamentos) {
		Principal_Prescrição.medicamentos = medicamentos;
	}
	



}