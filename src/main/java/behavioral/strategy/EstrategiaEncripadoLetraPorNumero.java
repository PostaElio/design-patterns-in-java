package behavioral.strategy;

import java.util.Arrays;

public class EstrategiaEncripadoLetraPorNumero implements EstrategiaEncriptado{


    @Override
    public String encriptar(String texto) {
        //1,2,3,4
        char[] arregloDeLetras = texto.toCharArray();
        String resultado = "";
        for (char letra : arregloDeLetras) {
            resultado = resultado + Abecedario.aNumero(letra)+",";
        }
        return Arrays.toString(resultado.split("[\\s,]+"));

    }

    @Override
    public String desencriptar(String texto) {/*

        //1,2,3,4
        char[] arregloDeLetras = texto.toCharArray();
        String resultado = "";
        for (char letra : arregloDeLetras) {
            resultado = resultado + Abecedario.aLetra(numero);
        }
        return Arrays.toString(resultado.split("[\\s,]+"));*/
        return null;
    }
}
