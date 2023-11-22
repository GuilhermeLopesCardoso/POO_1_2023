package prova;
public class Rodovia {
    String sigla;
    char grau;


    public Rodovia() {

    }
    public Rodovia(String sigla, char grau) {
        this.sigla=sigla;
        this.grau=grau;
    }

    public String toString(){
        return getSigla()+"-"+getGrau();
    }

//GETS & SETS--------------------------------------------------------------------------------------------------------------------------------------------------------------------

    public String getSigla() {
        return sigla;
    }
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
    public char getGrau() {
        return grau;
    }
    public void setGrau(char grau) {
        this.grau = grau;
    }

    

}
