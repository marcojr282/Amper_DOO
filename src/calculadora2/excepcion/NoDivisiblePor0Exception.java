package calculadora2.excepcion;

public class NoDivisiblePor0Exception extends RuntimeException{

    public NoDivisiblePor0Exception() {
        super("El denominador debe ser diferente de cero");
    }
}
