package behavioral.state;

public abstract class MaquinaDeVideoJuegosState {
    protected MaquinaDeVideoJuegos maquinaDeVideoJuegos;

    public MaquinaDeVideoJuegosState(MaquinaDeVideoJuegos maquinaDeVideoJuegos) {
        this.maquinaDeVideoJuegos = maquinaDeVideoJuegos;
    }

    public abstract void precionarBotonInicio();
}
