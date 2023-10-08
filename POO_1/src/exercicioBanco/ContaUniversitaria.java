package exercicioBanco;
import javax.swing.*;
public class ContaUniversitaria extends Conta{
    
    //Depósito
    //---------------------------------------------------------------------------------------------------------------------------------------------------------
    public void Deposito(Double val) {
		if (sald + val == 2000) {
			JOptionPane.showMessageDialog(null,"Lamento Saldo maximo atingido");
		}else {
		setSald(sald+=val );
		JOptionPane.showMessageDialog(null,"Deposito concluido");
		}
	}
	
}
