package AtividadeIMC;

import javax.swing.JOptionPane;

public class Pessoa {
    

    String nome;
    double peso;
    double altura;
    char sexo;

    void cadastra() {
    nome = JOptionPane.showInputDialog("Informe o seu nome: ");
    sexo = JOptionPane.showInputDialog("Informe o seu sexo M/F: ").toUpperCase().charAt(0);
    peso = Double.parseDouble(JOptionPane.showInputDialog("Informe o seu peso: "));
    altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a sua altura: "));
    }

    double calculaIMC() {
        return peso/(altura*altura);
    }

    String avaliacao() {
        String avaliacao = "";
        double imc = calculaIMC();
        if(sexo == 'M') {
            if(imc < 20.7) {
                avaliacao = "Abaixo do peso";
            } else if (imc > 20.7 && imc < 26.4) {
                avaliacao = "Peso ideal";
            } else if (imc > 26.5 && imc < 27.8) {
                avaliacao = "Pouco acima do peso";
            } else if (imc > 27.9 && imc < 31.1) {
                avaliacao = "Acima do peso";
            } else {
                avaliacao = "Obesidade";
            }
        } else if (sexo == 'F') {
            if(imc < 19.1) {
                avaliacao = "Abaixo do peso";
            } else if (imc > 19.1 && imc < 25.8) {
                avaliacao = "Peso ideal";
            } else if (imc > 25.9 && imc < 27.3) {
                avaliacao = "Pouco acima do peso";
            } else if (imc > 27.4 && imc < 32.3) {
                avaliacao = "Acima do peso";
            } else {
                avaliacao = "Obesidade";
            }
        }
        return avaliacao;
    }

    String exibirDados() {
        return nome + " - " + calculaIMC() + " - " + avaliacao()+"\n";
    }
}
