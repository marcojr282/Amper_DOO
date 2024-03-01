package calculadora2;

public class Fraccion {
    private long numerador;
    private long denominador;

    protected Fraccion(long numerador, long denominador) {
        setNumerador(numerador);
        setDenominador(denominador);
    }


    public static Fraccion crear(long numerador, long denominador){
        if (denominador == 0){
            throw new RuntimeException("El denominador debe ser diferente de cero");
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

    private static long calcularMCD(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
