package java111.project5.demos;
/**
 * Car class represents a car in the Vehicle System
 * @author pwaite
 */
class Car extends Vehicle {
    private int numberOfCylinders;
<<<<<<< HEAD

    /** creates a Car
     */
    public Car() {
        System.out.println("In the car constructor.");
    }

    /** creates a Car with number of cylinders
     * @param numberOfCylinders car's number of cylinders
     */
    public Car(int numberOfCylinders) {
        this();
        System.out.println("In the car constructor setting the cylinder count.");
        this.numberOfCylinders = numberOfCylinders;
    }

    /** creates a Car with make, model, year,  color, and cylinders.
     * @param make car's make
     * @param model car's model
     * @param year car's year
     * @param color car's color
     * @param numberOfCylinders car's number of cylinders
     */
    public Car(String make, String model, int year, String color, int numberOfCylinders) {
        super(make, model, year, color);
        this.numberOfCylinders = numberOfCylinders;
        System.out.println("In the car constructor setting all values.");
    }
	/**
	* Returns value of numberOfCylinders
	* 
=======

	/**
	* Returns value of numberOfCylinders
	* @return number of cylinders
>>>>>>> a9d73eaca3662a82bbd08ffe2441d17ac4836ba1
	*/
	public int getNumberOfCylinders() {
		return numberOfCylinders;
	}

	/**
	* Sets new value of numberOfCylinders
	* @param numberOfCylinders number of cylinders in the car
	*/
	public void setNumberOfCylinders(int numberOfCylinders) {
		this.numberOfCylinders = numberOfCylinders;
	}

    /** Display information about the car and a message that
     *  tells the user the car has started
     */
     public String toString() {
         return super.toString() + "It has " + numberOfCylinders + " cylinder/s.";
     }

     /** Drive the car
      */
     public void operate() {
         System.out.println("Driving the car...");

     }

     /** determines the cost of maintenance.
      *  @return maintenance cost
      */
      public  double determineMaintenanceCost() {
          return 250.00 * numberOfCylinders;
      }
}
