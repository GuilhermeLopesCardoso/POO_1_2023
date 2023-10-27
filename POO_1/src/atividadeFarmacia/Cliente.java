package atividadeFarmacia;
import javax.swing.JOptionPane;
public class Cliente {
    
    String nome;
    double saldo;


    //Cadastra Cliente----------------------------------------------------------------------------------------------------------------------
    public void cadastra() {
        nome = JOptionPane.showInputDialog("Informe o nome do cliente: ");
        saldo = Double.parseDouble(JOptionPane.showInputDialog("Informe o saldo devedor inicial: "));
    }

    //GETTERS AND SETTERS-------------------------------------------------------------------------------------------------------------------
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
}
