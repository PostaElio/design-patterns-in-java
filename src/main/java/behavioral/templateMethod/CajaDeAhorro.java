package behavioral.templateMethod;

public class CajaDeAhorro extends CuentaBancaria{
    private int limite;

    public CajaDeAhorro(String titular, int limite) {
        super(titular);
        this.limite = limite;
    }

    public int getLimite() {
        return limite;
    }
    //PRIMITIVE OPERATION
    @Override
    protected boolean esPosibleExtraer(int monto) {
        return this.getSaldo()>=monto&&this.getLimite()>=monto;
    }
}
