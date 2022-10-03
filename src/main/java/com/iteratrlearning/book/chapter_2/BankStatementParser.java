package main.java.com.iteratrlearning.book.chapter_2;

import java.util.List;

/*
 * Теперь класс BankStatementCSVParser будет реализовывать иданный интерфейс
 */
public interface BankStatementParser {
    BankTransaction parseFrom(String line);
    List<BankTransaction> parseLinesFrom(List<String> lines);
}
