package Exer4PAOO;

import java.util.Random;

public abstract class CorDaLinhaDecorator extends Figuras{
    private Figuras figura;

    public Figuras getFigura() {
        return figura;
    }

    public void setFigura(Figuras figura) {
        this.figura = figura;
    }

    public CorDaLinhaDecorator (Figuras figura) {
        this.figura = figura;
    }


    static Figuras corLinha(Figuras figura) {
        Random gerador =  new Random();
        int opLinha = gerador.nextInt(4);
        switch (opLinha) {
            case 0:
                figura = new LinhaAzul(figura);
                break;
            case 1:
                figura = new LinhaRoxa(figura);
                break;
            case 2:
                figura = new LinhaVermelha(figura);
                break;
            case 3:
                figura = new LinhaVerde(figura);
                break;
        }
        return figura;
    }
}
