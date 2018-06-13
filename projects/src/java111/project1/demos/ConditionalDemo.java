/** Demonstration if/else statements and booleans
 *
 * @author Paula Waite
 */
 public class ConditionalDemo {
     /** Create a variable and then use if/else
      *  check to perform displays of appropriate messages
      */
      public static void main(String[] args) {
          int myNumber = 25;

          if (myNumber == 40) {
              System.out.println("The number is 40, see...." + myNumber);
          } else if (myNumber == 30) {
              System.out.println("The number is 30, see...." + myNumber);
          } else {
               System.out.println("The number is not 30 or 40. It is " + myNumber);
          }
      }
 }
