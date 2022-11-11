import java.util.ArrayList; // import the ArrayList class

public class Forest {
    
    private ArrayList<Tree> trees;

    public Forest()
    {
    trees = new ArrayList<Tree>();
    }

    public void addTree(int growthPct)
    {
        Tree y = new Tree(growthPct);
        trees.add(y);
    }

    //Creating an empty string that we can one by one insert the contents of the array into it
    public String toString()
    {
        String t = "";
        for (int i = 0; i < trees.size(); i++)
        {
            t += trees.get(i).toString();
        }
        return "Forest(" + t + ")";
    }

    //use fori --> Useful for arrays --> predefined parameters provided by VsCode
    public void growOneYear()
    {
        for (int i = 0; i < trees.size(); i++) 
        {
            trees.get(i).growOneYear();
        }
    }
}