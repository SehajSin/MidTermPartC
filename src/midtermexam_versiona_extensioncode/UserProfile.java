import java.util.Scanner;

public class TestUserProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display list of possible genres
        System.out.println("Choose your favorite genre:");
        System.out.println("1. Action");
        System.out.println("2. Comedy");
        System.out.println("3. Drama");
        System.out.println("4. Sci-Fi");
        System.out.println("5. Romance");

        // Read user's name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Read user's favorite genre choice
        System.out.print("Enter your favorite genre number: ");
        int genreChoice = scanner.nextInt();

        // Create user profile
        UserProfile userProfile = new UserProfile(name, genreChoice);

        // Display profile creation message
        System.out.println("User profile created!");
        System.out.println("Name: " + userProfile.getName());
        System.out.println("Favorite Genre: " + userProfile.getFavoriteGenre());
    }
}

class UserProfile {
    private String name;
    private String favoriteGenre;

    public UserProfile(String name, int genreChoice) {
        this.name = name;
        this.favoriteGenre = getGenreFromChoice(genreChoice);
    }

    private String getGenreFromChoice(int choice) {
        switch (choice) {
            case 1:
                return "Action";
            case 2:
                return "Comedy";
            case 3:
                return "Drama";
            case 4:
                return "Sci-Fi";
            case 5:
                return "Romance";
            default:
                return "Unknown";
        }
    }

    public String getName() {
        return name;
    }

    public String getFavoriteGenre() {
        return favoriteGenre;
    }
}
