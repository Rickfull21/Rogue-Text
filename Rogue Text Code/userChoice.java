import java.util.Scanner;
public class userChoice {
    private final Scanner scanner;

    public userChoice() {
        this.scanner = new Scanner(System.in);
    }

    public String getChoice() {
        return this.scanner.nextLine(); 
    }

    public void closeScanner() {
        this.scanner.close();
    }
}
