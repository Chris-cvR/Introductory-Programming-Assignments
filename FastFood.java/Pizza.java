import java.util.ArrayList;
import java.util.List;

public class Pizza extends Food{

    protected List<String> toppings;

    public Pizza(){
        super("Pizza", 45);
        toppings = new ArrayList<>();

    }

    public void addTopping(String topping){
        toppings.add(topping);
        price += 10;
    }

    @Override public void display(){
        String split = "";  
        String collectedToppings = "";
            for (String collected : toppings) {
                collectedToppings = collectedToppings + split;
                collectedToppings = collectedToppings + collected;
                split = ", "; //for the loop split becomes the comma it needs - adds it at the end
            }
        System.out.println(this.price + " kr " + this.name + " { " + collectedToppings + " } ");
    }

    public void setName(String name){
        this.name = name;
    }

}