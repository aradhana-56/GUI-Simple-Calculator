import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Calculate implements ActionListener
{
    
    double n1=0,n2=0,r=0;
    int c;
    
    JFrame frame=new JFrame("Calculator");
    JLabel label=new JLabel();
    JTextField textField=new JTextField();
    JRadioButton onb=new JRadioButton("On");
    JRadioButton offb=new JRadioButton("Off");
    JButton b0=new JButton("0");
    JButton b1=new JButton("1");
    JButton b2=new JButton("2");
    JButton b3=new JButton("3");    
    JButton b4=new JButton("4");
    JButton b5=new JButton("5");
    JButton b6=new JButton("6");
    JButton b7=new JButton("7");
    JButton b8=new JButton("8");
    JButton b9=new JButton("9");
    JButton bdot=new JButton(".");
    JButton bcl=new JButton("C");
    JButton bdel=new JButton("DEL");
    JButton beq=new JButton("=");
    JButton bm=new JButton("*");
    JButton bd=new JButton("/");
    JButton ba=new JButton("+");
    JButton bs=new JButton("-");
    JButton bsq=new JButton("x\u00B2");
    JButton brec=new JButton("1/x");
    JButton bsqr=new JButton("\u221A");

    Calculate()
    {
        preparegui();
        addComponents();
        addActionEvent();
    }

    public void preparegui()
    {
        frame.setSize(305,510);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.black);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void addComponents()
    {
        label.setBounds(250,0,50,50);
        label.setForeground(Color.white);
        frame.add(label);

        textField.setBounds(10,40,270,40);
        textField.setFont(new Font("Arial",Font.BOLD,20));
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textField);

        onb.setBounds(10,95,60,40);
        onb.setSelected(true);
        onb.setFont(new Font("Arial",Font.BOLD,14));
        onb.setBackground(Color.black);
        onb.setForeground(Color.white);
        onb.setFocusable(false);
        frame.add(onb);

        offb.setBounds(10,120,60,40);
        offb.setSelected(false);
        offb.setFont(new Font("Arial",Font.BOLD,14));
        offb.setBackground(Color.black);
        offb.setForeground(Color.white);
        offb.setFocusable(false);
        frame.add(offb);

        ButtonGroup bg=new ButtonGroup();
        bg.add(onb);
        bg.add(offb);

        b7.setBounds(10,230,60,40);
        b7.setFont(new Font("Arial",Font.BOLD,20));
        b7.setFocusable(false);
        frame.add(b7);

        b8.setBounds(80,230,60,40);
        b8.setFont(new Font("Arial",Font.BOLD,20));
        b8.setFocusable(false);
        frame.add(b8);

        b9.setBounds(150,230,60,40);
        b9.setFont(new Font("Arial",Font.BOLD,20));
        b9.setFocusable(false);
        frame.add(b9);

        b4.setBounds(10,290,60,40);
        b4.setFont(new Font("Arial",Font.BOLD,20));
        b4.setFocusable(false);
        frame.add(b4);

        b5.setBounds(80,290,60,40);
        b5.setFont(new Font("Arial",Font.BOLD,20));
        b5.setFocusable(false);
        frame.add(b5);

        b6.setBounds(150,290,60,40);
        b6.setFont(new Font("Arial",Font.BOLD,20));
        b6.setFocusable(false);
        frame.add(b6); 
        
        b1.setBounds(10,350,60,40);
        b1.setFont(new Font("Arial",Font.BOLD,20));
        b1.setFocusable(false);
        frame.add(b1);

        b2.setBounds(80,350,60,40);
        b2.setFont(new Font("Arial",Font.BOLD,20));
        b2.setFocusable(false);
        frame.add(b2);

        b3.setBounds(150,350,60,40);
        b3.setFont(new Font("Arial",Font.BOLD,20));
        b3.setFocusable(false);
        frame.add(b3);

        bdot.setBounds(150,410,60,40);
        bdot.setFont(new Font("Arial",Font.BOLD,20));
        bdot.setFocusable(false);
        frame.add(bdot);

        b0.setBounds(10,410,130,40);
        b0.setFont(new Font("Arial",Font.BOLD,20));
        b0.setFocusable(false);
        frame.add(b0);

        beq.setBounds(220,350,60,100);
        beq.setFont(new Font("Arial",Font.BOLD,20));
        beq.setBackground(new Color(239,188,2));
        beq.setFocusable(false);
        frame.add(beq);

        bd.setBounds(220,110,60,40);
        bd.setFont(new Font("Arial",Font.BOLD,20));
        bd.setBackground(new Color(239,188,2));
        bd.setFocusable(false);
        frame.add(bd);

        bsqr.setBounds(10,170,60,40);
        bsqr.setFont(new Font("Arial",Font.BOLD,18));
        bsqr.setFocusable(false);
        frame.add(bsqr);

        bm.setBounds(220,230,60,40);
        bm.setFont(new Font("Arial",Font.BOLD,20));
        bm.setBackground(new Color(239,188,2));
        bm.setFocusable(false);
        frame.add(bm);

        bs.setBounds(220,170,60,40);
        bs.setFont(new Font("Arial",Font.BOLD,20));
        bs.setBackground(new Color(239,188,2));
        bs.setFocusable(false);
        frame.add(bs);
        
        ba.setBounds(220,290,60,40);
        ba.setFont(new Font("Arial",Font.BOLD,20));
        ba.setBackground(new Color(239,188,2));
        ba.setFocusable(false);
        frame.add(ba);

        bsq.setBounds(80,170,60,40);
        bsq.setFont(new Font("Arial",Font.BOLD,20));
        bsq.setFocusable(false);
        frame.add(bsq);

        brec.setBounds(150,170,60,40);
        brec.setFont(new Font("Arial",Font.BOLD,15));
        brec.setFocusable(false);
        frame.add(brec);

        bdel.setBounds(150,110,60,40);
        bdel.setFont(new Font("Arial",Font.BOLD,12));
        bdel.setBackground(Color.red);
        bdel.setForeground(Color.white);
        bdel.setFocusable(false);
        frame.add(bdel);

        bcl.setBounds(80,110,60,40);
        bcl.setFont(new Font("Arial",Font.BOLD,12));
        bcl.setBackground(Color.red);
        bcl.setForeground(Color.white);
        bcl.setFocusable(false);
        frame.add(bcl);
        
    }

    public void addActionEvent()
    {
        onb.addActionListener(this);
        offb.addActionListener(this);
        bcl.addActionListener(this);
        bdel.addActionListener(this);
        bd.addActionListener(this);
        bsqr.addActionListener(this);
        bsq.addActionListener(this);
        brec.addActionListener(this);
        bs.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        bm.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        ba.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        beq.addActionListener(this);
        b0.addActionListener(this);
        bdot.addActionListener(this);

    }

    public static void main(String[] args) 
    {
        Calculate cal=new Calculate();
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object s=e.getSource();
        if(s==onb)
        {
            enable();
        }
        else if(s==offb)
        {
            disable();
        }
        else if(s==bcl)
        {
            label.setText("");
            textField.setText("");

        }
        else if(s==bdel)
        {
            int l=textField.getText().length(); 
            int n=l-1;
            if(l>0)
            {
                StringBuilder bk=new StringBuilder(textField.getText());
                bk.deleteCharAt(n);
                textField.setText(bk.toString());
            }
            if(textField.getText().endsWith(""));
            label.setText("");
        }
        else if(s==b0)
        {
            if(textField.getText().equals("0"))
            {
                return;
            }
            else
            {
                textField.setText(textField.getText()+"0");
            }
        }
        else if(s==b1)
        {
            textField.setText(textField.getText()+"1");

        }
        else if(s==b2)
        {
            textField.setText(textField.getText()+"2");

        }
        else if(s==b3)
        {
            textField.setText(textField.getText()+"3");

        }
        else if(s==b4)
        {
            textField.setText(textField.getText()+"4");

        }
        else if(s==b5)
        {
            textField.setText(textField.getText()+"5");

        }
        else if(s==b6)
        {
            textField.setText(textField.getText()+"6");

        }
        else if(s==b7)
        {
            textField.setText(textField.getText()+"7");

        }
        else if(s==b8)
        {
            textField.setText(textField.getText()+"8");

        }
        else if(s==b9)
        {
            textField.setText(textField.getText()+"9");

        }
        else if(s==bdot)
        {
            if(textField.getText().contains("."))
            {
                return;
            }
            else
            {
                textField.setText(textField.getText()+".");
            }
        }
        else if(s==ba)
        {
            String str=textField.getText();
            n1=Double.parseDouble(textField.getText());
            c=1;
            textField.setText("");
            label.setText(str + "+");
        }
        else if(s==bs)
        {
            String str=textField.getText();
            n1=Double.parseDouble(textField.getText());
            c=2;
            textField.setText("");
            label.setText(str + "-");
        }
        else if(s==bm)
        {
            String str=textField.getText();
            n1=Double.parseDouble(textField.getText());
            c=3;
            textField.setText("");
            label.setText(str + "*");
        }
        else if(s==bd)
        {
            String str=textField.getText();
            n1=Double.parseDouble(textField.getText());
            c=4;
            textField.setText("");
            label.setText(str + "/");
        }
        else if(s==bsq)
        {
            n1= Double.parseDouble(textField.getText());
            double sq=Math.pow(n1, 2);
            String str=Double.toString(sq);
            if(str.endsWith(".0"))
            {
                textField.setText(str.replace(".0", ""));
            }
            else
            {
                textField.setText(str);
            }
        }
        else if(s==bsqr)
        {
            n1=Double.parseDouble(textField.getText());
            double sqr=Math.sqrt(n1);
            textField.setText(Double.toString(sqr));
        }
        else if(s==brec)
        {
            n1= Double.parseDouble(textField.getText());
            double rc=1/n1;
            String str=Double.toString(rc);
            if(str.endsWith(".0"))
            {
                textField.setText(str.replace(".0", ""));
            }
            else
            {
                textField.setText(str);
            }
        }
        else if(s==beq)
        {
            n2=Double.parseDouble(textField.getText());
            switch (c) 
            {
                case 1:r=n1+n2;
                    break;
                case 2:r=n1-n2;
                    break;
                case 3:r=n1*n2;
                    break;
                case 4:r=n1/n2;
                    break;
            }
            if(Double.toString(r).endsWith(".0"))
            {
                textField.setText(Double.toString(r).replace(".0", ""));
            }
            else
            {
                textField.setText(Double.toString(r));
            }
            label.setText("");
            n1=r;

        }
    }

    public void enable()
    {   
        onb.setEnabled(false);
        offb.setEnabled(true);
        textField.setEnabled(true);
        label.setEnabled(true);
        bcl.setEnabled(true);
        bdel.setEnabled(true);
        bd.setEnabled(true);
        bsqr.setEnabled(true);
        bsq.setEnabled(true);
        brec.setEnabled(true);
        bs.setEnabled(true);
        b7.setEnabled(true);
        b8.setEnabled(true);
        b9.setEnabled(true);
        bm.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
        ba.setEnabled(true);
        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        beq.setEnabled(true);
        b0.setEnabled(true);
        bdot.setEnabled(true);

    }

    public void disable()
    {
        onb.setEnabled(true);
        offb.setEnabled(false);
        textField.setEnabled(false);
        label.setEnabled(false);
        label.setText("");
        textField.setText("");
        bcl.setEnabled(false);
        bdel.setEnabled(false);
        bd.setEnabled(false);
        bsqr.setEnabled(false);
        bsq.setEnabled(false);
        brec.setEnabled(false);
        bs.setEnabled(false);
        b7.setEnabled(false);
        b8.setEnabled(false);
        b9.setEnabled(false);
        bm.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);
        b6.setEnabled(false);
        ba.setEnabled(false);
        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        beq.setEnabled(false);
        b0.setEnabled(false);
        bdot.setEnabled(false);
    }

}
