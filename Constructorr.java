class Human{
    String name;
    int age;
    double weight;
    Human(String name , int age , double weight){
        this.name=name;
        this.age=age;
        this.weight=weight;
    }
    void eat(){
        System.out.println(this.age+"is eating");
    }
}
public class Constructorr {
    public static void main(String[] args){
        Human human1=new Human("pravesh" , 18, 52.0);
        Human human2=new Human("praveshh", 19 , 53.0);
        human1.eat();
        human2.eat();
    }
}
