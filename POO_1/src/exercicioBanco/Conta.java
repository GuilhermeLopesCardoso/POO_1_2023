package exercicioBanco;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Conta {
    protected int num, agen;
    protected String corren;
    protected Double sald;


    //Cadastrar
    //---------------------------------------------------------------------------------------------------------------------------------------------------------
    public void cadastra(ArrayList <Conta> contas) {
        num = JOptionPane.showInputDialog("Informe o número da conta: ");
        agen = JOptionPane.showInputDialog("Informe a Agência: ");
        corren = JOptionPane.showInputDialog("Informe o nome do Correntista: ");
        setSald(0.00);
    }


    //Depósito
    //---------------------------------------------------------------------------------------------------------------------------------------------------------
    public void Deposito(Double val) {
        setSald(sald+=val);
        JOptionPane.showMessageDialog("Depósito Concluído");
    }

    //Saque
    //---------------------------------------------------------------------------------------------------------------------------------------------------------
    public void Saque (Double val) {
        if (sald < val) {
            JOptionPane.showMessageDialog("Lamento, saldo Insuficiente!");
        } else {
            setSald(sald -= val);
        }
    }

    //Verifica
    //---------------------------------------------------------------------------------------------------------------------------------------------------------
    private boolean validar(ArrayList <Conta> contas) {
        for (Conta c:contas) {
            if(num==c.num && agen==c.agen) {
                JOptionPane.showMessageDialog("Conta inválida");
                return false;
            }
        } return true;
    }

    //Extrato
    //---------------------------------------------------------------------------------------------------------------------------------------------------------
    public void exibirExtrato() {
        JOptionPane.showMessageDialog("Conta "+num+" Agência "+agen+"/n"+"Saldo "+sald);
    }

    //Getter e Setters
    //---------------------------------------------------------------------------------------------------------------------------------------------------------
    public int getNum() {
        return num;
    }


    public int getAgen() {
        return agen;
    }


    public String getCorren() {
        return corren;
    }


    public Double getSald() {
        return sald;
    }


    public void setNum(int num) {
        this.num = num;
    }


    public void setAgen(int agen) {
        this.agen = agen;
    }


    public void setCorren(String corren) {
        this.corren = corren;
    }


    public void setSald(Double sald) {
        this.sald = sald;
    }

}
