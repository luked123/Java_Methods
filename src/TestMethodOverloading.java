/* This simple program demonstrates the use of overloading
   methods. To overload a method the method must have the same name
   but different parameters. You can have the same or different return types when overloading methods
   as demonstrated here. You should overload methods which perform a similar functions
   such as max here. Only values changes or number of parameters but all return a maximum of sorts
   This makes the code easier to read.
 */


public class TestMethodOverloading {
    public static void main(String [] args){
        System.out.printf("The maximum of %d and %d is %d\n", 3, 4, max(3, 4));
        System.out.printf("The maximum of %.2f and %.2f is %.2f\n", 3.0, 5.4, max(3.0, 5.4));
        System.out.printf("The maximum of %.2f, %.2f, and %.2f is %.2f\n", 3.0, 5.4, 10.14, max(3.0,5.4, 10.14));
    }

    /* Returns the value of two ints */
    public static int max(int num1, int num2){
        return  num1 > num2 ? num1 : num2;
    }

    /* Returns the value of two doubles */
    public static double max(double num1, double num2){
        return  num1 > num2 ? num1 : num2;
    }

    /* Returns the max of three doubles */
    public static double max(double num1, double num2, double num3){
        return  max(max(num1, num2) , num3);
    }
}
