package prova;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal_Poo {
static ArrayList<Rodovia> rodovias = new ArrayList<Rodovia>();
static ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
static ArrayList<Acidente> acidentes = new ArrayList<Acidente>();
String[] meses = {"Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Outubro","Novembro","Dezembro"};
    public static void main(String[] args) {
//Menu----------------------------------------------------------------------------------------------------------------------------------------------------------
        int op = 0;
		do {
			op = menu();
			switch (op) {
			case 1:
                cadastraRodovia();
				break;
			case 2:
                cadastraAcidente();
				break;
			case 3:
				cadastraVeiculo();
				break;
			case 4:
                ListarRodoviaPeri()
				break;
			case 5:
				cadastraAcidente();
				break;
            case 6:
                listarVeiculoCarga();
                break;
			}
			}while(op != 99);
	}public static int menu() {
		String menu = "1 - Cadastrar Rodovia\n"
				+ "2 - Cadastrar Acidente\n"
                + "3 - Listar acidentes com o Condutor Embriagado\n"
                + "4 - Listar a quantidade de Acidentes para cada nivel de periculosidade da rodovia \n "
                + "5 - Listar Veículos de carga envolvidos em acidentes \n"
                + "6 - Mostrar qual a rodovia em que ocorreram mais acidentes com bicicletas\n"
                + "7 - Mostrar qual rodovia que possui mais acidentes com vítimas fatais \n"
                + "8 - Quantos acidentes possuem veículos novos (considerar o ano de 2013).\r \n"
                + "9 - Quais as rodovias que registraram acidentes no carnaval (considerar fevereiro). \n"
				+ "99 - Sair";
		return Integer.parseInt(JOptionPane.showInputDialog(menu));
	}

//Cadatra Rodovia--------------------------------------------------------------------------------------------------------------------------------------------------------
    public static void cadastraRodovia(){
        String sigla = JOptionPane.showInputDialog(null,"Qual o nome da rodovia");
        char grau = JOptionPane.showInputDialog(null,"Qual o Grau de periculosidade").toUpperCase().charAt(0);
        Rodovia r = new Rodovia(sigla,grau);
        rodovias.add(r);
        System.out.println(r);
    }

//Cadatra Condutor--------------------------------------------------------------------------------------------------------------------------------------------------------
public static Condutor cadastraCondutor() {
    String nome = JOptionPane.showInputDialog(null, "Informe o nome do condutor: ");
    int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a idade do condutor: "));
    char sexo = JOptionPane.showInputDialog(null, "Informe o sexo do condutor: ").toUpperCase().charAt(0);
    char condição = JOptionPane.showInputDialog(null, "Qual o estado atual do condutor? (F-ferido/M-morto)").toUpperCase().charAt(0);
    char embriagado = JOptionPane.showInputDialog(null, "O condutor estava embriagado? ").toUpperCase().charAt(0);
    Condutor c = new Condutor(nome, idade, sexo, condição, embriagado);
    return c;
}
//Cadatra Pessoa--------------------------------------------------------------------------------------------------------------------------------------------------------
    public static Pessoa cadastraPessoa() {
        String nome = JOptionPane.showInputDialog(null, "Informe o nome: ");
        int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a idade:"));
        char sexo = JOptionPane.showInputDialog(null, "Informe o sexo (M ou F): ").toUpperCase().charAt(0);
        char condição = JOptionPane.showInputDialog(null, "Qual o estado atual da vítima? (F-ferida/M-morta)").toUpperCase().charAt(0);
        Pessoa p = new Pessoa(nome, idade,sexo,condição);
        return p;
    }

//Cadatra Veículo--------------------------------------------------------------------------------------------------------------------------------------------------------
    public static Veiculo cadastraVeiculo(){
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        int anofab = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o ano de fabricação do veículo: "));
        char cod_modelo = JOptionPane.showInputDialog(null, "Informe o modelo do veículo:\n"+"1 - CARRO\n"+"2 - CAMINHÃO\n"+"3 - MOTO\n"+"4 - BICICLETA\n ").toUpperCase().charAt(0); 
        char con;
        Condutor condutor = cadastraCondutor();
        pessoas.add(condutor);
        char conti = JOptionPane.showInputDialog(null,"Deseja incluir mais passageiros?(S/n)").toUpperCase().charAt(0);
        if (conti == 'S'){
        do {
        pessoas.add(cadastraPessoa());
        con = JOptionPane.showInputDialog(null,"Deseja incluir mais passageiros?(S/n)").toUpperCase().charAt(0);
        }while( con == 'S');}
        char veiculocarga = JOptionPane.showInputDialog(null, "É veículo de carga? (S ou N): ").toUpperCase().charAt(0);
        if (veiculocarga == 'S'){
            Double carga = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o peso da carga? "));
            Veiculo v = new Veiculo_carga(anofab,cod_modelo,pessoas,condutor,carga);

            return v;
        }else {
            Veiculo v = new Veiculo(anofab,cod_modelo,pessoas,condutor);
            return v;
        }
    }

//Listar todos os acidentes cujo algum condutor estava embriagado--------------------------------------------------------------------------------------------------------
public static void ListarEmbri(){
    for (Acidente a: acidentes){
        if (verificaveiculoembri(a.veiculos)){
            JOptionPane.showMessageDialog(null,a);
        }
    }
     
        } 
    public static boolean verificaveiculoembri(ArrayList<Veiculo> veiculos){
        for(Veiculo v: veiculos){
                Condutor condutor = v.Condutor;
                if (condutor.embriagado == 'S'){
                return true;}
            }return false;
        }
//Listar a quantidade de acidentes para cada nível de periculosidade da rodovia------------------------------------------------------------------------------------------
public static String ListarRodoviaPeri(){
    int qta = 0;
    int qtb = 0;
    int qtc = 0;

    for (Acidente a: acidentes){
        Rodovia rodovia= a.rodovia;
        if(rodovia.grau=='A'){
            qta += 1;
        }
        if(rodovia.grau=='B'){
            qtb += 1;
        }
        if(rodovia.grau=='C'){
            qtc += 1;
        }
    }
    return "A: "+qta+" Rodovias \n"+"B: "+qtb+" Rodovias \n"+"C: "+qtc+" Rodovias";
}

//Mostrar todos os veículos de carga que se envolveram em acidentes.------------------------------------------------------------------------------------------------------

public static String listarVeiculoCarga() {
    ArrayList<Veiculo_carga> veicargas = new ArrayList<Veiculo_carga>();
    for (Acidente a : acidentes) {
        for (Veiculo v : a.veiculos) {
            if(v.carga > 0.00) {
                return v.toString();
            }
        }
    }
    }

//Mostrar qual a rodovia em que ocorreram mais acidentes com bicicletas---------------------------------------------------------------------------------------------------


//Mostrar qual rodovia que possui mais acidentes com vítimas fatais-------------------------------------------------------------------------------------------------------


//Quantos acidentes possuem veículos novos (considerar o ano de 2013)-----------------------------------------------------------------------------------------------------


//Quais as rodovias que registraram acidentes no carnaval (considerar fevereiro).-----------------------------------------------------------------------------------------
public static String rodoviasCarnaval(){
    for (Acidente a: acidentes){
        
    }
}

//Cadatra Acidente--------------------------------------------------------------------------------------------------------------------------------------------------------
    public static void cadastraAcidente(){
        final ArrayList<Veiculo> veiculos_ac = new ArrayList<Veiculo>();
        Rodovia rodovia = selecionaRodovia();
        char con = ' ';
        int vitimas = 0;
        do {
        veiculos_ac.add(cadastraVeiculo());
        con = JOptionPane.showInputDialog(null,"Deseja incluir mais Veiculos?(S/n)").toUpperCase().charAt(0);
        }while(con =='S');
        int cod_mes = Integer.parseInt(JOptionPane.showInputDialog(null,"Qual o mês do Acidente"));
        for (Veiculo v:veiculos_ac){
            for(Pessoa p: v.passageiros){
                    vitimas +=1;
            }
        }
        Acidente a = new Acidente(rodovia, vitimas,cod_mes,veiculos);
        acidentes.add(a);
        System.out.println(a);
        }
        
//Seleciona Rodovia--------------------------------------------------------------------------------------------------------------------------------------------------------
    	
        public static Rodovia selecionaRodovia () {
		String menuAl = "";
		int cont = 1;
		for (Rodovia r : rodovias) {
			menuAl += cont + " - " + r+"\n";
			cont ++;
		}
		int escolha = Integer.parseInt(JOptionPane.showInputDialog(menuAl));
		return rodovias.get(escolha-1);
	}
}


