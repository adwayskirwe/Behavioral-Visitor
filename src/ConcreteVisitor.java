
public class ConcreteVisitor implements Visitor {
    @Override
    public void visit(Monitor m) {
        System.out.println("I am new way to add additonal functionality to monitor");
    }

    @Override
    public void visit(Keyboard k) {
        System.out.println("I am new way to add additonal functionality to keyboard");
    }

    @Override
    public void visit(Mouse m) {
        System.out.println("I am new way to add additonal functionality to mouse");
    }

    @Override
    public void visit(Computer comps) {
        System.out.println("I am new way to add additonal functionality to computer");
    }
}
