package Exer4PAOO;

public class LinhaRoxa extends CorDaLinhaDecorator{
    public LinhaRoxa(Figuras figura) {
        super(figura);
    }

    @Override
    public String desenhar() {
        return getFigura().desenhar() + "\nLinha Roxa";
    }
}
