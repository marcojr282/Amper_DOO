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
    public static Fraccion restar(Fraccion fraccionUno, Fraccion fraccionDos) {
        long numerador = fraccionUno.getNumerador() * fraccionDos.getDenominador() - fraccionDos.getNumerador() * fraccionUno.getDenominador();
        long denominador = fraccionUno.getDenominador() * fraccionDos.getDenominador();
        return Fraccion.crear(numerador, denominador);
    }

    public static Fraccion multiplicar(Fraccion fraccionUno, Fraccion fraccionDos) {
        long numerador = fraccionUno.getNumerador() * fraccionDos.getNumerador();
        long denominador = fraccionUno.getDenominador() * fraccionDos.getDenominador();
        return Fraccion.crear(numerador, denominador);
    }

    public static Fraccion dividir(Fraccion fraccionUno, Fraccion fraccionDos) {
        long numerador = fraccionUno.getNumerador() * fraccionDos.getDenominador();
        long denominador = fraccionUno.getDenominador() * fraccionDos.getNumerador();
        if (denominador == 0) {
            throw new ArithmeticException("División por cero");
        }
        return Fraccion.crear(numerador, denominador);
    }

    public static Mixto sumar(Mixto mixtoUno, Mixto mixtoDos){
        Fraccion fraccionUno = convertirAFraccion(mixtoUno);
        Fraccion fraccionDos = convertirAFraccion(mixtoDos);

        Fraccion resultado = sumar(fraccionUno, fraccionDos);
        return convertirAMixto(resultado);
    }

    private static Mixto convertirAMixto(Fraccion resultado) {
        return null;
    }

    private static Fraccion convertirAFraccion(Mixto mixtoUno) {
        return null;
    }

}
