import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class myJPanel3 extends JPanel implements ActionListener //THIS IS THE MAP/ START GAME
{
        //JButton b1;
    //myJPanel3 mjp3;
        myJPanel4 mjp4;
        myJPanel1 mjp1;
        myJPanel2 mjp2;
        myJPanel5 mjp5;
        myJPanel6 mjp6;
        JButton BTH3, LP;
        JLabel jl1, jl2;
        JRadioButton jrb1, jrb2, jrb3;
        JRadioButton th1, th2, th3;
        int ch;
        int th;
        
        ImageIcon sourceImage1 = new ImageIcon("images/Franklin.jpg");
        ImageIcon newsize1 = new ImageIcon (((sourceImage1).getImage()).getScaledInstance(150, 80, java.awt.Image.SCALE_SMOOTH));
        //Image myImage1 = sourceImage1.getImage();

        ImageIcon sourceImage2  = new ImageIcon("images/Lion.jpg");
        ImageIcon newsize2 = new ImageIcon (((sourceImage2).getImage()).getScaledInstance(150, 80, java.awt.Image.SCALE_SMOOTH));
        //Image myImage2 = sourceImage2.getImage();

        ImageIcon sourceImage3 = new ImageIcon("images/Barron.jpg");
        ImageIcon newsize3 = new ImageIcon (((sourceImage3).getImage()).getScaledInstance(150, 80, java.awt.Image.SCALE_SMOOTH));
        //Image myImage3 = sourceImage3.getImage();
	public myJPanel3 (myJPanel4 a, myJPanel1 b, myJPanel2 c, myJPanel5 d, myJPanel6 e)
	{       
                //super();
		
		//b1 = new JButton("jhhdjdyour life!!!!");
		//add(b1);
		//JTextField jf = new JTextField("I'm a TextField and I belong to Panel 3..........");
		//add(jf);
               
                setLayout(null);
                mjp4 = a;     //Characters (HIDDEN)
                mjp1 = b;
                mjp2 = c;
                mjp5 = d;
                mjp6 = e;
                setBackground(Color.blue);
                BTH3 = new JButton ("Back To Home Page");
                BTH3.setBackground(Color.white);
                add(BTH3);
                BTH3.setBounds(200, 0, 150, 30);
                
                LP = new JButton("Let's Play");
                LP.setBackground(Color.WHITE);
                add(LP);
                LP.setBounds(1049, 0, 150, 30);
                
                jl1 = new JLabel("Choose a Theme");
                jl1.setFont(new Font("Serif", Font.PLAIN, 24));
                jl1.setForeground(Color.WHITE);
                
                jl2 = new JLabel("Choose a Character");
                jl2.setFont(new Font("Serif", Font.PLAIN, 24));
                jl2.setForeground(Color.WHITE);
                
                jrb1 = new JRadioButton("James Franklin");
                jrb2 = new JRadioButton("Nittany Lion");
                jrb3 = new JRadioButton("President Barron");
                th1 = new JRadioButton("Penn State");
                th2 = new JRadioButton("Football");
                th3 = new JRadioButton("State College");
                
                ButtonGroup group1 = new ButtonGroup();
                group1.add(jrb1);
                group1.add(jrb2);
                group1.add(jrb3);
                
//                th = 1;
//                ch = 1;
                th = 1;
                ch = 1;
                ButtonGroup group2 = new ButtonGroup();
                group2.add(th1);
                group2.add(th2);
                group2.add(th3);
        //-------------------------------------------------------	    
        // add components to JPanel		
        //-------------------------------------------------------	    
                add(jl1);
                add(jl2); 
                
                add(jrb1);
                add(jrb2);
                add(jrb3);
                
                add(th1);
                add(th2);
                add(th3);
                
                jl1.setBounds(624,50, 350, 100);
                jl2.setBounds(624, 200, 350, 100);
                
                jrb1.setBounds(449, 300, 150, 100);
                jrb2.setBounds(624, 300, 150, 100);
                jrb3.setBounds(799, 300, 150, 100);
              
                th1.setBounds(449, 120, 150, 100);
                th2.setBounds(624, 120, 150, 100);
                th3.setBounds(799, 120, 150, 100);
        
        //----------------------------------------------------------------
        // add eventListeners to the radiobutton		
        //-------------------------------------------------------	    
                jrb1.addActionListener(this);
                jrb2.addActionListener(this);
                jrb3.addActionListener(this);
                
                th1.addActionListener(this);
                th2.addActionListener(this);
                th3.addActionListener(this);
                
                LP.addActionListener(this);
                
                
              
            
                
             }

  

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        
         Object obj = ae.getSource();
         if (obj == jrb1 )
        {
            ch = 1;   
        }
         
         if (obj == jrb2)
        {
            ch = 2;
        }
        
        if (obj == jrb3)
        {
            ch = 3;
        }
   
        if (obj == th1)
        {
            
            th = 1;
        }
        
         if (obj == th2)
        {
            th = 2;
        }
        
        if (obj == th3)
        {
            th = 3;
        }
   
        //Choice to getImage
        if (ch == 1)
        {
       // ImageIcon sourceImage1 = new ImageIcon("images/Franklin.jpg");
       // ImageIcon newsize1 = new ImageIcon (((sourceImage1).getImage()).getScaledInstance(150, 80, java.awt.Image.SCALE_SMOOTH));
          mjp4.charac.setIcon(this.newsize1);
        }
        
        if (ch == 2)
        {
             mjp4.charac.setIcon(newsize2);
        }
        
        if (ch == 3)
        {
             mjp4.charac.setIcon(newsize3);
        }
        
            }
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  
    }
