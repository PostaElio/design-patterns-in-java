package behavioral.strategy;

public class EstrategiaEncriptadoCambiandoVocales implements EstrategiaEncriptado{
/*
    public String template(String texto, Function){
        char[] arregloDeLetras = texto.toCharArray();
        String resultado = "";
        for (char letra : arregloDeLetras) {
            resultado = resultado + function.apply(letra);
        }
        return resultado.toLowerCase();
    }
*/
    @Override
    public String encriptar(String texto) {
        char[] arregloDeLetras = texto.toCharArray();
        String resultado = "";
        for (char letra : arregloDeLetras) {
            resultado = resultado + Vocal.siguienteDeUnaVocal(letra);
        }
        return resultado.toLowerCase();
    };

    @Override
    public String desencriptar(String texto) {
        char[] arregloDeLetras = texto.toCharArray();
        String resultado = "";
        for (char letra : arregloDeLetras) {
            resultado = resultado + Vocal.anteriorDeUnaVocal(letra);
        }
        return resultado.toLowerCase();
    }

}
