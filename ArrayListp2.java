import java.util.ArrayList;
public class ArrayListp2 {
    public static void main(String[] args){
        ArrayList<ArrayList<String>> List= new ArrayList();
        ArrayList<String> bakerylist = new ArrayList();
        bakerylist.add("pasta");
        bakerylist.add("garlic bread");
        bakerylist.add("donuts");
        ArrayList<String> grocerylist=new ArrayList();
        grocerylist.add("bananas");
        grocerylist.add("tomatoes");
        grocerylist.add("cucumber");
        List.add(bakerylist);
        List.add(grocerylist);
        System.out.println(List);

    }
    
}
