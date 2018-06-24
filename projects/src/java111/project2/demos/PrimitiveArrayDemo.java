/** Demonstrate creating an array that will hold primitive values
 *
 * @author pwaite
 */
 public class PrimitiveArrayDemo {
     /** Create an array to hold 5 doubles
      *  Add doubles to the  array
      *  Display each item in the array
      *
      *  @param args command line arguments
      */
      public static void main(String[] args) {
          // Create an array to hold 5 doubles
          double[] prices = new double[5];

          //Add prices to the  array
          prices[0] = .99;
          prices[1] = 1.99;
          prices[2] = 9.99;
          prices[3] = 19.99;
          prices[4] = 5.99;

          //Display each item in the array
          System.out.println("The price at index 0 is: $" + prices[0]);
          System.out.println("The price at index 1 is: $" + prices[1]);

          System.out.println();
          System.out.println("The prices listed using a while loop");
          // A better way to display all the values
          int counter = 0;
          while (counter < prices.length) {
              System.out.println("The price at index " + counter +" is: $" + prices[counter]);
              counter++;
          }

          System.out.println();
          System.out.println("The prices listed using a for loop");
          // Using a for loop
          for (int counter2 = 0; counter2 < prices.length; counter2++) {
              System.out.println("The price at index " + counter2 +" is: $" + prices[counter2]);
          }

      }

 }
