
public class Mouse implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
