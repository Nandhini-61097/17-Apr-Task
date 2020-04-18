interface I1{
    void run();
}
interface I2{
    void run();
}

public class A implements I1,I2 {
    public void run(){
        System.out.println("run method");
    }
    public static void main(String args[]) {
        I1 a = new A();
        a.run();
        I2 b = new A();
        b.run();
    }
}