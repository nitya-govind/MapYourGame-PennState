


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author szr5407
 */
public class myJPanel7 extends JPanel implements ActionListener ,MouseMotionListener                //IST
{
   
    myJPanel4 mjp4;
    myJPanel3 mjp3;
    myJTabbedPane mjp;
    JButton BTM1;
    JButton bx, by, bmessage;
    JButton end, restart;
    JLabel labelx;
//    Rectangle rend = new Rectangle(end.getBounds());
    public myJPanel7 (myJPanel4 a, myJPanel3 b)
    {
        setLayout(null);
        mjp4 = a;
    mjp3 = b;

   setBackground(Color.GRAY);
        BTM1 = new JButton ("Back To Map");
        BTM1.setBackground(Color.white);
        BTM1.setBounds(630,0,150,40);
        add(BTM1);
        end = new JButton();
                add(end);
                 end.setText("End");
                 
                
                 JLabel labelx = new JLabel("Get through the maze! Reach end and click on Back to Map to play other games!");
                 labelx.setBounds(100, 10, 500, 15);
                add(labelx);
                addMouseMotionListener(this);
    }
    
   

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
       
        
    }
    
      public void paintComponent(Graphics g) 
{
    super.paintComponent(g); 
    if (mjp3.th == 3)
    {
    Image myImage = Toolkit.getDefaultToolkit().getImage("images/maze.jpg");
    g.drawImage(myImage, 350, 0, this);
    requestFocusInWindow();
    end.setBounds(1000, 520, 65, 55);
    }
    if (mjp3.th == 2)
    {
    Image myImage = Toolkit.getDefaultToolkit().getImage("images/maze_football.gif");
    g.drawImage(myImage, 450, 0, this);
    requestFocusInWindow(); 
    end.setBounds(840, 530, 65, 55);
    }
    if (mjp3.th == 1)
    {
    Image myImage = Toolkit.getDefaultToolkit().getImage("images/PennStateMaze.jpg");
    g.drawImage(myImage, 350, 0, this);
    requestFocusInWindow();
    end.setBounds(980, 560, 65, 55);
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
    public void mouseMoved(MouseEvent evt)
    {
    	Point pt = evt.getPoint();
    	
        
    }
    
    public void mouseDragged(MouseEvent evt)
    {
        Point pt = evt.getPoint();
        Graphics g = getGraphics();
        g.fillRect(pt.x, pt.y, 10, 10);
        
       Rectangle rend = end.getBounds();
       
       if(rend.contains(pt))
       {
      //  remove(mjp.gamep1);
      //  remove(end);
      //      add(mjp4);
       //     validate();
        //    repaint();
            
            mjp4.mjpt.remove(this);
            mjp4.mjpt.add(mjp4);
            mjp4.mjpt.validate();
            mjp4.mjpt.repaint();
       }

}
    


}
