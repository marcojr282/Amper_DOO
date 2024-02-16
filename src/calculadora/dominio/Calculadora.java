package calculadora.dominio;



public class Calculadora {
    public static double numero1;
    public static double denominador1;
    public static double numero2;
    public static double denominador2;
    public static double resultado;

    public Calculadora(int numero1, int denominador1, int numero2, int denominador2) {
        this.numero1 = numero1;
        this.denominador1 = denominador1;
        this.numero2 = numero2;
        this.denominador2 = denominador2;
    }

    public static double sumar(int numero1, int denominador1, int numero2, int denominador2) {
        System.out.println("Suma de Fracciones");
        System.out.println("Operación: (" + numero1 + "/" + denominador1
                + ")" + "+(" + numero2 + "/" + denominador2 + ")");
        resultado = ((double) numero1 / denominador1) + ((double) numero2 / denominador2);
        if ((numero1 * denominador2) + (numero2 * denominador1) >= denominador1 * denominador2) {
            System.out.println("El resultado de la suma es una fraccion impropia.");
        } else if ((numero1 * denominador2) + (numero2 * denominador1) <= denominador1 * denominador2) {
            System.out.println("El resultado de la suma es una fraccion propia.");
        } else {
            System.out.println("El resultado de la suma es una fraccion unitaria");
        }

        System.out.println("R//" + resultado);
        resultado = Math.round(resultado);
        System.out.println("Resultado simplificado: ");
        return resultado;
    }
    public static double resta(int numero1, int denominador1, int numero2, int denominador2) {
        System.out.println("Resta de Fracciones");
        System.out.println("Operación: (" + numero1 +  "/" + denominador1
                + ")" + "-(" +  numero2 + "/" + denominador2 + ")" );
        resultado = ((double) numero1 / denominador1) - ((double) numero2 / denominador2);
        if ((numero1 * denominador2) - (numero2 * denominador1) >= denominador1 * denominador2) {
            System.out.println("El resultado de la resta es una fraccion impropia.");
        } else if ((numero1 * denominador2) - (numero2 * denominador1) <= denominador1 * denominador2) {
            System.out.println("El resultado de la resta es una fraccion propia.");
        } else {
            System.out.println("El resultado de la resta es una fraccion unitaria");
        }
        System.out.println("R//" + resultado);
        resultado = Math.round(resultado);
        System.out.println("Resultado simplificado: ");
        return resultado;
    }
    public static double multiplicacion(int numero1, int denominador1, int numero2, int denominador2) {
        System.out.println("Multiplicacion de Fraccion");
        System.out.println("Operación: (" + numero1 + "/" + denominador1
                + ")" + "*(" + numero2 + "/" + denominador2 + ")");
        double resultado = ((double) numero1 / denominador1) * ((double) numero2 / denominador2);
        if ((numero1 * numero2) >= denominador1 * denominador2) {
            System.out.println("El resultado de la multiplicacion es una fraccion impropia.");
        } else if ((numero1 * numero2) <= denominador1 * denominador2) {
            System.out.println("El resultado de la multiplicacion es una fraccion propia.");
        } else {
            System.out.println("El resultado de la multiplicacion es una fraccion unitaria");
        }
        System.out.println("R//" + resultado);
        resultado = Math.round(resultado);
        System.out.println("Resultado simplificado: ");
        return resultado;
    }

    public static double division(int numero1, int denominador1, int numero2, int denominador2) {
        System.out.println("Division de Fracciones");
        System.out.println("Operación: (" + numero1 +  "/" + denominador1
                + ")" + "/(" +  numero2 + "/" + denominador2 + ")" );
        double resultado = ((double) numero1 / denominador1) / ((double) numero2 / denominador2);
        if ((numero1 * denominador2)  >= denominador1 * numero2) {
            System.out.println("El resultado de la division es una fraccion impropia.");
        } else if ((numero1 * denominador2)  <= denominador1 * numero2) {
            System.out.println("El resultado de la division es una fraccion propia.");
        } else {
            System.out.println("El resultado de la division es una fraccion unitaria");
        }
            System.out.println("R//" + resultado);
            resultado = Math.round(resultado);
            System.out.println("Resultado simplificado: ");
            return resultado;
    }

}
