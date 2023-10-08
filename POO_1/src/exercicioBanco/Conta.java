package exercicioBanco;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Conta {
    protected int num, agen;
    protected String corren;
    protected Double sald;


    //Cadastrar
    //---------------------------------------------------------------------------------------------------------------------------------------------------------
    public void cadastra(ArrayList <Conta> contas){
		int nume = (Integer.parseInt(JOptionPane.showInputDialog(null,"Qual o número da conta:")));
		int agenc =(Integer.parseInt(JOptionPane.showInputDialog(null,"Qual o número da agencia:")));
		setCorren(JOptionPane.showInputDialog(null,"Qual o nome do correntista:"));
		if (!validar(contas, nume, agenc)) {
			JOptionPane.showMessageDialog(null,"Lamento Cadastre novamente");
			cadastra(contas);
		}
		setNum(nume);
		setAgen(agenc);
		setSald(0.00);

    }
    //Depósito
    //---------------------------------------------------------------------------------------------------------------------------------------------------------
    public void Deposito(Double val) {
		setSald(sald+=val );
		JOptionPane.showMessageDialog(null,"Deposito concluido");
    }
    //Saque
    //---------------------------------------------------------------------------------------------------------------------------------------------------------
    public void Saque (Double val) {
		if (sald < val) {
			JOptionPane.showMessageDialog(null,"Saldo Insuficiente");
		}
		else {
			setSald(sald -=val);
		}
	}

    //Verifica
    //---------------------------------------------------------------------------------------------------------------------------------------------------------
    private boolean validar(ArrayList <Conta> contas,int nume,int agenc) {
		for (Conta c:contas) {
			if (nume == c.num && agenc == c.agen) {
				JOptionPane.showMessageDialog(null,"Conta invalida");
				return false;
			}
		}
		return true;
	}

    //Extrato
    //---------------------------------------------------------------------------------------------------------------------------------------------------------
    public void Exibir() {
		JOptionPane.showMessageDialog(null, "conta "+num+" agencia "+agen+"\n"+"saldo: "+sald);
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
