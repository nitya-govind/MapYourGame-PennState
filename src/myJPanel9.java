import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author szr5407
 */



public class myJPanel9 extends JPanel implements ActionListener, KeyListener                //Beaver
{

    ImageIcon minifb = new ImageIcon("images/" + "minifb" + ".jpg");  
    ImageIcon minicof = new ImageIcon("images/" + "minicof" + ".jpg");  
    ImageIcon minips = new ImageIcon("images/" + "minips" + ".jpg");  
    JLabel text1 = new JLabel("Press the arrow keys to navigate through the obstacles.");
    JLabel text2 = new JLabel(" If you hit an obstacle it is a foul and if you reach the goal you win!");
    JLabel text3 = new JLabel("After you reach your goal, click on Back to Map to play other games.");
    JButton fb = new JButton(new ImageIcon("images/minifb.jpg"));
         //   new JButton(new ImageIcon("images/minifb.jpg"));
    JButton BTM3;
    JButton p1, p2, p3, p4, p5, goal;
    int x = 100;
    int y = 100;
    myJPanel4 mjp4;
    myJPanel3 mjp3;
    public myJPanel9(myJPanel4 a, myJPanel3 b)
    {
        setLayout(null);
        mjp4 = a;
        mjp3 = b;
        setBackground(Color.pink);
        add(text1);
        text1.setBounds(new Rectangle(30, 30, 350, 30));
        add(text2);
        text2.setBounds(new Rectangle(30, 50, 400, 30));
        add(text3);
        text3.setBounds(new Rectangle(30, 70, 400, 30));
        
        BTM3 = new JButton ("Back To Map");
        BTM3.setBackground(Color.white);
        BTM3.setBounds(600,0,150,40);
        add(BTM3);

        add(fb);
        fb.setBounds(new Rectangle(x, y, 150, 80));

        setFocusable(true);
        addKeyListener(this);
        
        //PSU 1  Football 2 State College 3
        
                p1= new JButton("Obstacle 1");
                add (p1);
                p1.setBounds(100, 350, 150, 60);
                p1.addActionListener(this);
                
                
                p2= new JButton("Obstacle 2");
                add (p2);
                p2.setBounds(700, 450, 150, 60);
                p2.addActionListener(this);
                
                
                p3= new JButton("Obstacle 3");
                add (p3);
                p3.setBounds(1000, 100, 150, 60);
                p3.addActionListener(this);
                
                
                p4= new JButton("Obstacle 4");
                add (p4);
                p4.setBounds(350, 250, 150, 60);
                p4.addActionListener(this);
                
                p5= new JButton("Obstacle 5");
                add (p5);
                p5.setBounds(700, 250, 150, 60);
                p5.addActionListener(this);
                
                goal= new JButton("Goal");
                add (goal);
                goal.setBounds(1150,300 , 150, 60);
                goal.addActionListener(this);
                
                p1.setBackground(Color.white);
            p2.setBackground(Color.white);
            p3.setBackground(Color.white);
            p4.setBackground(Color.white);
            p5.setBackground(Color.white);
            goal.setBackground(Color.white);
                

    }
//==========================================================================

