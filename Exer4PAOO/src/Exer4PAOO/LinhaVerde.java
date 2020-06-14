package Exer4PAOO;

public class LinhaVerde extends CorDaLinhaDecorator{

    public LinhaVerde(Figuras figura) {
        super(figura);
    }

    @Override
    public String desenhar() {
        return getFigura().desenhar() + "\nLinha Verde";
    }
}
