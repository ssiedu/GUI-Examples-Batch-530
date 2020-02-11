
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class GUIFour extends Frame implements ActionListener, FocusListener, TextListener, KeyListener{

    
    
    public GUIFour() {
        initComponents();
    }

    public void initComponents() {
        t1 = new TextField(10);
        t2 = new TextField(10);
        b1 = new Button("Copy");
        b2 = new Button("Clear");
        b3 = new Button("Exit");
        b3.setEnabled(false);
        setLayout(new FlowLayout());
        add(t1);
        add(t2);
        add(b1);
        add(b2);
        add(b3);
        //registered the b1 with Action Listener
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b2.addFocusListener(this);
        t1.addTextListener(this);
        t1.addKeyListener(this);
    }

    public static void main(String[] args) {

        GUIFour ob = new GUIFour();
        ob.setSize(400, 400);
        ob.setVisible(true);
    }

    TextField t1, t2;
    Button b1, b2, b3;

    @Override
    public void focusGained(FocusEvent e) {
        b3.setEnabled(true);
    }

    @Override
    public void focusLost(FocusEvent e) {
    
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {

        //identify the event source (the component generates event)
        if (e.getSource() == b1) {
            //read the text from t1
            String s = t1.getText();
            //write the text to t2
            t2.setText(s);
        }else if(e.getSource()==b2){
            t1.setText(""); t2.setText("");
        }else if(e.getSource()==b3){
            System.exit(0);
        }
        

    }
    /*
    1) extends your class with Frame class.
    2) all the members are declared inside class.
    3) generates a method called initComponents
    4) generates a constructor and call initCompoenent in it.
     */

    @Override
    public void textValueChanged(TextEvent e) {
        String s=t1.getText();
        t2.setText(s);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
 
        int code=e.getKeyCode();
        if(code==KeyEvent.VK_F1){
            String s1=t1.getText();
            String s2=s1.toUpperCase();
            t1.setText(s2);
        }else if(code==KeyEvent.VK_F2){
            t1.setText(t1.getText().toLowerCase());
        }else if(code==KeyEvent.VK_ESCAPE){
            t1.setText("");
        }
        
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }

}