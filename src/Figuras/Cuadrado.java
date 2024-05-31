package Figuras;

public class Cuadrado extends FiguraGeometrica { //Herencia

    public Cuadrado(double valor1) {
        super(valor1);
    }

    //Polimorfismo
    @Override
    public double getArea(){
        double lado = super.getValor1();
        return Math.pow(lado, 2);
    }

}
