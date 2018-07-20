/** demonstrates polymorphism with Vehicle and it's subclasses
 *  @author pwaite
 */

 class PolyTestDrive {
     /** Create an airplane and a car object but the object Reference
      * variable type is Vehicle
      * @param args command line args (not used here)
      */
     public static void main(String[] args) {
         // instantiate a Car
         Car car = new Car();
         car.setMake("Chevy");
         car.setModel("Blazer");
         car.setNumberOfCylinders(4);

         Vehicle plane = new Airplane();
         plane.setMake("Cirrus");
         plane.setModel("SR22");

         System.out.println(plane);// implicitly calls toString();
         System.out.println(car);
     }

 }
