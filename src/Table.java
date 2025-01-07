import java.util.Scanner;

public class Table {
    static void  table(){
        String name = "Ebed";
        String Class = "Apeki";
        String Lever = "Level6";
        String Position = "Up";
        int Tellnumber  = 788;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number of Low you Wants?..");
        int num = obj.nextInt();
        while (num >=0 ){
            System.out.printf("%-10s%-10s%-10s%-10s%09d%n",name,Class,Lever,Position,Tellnumber);
            num --;
        }


    }
    public static void main(String[] args) {
        table();
    }
}
