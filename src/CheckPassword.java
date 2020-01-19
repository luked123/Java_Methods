import java.util.Scanner;

public class CheckPassword {
    /** Main method */
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Please make a password: ");
        String password = input.nextLine();
        checkPassword(password);
    }

    public static void checkPassword(String password){
        if(hasEightCharacters(password) &&
                digitsAndLetters(password) &&
                hasTwoDigits(password)){
            System.out.println("Valid Password");
        }
        else{
            System.out.println("Invalid Password");
        }
    }

    public static boolean hasEightCharacters(String password){
        return password.length() > 7;
    }

    public static boolean digitsAndLetters(String password){
        for(int i =0; i < password.length(); i++){
            if(!Character.isDigit(password.charAt(i)) &&
                    !Character.isLetter(password.charAt(i))){
                return false;
            }
        }
        return true;
    }

    public static boolean hasTwoDigits(String password){
        int count = 0;
        for(int i = 0; i < password.length(); i++){
            if(Character.isDigit(password.charAt(i))){
                count ++;
            }
        }
        return count >= 2;
    }

}
