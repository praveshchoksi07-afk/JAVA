import java.util.ArrayList;
public class Demo {
    public static void main(String[] args){
        ArrayList<String> food = new ArrayList<String>();
        food.add("pizza");
        food.add("Kaju curry");
        food.add("fried rice");
        for(int i =0 ; i<food.size();i++)
        {
            System.out.println(food.get(i));
        }
    }
}
