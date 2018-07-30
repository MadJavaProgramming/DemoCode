package java111.project5.demos;
/** Represents a vehicle. This will be used
 *  for demo throughout the semester.
 *
 *  @author pwaite
 */

 public abstract class Vehicle implements Maintainable {
     // instance variables/attributes
     private String make;
     protected String model;
     private int year;
     private String color;
     static int numberOfVehicles;

     /** Creates a vehicle
      */
     public Vehicle() {
         numberOfVehicles++;
         System.out.println("Vehicle no arg/default constructor");
     }

     /** creates a Car with make, model, year,  color, and cylinders.
      * @param make car's make
      * @param model car's model
      * @param year car's year
      * @param color car's color
      */
     public Vehicle(String make, String model, int year, String color) {
         this();
         System.out.println("In the vehicle constructor setting all values.");
         this.make = make;
         this.model = model;
         this.year = year;
         this.color = color;
     }

     /** sets the vehicle's make
      * @param newMake vehicle's make
      */
      public void setMake(String newMake) {
          make = newMake;
      }

      /** sets the vehicle's model
       * @param newModel vehicle's model
       */
       public void setModel(String newModel) {
           model = newModel;
       }

       /** sets the vehicle's color
        * @param newColor vehicle's color
        */
        public void setColor(String newColor) {
            color = newColor;
        }

        /** sets the vehicle's year
         * @param newYear vehicle's year
         */
         public void setYear(int newYear) {
             year = newYear;
         }



     /**Return information about the vehicle and a message that
      *  tells the user the vehicle has started
      * @return a string representation of a Vehicle
      */
      public String toString() {
          return super.toString() + ". The " + color + " " + year + " " + make + " " + model +
            " is starting.";
      }

    /** Operate defines how the vehicle is "driven" or "controlled"
     */
    public abstract void operate();
	/**
	* Returns value of make
	* @return make of car
	*/
	public String getMake() {
		return make;
	}



	/**
	* Returns value of model
	* @return model of car
	*/
	public String getModel() {
		return model;
	}



	/**
	* Returns value of year
	* @return car's year
	*/
	public int getYear() {
		return year;
	}



	/**
	* Returns value of color
	* @return car's color
	*/
	public String getColor() {
		return color;
	}


}
