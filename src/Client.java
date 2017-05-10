
public class Client {
    public static void main(String[]args){
        Computer comps=new Computer();
        Visitor visitor=new ConcreteVisitor();
        comps.accept(visitor);
    }
}
