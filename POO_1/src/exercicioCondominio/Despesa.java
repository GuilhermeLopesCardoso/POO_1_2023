package exercicioCondominio;

import javax.swing.JOptionPane;

public class Despesa {

    private String nome;
    private int ano;
    private int mes;
    private Double val;
    
    public Despesa() {
        cadastra();
    }
    
    void cadastra() {
        setNome(JOptionPane.showInputDialog(null,"Qual o nome da despesa"));
        setAno(Integer.parseInt(JOptionPane.showInputDialog(null,"Qual o ano")));
        setMes(Integer.parseInt(JOptionPane.showInputDialog(null,"Qual o mês")));
        setVal(Double.parseDouble(JOptionPane.showInputDialog(null,"Qual o valor da despesa")));
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getAno() {
        return ano;
    }


    public void setAno(int ano) {
        this.ano = ano;
    }


    public int getMes() {
        return mes;
    }


    public void setMes(int mes) {
        this.mes = mes;
    }


    public Double getVal() {
        return val;
    }


    public void setVal(Double val) {
        this.val = val;
    }
    
    
    
    
    
    
    
    
    
    
}