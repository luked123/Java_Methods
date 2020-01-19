public class TestMax {
    public static void main(String [] args){
        int i = 2;
        int j = 5;
        int k = max(i, j);
        System.out.printf("The maximum of %d and %d is %d\n", i, j, k);
    }

    public static int max(int num1, int num2){
        return num1 > num2 ? num1 : num2;
    }
}
