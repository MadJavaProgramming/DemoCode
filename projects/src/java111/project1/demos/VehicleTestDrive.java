/** Create vehicle objects and test them by calling the  start method.
 *
 * @author pwaite
 */

 public class VehicleTestDrive {

     /** instantiate 2 vehicle objects
      * and call the start method on each one.
      *
      * @param args command line arguments (not used here)
      */
      public static void main(String[] args) {

          // instantiate a vehicle object, and assigning it to the vehicle 1 variable
          Vehicle vehicle1 = new Vehicle();

          // set some details on the objects
          vehicle1.make = "Chevy";
          vehicle1.model = "Blazer";
          vehicle1.year = 2003;
          vehicle1.color = "grey";

          // call the start method on vehicle1
          vehicle1.start();
      }


 }
