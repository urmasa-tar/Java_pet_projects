import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * BankTransactionAnalyzerSimple
 */
public class BankTransactionAnalyzerSimple {

    private static final String RESOURCES = "src/main/resources/"; // final - 

    //                                      / throws - ?
    public static void main(String... args) throws IOException{

        final Path path = Paths.get(RESOURCES + args[0]); // data type Path - ?
        final List<String> lines = Files.readAllLines(path) ; // List<String> - ?
        double total = 0d;
        for(final String line: lines) {
            final String[] columns = line.split(",");
            final double amount = Double.parseDouble(columns[1]);
            total += amount;
        }
        System.out.println("The total for all transactions is " + total);

    }

    public static void sum_Jan(String... args){

        final Path path = Paths.get(RESOURCES + args[0]);
        final List<String> lines = Files.readAllLines(path);
        double total = 0d;
        final DateTimeFormatter DATE_PATTERN = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        for(final String line: lines) {
            final String[] columns = line.split (",");
            final LocalDate date = LocalDate.parse(columns[0], DATE_PATTERN);
            if(date.getMonth() == Month.JANUARY) {
                final double amount = Double.parseDouble(columns[1]);
                total += amount;
            }
            System.out.println("The total for all transactions in January is " + total);
        }

    }

}