public class LocalInnerMain {
    private int data=30;//instance variable
    void display(){
        int value=50;
        class Local{ //Generally, this block is a method body. Sometimes this block can be a for loop, or an if clause
            void msg(){System.out.println(value);}
        }
        Local l=new Local();
        l.msg();
    }
    public static void main(String args[]){
        LocalInnerMain obj=new LocalInnerMain();
        obj.display();
    }

}
