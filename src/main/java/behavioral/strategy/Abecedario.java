package behavioral.strategy;

public enum Abecedario {
    ESPACE,
    A,
    B,
    C,
    D,
    E,
    F,
    G,
    H,
    I,
    J,
    K,
    L,
    M,
    N,
    O,
    P,
    Q,R,S,U,T,W,X,Y,Z;


    public static String aNumero(char letra){
        String value = String.valueOf(letra).toUpperCase();
        for (Abecedario abecedario : Abecedario.values())
            if (abecedario.name().equals(value)) {
                value = String.valueOf(abecedario.ordinal());
                return value;
            }
        return value;
    }
}
