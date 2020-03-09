import domain.FizzBuzz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        try {
            Scanner keyboard = new Scanner(System.in);
            boolean Fizzbuzzing = true;
            while (Fizzbuzzing) {
                System.out.println("Number to domain.FizzBuzz our way to or 0 to quit: ");
                int numberToFizzBuzzTo = keyboard.nextInt();
                if (numberToFizzBuzzTo == 0) {
                    Fizzbuzzing = false;
                }
                else if (numberToFizzBuzzTo < 0){
                    System.out.println("A positive number, genius.\nNegative number capability hasn't been added yet.\n");
                }
                else {
                    FizzBuzz fizzBuzzTest = new FizzBuzz(numberToFizzBuzzTo);
                    fizzBuzzTest.doTheFizzBuzz();
                }
            }
        } catch (InputMismatchException e){
            System.out.println("That wasn't a number, try again");
        }
    }
}
