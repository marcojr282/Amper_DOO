package calculadora.app;

import calculadora.dominio.Calculadora;
import calculadora.dominio.FraccionIrreductible;
import calculadora.dominio.FraccionMixta;



public class CalculadoraApp {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(Calculadora.sumar(1,2,3,4));
        System.out.println(Calculadora.resta(5,4,2,7));
        System.out.println(Calculadora.multiplicacion(2,6,3,3));
        System.out.println(Calculadora.division(9,7,5,3));
        FraccionMixta.convertirFraccion(8,3);
        FraccionMixta.convertirFraccionMixta(2, 1, 4);
        FraccionIrreductible.esIrreductible(3,4);

    }
}
