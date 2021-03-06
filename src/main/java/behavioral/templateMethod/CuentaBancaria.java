package behavioral.templateMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class CuentaBancaria {
    private String titular;
    private int saldo;
    private List<String> movimientos;

    public CuentaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0;
        this.movimientos = new ArrayList<String>();
    }
    public String getTitular() {
        return titular;
    }
    public int getSaldo() {
        return saldo;
    }
    public void setSaldo(int monto) {
        this.saldo = monto;
    }
    public void agregarMovimiento(String movimiento) {
        movimientos.add(movimiento);
    }

    //TEMPLATE METHOD
    final public void extraer(int monto) {
        if(esPosibleExtraer(monto)){
            this.setSaldo(this.getSaldo()-monto);
            this.agregarMovimiento("Extraccion");
        }
    }
    //PRIMITIVE OPERATION
    abstract protected boolean esPosibleExtraer(int monto);

}

