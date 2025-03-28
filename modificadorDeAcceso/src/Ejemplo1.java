public class Ejemplo1 {
    private int atributo1;
    private int contador = 0;

    public void setAtributo1(int valor){
        contador++;
        atributo1 = valor;
    }
    public int getAtributo1(){
        return atributo1;
    }
    public int getContador(){
        return contador;
    }
}
