package calculadora2;

import calculadora2.excepcion.FraccionVaciaException;

public class Calculadora implements Exception {

    private Calculadora(){
        super();
    }
    public static Fraccion sumar(Fraccion fraccionUno, Fraccion fraccionDos) throws FraccionVaciaException {
        if (fraccionUno == null || fraccionDos == null) {
            throw new FraccionVaciaException();
        }

        long numerador = (fraccionUno.getNumerador() * fraccionDos.getDenominador())
                + (fraccionDos.getNumerador() * fraccionUno.getDenominador());
        long denominador = fraccionUno.getDenominador() * fraccionDos.getDenominador();

        return Fraccion.simplificar(numerador, denominador);
    }

    public static Fraccion restar(Fraccion fraccionUno, Fraccion fraccionDos) throws FraccionVaciaException {
        if (fraccionUno == null || fraccionDos == null) {
            throw new FraccionVaciaException();
        }

        long numerador = (fraccionUno.getNumerador() * fraccionDos.getDenominador())
                - (fraccionDos.getNumerador() * fraccionUno.getDenominador());
        long denominador = fraccionUno.getDenominador() * fraccionDos.getDenominador();

        return Fraccion.simplificar(numerador, denominador);
    }

    public static Fraccion multiplicar(Fraccion fraccionUno, Fraccion fraccionDos) throws FraccionVaciaException {
        if (fraccionUno == null || fraccionDos == null) {
            throw new FraccionVaciaException();
        }

        long numerador = fraccionUno.getNumerador() * fraccionDos.getNumerador();
        long denominador = fraccionUno.getDenominador() * fraccionDos.getDenominador();



        return Fraccion.simplificar(numerador, denominador);
    }

    public static Fraccion dividir(Fraccion fraccionUno, Fraccion fraccionDos) throws FraccionVaciaException {
        if (fraccionUno == null || fraccionDos == null) {
            throw new FraccionVaciaException();
        }

        long numerador = fraccionUno.getNumerador() * fraccionDos.getDenominador();
        long denominador = fraccionUno.getDenominador() * fraccionDos.getNumerador();
        

        return Fraccion.simplificar(numerador, denominador);
    }

    public static Mixto sumarMixto(Mixto mixtoUno, Mixto mixtoDos) throws FraccionVaciaException {
        Fraccion fraccionUno = convertirAFraccion(mixtoUno);
        Fraccion fraccionDos = convertirAFraccion(mixtoDos);

        Fraccion resultadoFraccion = sumar(fraccionUno, fraccionDos);

        return convertirAMixto(resultadoFraccion);
    }

    public static Mixto restarMixto(Mixto mixtoUno, Mixto mixtoDos) throws FraccionVaciaException {
        Fraccion fraccionUno = convertirAFraccion(mixtoUno);
        Fraccion fraccionDos = convertirAFraccion(mixtoDos);

        Fraccion resultadoFraccion = restar(fraccionUno, fraccionDos);

        return convertirAMixto(resultadoFraccion);
    }

    public static Mixto multiplicarMixto(Mixto mixtoUno, Mixto mixtoDos) throws FraccionVaciaException {
        Fraccion fraccionUno = convertirAFraccion(mixtoUno);
        Fraccion fraccionDos = convertirAFraccion(mixtoDos);

        Fraccion resultadoFraccion = multiplicar(fraccionUno, fraccionDos);

        return convertirAMixto(resultadoFraccion);
    }

    public static Mixto dividirMixto(Mixto mixtoUno, Mixto mixtoDos) throws FraccionVaciaException {
        Fraccion fraccionUno = convertirAFraccion(mixtoUno);
        Fraccion fraccionDos = convertirAFraccion(mixtoDos);

        Fraccion resultadoFraccion = dividir(fraccionUno, fraccionDos);

        return convertirAMixto(resultadoFraccion);
    }
    public static Mixto convertirAMixto(Fraccion fraccion) {
        long parteEntera = fraccion.getNumerador() / fraccion.getDenominador();
        long numerador = Math.abs(fraccion.getNumerador()) % fraccion.getDenominador();
        long denominador = fraccion.getDenominador();

        return new Mixto(numerador, denominador, parteEntera);
    }


    private static Fraccion convertirAFraccion(Mixto mixto) {
        long numerador = (mixto.getParteEntera() * mixto.getDenominador()) + mixto.getNumerador();
        long denominador = mixto.getDenominador();


        return Fraccion.crear(numerador, denominador);
    }

    @Override
    public void fraccionVacia() {

    }
}