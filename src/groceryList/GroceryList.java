package groceryList;

//Create a grocery list command line application.
    //A user should be prompted if they would like to create a grocery list.
    //If they pick yes, they will be prompted if they would like to enter a new item.
    //If the users picks yes, they should be given the following three prompts:
        //Given an ordered list of grocery categories to choose from, select the category.
        //Enter the name of the item.
        //Enter how many of the item.
    //The user will then be given the choice to finalize the list or add an item.
    //Once the user finalizes the list, they will be presented with a complete list organized alphabetically
        //and grouped by a category, and including quantity.
    //As a bonus, allow users to filter the results by only one category of items at a time.
    //For a super gold star bonus, allow users to edit the list items.

import util.Input;

import java.util.ArrayList;
import java.util.List;

public class GroceryList {

    private static Input input = new Input();

    //method to initially create list
    public static void createList(){
        List<Item> groceryList = new ArrayList<>();

        //confirm user wants to create a grocery list & add items to it
        if(getResponse("Would you like to create a grocery list?") && getResponse("Would you like to add a new item?")){
           groceryList.add(createItem()); //add new item
        }
        else {
            System.out.println("Ending Method, goodbye!");
            return;
        }

        //ask if want to add new item & add new items  until user says no
        while(input.yesNo("Would you like to add another item?")){
            groceryList.add(createItem()); //add new item
        }

        //print out finalized list (in categories
        System.out.println("\nGrocery List: ");
        System.out.println("Produce:");
        printList(groceryList, "Produce");

        System.out.println("Dairy:");
        printList(groceryList, "Dairy");

        System.out.println("Meat/Seafood/Meat Alternatives:");
        printList(groceryList, "Meat/Seafood/Meat Alternatives");

        System.out.println("Frozen Goods:");
        printList(groceryList, "Frozen Goods");

        System.out.println("Pantry Items:");
        printList(groceryList, "Pantry Items");

        System.out.println("Bakery:");
        printList(groceryList, "Bakery");

        System.out.println("Household Items:");
        printList(groceryList, "Household Items");

        System.out.println("Other:");
        printList(groceryList, "Other");
    }

    //method to create item
    public static Item createItem(){

        //get category, name, and quantity
        int userCategory = input.getInt("Select Category: \n" +
                "1 - Produce\n" +
                "2 - Dairy\n" +
                "3 - Meat/Seafood/Meat Alternatives\n" +
                "4 - Frozen Goods\n" +
                "5 - Pantry Items\n" +
                "6 - Bakery\n" +
                "7 - Household Items\n" +
                "8 - Other", 1, 8);
        String fixNextIntIssue1 = input.getString(); //placeholder string to fix issue with using nextInt

        //convert user selection into string category
        String category = "";
        switch (userCategory){
            case 1: category = "Produce";
                break;
            case 2: category = "Dairy";
                break;
            case 3: category = "Meat/Seafood/Meat Alternatives";
                break;
            case 4: category = "Frozen Goods";
                break;
            case 5: category = "Pantry Items";
                break;
            case 6: category = "Bakery";
                break;
            case 7: category = "Household Items";
                break;
            default: category = "Other";
        }

        String name = input.getString("Enter item name: ");
        int quantity = input.getInt("Enter quantity: ");

        String fixNextIntIssue2 = input.getString(); //placeholder string to fix issue with using nextInt

        //create & return new item with user input
        return new Item(category, name, quantity);
    }

    //method to print list
    public static void printList(List<Item> items, String category){
        //print out all items with given category
        for (Item item : items){
            if (item.getCategory().equals(category)){
                System.out.println("     " + item.getName() + " (" + item.getQuantity() + ")");
            }
        }

    }

    //method to get y/no input
    public static boolean getResponse(String prompt){
        return input.yesNo(prompt);
    }

    public static void main(String[] args) {
        createList();
    }

}
