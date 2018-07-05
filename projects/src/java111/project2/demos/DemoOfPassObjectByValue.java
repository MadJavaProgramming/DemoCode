/**
 *  This class demonstrates passing objects as values
 *
 *@author    eknapp
 */
public class DemoOfPassObjectByValue {

    Dog  dogOne  = new Dog();

    /**
     *  This method demos pass by value for objects.
     *
     *@param  dogTwo A new Dog object
     */
    void go(Dog dogTwo) {

        System.out.println("value of dogOne: " + dogOne.getSize());
        System.out.println("value of dogTwo: " + dogTwo.getSize());

        dogTwo.setSize(10);

        System.out.println("value of dogOne: " + dogOne.getSize());
        System.out.println("value of dogTwo: " + dogTwo.getSize());

    }

    /**
     *  Main processing method for the DemoOfPassObjectByValue object.
     */
    void run() {
        dogOne.setSize(20);
        go(dogOne);
    }
}
