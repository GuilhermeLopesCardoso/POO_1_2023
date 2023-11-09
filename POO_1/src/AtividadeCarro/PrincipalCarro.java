package AtividadeCarro;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class PrincipalCarro {
    public static void main(String[] args) {
        ArrayList<Carro> carros = new ArrayList<Carro>();


        String menu = "1 - Cadastrar \n"
                    + "2 - Buscar por ano de fabricação \n"
                    + "3 - Buscar por marca \n"
                    + "4 - Buscar por cor \n\n"
                    + "5 - Sair";

        int op = 0;

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));

            if(op == 1) {
                Carro c = new Carro();
                if(c.cadastra()) {
                    carros.add(c);
                }
            } 
            
            if(op == 2) {
                buscaPorPeriodo(carros);
            } 
            
            if(op == 3) {
                buscaPorMarca(carros);
            }

            if(op == 4) {
                buscaPorCor(carros);
            }
        } while(op != 5);
    }

    static void buscaPorPeriodo(ArrayList<Carro> carros) {
        int anoini = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o ano inicial: "));
        int anofim = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o ano final: "));
        String dados = "";
        int total = 0;

        for(Carro c : carros) {
            if(c.anofab >= anoini && c.anofab <= anofim) {
                dados += c.exibirDados();
                total++;
            }
        }
        dados += calcPercentual(carros.size(), total);
        JOptionPane.showMessageDialog(null, dados);
    }

    static void buscaPorMarca(ArrayList<Carro> carros) {
        String marca = JOptionPane.showInputDialog("Informe a Marca do veículo: ");
        String dados = "";
        int total = 0;

        for(Carro c : carros) {
            if(c.marca.equalsIgnoreCase(marca)) {
                dados += c.exibirDados();
                total++;
            }
        }

        dados += calcPercentual(carros.size(), total);
        JOptionPane.showMessageDialog(null, dados);
    }

    static void buscaPorCor(ArrayList<Carro> carros) {
        String cor = JOptionPane.showInputDialog("Informe a Cor do veículo: ");
        String dados = "";
        int total = 0;

        for(Carro c : carros) {
            if(c.cor.equalsIgnoreCase(cor)) {
                dados += c.exibirDados();
                total++;
            }
        }

        dados += calcPercentual(carros.size(), total);
        JOptionPane.showMessageDialog(null, dados);
    }

    static String calcPercentual(int total, int encontrados) {
        double perc = (double)encontrados / (double)total * 100;
        return "Percentual em relação ao total"+perc+"%";
    }
}
