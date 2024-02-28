package calculadora2;

public class Mixto extends Fraccion {

    private long parteEntera;

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

    @Override
    public String toString(){
        return getParteEntera() + " " + getNumerador() + "/" + getDenominador();
    }
}

