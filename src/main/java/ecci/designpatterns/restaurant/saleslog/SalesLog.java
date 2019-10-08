package ecci.designpatterns.restaurant.saleslog;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SalesLog {

    private static final SalesLog instance = new SalesLog();

    private SalesLog() {}

    public static SalesLog getInstance() {
        return instance;
    }

    private String getDateTime() {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        return dateTime.format(dateTimeFormatter);
    }

    public void logSale(String productDescription, double cost) {
        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("sales.log", true)))) {
            writer.write(getDateTime() + " " + productDescription + "COST: " + cost + "\n");
        }
        catch (IOException ex) {
            System.err.println("ERROR writing to Sales Log");
        }
    }
}
