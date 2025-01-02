public class ClassOne {
    private  volatile  boolean flage = false;
    public  void  changeFlag(){
        flage = true;
    }
    public void  checkFlage(){
        while (!flage){

        }
        System.out.println("Flag is true ");
    }

    public static void main(String[] args) {
        ClassOne obj = new ClassOne();
//        boolean out = ;
//        System.out.println(obj.changeFlag());
    }
}
