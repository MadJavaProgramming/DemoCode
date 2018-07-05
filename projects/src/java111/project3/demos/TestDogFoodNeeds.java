/**
 *  This class
 *
 * @author    eknapp
 */
public class TestDogFoodNeeds {

    /**
     *  The main program for the TestDogFoodNeeds class
     *
     * @param  args  The command line arguments
     */
    public static void main(String[] args) {

        //
        //Setup the dog with known data.
        //
        Dog  dog         = new Dog();
        dog.setWeight(45);

        //
        // Run the calculation
        //
        int  foodWeight  = dog.calculateFoodNeeded();

        //
        // With a weight of 45 pounds a dog will 
        // need 1 pound of food per day
        //
        if (foodWeight == 1) {
            System.out.println("Weight test for less " 
                    + "than 50 pounds - success");
        } else {
            System.out.println("Weight test for less " 
                    + "than 50 pounds - failure");
        }
        
        //
        // Do another test for over 50
        //
        dog.setWeight(75);

        //
        // Run the calculation
        //
        foodWeight  = dog.calculateFoodNeeded();

        //
        // With a weight of 75 pounds a dog will 
        // need 1 pound of food per day
        //
        if (foodWeight == 2) {
            System.out.println("Weight test for more " 
                    + "than 50 pounds - success");
        } else {
            System.out.println("Weight test for more " 
                    + "than 50 pounds - failure");
        }
    }
}
