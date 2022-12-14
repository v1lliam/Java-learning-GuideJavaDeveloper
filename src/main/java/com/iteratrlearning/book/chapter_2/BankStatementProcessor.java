package main.java.com.iteratrlearning.book.chapter_2;

import java.time.Month;
import java.util.List;

public class BankStatementProcessor {
    
    private final List<BankTransaction> bankTransactions;

    public BankStatementProcessor(List<BankTransaction> bankTransactions) {
        this.bankTransactions = bankTransactions;
    }

    // Подсчитывание суммы всего 
    public double calculateTotalAmount(final List<BankTransaction> bankTransactions ) { 
        double total = 0;
        for (final BankTransaction bankTransaction : bankTransactions) {
            total += bankTransaction.getAmount();
        }

        return total;
    }


    // Подсчитывание суммы по месяцу
    public double calculateInMonth (final Month month) { 
        double total = 0d;
        for (final BankTransaction bankTransaction : bankTransactions) {
            if (bankTransaction.getDate().getMonth() == month) {
                total += bankTransaction.getAmount();
            }
        }

        return total;
    }


    // Подсчитывание суммы по Описанию 
    public double calculateTotalForCategory (final String category) { 
        double total = 0d;
        for (final BankTransaction bankTransaction : bankTransactions) {
            if (bankTransaction.getDescription().equals(category)) {
                total += bankTransaction.getAmount();
            }
        }

        return total;
    }

}
