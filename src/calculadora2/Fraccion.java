package calculadora2;

import calculadora2.excepcion.NoDivisiblePor0Exception;

public class Fraccion implements Exception {
    private long numerador;
    private long denominador;

    protected Fraccion(long numerador, long denominador) {
        setNumerador(numerador);
        setDenominador(denominador);
    }


    public static Fraccion crear(long numerador, long denominador){
        if (denominador == 0){
            throw new NoDivisiblePor0Exception();
        }
        return new Fraccion(numerador, denominador);

    }


    public long getNumerador() {
        return numerador;
    }

    private  void setNumerador(long numerador) {
        this.numerador = numerador;
    }

    public long getDenominador() {
        return denominador;
    }

    private void setDenominador(long denominador) {

        this.denominador = denominador;
    }

    @Override
    public String toString() {
        return getNumerador() + "/" + getDenominador();
    }

    public static Fraccion simplificar(long numerador, long denominador) {
        long mcd = calcularMCD(Math.abs(numerador), Math.abs(denominador));
        numerador /= mcd;
        denominador /= mcd;
        if (denominador < 0) {
            numerador = -numerador;
            denominador = -denominador;
        }
        return new Fraccion(numerador, denominador);
    }

    private static long calcularMCD(long num1, long num2) {
        while (num2 != 0) {
            long temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }

    @Override
    public void fraccionVacia() {

    }
}