package creational.singleton;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
public class Library {
    private static Library library;
    private String name;
    private List<String> booksAvailable;
    private List<String> booksNotAvailable;

    public static Library getInstance(){
        if(library==null){
            library = new Library();
            library.booksAvailable = new ArrayList<>();
            library.booksNotAvailable = new ArrayList<>();
        }
        return library;
    }

    public void getSpecificBook(String nameBook) throws Exception {
        if(existBook(nameBook)){
            deleteBookFromBooksAvailable(nameBook);
            addBooksNotAvailable(nameBook);

        }else{
            throw new Exception("Book not found");
        }
    }

    private void addBooksNotAvailable(String nameBook) {
        booksNotAvailable.add(nameBook);
    }

    private boolean existBook(String nameBook){
        //booksAvailable.stream().anyMatch(book -> book.equals(nameBook));
        return booksAvailable.stream().map(book -> book.equals(nameBook)).reduce(Boolean::logicalOr).get();
    }

    private void deleteBookFromBooksAvailable(String nameBook){
        setBooksAvailable(booksAvailable.stream().filter(book -> !book.equals(nameBook)).collect(Collectors.toList()));
    }

}
