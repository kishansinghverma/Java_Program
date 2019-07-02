
import java.awt.*;
import java.awt.event.*;

public class SwingDemo implements ActionListener 
{
    Button b1;
    TextField t1;
    Label l1;
    void temp()
    {
        Frame f1=new Frame();
        f1.setVisible(true);
        f1.setSize(300,200);
        f1.setLayout(null);
        
        t1=new TextField();
        t1.setBounds(20, 50, 200, 30);
        
        l1=new Label();
        l1.setBounds(20, 100, 200, 30);
        
        b1=new Button("Click");
        b1.setBounds(50, 150, 40, 25);
        b1.addActionListener(this);
        
        f1.add(t1);
        f1.add(l1);
        f1.add(b1);
        
        
    }
    public void actionPerformed(ActionEvent e)
    {
        l1.setText(t1.getText());
    }
    public static void main(String args[])
    {
        SwingDemo obj=new SwingDemo();
        obj.temp();
    }
    
    
}
