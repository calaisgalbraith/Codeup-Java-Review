import java.util.Random;

public class ServerNameGenerator {
    //server name generator
    //Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.
    //Create a method that will return a random element from an array of strings.
    //Add a main method, and inside of your main method select a random noun and adjective and hyphenate the combination and display the generated name to the user.

    public static String[] nouns = {"dog", "cat", "bird", "hamster", "fish", "lizard", "frog", "gerbil", "pig", "horse"};
    public static  String[] adjectives = {"cute", "furry", "soft", "loud", "hairy", "quiet", "cuddly", "sweet", "active", "lazy"};

    public static String randomElement(String[] elements){
        int random = new Random().nextInt(elements.length);
        return elements[random];
    }

    public static void main(String[] args) {
        System.out.println(randomElement(adjectives) + "-" + randomElement(nouns));
    }
}
