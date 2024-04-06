package calculadora2;

import calculadora2.excepcion.FraccionVaciaException;

public class Prueba {
        public static void main(String[] args) throws FraccionVaciaException {
                Fraccion fraccionUno = Fraccion.crear(2,3);
                Fraccion fraccionDos = Fraccion.crear(1,2);
                Mixto mixtoUno = Mixto.crear(1,1,2);
                Mixto mixtoDos = Mixto.crear(2,3,4);

                System.out.println("Operaciones con fracciones: ");
                System.out.println("Suma: " + Calculadora.sumar(fraccionUno,fraccionDos).toString());
                System.out.println("Resta: " + Calculadora.restar(fraccionUno,fraccionDos).toString());
                System.out.println("Multiplicacion: " + Calculadora.multiplicar(fraccionUno,fraccionDos).toString());
                System.out.println("Division: " + Calculadora.dividir(fraccionUno,fraccionDos).toString());
                System.out.println("Operaciones con numeros mixtos: ");
                System.out.println("Suma: " + Calculadora.sumarMixto(mixtoUno,mixtoDos));
                System.out.println("Resta: " + Calculadora.restarMixto(mixtoUno,mixtoDos));
                System.out.println("Multiplicacion: " + Calculadora.multiplicarMixto(mixtoUno,mixtoDos));
                System.out.println("division: " + Calculadora.dividirMixto(mixtoUno,mixtoDos));


        }
}