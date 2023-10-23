import java.util.Random;
import java.util.Scanner;

public class RandomPasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the desired password length: ");
        int passwordLength = scanner.nextInt();

        System.out.print("Include Uppercase letters? (Y/N): ");
        boolean useUppercase = scanner.next().equalsIgnoreCase("Y");

        System.out.print("Include Lowercase letters? (Y/N): ");
        boolean useLowercase = scanner.next().equalsIgnoreCase("Y");

        System.out.print("Include Digits? (Y/N): ");
        boolean useDigits = scanner.next().equalsIgnoreCase("Y");

        System.out.print("Include Special characters? (Y/N): ");
        boolean useSpecialChars = scanner.next().equalsIgnoreCase("Y");

        String uppercaseChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercaseChars = "abcdefghijklmnopqrstuvwxyz";
        String digitChars = "0123456789";
        String specialChars = "!@#$%^&*()-_+=<>?";

        StringBuilder allChars = new StringBuilder();
        if (useUppercase) allChars.append(uppercaseChars);
        if (useLowercase) allChars.append(lowercaseChars);
        if (useDigits) allChars.append(digitChars);
        if (useSpecialChars) allChars.append(specialChars);

        if (allChars.length() == 0) {
            System.out.println("Please enable at least one character type.");
            return;
        }

        Random random = new Random();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < passwordLength; i++) {
            int randomIndex = random.nextInt(allChars.length());
            char randomChar = allChars.charAt(randomIndex);
            password.append(randomChar);
        }

        System.out.println("Generated Password: " + password.toString());
    }
}
