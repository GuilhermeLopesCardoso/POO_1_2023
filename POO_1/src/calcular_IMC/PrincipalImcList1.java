package calcular_IMC;

import javax.swing.JOptionPane;
public class PrincipalImcList1 {
	public static class PrincipalIMC1{
		public static void main(String[] args) {
			int n = Integer.parseInt(JOptionPane.showInputDialog("Qtd pessoas?"));
			
			Pessoa pessoas[]= new Pessoa[n];
			
			String resultado = "";
			
			for(int i=0; i<n; i++) {
				Pessoa p = new Pessoa();
				p.cadastra();
				pessoas[i] = p;
				resultado += p.exibirDados();
			}
			
			JOptionPane.showMessageDialog(null, resultado);
					
		}
		
	}
	
}