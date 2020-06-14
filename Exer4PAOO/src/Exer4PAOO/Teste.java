package Exer4PAOO;

import java.util.Random;

public class Teste {
    public static void main(String[] args) {
        Random gerador =  new Random();

        int opForma = gerador.nextInt(3);

        Figuras figura = null;
        switch (opForma) {
            case 0:
                figura = new Circulo();
                break;
            case 1:
                figura = new Quadrado();
                break;
            case 2:
                figura = new Retangulo();
                break;
        }

        int opDec= gerador.nextInt(3);
        switch (opDec) {
            case 0:
                break;
            case 1:
                int opTipoDec= gerador.nextInt(2);
                switch (opTipoDec) {
                    case 0:
                        figura = CorDePreenchimentoDecorator.corPreenche(figura);
                        break;
                    case 1:
                        figura = CorDaLinhaDecorator.corLinha(figura);
                        break;
                }
                break;
            case 2:
                figura = CorDePreenchimentoDecorator.corPreenche(figura);
                figura = CorDaLinhaDecorator.corLinha(figura);
                break;
        }


        System.out.println("Figura Final: \n" + figura.desenhar());
    }
}
