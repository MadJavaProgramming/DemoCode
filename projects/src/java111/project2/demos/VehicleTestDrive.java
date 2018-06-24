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

          // instantiate an array that will hold 2 Vehicle object references
          Vehicle[] vehicles = new Vehicle[2];

          // instantiate 2 vehicles, one for each index.
          vehicles[0] = new Vehicle();
          vehicles[1] = new Vehicle();

          // set some details on the first vehicle object
          vehicles[0].make = "Chevy";
          vehicles[0].model = "Blazer";
          vehicles[0].year = 2003;
          vehicles[0].color = "grey";

          // set some details on the second vehicle object
          vehicles[1].make = "Toyota";
          vehicles[1].model = "4-Runner";
          vehicles[1].year = 2012;
          vehicles[1].color = "black";

          // call the start method on each vehicle in the array

          for (int counter = 0; counter < vehicles.length; counter++) {
              vehicles[counter].start();
          }

      }


 }
