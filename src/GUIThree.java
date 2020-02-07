
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class GUIThree {
     public static void main(String[] args) {
        //create container
            Frame f=new Frame();
            f.setSize(400,400); f.setLocation(100,100);
            f.setVisible(true);
        //create components
            Label l1=new Label("Name");
            Label l2=new Label("Age");
            TextField t1=new TextField(10);
            TextField t2=new TextField(10);
            Button b1=new Button("Save");
            Button b2=new Button("Cancel");
            Button b3=new Button("Exit");
        //add components on container
            Panel p1=new Panel();
            Panel p2=new Panel();
            p1.setLayout(new GridLayout(2,2));
            p2.setLayout(new FlowLayout());
            p1.add(l1); p1.add(t1);
            p1.add(l2); p1.add(t2);
            p2.add(b1); p2.add(b2); p2.add(b3);
            f.add("North",p1);
            f.add("South",p2);
    }
}
