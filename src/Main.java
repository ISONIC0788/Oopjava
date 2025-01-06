import java.util.Scanner;
abstract class myFiture{
     abstract void characetrstic();
}
class People extends  myFiture{
    void characetrstic(){
        String myColor = "Black";
        String mySex = "male";
        String mylocation = "kgl";
        System.out.println("hellow my name is ituze agacyo ebedi meleck"+myColor + mySex);
    }

}

public class Main {
    static  void  skip(  ){
        Scanner scan = new Scanner("123 abc ");
        scan.skip("\\d+");
        String out = scan.next();
        System.out.println(out);
        scan.close();

    }
    static void Sskip (){
        Scanner scan = new Scanner(" Ituze ebedi");
        scan.skip("\\s*");
        String out = scan.next();
        System.out.println(out);
        scan.close();
    }
    static void  Scan3(){
        Scanner sc = new Scanner("    Hellow    world ");
        sc.skip("\\s*");
        System.out.println(sc.next());
        sc.close();
    }
    static void  Spacein(){
        Scanner sc = new Scanner(System.in);

        for (int i = 0  ; i <=3 ; i++){
          String name =  sc.next();
          int num = sc.nextInt();
          System.out.printf("%-15s%05d%n" , name , num);
        }
        sc.close();

    }
    static  void  CalcutePow(){
        Scanner  scan = new Scanner(System.in);
          System.out.println("Enter the number of Query");
          int numberQuery = scan.nextInt();
        for (int i = 0; i < numberQuery ; i++) {
            int frisnum = scan.nextInt();
            int  multpnum = scan.nextInt();
            int  numberMult = scan.nextInt();
            int[] store = new  int[3];
            store[0] = frisnum;
            store[1] = multpnum ;
            store[2] = numberMult;
            System.out.println(store.getClass().getSimpleName());
            // start sum number
            int  sum = frisnum;
           for (int n = 0  ; n < numberMult ; n++){
//                sum+=(1<<n)*multpnum;
                sum = sum + (1<<n)*multpnum;
//                double mathpow = Math.pow(2 , n);
//                sum = sum + mathpow * multpnum;
                System.out.print( sum + " " );//S

           }
//            sum+= (1<< 2 ) * multpnum; // logic in simple sum = 2  = 2^2  * 3 = 14

            System.out.println();

        }
        scan.close();
    }
    public  int  scrope( int x ){
        {
            // the code
            return x ;
        }

    }

    public static void main(String[] args) {
//        skip();
//        Sskip();
//        Scan3();
//        Spacein();
        CalcutePow();
        Main scopeVar = new Main();
        scopeVar.scrope(12);
        System.out.println(scopeVar.scrope(12));

    }
}