/** Demonstration of any array that hold doubles. Imagine
 *  this is a list of prices, for example.
 *
 * @author pwaite
 */

 public class ArrayOfPrimitivesDemo {
     /** Create an array to hold 5 doubles
      *  Assign a value to each slot
      *  Display those values
      *
      *  @param command line args
      */
      public static void main(String[] args) {
          // Create an array that will hold 5 doubles
          double[] prices = new double[5];

          // Assign a value to the first slot (index 0)
          prices[0] = 1.99;

          // continue adding prices to each slot/index
           prices[1] = 2.99;
           prices[2] = 4.99;
           prices[3] = 101.99;
           prices[4] = .99;

           // display values
           System.out.println("The first price at index 0 is: $" + prices[0] );
           System.out.println("The first price at index 1 is: $" + prices[1] );
           System.out.println("The first price at index 2 is: $" + prices[2] );

           System.out.println();
           System.out.println("Using a while loop to output the prices: " );
           // display values more elegantly??
           int counter = 0;
           while (counter < prices.length) {
                System.out.println("The first price at index 0 is: $" + prices[counter] ); //0, 1, 2, 3, 4
                counter++;
           }

           System.out.println();
           System.out.println("Using a for loop to output the prices: " );
           // display values more elegantly??
           for (counter = 0; counter < prices.length; counter++) {
               System.out.println("The first price at index 0 is: $" + prices[counter] ); //0, 1, 2, 3, 4
           }



      }

 }
