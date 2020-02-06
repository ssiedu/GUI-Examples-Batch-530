
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;


public class GUIOne {
    public static void main(String[] args) {
        //create container
            Frame f=new Frame();
            f.setSize(400,400);
            f.setVisible(true);
        //create components
            Label l1=new Label("Enter Name  : ");
            TextField t1=new TextField(10);
            Button b1=new Button("Submit");
        //add components on container
            f.setLayout(new FlowLayout());
            f.add(l1); f.add(t1); f.add(b1);
    }
}
