package Exer4PAOO;

public class PreencheAmarelo  extends CorDePreenchimentoDecorator{
    public PreencheAmarelo(Figuras figura) {
        super(figura);
    }

    @Override
    public String desenhar() {
        return getFigura().desenhar() + "\nPreenchimento Amarelo";
    }
}
