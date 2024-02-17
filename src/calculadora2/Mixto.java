package calculadora2;

public class Mixto extends Fraccion {

    private long parteEntera;

    private long residuo;

    public Mixto(long numerador, long denominador, long parteEntera) {
        super(numerador, denominador);
        this.parteEntera = parteEntera;
    }

    public static void convertirFraccion(int numerador, int denominador){
        getparteEntera = numerador/denominador;
        residuo = numerador % denominador;
        System.out.println("Numero Mixto: " + parteEntera + " " + residuo + "/" + denominador);
    }

    public long getParteEntera() {
        return parteEntera;
    }

    public void setParteEntera(long parteEntera) {
        this.parteEntera = parteEntera;
    }

    public long getResiduo() {
        return residuo;
    }

    public void setResiduo(long residuo) {
        this.residuo = residuo;
    }
}
