package behavioral.strategy;

public class EncriptadorNaive {
    private EstrategiaEncriptado estrategiaEncriptado;

    //Injectamos la estrategia de encriptado
    public EncriptadorNaive(EstrategiaEncriptado estrategiaEncriptado) {
        this.estrategiaEncriptado = estrategiaEncriptado;
    }

    //Injectamos nueva estrategia de encriptado
    public void setEstrategiaEncriptado(EstrategiaEncriptado estrategiaEncriptado) {
        this.estrategiaEncriptado = estrategiaEncriptado;
    }

    //Methodos que resuelve nuestra estrategia
    public String encriptar(String texto){
        return estrategiaEncriptado.encriptar(texto);
    }
    public String desencriptar(String texto){
        return estrategiaEncriptado.desencriptar(texto);
    }

}
