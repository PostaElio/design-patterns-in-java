package behavioral.strategy;

public class Main {

    public static void main(String[] args) {

        EncriptadorNaive encriptadorNaiveCambiendoVocales = new EncriptadorNaive(new EstrategiaEncriptadoCambiandoVocales());
        String textoEncriptado = encriptadorNaiveCambiendoVocales.encriptar("hola como estas");
        //Texto encriptado
        System.out.println(textoEncriptado);
        //Texto desencriptado
        System.out.println(encriptadorNaiveCambiendoVocales.desencriptar(textoEncriptado));
                                            //-----------><------------//
        EncriptadorNaive encriptadorNaiveLetraPorNumero = new EncriptadorNaive(new EstrategiaEncripadoLetraPorNumero());
        String textoEncriptado1 = encriptadorNaiveLetraPorNumero.encriptar("Diego");
        //Texto encriptado
        System.out.println(textoEncriptado1);
        //Texto desencriptado
        System.out.println(encriptadorNaiveLetraPorNumero.desencriptar(textoEncriptado1));
    }
}
