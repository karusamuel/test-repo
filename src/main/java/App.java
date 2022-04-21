import java.io.Console;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EvenNumberCalculator evenNumberCalculator = new EvenNumberCalculator();

        System.out.println("Welcome to the calculator");
        System.out.println("Please Enter a valid integer :");
        Integer number = scanner.nextInt();
        boolean isEven = evenNumberCalculator.isEven(number);

        String message;
        if(isEven){
//            message = String.format("Your number %d is Even", number);
              message = "Your number "+number+" is Even";
        }else {

            message = String.format("Your number %d is Odd", number);
        }

        System.out.println(message);

        Date date = new Date();
        SimpleDateFormat dateFormater = new SimpleDateFormat("EEE,  MMM d , \'\'yyyy");
        String outputDate = String.format("Calculated for int %d on : %s",number,dateFormater.format(date));
        System.out.println(outputDate);


//        System.out.println("Calculated for int "+number+" on :"+date.toString());

//
    }

}
