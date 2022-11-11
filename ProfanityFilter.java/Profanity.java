import java.util.Scanner;
import java.util.HashMap;


public class Profanity {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String swear1 = scan.nextLine().toLowerCase();
        String[] swearwords = swear1.split(" ");  // split at spaces of swear words
        
        HashMap<String, String> swearwords1 = new HashMap<String, String>();

        String[] Profanityfilter = {"*", "&", "#", "$", "%"};

        for (String badword : swearwords) {
            String word2 = "";    
            for (int i = 0; i < badword.length(); i++) 
                {
                    int check = i%5;
                    String censoredsign = Profanityfilter[check];
                    word2 += censoredsign;
                    //Could use switch statement instead of long else if statement for looping through the other symbols
                }
            swearwords1.put(badword, word2);
            }

        String FullTweet = "";

        while(scan.hasNextLine()) { //Need to change to while for submission otherwise it will only scan 1 line after the first
            String Censorline = scan.nextLine();
            String[] censor = Censorline.split(" "); //String is divided by spaces

                for (String censoredWords : swearwords){
                    for (int i = 0; i < censor.length; i++) {
                        String one = censor[i].toLowerCase();
                        String two = censoredWords;
                        
                        char variable = ' ';
                        if(one.contains(".") || one.contains(",") || one.contains("!") || one.contains("?")){ //checking if it contains ".", ",", "!", "?"
                            variable = one.charAt(one.length() - 1);
                            String one2 = one.substring(0, one.length() - 1);
                            
                            if (one2.equals(two)){ //checking censor array if there is a word that matches from swearwords1
                                censor[i] = swearwords1.get(two) + variable;
                            }
                        
                        }
                        else if (one.equals(two)){
                            censor[i] = swearwords1.get(two);
                        }
                    }
                }
            String FullSentece = String.join(" ", censor);
            FullTweet += FullSentece + " \n";             
        }
        System.out.println(FullTweet);
        scan.close();
    }    
}

    //first line is the input we want to censor - Scanner
    //ArrayList of strings could be a good idea...Convert all letters into lowercase to ensure it is the same

    /*

    Would be a big if else statement for the different decimal, commma, and special signs etc.

     * We have an array that stores the swear words we want to censor "swearwords"
     * We want to create a loop that checks over the length of the swear word
     * we have a loop that goes through the whole sentence 
     * When it spots a word it needs to censor it enters a different loop and checks 
     * 
     * first check the swear words and replace each element in the array with the profanity characters
     * store these words in a new array (Censored words)
     * 
     * we create a loop that checks over the whole sentence and replaces the swear words with the censored words in the new array (Censored words)
     * 
     * reconstruct the sentence with the correct words censored 
     * 
     * for i loop could be used to reconstruct the string
     * use an empty variable to reconstruct the string 
     */


     //String filtered1 = swearwords1.get(one);
     //FullSentece += filtered1 + " ";


