
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class myJPanel4 extends JPanel implements ActionListener, KeyListener //THIS IS THE CHARACTERS
{       
        
        myJPanel1 mjp1;
        myJPanel2 mjp2;
        myJPanel3 mjp3;
        myJPanel5 mjp5;
        myJPanel6 mjp6;
        myJPanel7 gamep1;
        myJPanel8 gamep2;
        myJPanel9 gamep3;
        myJPanel10 gamep4;
        myJPanel11 gamep5;
        
        myJTabbedPane mjpt;
	JButton b2, charac, game1, game2, game3, game4, game5;
        int x = 100;
        int y = 100;
        Timer tim;
        int delay = 0;
        JButton timer;
          int i = 0;
	public myJPanel4(myJPanel1 a, myJPanel2 b, myJPanel3 c, myJPanel5 d, myJPanel6 e, myJTabbedPane f )
	
        {
		super();
                setLayout(null);
                mjp1 = a;     //Characters (HIDDEN)
                mjp2 = b;
                mjp3 = c;
                mjp5 = d;
                mjp6 = e;
                
                mjpt = f;
                
                
		//setBackground
		b2 = new JButton("Back to Main Screen");  
                b2.setBackground(Color.white);//Do communcation part later
                
		add(b2);
                b2.setBounds(100, 0, 200, 30);
                b2.addActionListener(this);
                
               
                
                charac = new JButton();
                add (charac);
                charac.setBounds(200, 200, 150, 80);
                
                charac.addActionListener(this);
                
                addKeyListener(this);
                
                game1= new JButton("IST");
                add (game1);
                game1.setBounds(100, 550, 60, 60);
                game1.addActionListener(this);
                
                game2= new JButton("BJC");
                add (game2);
                game2.setBounds(1150, 300, 60, 60);
                game2.addActionListener(this);
                
                
                game3= new JButton("Beaver Stadium");
                add (game3);
                game3.setBounds(1200, 100, 150, 60);
                game3.addActionListener(this);
                
                
                game4= new JButton("HUB");
                add (game4);
                game4.setBounds(450, 550, 60, 60);
                game4.addActionListener(this);
                
                game5= new JButton("Creamery");
                add (game5);
                game5.setBounds(650, 250, 100, 60);
                game5.addActionListener(this);
                
                
                delay = 1000;
             //   tim = new Timer(delay, this);
                
               
                timer = new JButton("timer");
                timer.setBounds(350,0,150,30);
                
                add(timer);
                
               
                
                
        }
	
        public void paintComponent(Graphics g) 
{
    super.paintComponent(g); 
    Image myImage = Toolkit.getDefaultToolkit().getImage("images/IST240finalmap.jpg");
    g.drawImage(myImage, 0, 0, this);
    requestFocusInWindow();
}

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        Object obj = ae.getSource();
       /*if (obj == tim)
        {
                i = i++;
                timer.setText("Time:" + i);
                }
         */       
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        int k = ke.getKeyCode();
        if(k == ke.VK_LEFT){x = x - 10;;}
        if(k == ke.VK_RIGHT){x = x + 10;}
        if(k == ke.VK_UP){y = y - 10;}
        if(k == ke.VK_DOWN){y = y + 10;}
        
        charac.setBounds(x, y, 150, 80);
        Rectangle rcharac = charac.getBounds();
        Rectangle rgame1 = game1.getBounds();
        Rectangle rgame2 = game2.getBounds();
        Rectangle rgame3 = game3.getBounds();
        Rectangle rgame4 = game4.getBounds();
        Rectangle rgame5 = game5.getBounds();
        
        if (rcharac.intersects(rgame1))
        {
            game1.setBackground(Color.yellow);
            x= x-15;
            y=y-15;
            charac.setBounds(x, y, 150, 80);
                mjpt.remove(mjpt.mjp4);
                mjpt.add(mjpt.gamep1);
                mjpt.validate();
                mjpt.repaint();
                    
        }
        
        if (rcharac.intersects(rgame2))
        {
            //remove(this);
            //add(game1);
            game2.setBackground(Color.yellow);
            x= x-15;
            y=y-15;
            charac.setBounds(x, y, 150, 80);
                mjpt.remove(mjpt.mjp4);
                mjpt.add(mjpt.gamep2);
                mjpt.validate();
                mjpt.repaint();
         
        }
        
        if (rcharac.intersects(rgame3))
        {
            //remove(this);
            //add(game1);
            game3.setBackground(Color.yellow);
            x= x-15;
            y=y-15;
            charac.setBounds(x, y, 150, 80);
                mjpt.remove(mjpt.mjp4);
                mjpt.add(mjpt.gamep3);
                mjpt.validate();
                mjpt.repaint();
        }
        
        if (rcharac.intersects(rgame4))
        {
            //remove(this);
            //add(game1);
            game4.setBackground(Color.yellow);
            x= x-15;
            y=y-15;
            charac.setBounds(x, y, 150, 80);
                mjpt.remove(mjpt.mjp4);
                mjpt.add(mjpt.gamep4);
                mjpt.validate();
                mjpt.repaint();
        }
        if (rcharac.intersects(rgame5))
        {
            
            game5.setBackground(Color.yellow);
            x= x-15;
            y=y-15;
            charac.setBounds(x, y, 150, 80);
           
            mjpt.remove(mjpt.mjp4);
            mjpt.add(mjpt.gamep5);
            mjpt.validate();
            mjpt.repaint();
        }
    
    }

    @Override
    public void keyReleased(KeyEvent ke)
    {
        
      
    }
}
