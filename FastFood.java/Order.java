import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;

public class Order {
    
protected List<Food> ordered;

    public Order(){
        ordered = new ArrayList<Food>();
    }

    public void addFood(Food food){
        ordered.add(food);
    }

    public int total(){
        int value = 0;
        for (Food food : ordered){
            value = value + food.getPrice();
        }
        return value;
    }

    public void display(){
        for (Food food: ordered){
            food.display();
        }
        System.out.println(this.total() + " kr TOTAL");
    }

    public boolean payWith(CreditCard card){
        boolean check = card.withdraw(total());
            if (check == true){
                return check;
            }
            else if (check == false){
                System.out.println("ERROR: Payment failed");
                return check;
            }
            else{
                return check;
            }
    }
}
