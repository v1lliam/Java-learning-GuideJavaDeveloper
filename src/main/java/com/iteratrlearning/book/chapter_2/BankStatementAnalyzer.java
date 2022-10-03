package main.java.com.iteratrlearning.book.chapter_2;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Month;
import java.util.List;

public class BankStatementAnalyzer {
    
    private static final String RESOURCES = "src/main/resources/";
    
    public void analyze(final String fileName, final BankStatementParser bankStatementParser) throws Exception {
        
        
        final Path path = Paths.get(RESOURCES + fileName);
        final List<String> lines = Files.readAllLines(path);
        
        final List<BankTransaction> bankTransactions = bankStatementParser.parseLinesFrom(lines); // Создание списка с помощью парсера
        final BankStatementProcessor bankStatementProcessor = new BankStatementProcessor(bankTransactions); // Обработка данных 

        collectSummary(bankStatementProcessor);
    }

    private static void collectSummary(final BankStatementProcessor bankStatementProcessor) { 
        
        //System.out.println("The total for all trnsactions is " + bankStatementProcessor.calculateTotalAmount());
        
        System.out.println("The total for transactions in January is " + bankStatementProcessor.calculateInMonth(Month.JANUARY));

        System.out.println("The total for transactions in February is " + bankStatementProcessor.calculateInMonth(Month.FEBRUARY));

        System.out.println("The total salary received is " + bankStatementProcessor.calculateTotalForCategory("Salary"));
    }
}
