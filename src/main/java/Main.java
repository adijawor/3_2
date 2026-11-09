import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wprowadź dowolny tekst: ");
        String tekst = scanner.nextLine();

        StringBuilder zmienionytekst = new StringBuilder();
        
        for (int i = 0; i < tekst.length(); i++) {
            char znak = tekst.charAt(i);

            if (Character.isUpperCase(znak)){
                zmienionytekst.append(Character.toLowerCase(znak));
            } else if (Character.isLowerCase(znak)){
                zmienionytekst.append(Character.toUpperCase(znak));
            } else {
                zmienionytekst.append(znak);
            }
        }
        System.out.println("Tekst po zmianie wielkości liter:");
        System.out.println(zmienionytekst.toString());
        
        scanner.close();
    }
}