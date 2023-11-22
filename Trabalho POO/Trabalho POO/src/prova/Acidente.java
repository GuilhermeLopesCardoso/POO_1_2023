package prova;

import java.util.ArrayList;

public class Acidente {
ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();

    Rodovia rodovia;
    int vitimas;
    String mes;
    int cod_mes;

    public Acidente(){

    }
//Cadastra----------------------------------------------------------------------------------------------------------------------------------------------------------------
    public Acidente(Rodovia rodovia, int vitimas,int cod_mes,ArrayList<Veiculo> veiculos){
        this.rodovia=rodovia;
        this.vitimas=vitimas;
        this.mes=verificames(cod_mes);
        for(Veiculo v:veiculos){
                veiculos.add(v);
            }
    }

    public String toString(){
        return "Rodovia - "+rodovia.getSigla()+" - "+mes+" com "+vitimas+" vitimas";
    }

//Verifica Mês-----------------------------------------------------------------------------------------------------------------------------------------------------------------

    public String verificames(int cod_mes){
        if (cod_mes == 1){
            return "Janeiro";
        }if (cod_mes == 2){
            return "Fevereiro";
        }if (cod_mes == 3){
            return "Março";
        }if (cod_mes == 4){
            return "Abril";
        }if (cod_mes == 5){
            return "Maio";
        }if (cod_mes == 6){
            return "Junho";
        }if (cod_mes == 7){
            return "Julho";
        }if (cod_mes == 8){
            return "Agosto";
        }if (cod_mes == 9){
            return "Setembro";
        }if (cod_mes == 10){
            return "outubro";
        }if (cod_mes == 11){
            return "Novembro";
        }if (cod_mes == 12){
            return "Dezembro";
        }
        return "Mês não cadastrado";
    }


//GETS & SETS--------------------------------------------------------------------------------------------------------------------------------------------------------------------
    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }
    public void setVeiculos(ArrayList<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }
    public Rodovia getRodovia() {
        return rodovia;
    }
    public void setRodovia(Rodovia rodovia) {
        this.rodovia = rodovia;
    }
    public int getVitimas() {
        return vitimas;
    }
    public void setVitimas(int vitimas) {
        this.vitimas = vitimas;
    }
    public String getMes() {
        return mes;
    }
    public void setMes(String mes) {
        this.mes = mes;
    }
    
    
    
    




}