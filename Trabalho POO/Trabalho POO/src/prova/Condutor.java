package prova;

public class Condutor extends Pessoa{
char embriagado;

        public Condutor(String nome,int idade,char sexo,char condição,char embriagado){
            super(nome, idade,sexo,condição);
            this.embriagado = embriagado;
        }

        public char getEmbriagado() {
            return embriagado;
        }

        public void setEmbriagado(char embriagado) {
            this.embriagado = embriagado;
        }

        
}