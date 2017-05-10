
import java.util.*;
public class Computer implements Element {
    private Vector data=new Vector();
   public Computer() {
       data.addElement(new Mouse());
       data.addElement(new Keyboard());
       data.addElement(new Monitor());
   }

    public void accept(Visitor visitor){
        for(int i=0;i<data.size();i++){
            Element ele=(Element) data.elementAt(i);
            ele.accept(visitor);
        }
     visitor.visit(this);
    }

}
