/** Units test the calculations in the Dog class.
 * @author pwaite
 */

public class DogTest {
    /** verify calculateFoodNeeded() works correctly
     * for a small <50, medium =50,  and large >50 dog.
     *  @param args command line arguments
     */
    public static void main(String[] args) {
        // 1. Create the object that I want to test
        Dog smallDog = new Dog();

        // 2. Set relevant data on the Dog - in this case weight
        smallDog.setWeight(49);

        // 3. Create a variable for the expected results
        int expectedFoodNeeded = 1;

        // 4. Call the method to be tested and capture the result
        int actualFoodNeeded = smallDog.calculateFoodNeeded();

        //5. compare actual to expected and output a message.
        if (expectedFoodNeeded == actualFoodNeeded) {
            System.out.println("Small Dog food calculation SUCCESS");
        } else {
            System.out.println("Small Dog food calculation FAILED");
        }

    }

}
