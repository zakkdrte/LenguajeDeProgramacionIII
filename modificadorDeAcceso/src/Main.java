public class Main {
    public static void main(String[] args) {
        Ejemplo1 ejemplo1 = new Ejemplo1();
        ejemplo1.setAtributo1(5);
        System.out.printf("\n\n[-] Valor del atributo es: %d\n", ejemplo1.getAtributo1());

        try{
            System.out.print(ejemplo1.contador);
        }catch(Exception e){
            System.out.printf("\nError: %s\n",e);
        }
    }
}