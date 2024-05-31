package Figuras;

public class Circulo extends FiguraGeometrica {  //Herencia

    public Circulo(double valor1) {
        super(valor1);
    }


    //Polimorfismo
    @Override
    public double getArea() {
        double radio = super.getValor1();
        return Math.PI * Math.pow(radio, 2);
    }
}
