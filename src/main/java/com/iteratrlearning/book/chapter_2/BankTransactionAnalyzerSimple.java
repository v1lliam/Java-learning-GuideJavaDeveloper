package main.java.com.iteratrlearning.book.chapter_2;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


/* 
 * Первая версия анализатора банковских операций 
 */
public class BankTransactionAnalyzerSimple {

    private static final String RESOURCES = "src/main/resources/";

    public static void main(final String[] args) throws Exception {
            final Path path = Paths.get(RESOURCES + "bank-data-simple.csv");
            final List<String> lines = Files.readAllLines(path);
            double total = 0;
            for(final String line: lines) {
                String[] columns = line.split(",");
                double amount = Double.parseDouble(columns[1]);
                total += amount;
            }

            System.out.println("The total for all transactions is " + total);
    }
}