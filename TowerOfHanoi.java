import java.util.Scanner;

/**

* This solves tower of hanoi

* code taken from https://www.geeksforgeeks.org/python-program-for-tower-of-hanoi/ 

* @author  Housein

* @version 1.0

* @since   2022-04-2 

*/

public class TowerOfHanoi {

  public static void Hanoi(int nDisks, int source, int destination, int auxiliary) {

    if (nDisks == 1) {
      System.out.println("Move disk 1 from peg " + source + " to peg " + destination); 
    } else {
      Hanoi(nDisks - 1, source, auxiliary, destination);
      System.out.println("Move disk " + nDisks + " from peg " + source + " to peg " + destination);
      Hanoi(nDisks - 1, auxiliary, destination, source);
    }
  }

  public static void main(String[] args) {
    int numberOfDisks = 1;
    
    System.out.println("Towers of Hanoi program\n");
    
    while (true) {
      System.out.println("How many disks would you like in your tower? ");
      Scanner myReader = new Scanner(System.in);
      String numberOfDisksStr = myReader.nextLine();
    
      try {
        numberOfDisks = Integer.parseInt(numberOfDisksStr);
        break;
      } catch (NumberFormatException e) {
        System.out.println("invalid input");;
      }
    }

    Hanoi(numberOfDisks, 1, 3, 2);
    
    System.out.println("\nDone.");
  }
}