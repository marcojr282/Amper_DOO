package calculadora2;

public class Prueba {
    public static void main(String[] args) {
        Fraccion fraccionUno = Fraccion.crear(0,1);
        Fraccion fraccionDos = Fraccion.crear(0,2);
        System.out.println(fraccionUno.toString());
        System.out.println(Calculadora.sumar(fraccionUno, fraccionDos).toString());
        System.out.println(Calculadora.restar(fraccionUno, fraccionDos).toString());
        System.out.println(Calculadora.multiplicar(fraccionUno, fraccionDos).toString());
        System.out.println(Calculadora.dividir(fraccionUno, fraccionDos).toString());


    }
}
