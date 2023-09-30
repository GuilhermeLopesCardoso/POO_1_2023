package exercicioCondominio;
import javax.swing.*;
public class Apartamento {
    private int num;
    private char bloco;
    private Double tam;
    private String propri;
    private Double val_fix;

    public Apartamento() {
        cadastra();
    }

        void cadastra() {
        setNum(Integer.parseInt(JOptionPane.showInputDialog("Informe o Número do Apartamento: ")));
        setBloco(JOptionPane.showInputDialog("Informe o Bloco do Apartamento: ").toUpperCase().charAt(0));
        setTam(Double.parseDouble(JOptionPane.showInputDialog("Informe o Tamanho do Apartamento: ")));
        setPropri(JOptionPane.showInputDialog("Informe o Nome do Proprietário: "));
        setVal_fix(tam*5);
        }


        public int getNum() {
            return num;
        }


        public char getBloco() {
            return bloco;
        }


        public Double getTam() {
            return tam;
        }


        public String getPropri() {
            return propri;
        }


        public Double getVal_fix() {
            return val_fix;
        }


        public void setNum(int num) {
            this.num = num;
        }


        public void setBloco(char bloco) {
            this.bloco = bloco;
        }


        public void setTam(Double tam) {
            this.tam = tam;
        }


        public void setPropri(String propri) {
            this.propri = propri;
        }


        public void setVal_fix(Double val_fix) {
            this.val_fix = val_fix;
        }

    }
