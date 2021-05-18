import java.util.Scanner;

public class PasswordComplexity {

    public static boolean isPasswordComplexWithLoop(String password) {

        if(password.length() < 6) {
            return false;
        }
        boolean hasNumber = false;
        boolean hasLowercaseLetter = false;
        boolean hasUppercaseLetter = false;
        for(int i =0; i < password.length() ||
                (!hasLowercaseLetter && !hasUppercaseLetter
                && !hasNumber); i++) {
            char current = password.charAt(i);
            if(Character.isDigit(current)){
                hasNumber = true;
            } else if(Character.isUpperCase(current)) {
                hasUppercaseLetter = true;
            } else if(Character.isLowerCase(current)) {
                hasLowercaseLetter = true;
            }
        }
        return hasNumber
                && hasLowercaseLetter
                && hasUppercaseLetter;
    }

    public static boolean isPasswordComplexWithRegex(String password) {
        return password.length() >= 6
                && password.matches(".*\\d.*")
                && password.matches(".*[a-z].*")
                && password.matches(".*[A-Z].*");
    }

    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

       System.out.println("Enter a password: ");
       String userInput = scanner.nextLine();
       System.out.println("Is the password complex? " +
               isPasswordComplexWithLoop(userInput));
    }
}
