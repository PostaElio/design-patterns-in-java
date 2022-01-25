package creational.object.prototype;

import creational.object.builder.Article;
import creational.object.builder.Person;

public class Main {

    public static void main(String[] args){
        House house1, house2, house3;
        house1 = new House(5,2,"anyDirection");
        house2 = house1.clone();
        house3 = new House();
        //Diferente posicion de memoria
        System.out.println(house1 == house2);
        //Mismos valores
        System.out.println(house1.getCantidadDeCuartos() == house2.getCantidadDeCuartos());
        System.out.println(house1.getCantidadDeVentanas() == house2.getCantidadDeVentanas());
        System.out.println(house1.getDireccion().equals(house2.getDireccion()));

        System.out.println(house2.toString());
        System.out.println(house3.toString());

    }
}
