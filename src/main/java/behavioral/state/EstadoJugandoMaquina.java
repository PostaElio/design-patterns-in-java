package behavioral.state;

import java.util.Scanner;

public class EstadoJugandoMaquina extends MaquinaDeVideoJuegosState {


    public EstadoJugandoMaquina(MaquinaDeVideoJuegos maquinaDeVideoJuegos) {
        super(maquinaDeVideoJuegos);
    }

    @Override
    public void precionarBotonInicio() {

        //Timeout jugando y que despues se fije si la maquina tiene mas fichas disponible para jugar, si es que tiene
        // 0 entonces termina y volvemos al estado inicial
        if(this.maquinaDeVideoJuegos.tieneTurnos()){
            this.maquinaDeVideoJuegos.decrementarTurnos();
            this.maquinaDeVideoJuegos.getPantalla().mostrar("Comienza el juego");
            System.out.println("jugando...");
            precionarBotonInicio();
        }
        else
            this.maquinaDeVideoJuegos.setEstado(new EstadoInicialMaquina(this.maquinaDeVideoJuegos));

    }
}
