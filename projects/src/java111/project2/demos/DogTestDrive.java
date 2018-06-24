/**
 *  The Dog Test Drive class. Finally, we get to make some objects!
 *
 *@author    eknapp
 */
public class DogTestDrive {

    /**
     *  The main program for the DogTestDrive class. Why do we need a main
     *  method?
     *
     *@param  args  The command line arguments
     */
    public static void main(String[] args) {

        // create primitive for comparison
        int size = 50;

        //Create our first object on the next line
        Dog firstDog  = new Dog();

        //Set its size
        firstDog.size = 40;

        //Set its breed
        firstDog.breed = "poodle";

        //Make it bark
        firstDog.bark();



    }

}
