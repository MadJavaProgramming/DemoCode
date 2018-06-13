/**
 *  This is a very simple example of looping in Java
 *
 *@author    eknapp
 */
public class Loopy {

    /**
     *  The main method for the Loopy class
     *  it demonstrates our first while loop in java using a counter
     *
     *@param  args  The command line arguments
     */
    public static void main(String[] args) {

        int  counter  = 1;

        System.out.println("Before the Loop");

        while (true) {
            System.out.println("In the loop");
            System.out.println("Value of counter is " + counter);

            if (counter == 1) {
                break;
            }

            counter = counter + 1;
        }

        System.out.println("This is after the loop");

    }

}
