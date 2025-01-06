class  Vehical {
    // overriden method
    void  applyPaint(){
        System.out.println("Appliying white color paint "+"\n"+" to the car ....");
    }
}
class  Car extends  Vehical{
    // overriding method
    void  applyPaint(){
        System.out.println("Appliying white color paint "+"\n"+"to the car .....");
    }
}

public class Overring {
    public static void main(String[] args) {
        Vehical objBas = new Vehical();
        objBas.applyPaint();

    }

}
