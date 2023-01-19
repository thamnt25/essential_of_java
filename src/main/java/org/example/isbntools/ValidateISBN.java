package org.example.isbntools;

import org.codehaus.plexus.util.StringUtils;

public class ValidateISBN {

    public static final int SHORT_ISBN_LENGTH = 10;
    public static final int LONG_ISBN_LENGTH = 13;

    public static void main(String[] args) {

    }

    public boolean checkISBN(String isbn) {
        if (isbn.length() == SHORT_ISBN_LENGTH) {
            return isThisAvalidShortISBN(isbn);
        } else if (isbn.length() == LONG_ISBN_LENGTH) {
            return isThisAvalidLongISBN(isbn);
        }
        throw new NumberFormatException();
    }


    public boolean isThisAvalidShortISBN(String isbn) {
        int total = 0;
        for (int i = 0; i < SHORT_ISBN_LENGTH; i++) {
            if (!Character.isDigit(isbn.charAt(i))) {
                if (i == 9 && isbn.charAt(i) == 'X') {
                    total += 10;
                } else throw new NumberFormatException();
            } else {
                total += Character.getNumericValue(isbn.charAt(i)) * (SHORT_ISBN_LENGTH - i);
            }
        }
        return (total % 11 == 0) ? true : false;
    }

    public boolean isThisAvalidLongISBN(String isbn) {
        int total = 0;
        for (int i = 0; i < LONG_ISBN_LENGTH; i++) {
            if (!Character.isDigit(isbn.charAt(i))) {
                if (i == LONG_ISBN_LENGTH && isbn.charAt(i) == 'X') {
                    total += 10;
                } else throw new NumberFormatException();
            } else {
                if (i % 2 == 0)
                    total += Character.getNumericValue(isbn.charAt(i));
                else total += Character.getNumericValue(isbn.charAt(i)) * 3;
            }
        }
        return (total % 10 == 0) ? true : false;
    }
}
