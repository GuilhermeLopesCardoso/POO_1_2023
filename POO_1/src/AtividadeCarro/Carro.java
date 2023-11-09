package AtividadeCarro;

import javax.swing.JOptionPane;

public class Carro {

    protected String marca;
    protected int anofab;
    protected String cor;


    protected void cadastra() {
        marca = JOptionPane.showInputDialog("Informe a marca do veículo: ");
        anofab = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de fabricação do veículo: "));
        cor = JOptionPane.showInputDialog("Informe a Cor do veículo: ");
    }

    protected void validaDados() {
        String valida = "";

        
    }
}