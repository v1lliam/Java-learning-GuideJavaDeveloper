package main.java.com.iteratrlearning.book.chapter_2;
/*
 * Пример логической связности 
 * 
 * На самом деле методы относятся к категории "парсинга".
 * При этом по своей сути они разные и малы связанны друг с другом.
 * Их группировка также протеворечит принципу SRP. так как класс берет на себя
 * отвественность за несколько разных задач.
 */
public class BankTransactionParser {
    
    public BankTransaction parseFromCSV(final String line) { 
        // ...
        throw new UnsupportedOperationException();
    }

    public BankTransaction parseFromJSON(final String line) { 
        // ....
        throw new UnsupportedOperationException();
    }

    public BankTransaction parseFromXML (final String line) { 
        // ... 
        throw new UnsupportedOperationException();
    }
}
