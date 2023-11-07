package AtividadeIMC;

import javax.swing.JOptionPane;

public class PrincipalIMC1Lista {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Informe a Quantidade de pessoas que deseja calcular o IMC: "));
        
        Pessoa pessoas[] = new Pessoa[n];

        String resultado = "";

        for (int i=0; i<n; i++) {
            Pessoa p = new Pessoa();
            p.cadastra();
            pessoas[i] = p;
            resultado += p.exibirDadosIMC();
        }

        JOptionPane.showMessageDialog(null, resultado);

    }
}
