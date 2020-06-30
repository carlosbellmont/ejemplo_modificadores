public class SumarNumerosFamososDeFormaMixta {

    private static final float valorPi = 3.1416f;
    private static final float valorE = 2.71828f;

    private static float sumarNumero(int numero1, float numeroFamoso){
        return numero1 + numeroFamoso;
    }
    public float sumarPi(int numero){
        return sumarNumero(numero,valorPi);
    }

    public static float sumarE(int numero){
        return sumarNumero(numero,valorE);
    }

}
