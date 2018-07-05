/** Represents a dog in our kennel application
 * @author pwaite
 */
 public class Dog {

     private int weight;

     /** set the dog's weight
      * @param newWeight dog's weight in pounds
      */
      public void setWeight(int newWeight) {
          weight = newWeight;

      }
      /** determine the food needed for single day for the dog based on weight
       *  @return amount of food needed
       */
       public int calculateFoodNeeded() {
           if (weight < 50) {
               return 1;
           } else {
               return 2;
           }

       }
 }
