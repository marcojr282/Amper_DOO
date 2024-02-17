package calculadora2;

public class Calculadora {

    private Calculadora(){
        super();
    }
    public static  Fraccion sumar(Fraccion fraccionUno, Fraccion fraccionDos){
        if (fraccionUno == null){
            throw new RuntimeException("La fraccion uno no puede estar vacia");
        }
        if (fraccionDos == null){
            throw new RuntimeException("La fraccion dos no puede estar vacia");

        }
        long numerador = fraccionDos.getNumerador() * fraccionDos.getDenominador()
                + fraccionDos.getNumerador()* fraccionDos.getDenominador();
        long denominador = fraccionUno.getDenominador()* fraccionDos.getDenominador();
        return Fraccion.crear(numerador, denominador);
    }
}
