package creational.builder;

import lombok.*;

import java.util.List;

/**
 * Necesitamos el @AllArgsConstructor para usar el @Builder
 * @Builder genera una classe llamada PersonBuilder y el methodo builder()
 *
 * */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder//le damos un nombre a "new PersonBuilder()" -> (builderMethodName = "hiddenBuilder")
@ToString
public class Person {
    private String firstName;
    private String lastName;
    private int age;
    @Singular //Permitimos agregar de a uno
    private List<String> hobbies;
    @Builder.Default  //Valores por defecto
    private String colorFavorite = "White";
    private String study;
    private String status;

    /**
     * Constructor con atributos requeridos de la clase
     * @param firstName
     * @param lastName
     * @return
     */
    public static PersonBuilder builder(String firstName,String lastName) {
        //More Logic
        return new PersonBuilder().firstName(firstName).lastName(lastName);
    }


}
