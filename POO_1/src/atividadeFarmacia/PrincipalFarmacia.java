package atividadeFarmacia;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class PrincipalFarmacia {
    public static ArrayList<Produto> produtos = new ArrayList<Produto>();
    public static void main(String[] args) {
        int op = 0;
        do {
                op = menu();
                switch (op) {
                    case 1:
                            Produto();
                            break;
                }
        } while(op != 99);
    }
    public static int menu() {
        String menu = "1 - Cadastrar Produto\n"
                    + "2 - Fazer Depósito \n"
                    + "3 - Fazer um saque \n"
                    + "4 - Fazer uma tranferencia \n"
                    + "5 - Exibir Extrato \n"
                    + "99 - Sair";
            return Integer.parseInt(JOptionPane.showInputDialog(menu));
    }

}
