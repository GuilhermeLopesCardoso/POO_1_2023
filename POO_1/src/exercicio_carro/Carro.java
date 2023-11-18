package exercicio_carro;
import javax.swing.*;
public class Carro {
    protected String marca;
    protected String cor;
    protected int anofab;


    //Cadastrar carro
    //-----------------------------------------------------------------------------------------------------------------------------------------
    public void Cadastra() {
        marca = JOptionPane.showInputDialog("Informe a marca do veículo: ");
        cor = JOptionPane.showInputDialog("Informe a cor do veículo: ");
        anofab = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de fabricação do veículo: "));
    }
    //Validar se já existe um carro com os mesmos dados
    //-----------------------------------------------------------------------------------------------------------------------------------------
    protected void validaDados() {
        
    }

}
