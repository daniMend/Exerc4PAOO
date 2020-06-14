package Exer4PAOO;

public class PreenchePreto extends CorDePreenchimentoDecorator{
    public PreenchePreto(Figuras figura) {
        super(figura);
    }

    @Override
    public String desenhar() {
        return getFigura().desenhar() + "\nPreenchimento Preto";
    }
}
