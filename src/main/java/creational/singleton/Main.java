package creational.singleton;

import java.util.List;

public class Main {
    /**
     * Una Biblioteca pertenece a todos los Usuarios de la Biblioteca
     *
     */
    public static void main(String[] args) throws Exception {

        Library.getInstance().setBooksAvailable(List.of("Book1","Book2","Book3","Book4"));

        LibraryUser libraryUser1,libraryUser2,libraryUser3;

        libraryUser1 = new LibraryUser(1,"FirstUser");
        libraryUser2 = new LibraryUser(2,"SecondUser");
        libraryUser3 = new LibraryUser(3,"ThirdUser");

        libraryUser1.takeBookWithName("Book1");
        libraryUser2.takeBookWithName("Book2");
        libraryUser3.takeBookWithName("Book3");
        try{
            libraryUser1.takeBookWithName("Book5");
        }catch (Exception ex){
            System.out.println(ex);
        }

        System.out.println("Libros disponibles: "+Library.getInstance().getBooksAvailable());
        System.out.println("Libros NO disponibles: "+Library.getInstance().getBooksNotAvailable());
    }
}
