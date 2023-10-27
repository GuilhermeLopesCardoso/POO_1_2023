package atividadeFarmacia;

public class Medicamento extends Produto {

    boolean receita = false;

    public Medicamento(String nome, String tipo, int estoque, double valor) {
        super(nome, tipo, estoque, valor);
        
    }

    public void setReceita(boolean receita) {
        this.receita = receita;
    }

    
    
}
