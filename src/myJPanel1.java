import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class myJPanel1 extends JPanel implements ActionListener // THIS IS INTRODUCTION PAGE
{
        JButton Instructions;
        JButton StartGame;
        JButton Credits;
        myJPanel2 mjp2;
        myJPanel3 mjp3;
        myJPanel4 mjp4;
        myJPanel5 mjp5;
        myJPanel6 mjp6;
	public myJPanel1(myJPanel2 a, myJPanel3 b, myJPanel4 c, myJPanel5 d, myJPanel6 e)
	{
		setBackground(Color.MAGENTA);
		//JButton jb1 = new JButton("Click for Instructions");
		//add(jb1);
                JTextField introf = new JTextField("Welcome to the Navigation Game");
		add(introf);
                
             
                mjp2 = a;     //Characters (HIDDEN)
                mjp3 = b;
                mjp4 = c;
                mjp5 = d;
                mjp6 = e;
        Instructions = new JButton ("Instructions");
        Instructions.setBackground(Color.white);
        Instructions.addActionListener(this);
        add(Instructions);
        
        
        StartGame = new JButton ("Start Game");
        StartGame.setBackground(Color.white);
        StartGame.addActionListener(this);
        add(StartGame);
        
        Credits = new JButton ("Credits");
        Credits.setBackground(Color.white);
        Credits.addActionListener(this);
        add(Credits);
	}

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
    
        
        //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
