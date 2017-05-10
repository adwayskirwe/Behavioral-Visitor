
public class Monitor implements Element {
    public void accept(Visitor visitor){
        visitor.visit(this);
    }
}
