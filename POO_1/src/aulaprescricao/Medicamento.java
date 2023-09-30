import javax.swing.JOptionPane;

public class Medicamento {
	String nome;
	char contraind;
	char ind;
	char adm;

	public Medicamento() {
		cadastra();
	}
	
	
	void cadastra() {
		setNome (JOptionPane.showInputDialog("informe o nome"));
		setAdm (JOptionPane.showInputDialog("informe a administração(injetável,tópico ou oral)").toUpperCase().charAt(0));
		setInd (JOptionPane.showInputDialog("informe a indicação(gripe,febre ou nausea)").toUpperCase().charAt(0));
		setContraind (JOptionPane.showInputDialog("Informe a contraindicação(gripe,febre ou nausea)").toUpperCase().charAt(0));
	}
	String exibirDadosMed() {
		return nome + "indicado a:" + ind + "|Contraindicado a:" + contraind + "\n";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public char getContraind() {
		return contraind;
	}
	public void setContraind(char contraind) {
		this.contraind = contraind;
	}
	public char getInd() {
		return ind;
	}
	public void setInd(char ind) {
		this.ind = ind;
	}
	public char getAdm() {
		return adm;
	}
	public void setAdm(char adm) {
		this.adm = adm;
	}
		
}
