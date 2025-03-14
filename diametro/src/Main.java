import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        try {

            Scanner sc = new Scanner(System.in);
            System.out.print("\n\n[+] Ingrese el valor para el lado A:  ");
            Triangulo.ladoA = sc.nextDouble();
            System.out.print("\n\n[+] Ingrese el valor para el lado B:  ");
            Triangulo.ladoB = sc.nextDouble();
            System.out.print("\n\n[+] Ingrese el valor para el lado C:  ");
            Triangulo.ladoC = sc.nextDouble();

            System.out.print(Triangulo.perimetroTriangulo());

            System.out.println("\n[+] Ingrese el valor del diametro para obtener la circunferencia del circulo:  ");
            double Diametro = sc.nextDouble();
            Circunferencia circunferencia = new Circunferencia(Diametro);
            System.out.printf("[i] A continuación se mostrarán el valor de la circunferencia con un diametro de %f\n\n", Diametro);
            System.out.printf("[+] Circunferencia: %s", circunferencia.SacarCircunferencia());
        } catch(Exception e){
            System.out.printf("\n\n[!] Error: %s\n\n", e.getMessage());
        }
    }

}

