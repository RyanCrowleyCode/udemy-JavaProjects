package emailapp;

public class EmailApp {

    public static void main(String[] args) {
        Email email1 = new Email("Ryan", "Crowley", "development", "teletracking");
        Email email2 = new Email("Chris", "McGuire", "transportation", "geodis");

        System.out.println(email1);
        System.out.println(email2);
    }
}
