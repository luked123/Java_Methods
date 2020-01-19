public class MethodPractice {

    public static int sum(int i1, int i2){
        int result = 0;
        for(int i = i1; i <= i2; i++){
            result += i;
        }

        return result;
    }

    public static void main(String [] args){
        System.out.printf("Sum from 1 to 10 is %d\n", sum(1,10));
        System.out.printf("Sum from 20 to 37 is %d\n", sum(20,37));
        System.out.printf("Sum from 35 to 49 is %d\n", sum(35,49));
    }
}
