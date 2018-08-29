import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import javafx.beans.value.ObservableValue;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author szr5407
 */
public class myJPanel10 extends JPanel implements ActionListener               //HUB BUILDING
{
    
    myJPanel4 mjp4;
    myJPanel3 mjp3;
    JButton BTM4;
    
    
   //////////////////////////////////////////////////////////////// 
    JTextArea message = new JTextArea("Time intervals will be shown here");
    JButton b1, start, b2, b3;
    Timer tim;
    JSlider js1;
    JLabel text1= new JLabel("Collect points by clicking on the image!");
    JLabel text2= new JLabel("Once you collect 10 points, Click on Back To Map to play other games!!!");
    int limit = 0;
    int delay = 0;
    int x = 500;
    int y = 550;
    int score = 0;
    int i;
    ImageIcon originalSize = new ImageIcon("images/" + "ayyycoffee" + ".jpg");          //TH3
    ImageIcon originalSize2 = new ImageIcon("images/" + "nooocoffee" + ".jpg");
    
    ImageIcon originalSize3 = new ImageIcon("images/" + "fb1" + ".jpg");                //TH1
    ImageIcon originalSize4 = new ImageIcon("images/" + "fb2" + ".jpg");
    
    ImageIcon originalSize5 = new ImageIcon("images/" + "ps1" + ".jpg");                   //TH2
    ImageIcon originalSize6 = new ImageIcon("images/" + "ps2" + ".jpg");

    ImageIcon newsize = new ImageIcon(((originalSize).getImage()).getScaledInstance(100, 75, java.awt.Image.SCALE_SMOOTH));
    ImageIcon newsize2 = new ImageIcon(((originalSize2).getImage()).getScaledInstance(100, 75, java.awt.Image.SCALE_SMOOTH));
    
    ImageIcon newsize3 = new ImageIcon(((originalSize3).getImage()).getScaledInstance(100, 75, java.awt.Image.SCALE_SMOOTH));
    ImageIcon newsize4 = new ImageIcon(((originalSize4).getImage()).getScaledInstance(100, 75, java.awt.Image.SCALE_SMOOTH));
    
    ImageIcon newsize5 = new ImageIcon(((originalSize5).getImage()).getScaledInstance(100, 75, java.awt.Image.SCALE_SMOOTH));
    ImageIcon newsize6 = new ImageIcon(((originalSize6).getImage()).getScaledInstance(100, 75, java.awt.Image.SCALE_SMOOTH));
    //////////////////////////////////////////////////////////////// 
    public myJPanel10 (myJPanel4 a, myJPanel3 b) 
    {
        setLayout(null);
        mjp4 = a;
        mjp3 = b;

      //  setBackground(Color.GRAY);
      
      
        BTM4 = new JButton ("Back To Map");
        BTM4.setBackground(Color.white);
        BTM4.setBounds(600,0,150,40);
        add(BTM4);
        
        add(text1);
        text1.setBounds(new Rectangle(30, 30, 350, 30));
        
        add(text2);
        text2.setBounds(new Rectangle(30,50,450,30));
        
        //////////////////////////////////////////////////////////////////////////////////////////
        b1 = new JButton("click me");
        start = new JButton("start");
        b2 = new JButton("time");
        b3 = new JButton("score");

        b1.addActionListener(this);

        add(b1);
        start.addActionListener(this);
        add(start);
        b2.addActionListener(this);
        add(b2);
        b3.addActionListener(this);
        add(b3);

        add(message);

        b1.setBounds(new Rectangle(400, 550, 100, 75));
        b2.setBounds(new Rectangle(x, y, 100, 75));
        b3.setBounds(new Rectangle(600, 550, 100, 75));
        start.setBounds(new Rectangle(700, 550, 100, 75));
        js1 = new JSlider(JSlider.HORIZONTAL, 0, 15, 0);
        js1.setBorder(BorderFactory.createTitledBorder("Faster"));
        js1.setMajorTickSpacing(5);
        js1.setPaintTicks(true);
        js1.setPaintLabels(true);
        js1.setBounds(800, 550, 100, 75);
        add(js1);

//------TIMER -------------------------------------------
        delay = 1000; //milliseconds
        tim = new Timer(delay, this);// the word 'this' here means that the action listener
        // that the timer needs is this very same class 'myJPanelTimer
        // This way the action performed method is called every time the timer ticks. 		
//------TIMER -------------------------------------------


///////////////////////////////////////////////////////////////////////////////////////////////////////////
        
       
       
    }

    
    


public ImageIcon img() 
{
        ImageIcon result = new ImageIcon("images/" + ".jpg");
        return result;
    }

//-------------------------------------------------------------------
// actionPerformed
    public void actionPerformed(ActionEvent event)
    {

        Object obj = event.getSource();
        String choice = event.getActionCommand();
        if (obj == start) {
            tim.start();
        }
        //if (obj == b1){tim.start();}
        if (obj == b1) {
            score = score + 1;
            b3.setText("Score: " + score);
            

        }
        if (obj == b2) {
            int delayfast = tim.getDelay();
            delayfast = (int) ((float) delayfast * (.9f));
            tim.setDelay(delayfast);
        }
        if (obj == b3)
        {

            //int delayfast = tim.getDelay();
            //delayfast = (int) ( (float)delayfast *(1.1f) );
            //tim.setDelay(delayfast);
        }
        
         if ( score==10)
        {
            mjp4.mjpt.remove(this);
            mjp4.mjpt.add(mjp4);
            mjp4.mjpt.validate();
            mjp4.mjpt.repaint();
            score = 0;
            b3.setText("Score: " + score);
        }
//============================================================		
// every tick of the timer clock will call --> x and y generator 
        if (obj == tim) {
            i = i + 1;
            b2.setText("time: " + i);

            Random rand = new Random();
          //  int x = rand.nextInt(580) + 1;
          //  int y = rand.nextInt(350) + 1;
            int x = rand.nextInt(1300) + 1;
            int y = rand.nextInt(600) + 1;
            b1.setBounds(new Rectangle(x, y, 100, 75));
        }

        if (mjp3.th ==3)
        {
         if (obj == b1)
          {

            if (b1.getIcon() == newsize2)
            {
                b1.setIcon(newsize);
              //  System.out.println( newsize);
             }
            else 
            {
               b1.setIcon(newsize2);
            }

          }
        }
        
        if (mjp3.th ==2)
        {
         if (obj == b1)
          {
            if (b1.getIcon() == newsize4)
            {
                b1.setIcon(newsize3);
             }
            else 
            {
               b1.setIcon(newsize4);
            }

          }
        }
        if (mjp3.th ==1)
        {
         if (obj == b1)
          {
            if (b1.getIcon() == newsize6)
            {
                b1.setIcon(newsize5);
             }
            else 
            {
               b1.setIcon(newsize6);
            }

          }
        }
    }

    //@Override
    public void changed(ObservableValue observable, Object oldValue, Object newValue)
    {
        Object obj = observable.getValue();

        if (obj == js1) {
            int count = js1.getValue();
            if (js1.getValueIsAdjusting()) 
            {
                int delay = js1.getValue();
                delay = (int) ((float) delay * (10f));

                tim.setDelay(delay);
                

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