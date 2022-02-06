package creational.prototype;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class House implements Cloneable{
    private int cantidadDeVentanas;
    private int cantidadDeCuartos;
    private String direccion;
    // Many attributes

    @Override
    protected House clone() //throws CloneNotSupportedException {
    {
        try{
            return (House) super.clone();
        }catch (CloneNotSupportedException ex){
            ex.printStackTrace();
        }
        return null;
    }
}
