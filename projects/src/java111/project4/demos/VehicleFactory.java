import java.util.*;
/** This class demonstrate working with an array of object references
 *  as prep for lab 5
 *
 * @author pawaite
 */

 public class VehicleFactory {
     // create an instance variable that will hold an array of vehicle object references
     // but do not instantiate the array yet.
     //Vehicle[] listOfVehicles;

     ArrayList<Vehicle> listOfVehicles;

     /** creates vehicles and puts them in a listOfVehicles **/
     public void createVehicles() {
         System.out.println("in the create Vehicles");
         // instantiate an array that will hold Vehicle obj refs.
        // listOfVehicles = new Vehicle[3];
         listOfVehicles = new ArrayList<Vehicle>();

         //create a vehicle and assign to the first slot in the array
         //listOfVehicles.add(new Vehicle());

         Vehicle vehicle1 = new Car();
         vehicle1.setMake("Chevy");
         vehicle1.setMake("Blazer");
         vehicle1.setYear(2003);
         vehicle1.setColor("grey");
         listOfVehicles.add(vehicle1);

         Vehicle vehicle2 = new Car();
         vehicle2.setMake("Toyota");
         vehicle2.setMake("4 Runner");
         vehicle2.setYear(2012);
         vehicle2.setColor("black");
         listOfVehicles.add(vehicle2);

         //use set methods to assign values...
         // set some details on the first vehicle object


         System.out.println("at the end of the create Vehicles()");

     }
     /** start each vehicle in the list **/
     public void startAllVehicles() {
         // loop through all the vehicles and call the start on each one
         System.out.println("in startAllVehicles");
         for (int counter = 0; counter < listOfVehicles.size(); counter++) {
             Vehicle vehicle = listOfVehicles.get(counter);
             System.out.println(vehicle);
             //listOfVehicles.get(counter).start(); // this line is equivalent to lines 51 & 52
         }
         System.out.println();
         System.out.println("Enhanced for loop output follows");
         for (Vehicle vehicle1 : listOfVehicles) {
             System.out.println(vehicle1);
         }

     }

     /** method to call all the other methods **/
     public void run() {
         createVehicles();
         startAllVehicles();

     }




 }
