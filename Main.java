import java.util.Scanner;
/**
 * This program outputs the biggest integer registered
 * @author David Toma
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for the user
    Scanner input = new Scanner(System.in);

    // ask user for integer
    System.out.println("Please enter an integer:");

    int integer1 = input.nextInt();

    // ask user for another integer
    System.out.println("Please enter another integer:");

    int integer2 = input.nextInt();

    // determine which integer is bigger
    if(integer1 > integer2){
      System.out.println("The biggest number is " + integer1 + ".");
    } else if(integer1 == integer2){
      System.out.println("There is no biggest number.");
    } else {
      System.out.println("The biggest number is " + integer2 + ".");
    }
  }
}

