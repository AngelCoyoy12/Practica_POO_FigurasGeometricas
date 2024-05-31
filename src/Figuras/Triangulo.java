package Figuras;

public class Triangulo extends FiguraGeometrica { //Herencia

    private double altura;

    public Triangulo(double valor1, double altura) {
       super(valor1);
       this.altura = altura;
    }

    //polimorfismo
    @Override
    public double getArea() {
        double base = super.getValor1();
        return base * this.altura/2;
    }
}
