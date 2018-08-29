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
public class myJPanel11 extends JPanel implements ActionListener {
    
    myJPanel4 mjp4;
    myJPanel3 mjp3;
    JButton BTM5;
    JButton mtf;
    JRadioButton option1, option2, option3, option4;
    JTextField jtfg;
    public myJPanel11 (myJPanel4 a, myJPanel3 b) {
    setLayout (null);
    mjp4 = a;
    mjp3 = b;
    mtf = new JButton ("Which  Penn State ice cream flavor is not a Hall of Fame flavor?");
    mtf.setBounds(400, 100, 550, 40);
    add(mtf);
    jtfg = new JTextField ();
    add(jtfg);
    jtfg.setText("Select an answer");
    jtfg.setBounds(550, 600, 300, 40);
    option1 = new JRadioButton("Death by Chocolate");
    option2 = new JRadioButton("WPSU Coffee Break");
    option3 = new JRadioButton("Peachy Paterno");
    option4 = new JRadioButton("Russ 'Digs' Roseberry");
    ButtonGroup group2 = new ButtonGroup();
    group2.add(option1);
    group2.add(option2);
    group2.add(option3);
    group2.add(option4);
    option1.setBounds(575, 150, 200, 40);
    option2.setBounds(575, 200, 200, 40);
    option3.setBounds(575, 250, 200, 40);
    option4.setBounds(575, 300, 200, 40);
    add(option1);
    add(option2);
    add(option3);
    add(option4);
    setBackground(Color.GRAY);
        BTM5 = new JButton ("Back To Map");
        BTM5.setBackground(Color.white);
        BTM5.setBounds(600, 0, 150, 40);
        add(BTM5);
    option1.addActionListener(this);
    option2.addActionListener(this);
    option3.addActionListener(this);
    option4.addActionListener(this);
    }

    public void changeColor() 
   {
       if (mjp3.th == 3)
        {
            setBackground(Color.yellow);
            //mtf.setText(("Which Penn State ice cream flavor is named after a volleyball coach?"));
        }
         if (mjp3.th == 2)
        {
            setBackground(Color.RED);
            //mtf.setText("Which Penn State ice cream flavor is named after a football coach?");
        }
         if (mjp3.th == 1)
        {
            setBackground(Color.orange);
            //mtf.setText("Which Penn State ice cream flavor is not a Hall of Fame flavor?");
        }
   }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object obj = ae.getSource();
        if (mjp3.th == 3)
        {
            if (obj == option4)
            {
                jtfg.setText("Correct!  Return to map");
            }
            if (obj == option1)
            {
                jtfg.setText("Incorrect, try again");
            }
            if (obj == option2)
            {
                jtfg.setText("Incorrect, try again");
            }
            if (obj == option3)
            {
                jtfg.setText("Incorrect, try again");
            }
        }
        if (mjp3.th == 2)
        {
            if (obj == option3)
            {
                jtfg.setText("Correct!  Return to map");
            }
            if (obj == option1)
            {
                jtfg.setText("Incorrect, try again");
            }
            if (obj == option2)
            {
                jtfg.setText("Incorrect, try again");
            }
            if (obj == option4)
            {
                jtfg.setText("Incorrect, try again");
            }
        }
        if (mjp3.th == 1)
        {
            if (obj == option1)
            {
                jtfg.setText("Correct!  Return to map");
            }
            if (obj == option4)
            {
                jtfg.setText("Incorrect, try again");
            }
            if (obj == option2)
            {
                jtfg.setText("Incorrect, try again");
            }
            if (obj == option3)
            {
                jtfg.setText("Incorrect, try again");
            }
        }
    }
    
}
