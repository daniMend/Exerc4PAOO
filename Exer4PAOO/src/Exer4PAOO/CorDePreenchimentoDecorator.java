package Exer4PAOO;

import java.util.Random;

public abstract class CorDePreenchimentoDecorator extends Figuras{
    private Figuras figura;

    public Figuras getFigura() {
        return figura;
    }

    public void setFigura(Figuras figura) {
        this.figura = figura;
    }

    public CorDePreenchimentoDecorator (Figuras figura) {
        this.figura = figura;
    }


    static Figuras corPreenche(Figuras figura) {
        Random gerador =  new Random();
        int opPreenche= gerador.nextInt(4);
        switch (opPreenche) {
            case 0:
                figura = new PreencheAzul(figura);
                break;
            case 1:
                figura = new PreencheAmarelo(figura);
                break;
            case 2:
                figura = new PreenchePrata(figura);
                break;
            case 3:
                figura = new PreenchePreto(figura);
                break;
        }
        return figura;
    }

}
