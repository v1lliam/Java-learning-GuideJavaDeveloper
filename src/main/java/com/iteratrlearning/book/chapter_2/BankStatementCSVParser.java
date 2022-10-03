package main.java.com.iteratrlearning.book.chapter_2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class BankStatementCSVParser implements BankStatementParser{

    private static final DateTimeFormatter DATE_PATTERN = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public BankTransaction parseFrom (final String line) { 
        // Разделяем читаемые объекты через запятую
        final String[] columns = line.split(",");

        // DATE_PATTERN - показывает в каком формате будет обрабатываться дата 
        final LocalDate date = LocalDate.parse(columns[0], DATE_PATTERN); // Обработка даты 
        final double amount = Double.parseDouble(columns[1]); // Обработка суммы 
        final String description = columns[2]; // Обработка описания


        return new BankTransaction(date, amount , description); 
    }

    // Занесение считанных данных в список
    public List<BankTransaction> parseLinesFrom (final List<String> lines) { 
        final List<BankTransaction> bankTransactions = new ArrayList<>();
        for (String line : lines) {
            bankTransactions.add(parseFrom(line));
        }

        return bankTransactions;
    }
}
