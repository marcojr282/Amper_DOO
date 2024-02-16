package calculadora.dominio;

public class FraccionMixta {

    public static int parteEntera;
    public int numerador;
    public int denominador;
    public static int residuo;

    public static int resultado;

    public FraccionMixta(int parteEntera, int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
        this.parteEntera = parteEntera;

    }

    public static void convertirFraccion(int numerador, int denominador){
        parteEntera = numerador/denominador;
        residuo = numerador % denominador;
        System.out.println("Numero Mixto: " + parteEntera + " " + residuo + "/" + denominador);
    }
    public static void convertirFraccionMixta(int parteEntera, int numerador, int denominador) {
        resultado = (parteEntera * denominador) + numerador;
        System.out.println("Fracción: " + resultado + "/" + denominador);
    }

}


