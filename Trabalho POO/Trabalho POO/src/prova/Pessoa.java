package prova;
public class Pessoa {

String nome;
int idade;
char cod_sexo;
char condição;
String sexo;

public Pessoa(){
    
}

public Pessoa(String nome,int idade,char cod_sexo,char condição){
    this.nome=nome;
    this.idade=idade;
    this.sexo=verificaSexo(cod_sexo);
}


public String toString(){
    return nome+","+idade+" anos"+":"+cod_sexo;
}

//Verifica Sexo-----------------------------------------------------------------------------------------------------------------------------------------------------------------

public String verificaSexo(char cod_sexo) {
    if(cod_sexo == 1) {
        return "Masculino";
    }
    if(cod_sexo == 2) {
        return "Feminino";
    }
    return "Sexo não informado";
}

//GETS & SETS--------------------------------------------------------------------------------------------------------------------------------------------------------------------
public void setNome(String nome) {
    this.nome = nome;
}

public void setIdade(int idade) {
    this.idade = idade;
}

public void setSexo(String sexo) {
    this.sexo = sexo;
}

public String getNome() {
    return nome;
}

public int getIdade() {
    return idade;
}

public String getSexo() {
    return sexo;
}

}