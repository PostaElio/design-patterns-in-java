package behavioral.templateMethod;

public class CuentaCorriente extends CuentaBancaria{
    private int descubierto;

    public CuentaCorriente(String titular, int descubierto) {
        super(titular);
        this.descubierto = descubierto;
    }
    public int getDescubierto() {
        return descubierto;
    }

    //PRIMITIVE OPERATION
    @Override
    public boolean esPosibleExtraer(int monto) {
        return this.getSaldo()+this.descubierto>=monto;
    }

}

