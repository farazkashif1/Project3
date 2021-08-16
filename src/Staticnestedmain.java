public class Staticnestedmain {
    static int data=30;
    static class Inner{
        void msg(){System.out.println("data is "+data);}
    }
    public static void main(String args[]){
        Staticnestedmain.Inner obj=new Staticnestedmain.Inner();
        obj.msg();
    }
}