public class Main{
    
    public static void main(String[] args) {
    
        //Testing using the codeJudge test help
    Tree t4 = new Tree(100);
    System.out.println("A tree growing to full height:");
    for (int i = 0 ; i < 10 ; i++) {
    t4.growOneYear();
    System.out.println(t4);
    }

}
}