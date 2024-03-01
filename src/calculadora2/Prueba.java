package calculadora2;

public class Prueba {
    public static void main(String[] args) {
        Fraccion fraccionUno = Fraccion.crear(2,3);
        Fraccion fraccionDos = Fraccion.crear(1,2);
        System.out.println(fraccionUno.toString());
        System.out.println(Calculadora.sumar(fraccionUno, fraccionDos).toString());
        System.out.println(Calculadora.restar(fraccionUno,fraccionDos).toString());
        System.out.println(Calculadora.multiplicar(fraccionUno, fraccionDos).toString());
        System.out.println(Calculadora.dividir(fraccionUno,fraccionDos).toString());
        System.out.println(Mixto.crear(2,4,5));

        Mixto mixtoUno = new Mixto(1, 2, 1);
        Mixto mixtoDos = new Mixto(3, 4, 2);

        Mixto suma = Calculadora.sumarMixto(mixtoUno, mixtoDos);
        System.out.println("Suma: " + suma);

        Mixto resta = Calculadora.restarMixto(mixtoUno, mixtoDos);
        System.out.println("Resta: " + resta);

        Mixto multiplicacion = Calculadora.multiplicarMixto(mixtoUno, mixtoDos);
        System.out.println("Multiplicación: " + multiplicacion);

        Mixto division = Calculadora.dividirMixto(mixtoUno, mixtoDos);
        System.out.println("División: " + division);
    }

}
