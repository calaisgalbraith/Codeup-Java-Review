package movies;

//
//Give the user a list of options for viewing all the movies or viewing movies by category.
//Use your Input class to get input from the user, and display information based on their choice.
//If a category is selected, only movies from that category should be displayed.
//Your application should continue to run until the user chooses to exit.
//Bonus: Add functionality to allow a user to add a new movie to the list.

import util.Input;

public class MoviesApplication {

    private static final Input input = new Input();

    //method to display menu
    public static void displayMenu(){
        System.out.println("What would you like to do? \n \n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view all movies in the drama category\n" +
                "4 - view all movies in the horror category\n" +
                "5 - view all movies in the scifi category\n" +
                "6 - view all movies in the musical category\n" +
                "7 - view all movies in the comedy category\n");

        //call method to get selected movie genre
        displayMovieGenre(input.getInt("Enter your choice: ", 0, 7));
    }

    //method to display selected movie genre
    public static void displayMovieGenre(int choice){
        String genre = "";

        //assign string value for selected genre
        switch (choice){
            case 1: genre = "all";
                    break;
            case 2: genre = "animated";
                    break;
            case 3: genre = "drama" ;
                    break;
            case 4: genre = "horror";
                    break;
            case 5: genre = "scifi";
                    break;
            case 6: genre = "musical";
                    break;
            case 7: genre = "comedy";
                    break;
            default: genre = "exit";
                    break;
        }

        //logic to display movies (if exit not chosen)
        if(genre.equals("exit")){
            System.out.println("Exiting method...");
            return;
        }
        else if(genre.equals("all")){ //display all movies
            for (Movie movie : MoviesArray.findAll()) {
                System.out.println(movie.getName() + " -- " + movie.getCategory());
            }
        }
        else { //display movies for selected genre
            for (Movie movie: MoviesArray.findAll()) {

                if(movie.getCategory().equals(genre)){ //if genre of movie matches selected genre --> display it
                    System.out.println(movie.getName() + " -- " + movie.getCategory());
                }
            }
        }

        //call method to see if user wants to continue
        promptContinue();

    }

    //method to see if user wants to continue
    public static void promptContinue(){

        int answer = input.getInt("\nWhat do you want to do?\n\n" +
                "0 - exit\n" +
                "1 - return to main menu", 0, 1);

        if(answer == 1){
            displayMenu();
        }
        else {
            System.out.println("Ending method...");
        }

    }

    public static void main(String[] args) {
        displayMenu();
        System.out.println("Goodbye");
    }
}
