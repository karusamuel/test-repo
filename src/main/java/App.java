import java.io.Console;

public class App {

    public static void main(String[] args){
      System.out.println("Hello world");
        Console console = System.console();

        String name  = console.readLine();
    }
}
