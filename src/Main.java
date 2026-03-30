import javax.swing.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        try {

            // Give the String variable with JOptionPane
            Double tank = Double.parseDouble(JOptionPane.showInputDialog(null ,"Enter Ranges Tank : " ));


            // conditional flow
            if (tank >= 60 && tank < 70){
                JOptionPane.showMessageDialog(null , "Almost full");

            } else if (tank == 70){
                JOptionPane.showMessageDialog(null ,"Tank full");

            } else if (tank >= 40 && tank < 60) {
                JOptionPane.showMessageDialog(null, "Thank 1/4");

            } else if ( tank >= 35 && tank < 40) {
                JOptionPane.showMessageDialog(null ,"Half a tank" );

            } else if ( tank >= 20 && tank < 35) {
                JOptionPane.showMessageDialog(null ,"sufficient" );

            } else if (tank >= 1 && tank < 20){
                JOptionPane.showMessageDialog(null, "Insufficient");

            } else {
                JOptionPane.showMessageDialog(null, "Out of the range");
                main(args);
                System.exit(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null , "Error : " + e + ", please enter right values");
            main(args);
            System.exit(0);
        }

    }
}