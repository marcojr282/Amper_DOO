package calculadora2.excepcion;

public class FraccionVaciaException extends Exception{

    public FraccionVaciaException() {
        super("Las fracciones no pueden estar vacias");
    }
}
