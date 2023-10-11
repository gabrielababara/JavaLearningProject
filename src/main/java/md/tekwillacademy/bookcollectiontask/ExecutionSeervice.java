package md.tekwillacademy.bookcollectiontask;

import java.util.HashMap;
import java.util.Map;

public class ExecutionSeervice {
    public static void main(String[] args) {
        Book gabisBook = new Book("Ego is the enemy","Ryan Holiday");
        Book mihaisBook = new Book("Atomic Habits", "JamesC.");
        Book alexsBook = new Book("Crime and Punishment", "Feodor D.");
        Book ruxandasBook = new Book("Karamazov Brothers", "Feodor D.");
        Book veronicasBook = new Book("To Kill a Mockingbird", "Harper L.");
        Book mihais2book = new Book("1984", "George O.");

        gabisBook.printTheBookDetails();
        mihais2book.printTheBookDetails();
        mihaisBook.printTheBookDetails();
        alexsBook.printTheBookDetails();
        ruxandasBook.printTheBookDetails();
        veronicasBook.printTheBookDetails();

        Library carturestiLibrary = new Library("Carturesti");

        carturestiLibrary.addBook(mihaisBook);
        carturestiLibrary.addBook(mihaisBook);
        carturestiLibrary.addBook(veronicasBook);
        carturestiLibrary.addBook(ruxandasBook);
        carturestiLibrary.addBook(gabisBook);

        System.out.println(carturestiLibrary.getTheStockStatusNumber());
        System.out.println(carturestiLibrary.isThereSuchABookInTheStock(alexsBook));

        carturestiLibrary.addBook(alexsBook);
        System.out.println(carturestiLibrary.getTheStockStatusNumber());
        System.out.println(carturestiLibrary.isThereSuchABookInTheStock(alexsBook));

        carturestiLibrary.deleteABookIfExists(alexsBook);
        System.out.println(carturestiLibrary.getTheStockStatusNumber());

        carturestiLibrary.printAllTheBooks();
        System.out.println();

        Library gabrielasLibrary = new Library("Cartier");

        gabrielasLibrary.addBook(gabisBook);
        gabrielasLibrary.addBook(mihaisBook);
        gabrielasLibrary.addBook(veronicasBook);

        System.out.println(gabrielasLibrary.getTheStockStatusNumber());

        gabrielasLibrary.printAllTheBooks();

        Map<String, Library> librariesMap = new HashMap<>();

        librariesMap.put("Str.Stefan cel Mare 81 ", carturestiLibrary);
        librariesMap.put("Str.Mihai Eminescu 48 ", gabrielasLibrary);
        librariesMap.put("Str.Stefan cel Mare 81", gabrielasLibrary);

        System.out.println(librariesMap.size());

        System.out.println(librariesMap.get("Str.Stefan cel Mare 81 ").getLibraryName());

        librariesMap.get("Str.Stefan cel Mare 81").printAllTheBooks();
        System.out.println(librariesMap.get("Str.Mihai Eminescu 48 ").isThereSuchABookInTheStock(gabisBook));

        int[] dataTable = new int[6];
        dataTable[0] = 9;
        dataTable[1] = 65;
        dataTable[2] = 12;
        dataTable[3] = 52;
        dataTable[4] = 5;
        dataTable[5] = 1;

        System.out.println(IntNumberArrayService.findMin(dataTable));
        System.out.println(IntNumberArrayService.getAvg(dataTable));

    }
}