import org.example.isbntools.Book;
import org.example.isbntools.ExternalISBNDataService;
import org.example.isbntools.StockManager;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StockManagerTest {
    @Test
    public void getCorrectLocatorCode() {
        String isbn = "0140449116";
        ExternalISBNDataService service = new ExternalISBNDataService() {
            @Override
            public Book lockup(String isbn) {
                return new Book(isbn, "Of Mine and Man", "Jean");
            }
        };
        StockManager stockManager = new StockManager();
        stockManager.setExternalISBNDataService(service);
        String locatorCode = stockManager.getLocatorCode(isbn);
        assertEquals("9116J4", locatorCode);
    }
}
