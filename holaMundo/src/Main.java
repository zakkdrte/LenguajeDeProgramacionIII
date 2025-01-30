import java.util.Scanner;
public class Main {
    public static double areaCirculo(double radio){
    return Math.PI*radio*radio;
    }
    public static double areaCuadrado(double lado){
        return lado*lado;
    }
    public static double areaTriangulo(double base, double altura){
        return (base * altura)/2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n[-] Menu:");
        System.out.println("\t(1) Calcular el area de un circulo.");
        System.out.println("\t(2) Calcular el area de un cuadrado.");
        System.out.println("\t(3) Calcular el area de un triangulo.");
        System.out.println("\t(4) Salir.");
        int opcion = sc.nextInt();
        switch (opcion){
            case 1:
                System.out.print("Ingresa el radio:\t");
                double radio = sc.nextDouble();
                double circulo = areaCirculo(radio);
                System.out.printf("\nEl area de nuestro circulo es: %f", circulo);
                break;
            case 2:
                System.out.print("Ingresa el lado:\t");
                double lado = sc.nextDouble();
                double cuadrado = areaCuadrado(lado);
                System.out.printf("\nEl area de nuestro cuadrado es: %f", cuadrado);
                break;
            case 3:
                System.out.print("Ingresa la altura:\t");
                double altura = sc.nextDouble();
                System.out.print("Ingresa la base:\t");
                double base = sc.nextDouble();
                double triangulo = areaTriangulo(base, altura);
                System.out.printf("\nEl area de nuestro triangulo es: %f", triangulo);
                break;
            case 4: break;
            default: System.out.print("\n[!] No se selecciono ninguna opcion");
        }
    }
}