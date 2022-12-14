import java.util.Scanner;

/**
 * Simple input output math program.
 * @version 10.03.2022
 * @author Srao2020
 * This is my extra: If your type in 52 as the age, it prints out a little extra.
 */
public class SimpleIOMath {
    private String name;
    private int age;
    private int favNumber;

    //public SimpleIOMath() {
        //name = "";
        //age = 0;
        //favNumber = 0;
    //}


    /**
     * Asking the user for some information.
     */

    public void promptUser() {
        System.out.println("* Sit yourself down, take a seat *");
        System.out.println("* All you gotta do is repeat after me *");
        Scanner in = new Scanner(System.in);
        System.out.print("Question 1: What is your name? ");
        name = in.nextLine();
        System.out.print("Question 2: How old are you? ");
        age = in.nextInt();

        if (age == 52) {
            System.out.println("What is Forrest Gump’s email password?\n" +
                    "1forrest1.\n" + "I know amazing joke");
        }

        System.out.print("Question 3: What is your favorite number? ");
        favNumber = in.nextInt();
        System.out.println("I'm gonna teach you how to sing it out");
        System.out.println("Come on, come on, come on");
        System.out.println("Let me tell you what it's all about");
        System.out.println("Reading, writing, arithmetic");
        System.out.println("Are the branches of the learning tree");
    }

    /**
     * Reprinting the info the user supplied the program.
     */
    public void printInfo() {
        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);
        System.out.println("At your next birthday, you will turn " + (age + 1));
        System.out.println("The first prime factor of " + age + " is: " + smallestPrimeFactor(age));
        System.out.println("Your favorite number is: " + favNumber);
        System.out.println("Your favorite number squared is: " + (favNumber*favNumber));
        //System.out.println(favNumber + "squared" + (int)(Math.pow(favNumber, 2));
        //Could also use this to square the number
        System.out.println("* end of program *");
    }


    private boolean isPrime(int num) {
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0)
                return false;
        }
        return true;
    }

    private int smallestPrimeFactor(int num) {
        for(int i = 2; i < Math.sqrt(num)+1; i++) {
            if(isPrime(i)) {
                if (num % i == 0)
                    return i;
            }
        }
       return num;
    }

    /**
     * Main method for SimpleIOMath
     * @param args command line arguments, if needed.
     */
    public static void main(String[] args) {
        SimpleIOMath prod = new SimpleIOMath();
        prod.promptUser();
        prod.printInfo();
        //System.out.println(prod.isPrime(20));
        //System.out.println(prod.smallestPrimeFactor(20));
    }
}
