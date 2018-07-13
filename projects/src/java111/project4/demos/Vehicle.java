/** Represents a vehicle. This will be used
 *  for demo throughout the semester.
 *
 *  @author pwaite
 */

 public class Vehicle {
     // instance variables/attributes
     private String make;
     protected String model;
     private int year;
     private String color;

     /** sets the vehicle's make
      * @param make vehicle's make
      */
      public void setMake(String newMake) {
          make = newMake;
      }

      /** sets the vehicle's model
       * @param model vehicle's model
       */
       public void setModel(String newModel) {
           model = newModel;
       }

       /** sets the vehicle's color
        * @param color vehicle's color
        */
        public void setColor(String newColor) {
            color = newColor;
        }

        /** sets the vehicle's year
         * @param year vehicle's year
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
