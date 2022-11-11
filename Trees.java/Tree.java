public class Tree{

    private int age;
    private double height;
    private double growthPct;

    public Tree(double growthPct)
    {
        this.height = 0.25;
        this.age = 1;
        this.growthPct = growthPct;
    }

    public String toString()
    {
        return "Tree(age = " + this.age + ", height = " + this.height + ")";

    }

    //Growing the tree in a year
    public void growOneYear()
    {
        if (this.height * (1 + this.growthPct / 100) <= 20)
        {
            this.age++;
            this.height = this.height * (1 + this.growthPct / 100);
        }
        else
        {
            this.age++;
            this.height = 20;
        }
    }
}