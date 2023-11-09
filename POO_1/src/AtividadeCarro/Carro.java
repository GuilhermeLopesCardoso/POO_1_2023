package AtividadeCarro;

import javax.swing.JOptionPane;

public class Carro {

    protected String marca;
    protected int anofab;
    protected String cor;


    boolean cadastra() {
        marca = JOptionPane.showInputDialog("Informe a marca do veículo: ");
        anofab = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de fabricação do veículo: "));
        cor = JOptionPane.showInputDialog("Informe a Cor do veículo: ");
        return validaCadastro();
    }

    boolean validaCadastro() {
        if(marca.equals("")) {
            JOptionPane.showMessageDialog(null, "A marca é obrigatória, favor informar uma marca: ");
            return false;
        } if(cor.equals("")) {
            JOptionPane.showMessageDialog(null, "A cor é obrigatória, favor informar um nome: ");
            return false;
        } if(anofab < 1954 || anofab > 2024) {
            JOptionPane.showMessageDialog(null, "Ano inválido, favor informar outro ano de fabricação: ");
            return false;
        } 
        return true;
    }

    String exibirDados() {
        return marca + " - " + cor + " - " + anofab + "\n";
    }
}