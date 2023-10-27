package atividadeFarmacia;

import javax.swing.JOptionPane;

public class Produto {
    String nome, tipo;
    int estoque;
    double valor;

    //Contrutores
    public Produto(String nome, String tipo, int estoque, double valor) {
        this.nome = nome;
        this.estoque = estoque;
        this.valor = valor;
        this.tipo = tipo;
    }

    //Cadastra produto
    public void cadastra() {
        nome = JOptionPane.showInputDialog("Informe o nome do produto: ");
        estoque = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade disponível em estoque: "));
        valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do produto: "));
        tipo = JOptionPane.showInputDialog("Informe o tipo do produto (M-Medicamento, E-Equipamento Médico, P-Perfumaria): ");
    }

    
}