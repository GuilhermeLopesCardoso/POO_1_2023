package prova;
import java.util.ArrayList;
public class Veiculo {
    int anofab;
    char cod_modelo;
    Condutor Condutor;
    int count = 0;
    String modelo;

    ArrayList<Pessoa> passageiros = new ArrayList<Pessoa>();

    public Veiculo() {

    }
//Cadastra-----------------------------------------------------------------------------------------------------------------------------------------------------------
    public Veiculo(int anofab, char cod_modelo,ArrayList<Pessoa> pessoas,Condutor condutor) {
        this.anofab=anofab;
        this.modelo=verificaModelo(cod_modelo);
            for(Pessoa p:pessoas){
                passageiros.add(p);
        this.Condutor=condutor;
            }
        }
//Verifica Modelo-----------------------------------------------------------------------------------------------------------------------------------------------------------------
public String verificaModelo(char cod_modelo){
    if (cod_modelo == 1){
        return "Carro";
    } 
    if(cod_modelo == 2) {
        return "Caminhão";
    } 
    if(cod_modelo == 3) {
        return "Moto";
    }
    if(cod_modelo == 4) {
        return "Bicicleta";
    } 
    return "Modelo não informado";
}

//Retorna Veículo-----------------------------------------------------------------------------------------------------------------------------------------------------------------

    public String toString(){
        return modelo+anofab;
    }

//GETS & SETS--------------------------------------------------------------------------------------------------------------------------------------------------------------------
    public int getAnofab() {
        return anofab;
    }

    public void setAnofab(int anofab) {
        this.anofab = anofab;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public char getCod_modelo() {
        return cod_modelo;
    }
    public void setCod_modelo(char cod_modelo) {
        this.cod_modelo = cod_modelo;
    }
    public Pessoa getCondutor() {
        return Condutor;
    }
    public void setCondutor(Condutor condutor) {
        Condutor = condutor;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
    public ArrayList<Pessoa> getPassageiros() {
        return passageiros;
    }
    public void setPassageiros(ArrayList<Pessoa> passageiros) {
        this.passageiros = passageiros;
    }
}