import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        try {

            // initialized an object Scanner class
            Scanner s = new Scanner(System.in);

            // Give the String variable
            System.out.println("Enter Ranges Tank : ");
            Double tank = s.nextDouble();

            if (tank >= 60 && tank < 70){
                System.out.println("Almost full");
            } else if (tank == 70){
                System.out.println("Tank full" );
            } else if (tank >= 40 && tank < 60) {
                System.out.println("Thank 1/4");
            } else if ( tank >= 35 && tank < 40) {
                System.out.println("Half a tank");
            } else if ( tank >= 20 && tank < 35) {
                System.out.println("sufficient");
            } else if (tank >= 1 && tank < 20){
                System.out.println("Insufficient");
            } else {
                System.out.println("Out of the range");
            }
        } catch (Exception e) {
            System.out.println("Error : " + e + ", please enter right values");
            main(args);
            System.exit(0);
        }

    }
}