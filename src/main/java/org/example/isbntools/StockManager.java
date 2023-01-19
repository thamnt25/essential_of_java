package org.example.isbntools;
import org.example.isbntools.ExternalISBNDataService;

public class StockManager {

    public ExternalISBNDataService service;

    public void setExternalISBNDataService(ExternalISBNDataService service) {
        this.service = service;
    }

    public String getLocatorCode(String inbs) {
        Book book = service.lockup(inbs);
        StringBuilder locator = new StringBuilder();
        locator.append(book.getIsbn().substring(inbs.length() - 4));
        locator.append(book.getAuthor().substring(0, 1));
        locator.append(book.getTitle().split(" ").length);
        return locator.toString();
    }
}
