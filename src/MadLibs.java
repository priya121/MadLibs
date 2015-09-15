import java.util.Scanner;

public class MadLibs {

    public static void main(String args[]) {
        System.out.println("Do you " + verb() + " your " + adjective() + " " + noun() + " " + adverb() + "?");
    }

    public static String noun() {
        System.out.println("Enter a noun:");
        Scanner nounInput = new Scanner(System.in);
        String nounString = nounInput.nextLine();
        return nounString;
    }

    public static String verb() {
        System.out.println("Enter a verb:");
        Scanner verbInput = new Scanner((System.in));
        String verbString = verbInput.nextLine();
        return verbString;
    }

    public static String adverb() {
        System.out.println("Enter an adverb:");
        Scanner adverbInput = new Scanner(System.in);
        String adverbString = adverbInput.nextLine();
        return adverbString;
    }

    public static String adjective() {
        System.out.println("Enter an adjective:");
        Scanner adjectiveInput = new Scanner(System.in);
        String adjectiveString = adjectiveInput.nextLine();
        return adjectiveString;
    }
}
