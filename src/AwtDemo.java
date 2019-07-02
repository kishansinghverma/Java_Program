
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AwtDemo implements ActionListener
{
    Button b1,b2,b3,b4;
    TextField t1,t2,t3;
    void calculator()
    {
        Frame f=new Frame("Calculator");
        f.setVisible(true);
        f.setSize(300,250);
        f.setLayout(null);
        f.setBackground(Color.cyan);
        
        b1=new Button("Add");
        b1.setBounds(20, 205, 50, 20);
        b1.addActionListener(this);
        b2=new Button("Subtract");
        b2.setBounds(90, 205, 50, 20);
        b2.addActionListener(this);
        b3=new Button("Multiply");
        b3.setBounds(160, 205, 50, 20);
        b3.addActionListener(this);
        b4=new Button("Divide");
        b4.setBounds(230, 205, 50, 20);
        b4.addActionListener(this);
        
        Label l1=new Label("Enter First Number:");
        l1.setBounds(20,40,260,20);
        t1=new TextField();
        t1.setBounds(20,62,260,25);
        
        Label l2=new Label("Enter Second Number:");
        l2.setBounds(20,90,260,20);
        t2=new TextField();
        t2.setBounds(20,112,260,25);
        
        Label l3=new Label("Output:");
        l3.setBounds(20,140,260,20);
        t3=new TextField();
        t3.setBounds(20,162,260,25);
        t3.setEnabled(false);
        
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        double a,b;
        try
        {
            a = Integer.parseInt(t1.getText());
            b = Integer.parseInt(t2.getText());
        }
        catch(NumberFormatException x)
        { a=0; b=0;}
        
        if(e.getSource()==b1)
        {
            t3.setText(String.valueOf(a+b));
        }
        else if(e.getSource()==b2)
        {
            t3.setText(String.valueOf(a-b));
        }
        else if(e.getSource()==b3)
        {
            t3.setText(String.valueOf(a*b));
        }
        else
        {
            try
            {
                t3.setText(String.valueOf((float)a/(float)b));
            }
            catch(ArithmeticException y)
            {
                t3.setText("Can't Divide By Zero!! ");
            }
        }
    }
    public static void main(String args[])
    {
        AwtDemo obj=new AwtDemo();
        obj.calculator();
    }
}
