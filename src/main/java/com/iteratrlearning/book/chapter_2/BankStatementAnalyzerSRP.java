package main.java.com.iteratrlearning.book.chapter_2;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class BankStatementAnalyzerSRP {
    private static final String RESOURCES = "src/main/resources/";

    public static void main(final String[] args) throws Exception {
            
        
        final BankStatementCSVParser bankStatementParser = new BankStatementCSVParser();
            

        final String fileName = "bank-data-simple.csv";
        final Path path = Paths.get(RESOURCES + fileName);
        final List<String> lines = Files.readAllLines(path);

        final List<BankTransaction> bankTransactions = bankStatementParser.parseLinesFromCSV(lines);


        System.out.println("The total for all transactions is " + calculateTotalAmount(bankTransactions));
        System.out.println("The total for all transactions in January " + selectInMonth(bankTransactions, Month.JANUARY));
        
    }


    public static double calculateTotalAmount(final List<BankTransaction> bankTransactions ) { 
        double total = 0d;
        for (final BankTransaction bankTransaction : bankTransactions) {
            total += bankTransaction.getAmount();
        }

        return total;
    }


    public static List<BankTransaction> selectInMonth(final List<BankTransaction> bankTransactions, final Month month) { 


        final List<BankTransaction> bankTransactionsInMonth = new ArrayList<>();
        for (final BankTransaction bankTransaction : bankTransactions) {
            if (bankTransaction.getDate().getMonth() == month) {
                bankTransactionsInMonth.add(bankTransaction);
            }
        }

        return bankTransactionsInMonth;
    }
}
