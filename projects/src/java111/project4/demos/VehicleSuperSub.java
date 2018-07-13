/** demonstrates creating instances of subclasses of the Vehicle
 *  @author pwaite
 */

 class VehicleSuperSub {
     /** Create an airplane and a car, and call
      * the start method on each one.
      */
     public static void main(String[] args) {
         // instantiate a Car
         Car car = new Car();
         car.setMake("Chevy");
         car.setModel("Blazer");
         car.setYear(2003);
         car.setColor("red");
         car.setNumberOfCylinders(8);

         Airplane plane = new Airplane();
         plane.setMake("Cirrus");
         plane.setModel("SR22");
         plane.setColor("White with red stripe");
         plane.setYear(2018);
         plane.setNumberOfEngines(2);

         //plane.start();
         //car.start();

         // toString() demo:
         System.out.println(plane);// implicitly calls toString();
         System.out.println(car);
     }

 }
