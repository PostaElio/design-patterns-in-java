package behavioral.state;

import java.util.Scanner;

public class EstadoInicialMaquina extends MaquinaDeVideoJuegosState {


    public EstadoInicialMaquina(MaquinaDeVideoJuegos maquinaDeVideoJuegos) {
        super(maquinaDeVideoJuegos);
    }

    @Override
    public void precionarBotonInicio() {
        this.maquinaDeVideoJuegos.getPantalla().mostrar("Bienvenido");
        this.maquinaDeVideoJuegos.getRanura().abrir();
        Scanner userInputScanner = new Scanner(System.in);
        int cantidadDeFichas = userInputScanner.nextInt();
        if (cantidadDeFichas > 0){
            this.maquinaDeVideoJuegos.ingresarFichas(cantidadDeFichas);
            maquinaDeVideoJuegos.setEstado(new EstadoJugandoMaquina(maquinaDeVideoJuegos));
        }else
            System.out.println("No ingresaste ninguna ficha");
        this.maquinaDeVideoJuegos.getRanura().cerrar();
    }

}
