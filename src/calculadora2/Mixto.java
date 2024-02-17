package calculadora2;

public class Mixto extends Fraccion {

    private long parteEntera;

    private long residuo;

    public Mixto(long numerador, long denominador, long parteEntera) {
        super(numerador, denominador);
        this.parteEntera = parteEntera;
    }

    public static Mixto crear(long parteEntera, long numerador, long denominador){
        return new Mixto(numerador, denominador, parteEntera);
    }

    public long getParteEntera() {
        return parteEntera;
    }

    private void setParteEntera(long parteEntera) {
        this.parteEntera = parteEntera;
    }
    public String toString(){
        return getParteEntera() + "->" + super.toString();
    }

}
