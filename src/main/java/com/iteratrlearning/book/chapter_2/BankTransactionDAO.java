package main.java.com.iteratrlearning.book.chapter_2;

import java.time.LocalDate;

/*
 * Информационный тип связности, методы связанны одной информации которые занимаются обработкой одного класса,
 * но данный способ может привести к ненужным зависимостям из-вне.
 */
public class BankTransactionDAO {
    
    public BankTransaction create(final LocalDate date, final double amount, final String description) {
        // ...
        throw new UnsupportedOperationException();
    }

    public BankTransaction read(final long id) { 
        // ... 
        throw new UnsupportedOperationException();
    }

    public BankTransaction update(final long id) { 
        // ...
        throw new UnsupportedOperationException();
    }

    public void delete(final BankTransaction bankTransaction) { 
        // ...
        throw new UnsupportedOperationException(); 
    }
}
