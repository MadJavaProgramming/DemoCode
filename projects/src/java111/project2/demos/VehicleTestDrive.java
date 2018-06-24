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
          vehicles[0].setMake("Chevy");
          vehicles[0].setMake("Blazer");
          vehicles[0].setYear(2003);
          vehicles[0].setColor("grey");

          // set some details on the second vehicle object
          vehicles[1].setMake("Toyota");
          vehicles[1].setMake("4-Runner");
          vehicles[1].setYear(2012);
          vehicles[1].setColor("black");

          // call the start method on each vehicle in the array

          for (int counter = 0; counter < vehicles.length; counter++) {
              vehicles[counter].start();
          }

      }


 }
