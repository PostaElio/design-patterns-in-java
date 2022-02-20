package behavioral.state;

public class MaquinaDeVideoJuegos {

    private Ranura ranura;
    private Pantalla pantalla;

    private MaquinaDeVideoJuegosState maquinaDeVideoJuegosState;
    private int fichasIngresadas;

    public Ranura getRanura() {
        return ranura;
    }

    public Pantalla getPantalla() {
        return pantalla;
    }

    public MaquinaDeVideoJuegos() {
        this.ranura = new Ranura();
        this.pantalla = new Pantalla();
        this.maquinaDeVideoJuegosState = new EstadoInicialMaquina(this);
    }


    public void precionarBotonInicio(){
        this.maquinaDeVideoJuegosState.precionarBotonInicio();

    }

    void setEstado(MaquinaDeVideoJuegosState estadoJugandoMaquina) {
        this.maquinaDeVideoJuegosState = estadoJugandoMaquina;
    }

    public boolean tieneTurnos() {
        return this.fichasIngresadas > 0;
    }

    public void ingresarFichas(int cantidadDeFichas) {
        this.fichasIngresadas = cantidadDeFichas;
    }

    public void decrementarTurnos() {
        this.fichasIngresadas=-1;
        System.out.println("Tenes " +this.fichasIngresadas+" turnos.");
    }
}
