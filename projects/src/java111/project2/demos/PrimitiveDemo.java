/**Demonstrates some of the various primitive types
 *
 * @author pwaite
 */

 public class PrimitiveDemo  {
     /** create double, float, char to demonstrate some primitives.
      *
      *  @param args command line arguments (not used here)
      */
      public static void main(String[] args) {
          double myDouble = 45.99;
          float myFloat = 55.791f;
          char myChar = 'y';

          System.out.println("Here is myDouble: " + myDouble);
          System.out.println("Here is myFloat: " + myFloat);
          System.out.println("Here is myChar: " + myChar);

          System.out.println("Here is myDouble + myFloat: " + (myDouble + myChar));

      }

 }
