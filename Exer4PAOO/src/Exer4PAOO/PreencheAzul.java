package Exer4PAOO;

public class PreencheAzul extends CorDePreenchimentoDecorator{
    public PreencheAzul(Figuras figura) {
        super(figura);
    }

    @Override
    public String desenhar() {
        return getFigura().desenhar() + "\nPreenchimento Azul";
    }
}
