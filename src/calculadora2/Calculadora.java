package calculadora2;

public class Calculadora {

    private Calculadora(){
        super();
    }
    public static Fraccion sumar(Fraccion fraccionUno, Fraccion fraccionDos) {
        if (fraccionUno == null || fraccionDos == null) {
            throw new RuntimeException("Las fracciones no pueden estar vacías");
        }

        long numerador = fraccionUno.getNumerador() * fraccionDos.getDenominador()
                + fraccionDos.getNumerador() * fraccionUno.getDenominador();
        long denominador = fraccionUno.getDenominador() * fraccionDos.getDenominador();

        return Fraccion.crear(numerador, denominador);
    }

    public static Fraccion restar(Fraccion fraccionUno, Fraccion fraccionDos) {
        if (fraccionUno == null || fraccionDos == null) {
            throw new RuntimeException("Las fracciones no pueden estar vacías");
        }

        long numerador = fraccionUno.getNumerador() * fraccionDos.getDenominador()
                - fraccionDos.getNumerador() * fraccionUno.getDenominador();
        long denominador = fraccionUno.getDenominador() * fraccionDos.getDenominador();

        return Fraccion.crear(numerador, denominador);
    }

    public static Fraccion multiplicar(Fraccion fraccionUno, Fraccion fraccionDos) {
        if (fraccionUno == null || fraccionDos == null) {
            throw new RuntimeException("Las fracciones no pueden estar vacías");
        }

        long numerador = fraccionUno.getNumerador() * fraccionDos.getNumerador();
        long denominador = fraccionUno.getDenominador() * fraccionDos.getDenominador();

        return Fraccion.crear(numerador, denominador);
    }

    public static Fraccion dividir(Fraccion fraccionUno, Fraccion fraccionDos) {
        if (fraccionUno == null || fraccionDos == null) {
            throw new RuntimeException("Las fracciones no pueden estar vacías");
        }

        long numerador = fraccionUno.getNumerador() * fraccionDos.getDenominador();
        long denominador = fraccionUno.getDenominador() * fraccionDos.getNumerador();


        return Fraccion.crear(numerador, denominador);
    }

    public static Mixto sumarMixto(Mixto mixtoUno, Mixto mixtoDos) {
        Fraccion fraccionUno = convertirAFraccion(mixtoUno);
        Fraccion fraccionDos = convertirAFraccion(mixtoDos);

        Fraccion resultadoFraccion = sumar(fraccionUno, fraccionDos);

        return convertirAMixto(resultadoFraccion);
    }

    public static Mixto restarMixto(Mixto mixtoUno, Mixto mixtoDos) {
        Fraccion fraccionUno = convertirAFraccion(mixtoUno);
        Fraccion fraccionDos = convertirAFraccion(mixtoDos);

        Fraccion resultadoFraccion = restar(fraccionUno, fraccionDos);

        return convertirAMixto(resultadoFraccion);
    }

    public static Mixto multiplicarMixto(Mixto mixtoUno, Mixto mixtoDos) {
        Fraccion fraccionUno = convertirAFraccion(mixtoUno);
        Fraccion fraccionDos = convertirAFraccion(mixtoDos);

        Fraccion resultadoFraccion = multiplicar(fraccionUno, fraccionDos);

        return convertirAMixto(resultadoFraccion);
    }

    public static Mixto dividirMixto(Mixto mixtoUno, Mixto mixtoDos) {
        Fraccion fraccionUno = convertirAFraccion(mixtoUno);
        Fraccion fraccionDos = convertirAFraccion(mixtoDos);

        Fraccion resultadoFraccion = dividir(fraccionUno, fraccionDos);

        return convertirAMixto(resultadoFraccion);
    }

    private static Mixto convertirAMixto(Fraccion fraccionUno) {
        long parteEntera = fraccionUno.getNumerador() / fraccionUno.getDenominador();
        long numerador = Math.abs(fraccionUno.getNumerador()) % fraccionUno.getDenominador();
        long denominador = fraccionUno.getDenominador();

        return new Mixto(parteEntera, numerador, denominador);
    }

    private static Fraccion convertirAFraccion(Mixto mixto) {
        long numerador = mixto.getParteEntera() * mixto.getDenominador() + mixto.getNumerador();
        long denominador = mixto.getDenominador();


        return Fraccion.crear(numerador, denominador);
    }

}
