package calculadora2;

public class Calculadora {


    private Calculadora(){
        super();
    }

    public static Fraccion sumar(Fraccion fraccionUno, Fraccion fraccionDos){
        if (fraccionUno == null){
            throw new RuntimeException("La fraccion uno no puede estar vacia");
        }
        if (fraccionDos == null){
            throw new RuntimeException("La fraccion dos no puede estar vacia");
        }
        long numerador = fraccionUno.getNumerador() * fraccionDos.getDenominador() + fraccionUno.getDenominador() * fraccionDos.getNumerador();
        long denominador = fraccionUno.getDenominador() * fraccionDos.getDenominador();

        Fraccion resultado = simplificar(Fraccion.crear(numerador, denominador));


        return resultado;

    }

    public static Fraccion restar(Fraccion fraccionUno, Fraccion fraccionDos){
        if (fraccionUno == null){
            throw new RuntimeException("La fraccion uno no puede estar vacia");
        }
        if (fraccionDos == null){
            throw new RuntimeException("La fraccion dos no puede estar vacia");
        }
        long numerador = fraccionUno.getNumerador() * fraccionDos.getDenominador() - fraccionUno.getDenominador() * fraccionDos.getNumerador();
        long denominador = fraccionUno.getDenominador() * fraccionDos.getDenominador();


        Fraccion resultado = simplificar(Fraccion.crear(numerador, denominador));


        return resultado;

    }

    public static Fraccion multiplicar(Fraccion fraccionUno, Fraccion fraccionDos){
        if (fraccionUno == null){
            throw new RuntimeException("La fraccion uno no puede estar vacia");
        }
        if (fraccionDos == null){
            throw new RuntimeException("La fraccion dos no puede estar vacia");
        }
        long numerador = fraccionUno.getNumerador() * fraccionDos.getNumerador();
        long denominador = fraccionUno.getDenominador() * fraccionDos.getDenominador();

        Fraccion resultado = simplificar(Fraccion.crear(numerador, denominador));


        return resultado;

    }

    public static Fraccion dividir(Fraccion fraccionUno, Fraccion fraccionDos){
        if (fraccionUno == null){
            throw new RuntimeException("La fraccion uno no puede estar vacia");
        }
        if (fraccionDos == null){
            throw new RuntimeException("La fraccion dos no puede estar vacia");
        }
        long numerador = fraccionUno.getNumerador() * fraccionDos.getDenominador();
        long denominador = fraccionUno.getDenominador() * fraccionDos.getNumerador();

        Fraccion resultado = simplificar(Fraccion.crear(numerador, denominador));


        return resultado;

    }

    public static Mixto sumarMixto(Mixto mixtoUno, Mixto mixtoDos){
        Fraccion fraccionUno = Calculadora.convertirAFraccion(mixtoUno);
        Fraccion fraccionDos = Calculadora.convertirAFraccion(mixtoDos);

        Fraccion resultado = simplificar(sumar(fraccionUno, fraccionDos));



        return   convertirAmixto(resultado);

    }

    public static Mixto restaMixto(Mixto mixtoUno, Mixto mixtoDos){
        Fraccion fraccionUno = convertirAFraccion(mixtoUno);
        Fraccion fraccionDos = convertirAFraccion(mixtoDos);

        Fraccion resultado = simplificar(restar(fraccionUno, fraccionDos));



        return   convertirAmixto(resultado);

    }

    public static Mixto multiplicaionMixto(Mixto mixtoUno, Mixto mixtoDos){
        Fraccion fraccionUno = convertirAFraccion(mixtoUno);
        Fraccion fraccionDos = convertirAFraccion(mixtoDos);

        Fraccion resultado = simplificar(multiplicar(fraccionUno, fraccionDos));



        return   convertirAmixto(resultado);

    }

    public static Mixto divisionMixto(Mixto mixtoUno, Mixto mixtoDos){
        Fraccion fraccionUno = convertirAFraccion(mixtoUno);
        Fraccion fraccionDos = convertirAFraccion(mixtoDos);

        Fraccion resultado = simplificar(dividir(fraccionUno, fraccionDos));



        return   convertirAmixto(resultado);

    }

    public static Fraccion simplificar(Fraccion fraccion){
        long mcd = calcularMinimoComunDivisor(fraccion.getNumerador(), fraccion.getDenominador());

        long numerador= fraccion.getNumerador() / mcd;
        long denominador = fraccion.getDenominador() / mcd;



        return Fraccion.crear(numerador,denominador);

    }

    public static Fraccion amplificar(Fraccion fraccion, long amplificador){


        long numerador= fraccion.getNumerador() * amplificador;
        long denominador = fraccion.getDenominador() * amplificador;



        return Fraccion.crear(numerador,denominador);

    }

    public static long calcularMinimoComunDivisor(long numero1, long numero2) {
        // Aplicar el algoritmo de Euclides
        while (numero2 != 0) {
            long temp = numero2;
            numero2 = numero1 % numero2;
            numero1 = temp;
        }

        // El MCD es el último valor no nulo de numero1
        return numero1;
    }


    public static boolean VerificarIrredictible(Fraccion fraccion) {
        if(calcularMinimoComunDivisor(fraccion.getNumerador(), fraccion.getDenominador())==1) {
            return true;
        }
        return false;
    }


    public static boolean verificarFraccionPropia(Fraccion fraccion){
        if (fraccion.getDenominador() > fraccion.getNumerador()) {
            return true;
        }
        return false;

    }

    public static boolean verificarFraccionImpropia(Fraccion fraccion){
        if (verificarFraccionPropia(fraccion)){
            return false;
        }
        return true;

    }

    public static Mixto convertirAmixto(Fraccion fraccion){
        Fraccion fraccionSimplificada = simplificar(fraccion);


        long parteEntera = fraccionSimplificada.getNumerador()/ fraccionSimplificada.getDenominador();
        long numerador = fraccionSimplificada.getNumerador() - (parteEntera* fraccionSimplificada.getDenominador());
        long denominador = (fraccionSimplificada.getDenominador());

        return Mixto.crear(parteEntera ,numerador, denominador);
    }

    public static Fraccion convertirAFraccion(Mixto mixto) {
        if (mixto == null){
            throw new RuntimeException("El mixto no puede estar vacio");
        }
        long numerador = (mixto.getParteEntera()* mixto.getDenominador()) + mixto.getNumerador();
        long denominador = (mixto.getDenominador());

        return simplificar(Fraccion.crear(numerador, denominador));
    }

}
