package AtividadeIMC;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class PrincipalIMC2Lista {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

        String menu = "1 - Cadastrar \n"
                    + "2 - Listar \n"
                    + "3 - Sair";

        int op = 0;

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));

            if(op == 1) {
                Pessoa p = new Pessoa();
                p.cadastra();
                pessoas.add(p);
            }

            if(op ==2) {
                String result = "Pessoas Cadastradas \n\n";
                for(Pessoa p:pessoas) {
                    result +=p.exibirDadosIMC();
                }
                JOptionPane.showMessageDialog(null, result);
            }
        } while (op != 3);
    }
}
