package exercicioBanco;

import java.util.ArrayList;

public class PrincipalBanco {
    
    public static ArrayList <Conta> contas = new ArrayList<Conta>();

    //Menu
    //---------------------------------------------------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        int op = 0;
        do {
                op = menu();
                switch (op) {
                    case 1:
                            contas();
                            break;
                    case 2:
                            deposito(contas);
                            break;
                    case 3:
                            saque(contas);
                            break;
                    case 4:
                            transferencia(contas);
                            break;
                    case 5:
                            exibir();
                            break;
                }
        } while(op != 99);
    }
    public static int menu() {
        String menu = "1 - Cadastrar Conta\n"
                    + "2 - Fazer Depósito \n"
                    + "3 - Fazer um saque \n"
                    + "4 - Fazer uma tranferencia \n"
                    + "5 - Exibir Extrato \n"
                    + "99 - Sair";
            return Integer.parseInt(JOptionPane.showInputDialog(menu));
    }

}
