package main.java.com.iteratrlearning.book.chapter_2;

public class MainAppplication {

    public static void main(String[] args) throws Exception {

        final BankStatementAnalyzer bankStatementAnalyzer = new BankStatementAnalyzer();

        final BankStatementParser bankStatementParser = new BankStatementCSVParser();

        bankStatementAnalyzer.analyze("bank-data-simple.csv", bankStatementParser);
    }
}
