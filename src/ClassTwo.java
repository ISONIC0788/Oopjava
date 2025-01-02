abstract class  Animal {
    public  abstract void sound();
}
class  Dog extends  Animal{
    public  void  sound (){
        System.out.println("Woof");

    }
}

public class ClassTwo {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.sound();
    }
}
