public class Test1 {
    public static void main(String[] args) {
        Theinterface1 ti1= () -> {};
        System.out.println(ti1);
        Theinterface2 ti2 =() ->{
            System.out.println("asdas");
        };
        System.out.println(ti2);
    }
}
interface  Theinterface1{
    void mymethod1();
}
interface  Theinterface2{
    void mymethod2();
}