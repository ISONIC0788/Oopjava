  abstract  class Animl {
    int age ;
    String name ;
    public  abstract  void makeNose ();
}
class Cat  extends  Animl{
   public void  makeNose(){
     System.out.println("hellow world bro ");
     System.out.println("I senior java  Developer ");
    }
}
interface  anamilaStifu{
       void loop () ;
}
//class  Coock  implements  anamilaStifu{
//
//     void  looop(){
//
//     }
//}


public class Encapusiration {
    public static void main(String[] args) {
     int a = -23 ;
     String result = (a >0)? "true " : "flase";
     System.out.println(result);
     Animl myObj = new Cat();
     myObj.makeNose();
    }
}
