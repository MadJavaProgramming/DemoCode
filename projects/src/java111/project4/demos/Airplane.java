/**
 * Airplane class represents an airplane in the Vehicle System
 * @author pwaite
 */
class Airplane extends Vehicle {
    private int numberOfEngines;

	/**
	* Returns value of numberOfEngines
	* @return number of engines on the plane
	*/
	public int getNumberOfEngines() {
		return numberOfEngines;
	}

	/**
	* Sets new value of numberOfEngines
	* @param numberOfEngines number of plane engines
	*/
	public void setNumberOfEngines(int numberOfEngines) {
		this.numberOfEngines = numberOfEngines;
	}

    /** Fly the plane
     */
    public void operate() {
        System.out.println("Flying the plan...");

    }
}
