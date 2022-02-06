package structural.decorator;

public abstract class IngredienteDePizza implements Pizza{
    protected Pizza wrapper;
    protected Long precio;
    protected String descripcion;

    public IngredienteDePizza(Pizza wrapper, Long precio, String descripcion) {
        this.wrapper = wrapper;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    //<<fina>>: No nos permite modificar estos metodos en las subclass
    //si intentamos modificarlo el IDE nos marca el error, no nos permite correrlo
    @Override
    final public String obtenerDescripcion() {
        return this.wrapper.obtenerDescripcion() + this.descripcion;
    }

    @Override
    final public Long obtenerCosto() {
        return this.wrapper.obtenerCosto() + this.precio;
    }

    @Override
    final public String obtenerInformacionGeneral() {
        return this.wrapper.obtenerInformacionGeneral() + " - " + this.descripcion + ", costo: "+ this.precio+"\n ";
    }
}
