package structural.decorator;

public class PrePizza implements Pizza{
    private String nombre;

    public PrePizza(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String obtenerDescripcion() {
        return "La mejor prepizza :)";
    }

    @Override
    public Long obtenerCosto() {
        return 20L;
    }

    @Override
    public String obtenerInformacionGeneral() {
        return "Informacion de la Pizza "+this.nombre+"\n" +
                "  - " + obtenerDescripcion() + ", costo: "+ this.obtenerCosto()+"\n ";
    }

}