    public void keyPressed(KeyEvent evt)
    {
        System.out.println("Key pressed");
        int kk = evt.getKeyCode();
        if (kk == evt.VK_LEFT)
        {
            x = x - 10;;
        }
        if (kk == evt.VK_RIGHT)
        {
            x = x + 10;
        }
        if (kk == evt.VK_UP)
        {
            y = y - 10;
        }
        if (kk == evt.VK_DOWN)
        {
            y = y + 10;
        }
        fb.setBounds(new Rectangle(x, y, 150, 80));
        Rectangle rfb = fb.getBounds();
        Rectangle rp1 = p1.getBounds();
        Rectangle rp2 = p2.getBounds();
        Rectangle rp3 = p3.getBounds();
        Rectangle rp4 = p4.getBounds();
        Rectangle rp5 = p5.getBounds();
        Rectangle rgoal = goal.getBounds();
        
    if (mjp3.th == 1)
    {
        
        if (rfb.intersects(rp1))
        {
            p1.setBackground(Color.BLUE);
            x= x-15;
            y=y-15;
            fb.setBounds(x, y, 150, 80);  
        }
        if (rfb.intersects(rp2))
        {
            p2.setBackground(Color.BLUE);
            x= x-15;
            y=y-15;
            fb.setBounds(x, y, 150, 80);  
        }
        if (rfb.intersects(rp3))
        {
            p3.setBackground(Color.BLUE);
            x= x-15;
            y=y-15;
            fb.setBounds(x, y, 150, 80);  
        }
        if (rfb.intersects(rp4))
        {
            p4.setBackground(Color.BLUE);
            x= x-15;
            y=y-15;
            fb.setBounds(x, y, 150, 80);  
        }
        if (rfb.intersects(rp5))
        {
            p5.setBackground(Color.BLUE);
            x= x-15;
            y=y-15;
            fb.setBounds(x, y, 150, 80);  
        }
        if (rfb.intersects(rgoal))
        {
            goal.setBackground(Color.green);
            x= x-15;
            y=y-15;
            fb.setBounds(x, y, 150, 80); 
            mjp4.mjpt.remove(this);
            mjp4.mjpt.add(mjp4);
            mjp4.mjpt.validate();
            mjp4.mjpt.repaint();
            
        }
     }
   if (mjp3.th == 2)
    {
        
        if (rfb.intersects(rp1))
        {
            p1.setBackground(Color.PINK);
            x= x-15;
            y=y-15;
            fb.setBounds(x, y, 150, 80);  
        }
        if (rfb.intersects(rp2))
        {
            p2.setBackground(Color.PINK);
            x= x-15;
            y=y-15;
            fb.setBounds(x, y, 150, 80);  
        }
        if (rfb.intersects(rp3))
        {
            p3.setBackground(Color.PINK);
            x= x-15;
            y=y-15;
            fb.setBounds(x, y, 150, 80);  
        }
        if (rfb.intersects(rp4))
        {
            p4.setBackground(Color.PINK);
            x= x-15;
            y=y-15;
            fb.setBounds(x, y, 150, 80);  
        }
        if (rfb.intersects(rp5))
        {
            p5.setBackground(Color.PINK);
            x= x-15;
            y=y-15;
            fb.setBounds(x, y, 150, 80);  
        }
        if (rfb.intersects(rgoal))
        {
            goal.setBackground(Color.green);
            x= x-15;
            y=y-15;
            fb.setBounds(x, y, 150, 80); 
            mjp4.mjpt.remove(this);
            mjp4.mjpt.add(mjp4);
            mjp4.mjpt.validate();
            mjp4.mjpt.repaint();
        }
    }
     if (mjp3.th == 3)
    {
        
        if (rfb.intersects(rp1))
        {
            p1.setBackground(Color.red);
            x= x-15;
            y=y-15;
            fb.setBounds(x, y, 150, 80);  
        }
        if (rfb.intersects(rp2))
        {
            p2.setBackground(Color.red);
            x= x-15;
            y=y-15;
            fb.setBounds(x, y, 150, 80);  
        }
        if (rfb.intersects(rp3))
        {
            p3.setBackground(Color.red);
            x= x-15;
            y=y-15;
            fb.setBounds(x, y, 150, 80);  
        }
        if (rfb.intersects(rp4))
        {
            p4.setBackground(Color.red);
            x= x-15;
            y=y-15;
            fb.setBounds(x, y, 150, 80);  
        }
        if (rfb.intersects(rp5))
        {
            p5.setBackground(Color.red);
            x= x-15;
            y=y-15;
            fb.setBounds(x, y, 150, 80);  
        }
        if (rfb.intersects(rgoal))
        {
            goal.setBackground(Color.green);
            x= x-15;
            y=y-15;
            fb.setBounds(x, y, 150, 80); 
            mjp4.mjpt.remove(this);
            mjp4.mjpt.add(mjp4);
            mjp4.mjpt.validate();
            mjp4.mjpt.repaint();
            
        }
     }
}

    public void keyReleased(KeyEvent evt)
    {
    }

    public void keyTyped(KeyEvent evt)
    {
    }
//============================================================================

    public void paintComponent(Graphics g)  //consider g as a pencil that is able to draw on the screen
    {
        super.paintComponent(g);
        requestFocusInWindow();
    }

    @Override
    public void actionPerformed(ActionEvent ae)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

      public void changeColor() 
   {
       if (mjp3.th == 3)
        {
            setBackground(Color.yellow);
             fb.setIcon(minicof);
             //= new JButton(new ImageIcon("images/minicof.jpg"));
            
            
        }
         if (mjp3.th == 2)
        {
            setBackground(Color.RED);
            fb.setIcon(minifb);
        //     fb = new JButton(new ImageIcon("images/minifb.jpg"));
        }
         if (mjp3.th == 1)
        {
            setBackground(Color.orange);
            fb.setIcon(minips);
         //    fb = new JButton(new ImageIcon("images/minips.jpg"));
        }
   }
}
    
    
  
    

