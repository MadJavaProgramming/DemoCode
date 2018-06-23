package java111.project2.demos;

/** Represents a vehicle. This will be used
 *  for demo throughout the semester.
 *
 *  @author pwaite
 */

 public class Vehicle {
     // instance variables/attributes
     String make;
     String model;
     int year;
     String color;

     /** Display information about the vehicle and a message that
      *  tells the user the vehicle has started
      */
      public void start() {
          System.out.println("The " + color + " " + year + " " + make + " " + model +
                " is starting.");
      }
 }
