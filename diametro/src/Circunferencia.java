import static java.lang.Math.PI;

public class Circunferencia {
    public double Diametro;
    public double _Pi;

    Circunferencia(double diametro){
        Diametro = diametro;
         _Pi = PI;
    }

    public double SacarCircunferencia(){
        return Diametro * _Pi;
    }

}
