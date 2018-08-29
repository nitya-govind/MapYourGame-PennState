import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.*;
public class myJTabbedPane extends JPanel implements ActionListener
{
	myJPanel1  mjp1;                
	myJPanel2  mjp2;                
	myJPanel3  mjp3; 
	myJPanel4  mjp4;    
	myJPanel5  mjp5;
        myJPanel6  mjp6;    //Game Over H
        
        myJPanel7 gamep1;           //IST           S Maze
        myJPanel8 gamep2;           //BJC           M Trivia 2
        myJPanel9 gamep3;           //Beaver        N Football
        myJPanel10 gamep4;          //HUB           N Coffee
        myJPanel11 gamep5;          //Cremeary      M Trivia 1
        int i = 0;
        
    //        JButton Instructions;
    //        JButton StartGame;
    //        JButton Credits;
        
        public myJTabbedPane()
	{
	
    	mjp1 = new myJPanel1(mjp2, mjp3, mjp4, mjp5, mjp6);     //Introduction
    	mjp2 = new myJPanel2(mjp1, mjp3, mjp4, mjp5, mjp6);     //Instructions
        mjp4 = new myJPanel4(mjp1, mjp2, mjp3, mjp5, mjp6,this);     //Map/ Lets Play
        mjp3 = new myJPanel3(mjp4, mjp1, mjp2, mjp5, mjp6);     //Characters
        mjp5 = new myJPanel5(mjp1, mjp2, mjp3, mjp4, mjp6);     //Credits 
        mjp6 = new myJPanel6(mjp1, mjp2, mjp3, mjp4, mjp5);     //Game Over (Hidden)
        gamep1= new myJPanel7(mjp4, mjp3);
        mjp4.gamep1 = gamep1;
        gamep2= new myJPanel8(mjp4, mjp3);
        mjp4.gamep2 = gamep2;
        gamep3= new myJPanel9(mjp4, mjp3);
        mjp4.gamep3 = gamep3;
        mjp4.gamep3 = gamep3;
        gamep4= new myJPanel10(mjp4, mjp3);
        mjp4.gamep4 = gamep4;
        gamep5= new myJPanel11(mjp4, mjp3);
        mjp4.gamep5 = gamep5;
    	

        
    	
    	setBackground(Color.GREEN);
        setLayout(new BorderLayout());
		//JTextField jf = new JTextField("HOME PANEL");
		//add(jf);
                
                add(mjp1);
                mjp1.Instructions.addActionListener(this);
                mjp2.BackToHome.addActionListener(this);
                mjp1.StartGame.addActionListener(this);
                mjp3.BTH3.addActionListener(this);
                mjp1.Credits.addActionListener(this);
                mjp5.BTH5.addActionListener(this);
                mjp4.b2.addActionListener(this);
                mjp3.LP.addActionListener(this);
                
             
                mjp4.charac.addActionListener(this);
                mjp4.game1.addActionListener(this);
                mjp4.game2.addActionListener(this);
                mjp4.game3.addActionListener(this);
                mjp4.game4.addActionListener(this);
                mjp4.game5.addActionListener(this);
                
                gamep1.BTM1.addActionListener(this);
                gamep2.BTM2.addActionListener(this);
                gamep3.BTM3.addActionListener(this);
                gamep4.BTM4.addActionListener(this);
                gamep5.BTM5.addActionListener(this);
                
             //   gamep3.fb.addActionListener(this);
        
	}

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        Object obj = ae.getSource();
        {    
            if (obj == mjp1.Instructions)
            {
                remove(mjp1);
                add(mjp2);
                validate();
                repaint();

            }
            if (obj == mjp2.BackToHome)
            {
                remove(mjp2);
                add(mjp1);
                validate();
                repaint();
            }
        }
        {
            if (obj == mjp1.StartGame)
            {
                remove(mjp1);
                add(mjp3);
                validate();
                repaint();

            }
            if (obj == mjp3.BTH3)
            {
                remove(mjp3);
                add(mjp1);
                validate();
                repaint();
            }
        }
        
