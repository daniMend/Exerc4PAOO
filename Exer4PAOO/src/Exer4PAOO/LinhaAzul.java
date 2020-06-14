package Exer4PAOO;

public class LinhaAzul extends CorDaLinhaDecorator{
    public LinhaAzul(Figuras figura) {
        super(figura);
    }

    @Override
    public String desenhar() {
        return getFigura().desenhar() + "\nLinha Azul";
    }
}
