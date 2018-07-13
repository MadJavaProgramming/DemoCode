/**
 * Car class represents a car in the Vehicle System
 * @author pwaite
 */
class Car extends Vehicle {
    private int numberOfCylinders;

	/**
	* Returns value of numberOfCylinders
	* @return number of cylinders
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
}
