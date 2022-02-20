package behavioral.strategy;

public enum Vocal {
    A,
    E,
    I,
    O,
    U;

    /**
     * Si el ordinal(posicion actual) es igual a la cantidad de nuestros enums(ininciando en 0),
     * entonces devolvemos el primero, sino devolvemos la siguiente vocal
     * @return
     */
    public String siguiente(){
        return Vocal.values()[this.ordinal() == Vocal.values().length -1 ? 0 : this.ordinal()+1].name();
    }

    public static String siguienteDeUnaVocal(char letra){
        String value = String.valueOf(letra).toUpperCase();
        for (Vocal vocal : Vocal.values())
            if (vocal.name().equals(value)) {
                value = vocal.siguiente();
                return value;
            }
        return value;
    };

    public String anterior(){
        return Vocal.values()[this.ordinal() == Vocal.values().length -1 ? Vocal.values().length -2 : this.ordinal()-1].name();
    }

    public static String anteriorDeUnaVocal(char letra){
        String value = String.valueOf(letra).toUpperCase();
        for (Vocal vocal : Vocal.values())
            if (vocal.name().equals(value)) {
                value = vocal.anterior();
                return value;
            }
        return value;
    };


}
