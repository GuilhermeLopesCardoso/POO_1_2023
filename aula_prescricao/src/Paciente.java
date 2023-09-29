import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Paciente {
	private String nome;
	private String sintoma;
	char sin;
	char condsau;

	public Paciente(){
		cadastra();
	}
	private ArrayList<Medicamento> MedPresc = new ArrayList<Medicamento>();
	
	public void cadastra() {
		setNome( JOptionPane.showInputDialog("infome o nome do paciente:"));
		setSintoma (JOptionPane.showInputDialog("informe o sintoma(gripe,febre ou nausea)"));
		sin = sintoma.toUpperCase().charAt(0);
		setCondsau (JOptionPane.showInputDialog("informe a contraindicação(gripe,febre ou nausea)").toUpperCase().charAt(0));
	}
	ArrayList<Medicamento> getMedPresc() {
		return MedPresc;
	}
	String exibirDadosPac(){
		return "Paciente - " + nome + " está com " + sintoma + "\n" + MedPresc + "\n";
	}
	
	
	
	
	
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSintoma() {
		return sintoma;
	}
	public void setSintoma(String sintoma) {
		this.sintoma = sintoma;
	}
	public char getSin() {
		return sin;
	}
	public void setSin(char sin) {
		this.sin = sin;
	}
	public char getCondsau() {
		return condsau;
	}
	public void setCondsau(char condsau) {
		this.condsau = condsau;
	}

	
}
