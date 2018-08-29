import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author szr5407
 */
public class myJPanel8 extends JPanel implements ActionListener 
{
    
    myJPanel4 mjp4;
    myJPanel3 mjp3;
    JButton BTM2;
    JButton mtf2;
    JRadioButton option5, option6, option7, option8;
    JTextField jtfg2;
    public myJPanel8 (myJPanel4 a, myJPanel3 b)
    {
     setLayout(null);
    mjp4 = a;
    mjp3 = b;
    mtf2 = new JButton ("Which artist is coming to Penn State at the BJC in January?");
    add(mtf2);
    mtf2.setBounds(425, 100, 550, 40);
    jtfg2 = new JTextField ();
    add(jtfg2);
    jtfg2.setText("Select an answer");
    jtfg2.setBounds(550, 600, 300, 40);
    option5 = new JRadioButton("Whitney Houston");
    option6 = new JRadioButton("Pride of the Lions Pep Band");
    option7 = new JRadioButton("Lana Del Rey");
    option8 = new JRadioButton("Luke Bryan");
    ButtonGroup group3 = new ButtonGroup();
    group3.add(option5);
    group3.add(option6);
    group3.add(option7);
    group3.add(option8);
    option5.setBounds(575, 150, 200, 40);
    option6.setBounds(575, 200, 200, 40);
    option7.setBounds(575, 250, 200, 40);
    option8.setBounds(575, 300, 200, 40);
    add(option5);
    add(option6);
    add(option7);
    add(option8);
    setBackground(Color.GRAY);
        BTM2 = new JButton ("Back To Map");
        BTM2.setBackground(Color.white);
        BTM2.setBounds(600, 0, 150, 40);
        add(BTM2);
    option5.addActionListener(this);
    option6.addActionListener(this);
    option7.addActionListener(this);
    option8.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object obj = ae.getSource();
        if (mjp3.th == 3)
        {
            if (obj == option8)
            {
                jtfg2.setText("Correct!  Return to map");
            }
            if (obj == option6)
            {
                jtfg2.setText("Incorrect, try again");
            }
            if (obj == option7)
            {
                jtfg2.setText("Incorrect, try again");
            }
            if (obj == option5)
            {
                jtfg2.setText("Incorrect, try again");
            }
        }
        if (mjp3.th == 2)
        {
            if (obj == option6)
            {
                jtfg2.setText("Correct!  Return to map");
            }
            if (obj == option5)
            {
                jtfg2.setText("Incorrect, try again");
            }
            if (obj == option7)
            {
                jtfg2.setText("Incorrect, try again");
            }
            if (obj == option8)
            {
                jtfg2.setText("Incorrect, try again");
            }
        }
        if (mjp3.th == 1)
        {
            if (obj == option7)
            {
                jtfg2.setText("Correct!  Return to map");
            }
            if (obj == option6)
            {
                jtfg2.setText("Incorrect, try again");
            }
            if (obj == option5)
            {
                jtfg2.setText("Incorrect, try again");
            }
            if (obj == option8)
            {
                jtfg2.setText("Incorrect, try again");
            }
        }
    }
    
    public void changeColor() 
   {
       if (mjp3.th == 3)
        {
            setBackground(Color.yellow);
        }
         if (mjp3.th == 2)
        {
            setBackground(Color.RED);
        }
         if (mjp3.th == 1)
        {
            setBackground(Color.orange);
        }
   }
    
}
