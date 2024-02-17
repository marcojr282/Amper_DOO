package calculadora2;

public class Calculadora {

    private Calculadora(){
        super();
    }
    public static  Fraccion sumar(Fraccion fraccionUno, Fraccion fraccionDos){
        long numerador = fraccionDos.getNumerador() * fraccionDos.getDenominador()
                + fraccionDos.getNumerador()* fraccionDos.getDenominador();
        long denominador = fraccionUno.getDenominador()* fraccionDos.getDenominador();
        return Fraccion.crear(numerador, denominador);
    }
}
