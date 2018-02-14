//Hello from mac!
package school_Project;
import java.util.*;
/**
 * This was written for class.
 * @author ashtoncrossdude
 */
public class new_test { // Remember to always make the main class public.
    //ARGS
    public static void main(String[] arguments) {
        // TODO learn stuff & things. (remember to write page number in text book)
        /* Because we imported the java.util.* classes, we dont need to say...
            java.util.Random
        We just say
        Random
        */
        
        Random generator = new Random();
        int Random_Value = generator.nextInt();
        System.out.println(Random_Value);
        //or we could probably just do...
        System.out.println(generator.nextInt());
        
        //java.util.Random genorator = new java.util.Random();
        // Check donwload.java.net/jdk8/docs/api for all the classes.
        // Read up on page 49 - 51 on how the arguments work in the configuration file.
        
    } 
}
