package Figuras;

public class Rectangulo extends FiguraGeometrica {  //Herencia

    private double altura;

    public Rectangulo (double valor1, double altura) {
        super(valor1);
        this.altura = altura;
    }

    //Polimorfismo
    @Override
    public double getArea(){
        double valor1 = super.getValor1();
        return valor1 * altura;
    }

}
