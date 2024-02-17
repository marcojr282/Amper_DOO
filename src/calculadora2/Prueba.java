package calculadora2;

public class Prueba {
    public static void main(String[] args) {
        Fraccion fraccionUno = Fraccion.crear(0,1);
        System.out.println(fraccionUno.getNumerador()+ "/" + fraccionUno.getDenominador());
        System.out.println(fraccionUno.toString());
    }
}
