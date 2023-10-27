package atividadeFarmacia;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class PrincipalFarmacia {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<Produto>();

        public static int menu() {
            int menu = "1 - Cadastrar Produto \n" +
                       "+99 - Sair";

                    return Integer.parseInt(JOptionPane.showInputDialog(menu));
        }


        int op = 0;

        do {
            op = menu();
            switch (op) {
                case 1:
                    Produto();
                    break;
            
                    

            }
        }

    }
}
