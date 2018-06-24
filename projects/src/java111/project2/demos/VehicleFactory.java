/** This class demonstrate working with an array of object references
 *  as prep for lab 5
 *
 * @author pawaite
 */

 public class VehicleFactory {
     // create an instance variable that will hold an array of vehicle object references
     // but do not instantiate the array yet.
     Vehicle[] listOfVehicles;

     /** creates vehicles and puts them in a listOfVehicles **/
     public void createVehicles() {
         System.out.println("in the create Vehicles");
         // instantiate an array that will hold Vehicle obj refs.
         listOfVehicles = new Vehicle[3];

         //create a vehicle and assign to the first slot in the array
         listOfVehicles[0] = new Vehicle();

         //use set methods to assign values...
         // set some details on the first vehicle object
         listOfVehicles[0].setMake("Chevy");
         listOfVehicles[0].setMake("Blazer");
         listOfVehicles[0].setYear(2003);
         listOfVehicles[0].setColor("grey");

         System.out.println("at the end of the create Vehicles()");

     }
     /** start each vehicle in the list **/
     public void startAllVehicles() {
         // loop through all the vehicles and call the start on each one
         System.out.println("in startAllVehicles");
     }

     /** method to call all the other methods **/
     public void run() {
         createVehicles();
         startAllVehicles();

     }




 }
