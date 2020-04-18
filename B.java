interface I1{
    void run();
}
interface I2{
    void run();
}
interface I3{
  void delete();   
}
interface I4{
    void addproduct();
}
interface I5 extends I4{
    void createuser();
}
public class B implements I2,I3,I5  {
   public void run(){
       System.out.println("run");
   }
   public void delete(){
       System.out.println("delete");
   }
   public void addproduct(){
       System.out.println("add");
   }
   public void createuser(){
       System.out.println("create");
   }
    public static void main(String args[]) {
        I2 b = new B();
        b.run();
        I3 a = new B();
        a.delete();
        I5 c = new B();
        c.addproduct();
        c.createuser();
    }
}