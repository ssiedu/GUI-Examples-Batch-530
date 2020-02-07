
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;

public class GUITwo {
      public static void main(String[] args) {
        //create container
            Frame f=new Frame();
            f.setSize(400,400); f.setLocation(100,100);
            f.setVisible(true);
        //create components
            Label l1=new Label("Name");
            TextField t1=new TextField(10);
            Button b1=new Button("Submit");
        //add components on container
            f.setLayout(null);
            l1.setSize(80, 30);  //w,h
            l1.setLocation(50, 100); //x,y
            f.add(l1);
            t1.setBounds(150,100,100,30);
            //t1.setSize(100,30);
            //t1.setLocation(150,100);
            f.add(t1);
            
            b1.setBounds(70, 170, 60, 40);//x,y,w,h
            f.add(b1);
    }
}
