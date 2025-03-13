import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("\n\n[+] Ingrese el valor para el lado A:  ");
        Triangulo.ladoA = sc.nextDouble();
        System.out.print("\n\n[+] Ingrese el valor para el lado B:  ");
        Triangulo.ladoB = sc.nextDouble();
        System.out.print("\n\n[+] Ingrese el valor para el lado C:  ");
        Triangulo.ladoC = sc.nextDouble();

        System.out.print(Triangulo.perimetroTriangulo());

    }

}

