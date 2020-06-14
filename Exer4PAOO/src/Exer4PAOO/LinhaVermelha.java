package Exer4PAOO;

public class LinhaVermelha extends CorDaLinhaDecorator{
    public LinhaVermelha(Figuras figura) {
        super(figura);
    }

    @Override
    public String desenhar() {
        return getFigura().desenhar() + "\nLinha Vermelha";
    }
}
