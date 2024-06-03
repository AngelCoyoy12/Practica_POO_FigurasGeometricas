package Figuras;

public class Ejecutador {

    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(5);
        Triangulo triangulo1 = new Triangulo(4,4);
        Cuadrado cuadrado1= new Cuadrado(12);
        Rectangulo rectangulo1 = new Rectangulo(5,5);

        System.out.println(circulo1.getArea());
        System.out.println(triangulo1.getArea());
        System.out.println(cuadrado1.getArea());
        System.out.println(rectangulo1.getArea());
    }
}
