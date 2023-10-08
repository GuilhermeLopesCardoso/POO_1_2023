package exercicioBanco;
public class ContaUniversitaria extends Conta{
    
    //Depósito
    //---------------------------------------------------------------------------------------------------------------------------------------------------------
    public void Deposito(Double val) {
        if(sald + val == 2000) {
            JOptionPane.showMessageDialog("Lamento, saldo máximo atingido");
        } else {
            setSald(sal+=val);
            JOptionPane.showMessaDialog("Depósito Concluído!");
        }
    }
}
