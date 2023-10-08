package exercicioBanco;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ContaEspecial extends Conta {
    Double saldes;

    //Cadastra
    //---------------------------------------------------------------------------------------------------------------------------------------------------------
    public void cadastra(ArrayList<Conta> contas) {
        num = JOptionPane.showInputDialog("Informe o número da conta: ");
        agen = JOptionPane.showInputDialog("Informe a Agência: ");
        corren = JOPtionPane.showInputDialog("Informe o nome do correntista: ");
    }


    //Cadastrar Crédito Especial
    //---------------------------------------------------------------------------------------------------------------------------------------------------------
    public void cadastrasaldes() {
        setSaldes(Double.parseDouble(JOptionPane.showInputDialog("Informe o limite de crédito: ")));
    }

    //Uso Crédito
    //---------------------------------------------------------------------------------------------------------------------------------------------------------
    public void Saque (Double val) {
        if(sald >= val) {
            setSald(sald -=val);
        } else if (saldes+sald>=val) {
            setSaldes(saldes+sald);
            sald = 0.00;
            setSaldes(saldes -=val);
        } else {
                JOptionPane.showMessageDialog("Lamento, saldo insuficiente!");
        }
    }

    //Extrato
    //---------------------------------------------------------------------------------------------------------------------------------------------------------
    public void Exibir() {
        JOptionPane.showMessageDialog("Conta "+num+" Agência "+agen+"\n"+"Saldo: "+sald+"\n"+"Saldo Especial: "+saldes);
    }

    //Validar
    //---------------------------------------------------------------------------------------------------------------------------------------------------------
    private boolean validar(ArrayList <Conta> contas) {
        for(Conta c:contas) {
            if(num == c.num) {
                JOptionPane.showMessageDialog("Conta Inválida!");
                return false;
            }
            if(agen == c.agen) {
                JOptionPane.showMessageDialog("Agência Inválida!");
                return false;
            }
        } return true;
    }

    //Getters e Setters
    //---------------------------------------------------------------------------------------------------------------------------------------------------------
    public void setSaldes(Double saldes) {
        this.saldes = saldes;
    }


    public Double getSaldes() {
        return saldes;
    }
}
