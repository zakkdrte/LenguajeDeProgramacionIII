public class Main {
    public static void main(String[] args) {
        Triangulo.ladoA = 4;
        Triangulo.ladoB = 4;
        Triangulo.ladoC = 4;

        double perimetro = Triangulo.perimetroTriangulo();
        System.out.print(perimetro);
    }
}

