package doo.calculadora.dominio;

public class FraccionIrreductible {
    private int numerador;
    public int denominador;

    public static void esIrreductible(int numerador, int denominador) {
        int mcd = calcularMCD(numerador, denominador);
        boolean irreductible = mcd == 1;

        if (irreductible) {
            System.out.println("La fracción " + numerador + "/" + denominador + " es irreductible.");
        } else {
            System.out.println("La fracción " + numerador + "/" + denominador + " no es irreductible.");
        }

    }

    public static int calcularMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }


}
