public class Main {
    public static void main(String[] args) {
        double x = 2;
        double y = 2;
        double z = 2;
        Triangulo _triangulo = new Triangulo(x,y,z);



        Triangulo.ladoA = 4;
        Triangulo.ladoB = 4;
        Triangulo.ladoC = 4;
        System.out.print(_triangulo.perimetroTriangulo());

    }
}

