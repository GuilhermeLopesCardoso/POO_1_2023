package prova;

import java.util.ArrayList;

public class Veiculo_carga extends Veiculo{

    Double carga;

    public Veiculo_carga(int anofab, char cod_modelo,ArrayList<Pessoa> pessoas, Condutor condutor, double carga) {
        super(anofab, cod_modelo, pessoas, condutor);
        this.carga=carga;
    }

    
    public String toString(){
        return modelo+anofab+':'+carga+"kg";
    }


    public Double getCarga() {
        return carga;
    }


    public void setCarga(Double carga) {
        this.carga = carga;
    }

}

