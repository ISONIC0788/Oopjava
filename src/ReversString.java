


public class ReversString {
    static  void  revestr(){
        String str = "ebedi";
        String[] sta = str.split("");
        int strlen = sta.length;
        System.out.println(strlen);
        System.out.println(sta[1]);
//        for (int i = 0; i < strlen ; i++) {
//            System.out.print(sta[i]);
//        }
        for (int i = (--strlen); i >=0 ; i--) {
            System.out.print(sta[i]);
        }
    }
    static  void  revresecond(){
        String str = "ABCD";
        String rev = null;
        int strleng  = str.length();
        for (int i= (--strleng); i  >= 0 ; i--){
            rev = rev + str.charAt(i);

        }
        System.out.println(rev);
    }
    public static void main(String[] args) {
      revestr();
      revresecond();
    }
}
