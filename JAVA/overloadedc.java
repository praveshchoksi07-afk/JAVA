class Pizza{
    String bread;
    String sauce;
    String cheese;
    String toppings;
    Pizza(String bread,String sauce,String cheese,String toppings){
        this.bread=bread;
        this.sauce=sauce;
        this.cheese=cheese;
        this.toppings=toppings;
    }
    Pizza(String bread , String sauce , String cheese){
        this.bread=bread;
        this.sauce=sauce;
        this.cheese=cheese;
    }
    Pizza(String bread , String sauce){
        this.bread=bread;
        this.sauce=sauce;
    }
    Pizza(String bread){
        this.bread=bread;
    }
}
public class overloadedc {
    public static void main(String [] args){
        Pizza pizza=new Pizza(  "tomato" , "Mozarella" , "chilli");
        System.out.println("Here are your ingredients");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.toppings);
    }
}