        {
            if (obj == mjp1.Credits)
            {
                remove(mjp1);
                add(mjp5);
                validate();
                repaint();

            }
            if (obj == mjp5.BTH5)
            {
                remove(mjp5);
                add(mjp1);
                validate();
                repaint();
            }
           
       
        }
        
         if (obj == mjp3.LP)
            {
                remove(mjp3);
                add(mjp4);
                validate();
                repaint();
                mjp4.tim = new Timer(mjp4.delay,this);
                mjp4.tim.start();
              //  System.out.println("t start");
            }
                //Object obj = ae.getSource();
               if (obj == mjp4.tim){
                    {
                        
                        i++;
                        mjp4.timer.setText("Time:" + i);
                    }
                
             }
        if (obj == mjp4.b2)
            {
                remove(mjp4);
                add(mjp1);
                validate();
                repaint();
             }
        
        if (obj== gamep1.BTM1)
        {
            remove(gamep1);
            add(mjp4);
            validate();
            repaint();
        }
        
        if (obj== gamep2.BTM2)
        {
            remove(gamep2);
            add(mjp4);
            validate();
            repaint();
        }
        
        if (obj== gamep3.BTM3)
        {
            gamep3.p1.setBackground(Color.white);
            gamep3.p2.setBackground(Color.white);
            gamep3.p3.setBackground(Color.white);
            gamep3.p4.setBackground(Color.white);
            gamep3.p5.setBackground(Color.white);
            gamep3.goal.setBackground(Color.white);
            
            gamep3.fb.setBounds(100,100,150,80);
            remove(gamep3);
            add(mjp4);
            validate();
            repaint();
        }
        if (obj== gamep4.BTM4)
        {
            gamep4.tim.stop();
        //    if (obj == gamep4.start) 
          //  {
            //    gamep4.tim.restart();
           // }
           // gamep4.tim.restart();
            gamep4.score = 0;
            gamep4.b3.setText("Score: " + gamep4.score);
            gamep4.b1.setBounds(new Rectangle(400, 550, 100, 75));
            remove(gamep4);
            add(mjp4);
            validate();
            repaint();
        }
        if (obj== gamep5.BTM5)
        {
            remove(gamep5);
            add(mjp4);
            validate();
            repaint();
        }
      
            
        if (mjp3.th == 1)
        {
            gamep5.mtf.setText("Which Penn State ice cream flavor is not a Hall of Fame flavor?");
            
        }
        if (mjp3.th == 2)
        {
            gamep5.mtf.setText("Which Penn State ice cream flavor is named after a football coach?");
            
        }
        if (mjp3.th == 3)
        {
            gamep5.mtf.setText(("Which Penn State ice cream flavor is named after a volleyball coach?"));
            
        }
        if (mjp3.th == 1)
        {
            gamep2.mtf2.setText("Which artist is coming to Penn State at the BJC in January?");
            
        }
        if (mjp3.th == 2)
        {
            gamep2.mtf2.setText("Which performance is at the BJC before some football games?");
            
        }
        if (mjp3.th == 3)
        {
            gamep2.mtf2.setText(("Which artist is coming to State College at the BJC in February?"));
            
        }

        /*
        if (mjp3.th ==3)
        {
         if (obj == gamep4.b1)
          {

            //b1.setIcon(newsize2);
            //b1.setIcon(newsize);
            if (gamep4.b1.getIcon() == gamep4.newsize2)
            {
                gamep4.b1.setIcon(gamep4.newsize);
                System.out.println( gamep4.newsize);
             }
            else 
            {
                gamep4.b1.setIcon(gamep4.newsize2);
            }

         }
        }
        */
        
                
                
                
                
        gamep1.changeColor();
        gamep2.changeColor();
        gamep3.changeColor();
        gamep4.changeColor();
        gamep5.changeColor();
        

    
        
    }

    

}


  

