package Exer4PAOO;

public class PreenchePrata extends CorDePreenchimentoDecorator{
    public PreenchePrata(Figuras figura) {
        super(figura);
    }

    @Override
    public String desenhar() {
        return getFigura().desenhar() + "\nPreenchimento Prata";
    }
}
