package creational.singleton;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class LibraryUser {
    private int id;
    private String name;

    public void takeBookWithName(String nameBook) throws Exception {
        Library.getInstance().getSpecificBook(nameBook);

    }

}
