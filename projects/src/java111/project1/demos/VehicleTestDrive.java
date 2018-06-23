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

          // instantiate a vehicle object, and assigning it to the vehicle1 variable
          Vehicle vehicle1 = new Vehicle();

          // instantiate a second vehicle object, and assigning it to the vehicle2 variable
          Vehicle vehicle2 = new Vehicle();

          // set some details on the first vehicle object
          vehicle1.make = "Chevy";
          vehicle1.model = "Blazer";
          vehicle1.year = 2003;
          vehicle1.color = "grey";

          // set some details on the second vehicle object
          vehicle2.make = "Toyota";
          vehicle2.model = "4-Runner";
          vehicle2.year = 2012;
          vehicle2.color = "black";

          // call the start method on vehicle1 and vehicle 2
          vehicle1.start();
          vehicle2.start();
      }


 }
