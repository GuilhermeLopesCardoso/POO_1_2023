package exercicioBanco;

import java.util.ArrayList;

import javax.swing.JOptionPane;

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

    //Menu Contas
    //---------------------------------------------------------------------------------------------------------------------------------------------------------
    public static void contas() {
        int os = 0;
        do {
                os = menu2();
                switch (os) {
                case 1:
                        Conta c = new Conta();
                        c.cadastra(contas);
                        contas.add(c);
                        break;
                case 2:
                        c = new ContaEspecial();
                        c.cadastra(contas);
                        contas.add(c);
                        break;
                case 3:
                        c = new ContaUniversitaria();
                        c.cadastra(contas);
                        contas.add(c);
                        break;
                }
                }while(os != 99);
}

    public static int menu2(){
        String menu = "1 - Conta corrente\n"
                        + "2 - Conta Especial\n"
                        + "3 - Conta Universitaria\n"
                        + "99 - Sair";
        return Integer.parseInt(JOptionPane.showInputDialog(menu));
    }

   // Fazer Depósito
   //---------------------------------------------------------------------------------------------------------------------------------------------------------
   private static void deposito(ArrayList <Conta> contas) {
        int num = Integer.parseInt(JOptionPane.showInputDialog(null,"qual o número da conta"));
        int agenc = Integer.parseInt(JOptionPane.showInputDialog(null,"qual o número da agencia"));
        if (validar(contas,num,agenc)) {
                JOptionPane.showMessageDialog(null,"Essa conta não consta no sistema \n");
                deposito(contas);
        }
        Double val = Double.parseDouble(JOptionPane.showInputDialog(null,"qual o valor"));
        for (Conta c:contas) {
                if (num == c.num && agenc==c.agen) {
                        c.Deposito(val);;
                }
        }
}

   //Saque
   //---------------------------------------------------------------------------------------------------------------------------------------------------------
   private static void saque (ArrayList <Conta> contas) {
        int num = Integer.parseInt(JOptionPane.showInputDialog(null,"qual o número da conta"));
        int agenc = Integer.parseInt(JOptionPane.showInputDialog(null,"qual o número da agencia"));
        if (validar(contas,num,agenc)) {
                JOptionPane.showMessageDialog(null,"Essa conta não consta no sistema \n");
                saque(contas);
        }
        Double val = Double.parseDouble(JOptionPane.showInputDialog(null,"qual o valor"));
        for (Conta c:contas) {
                if (num == c.num && agenc==c.agen) {
                        c.Saque(val);;
                }
        }	
}


   //Transferência
   //---------------------------------------------------------------------------------------------------------------------------------------------------------
   private static void transferencia(ArrayList <Conta> contas) {
        int num = Integer.parseInt(JOptionPane.showInputDialog(null,"Retirar em qual o número da conta"));
        int agenc = Integer.parseInt(JOptionPane.showInputDialog(null,"Qual o número da agencia"));
        if (validar(contas,num,agenc)) {
                JOptionPane.showMessageDialog(null,"Essa conta não consta no sistema \n");
                transferencia(contas);
        }
        Double val = Double.parseDouble(JOptionPane.showInputDialog(null,"qual o valor"));
        for (Conta c:contas) {
                if (num == c.num && agenc==c.agen) {
                        c.Saque(val);;
                }
        }
        num = Integer.parseInt(JOptionPane.showInputDialog(null,"Depositar em qual o número da conta"));
        agenc = Integer.parseInt(JOptionPane.showInputDialog(null,"Qual o número da agencia"));
        if (validar(contas,num,agenc)) {
                JOptionPane.showMessageDialog(null,"Essa conta não consta no sistema \n");
                transferencia(contas);
        }
        for (Conta c:contas) {
                if (num == c.num && agenc==c.agen) {
                        c.Deposito(val);;
                }
        }	
}


   //Extrato
   //---------------------------------------------------------------------------------------------------------------------------------------------------------
   private static void exibir() {
        int num = Integer.parseInt(JOptionPane.showInputDialog(null,"qual o número da conta"));
        int agenc = Integer.parseInt(JOptionPane.showInputDialog(null,"qual o número da agencia"));
        if (validar(contas,num,agenc)) {
                JOptionPane.showMessageDialog(null,"Essa conta não consta no sistema \n");
                exibir();
        }
        for (Conta c:contas) {
                if (num == c.num && agenc==c.agen) {
                        c.Exibir();
                }
        }	
}

   //Validar
   //---------------------------------------------------------------------------------------------------------------------------------------------------------
   private static boolean validar(ArrayList <Conta> contas,int num,int agenc) {
        for (Conta c:contas) {
                if (num == c.num && agenc==c.agen) {
                        return false;
                }
        }
        return true;
}

}