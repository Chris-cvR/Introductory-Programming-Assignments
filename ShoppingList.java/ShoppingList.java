import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.HashMap;

public class ShoppingList {

    private HashMap<String,Integer> AvailableIngredients;
    private HashMap<String, Integer> RecipeIngredients;
    private TreeMap<String, Integer> ShoppingList;

    public void Shopping(){

        AvailableIngredients = new HashMap<>();
        RecipeIngredients = new HashMap<>();
        Scanner scan = new Scanner(System.in);        

        while(scan.hasNextLine()){
            String input = scan.nextLine();
                while (input.contains("AVAILABLE")){
                    String convert = scan.nextLine();
                    String[] convert2 = convert.split(" ");
                    if (convert.contains("RECIPE")) break;

                        if (convert2[1].equals("g")){
                            AvailableIngredients.put(convert2[2], Integer.parseInt(convert2[0]));
                        }
                        else {
                            AvailableIngredients.put(convert2[2], Integer.parseInt(convert2[0]) * 1000);
                    }
                }                 
                if (input.contains("AVAILABLE")|| input.contains("RECIPE")) continue;
                    String[] input2 = input.split(" ");
                    if (input2[1].equals("g")){
                        if (RecipeIngredients.containsKey(input2[2])){
                            int ingredient = RecipeIngredients.get(input2[2]);
                            RecipeIngredients.put(input2[2], Integer.parseInt(input2[0]) + ingredient);
                        }
                        else{
                            RecipeIngredients.put(input2[2], Integer.parseInt(input2[0]));
                        }
                    }
                    else {
                        if (RecipeIngredients.containsKey(input2[2])){
                            int ingredient = RecipeIngredients.get(input2[2]);
                            RecipeIngredients.put(input2[2], (Integer.parseInt(input2[0]) * 1000) + ingredient);
                        }
                        else{
                            RecipeIngredients.put(input2[2], (Integer.parseInt(input2[0]) * 1000));
                        }
                
                    }
        }
        scan.close();
    }

    public void ShoppingList(){
        ShoppingList = new TreeMap<>();
        for (String IngredientsList : RecipeIngredients.keySet()){
            if (AvailableIngredients.containsKey(IngredientsList)){
                //subtract the available ingredients value from the existing value in recipe ingredients 
                int value = RecipeIngredients.get(IngredientsList) - AvailableIngredients.get(IngredientsList);
                if (value > 0){
                    ShoppingList.put(IngredientsList, value);
                    //it should not add, but in my example it adds 100 g oil to the shopping list when I have enough....
                }
                //else - do nothing - because I have enough in available already - it should not add minus values to it
            }
            else {
                ShoppingList.put(IngredientsList, RecipeIngredients.get(IngredientsList));
                //Else if there is no match, I want it to add the RecipeIngredient to the treeMap (ShoppingList) with the value of 
                //the Recipe Ingredient it has checked
            }
            
        }
    }

    public void printShoppingList(){
        Set<String> set = ShoppingList.keySet();
        System.out.println("Shopping List:");
        for (String key : set){
            int value = ShoppingList.get(key);
            System.out.println(value + " g " + key);
        }

    }
    public static void main(String[] args) {
        
        ShoppingList SP = new ShoppingList();
        SP.Shopping();
        SP.ShoppingList();
        SP.printShoppingList();
    }
    
}         
        //Also need to make sure there can be an empty shopping list at some point, if you have everything you need it should just print
        //Shopping List: (That is empty)

        //Maybe make a method that checks both hashmaps and if it has the ingredient adds it to the tree map
        //If there is nothing to add the treemap should just print the title "Shopping List"

        //Needs to print out a line that says Shopping List:
        //And then list out the tree map, adding a "g" in between each line it prints out on








        //Once out of the loop need to create a method called printShoppingList() that should print a list of ingredients to buy
        //The list needs to compare the availabel ingredients against the Recipe ingredients, and if there is a match, store it in the TreeMap
        //The TreeMap will sort the ingredients via alphabetical order and then it should be printed with the line
        /*
         * Shopping List:
         * ...
         * ...
         * ...
         */

//one final output including all things needed...
//Not one for each ingredient


/*
 * Look at the picture on phone
 * Dont need to do a duplicate check for the Available while loop
 * Need to do a check on the second while loop for recipe that checks if the value already exists in the Treemap after the 
 * first loop of adding into the TreeMap.....If it exists it should recognize the same value and then 
 */
