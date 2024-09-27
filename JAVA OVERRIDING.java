class animal{
    void display(){
        System.out.println("animals is a food ");
    }
}
class dog extends animal{
    void display(){
    System.out.println("here you can dog class...");
}}
class cat extends animal{
    void display(){
        System.out.println("here you can cat class...");
    }
}
public class Main{
    public static void main(String[] args){
        dog  a1 = new dog();
        cat b1 = new cat();
        a1.display();
        b1.display();
    }
}
