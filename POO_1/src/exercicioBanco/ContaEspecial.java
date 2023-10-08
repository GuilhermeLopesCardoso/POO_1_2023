package exercicioBanco;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ContaEspecial extends Conta {
    Double saldes;

    //Cadastra
    //---------------------------------------------------------------------------------------------------------------------------------------------------------
    public void cadastra(ArrayList <Conta> contas){
		int nume = (Integer.parseInt(JOptionPane.showInputDialog(null,"Qual o número da conta:")));
		int agenc =(Integer.parseInt(JOptionPane.showInputDialog(null,"Qual o número da agencia:")));
		setCorren(JOptionPane.showInputDialog(null,"Qual o nome do correntista:"));
		cadastrasald();
		if (!validar(contas, nume, agenc)) {
			JOptionPane.showMessageDialog(null,"Lamento Cadastre novamente");
			cadastra(contas);
		}
		setNum(nume);
		setAgen(agenc);
		setSald(0.00);
	}


    //Cadastrar Crédito Especial
    //---------------------------------------------------------------------------------------------------------------------------------------------------------
    public void cadastrasald(){
		setSaldes(Double.parseDouble(JOptionPane.showInputDialog(null,"Qual o limite de crédito")));
	}

    //Uso Crédito
    //---------------------------------------------------------------------------------------------------------------------------------------------------------
    public void Saque (Double val) {
		if (sald >= val){
			setSald(sald -=val);
		}
		else if (saldes+sald>= val){
			setSaldes(saldes+sald);
			sald = 0.00;
			setSaldes(saldes -=val);
		}
		else {
			JOptionPane.showMessageDialog(null,"Saldo Insuficiente");
		}
	}

    //Extrato
    //---------------------------------------------------------------------------------------------------------------------------------------------------------
    public void Exibir() {
		JOptionPane.showMessageDialog(null, "conta "+num+" agencia "+agen+"\n"+"saldo: "+sald+"\n"+"saldo especial: "+saldes);
	}

    //Validar
    //---------------------------------------------------------------------------------------------------------------------------------------------------------
    private boolean validar(ArrayList <Conta> contas,int nume,int agenc) {
		for (Conta c:contas) {
			if (nume == c.num) {
				JOptionPane.showMessageDialog(null,"Conta invalida");
				return false;
			}
			if(agenc == c.agen) {
				JOptionPane.showMessageDialog(null,"Agencia invalida");
				return false;
			}
		}
		return true;
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
