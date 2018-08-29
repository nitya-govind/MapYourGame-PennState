import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.beans.*;
public class myJPanel2 extends JPanel implements ActionListener//THIS IS INSTRUCTIONS PAGE
{
        myJPanel1 mjp1;
        myJPanel3 mjp3;
        myJPanel4 mjp4;
        myJPanel5 mjp5;
        myJPanel6 mjp6;
        JButton BackToHome;
        XML_240 x2;
	public myJPanel2(myJPanel1 a, myJPanel3 b, myJPanel4 c, myJPanel5 d, myJPanel6 e)
	{
                mjp1 = a;     //Characters (HIDDEN)
                mjp3 = b;
                mjp4 = c;
                mjp5 = d;
                mjp6 = e;
		setBackground(Color.yellow);
		BackToHome = new JButton ("Back To Home Page");
                BackToHome.setBackground(Color.white);
                add(BackToHome);
                
        
        JLabel b1 = new JLabel("Welcome to the Navigation Game!");
        add(b1);
//=====================================
        x2 = new XML_240(); // creates the 240 class that reads and writes XML
//=====================================
        String s1 = "James Franklin, Nittany Lion, President Barron";
        String s2 = "Penn State, Football, State College";
      //  int num = 1855;
        x2.openWriterXML("XML_test.xml");
        x2.writeObject(s1);
        x2.writeObject(s2);
      //  x2.writeObject(num);
        x2.closeWriterXML();
        //these statements above just open an xml file, wrote 3 lines in the file, close it.
        //open the xml file outside Netbeans and check the contents        
                
                JLabel b5 = new JLabel("The motive of the game is to collect as many points possible."
                        + " You need to pick one character and theme ahead to play the game.");
        add(b5);
//=====================================
        x2 = new XML_240(); // creates the 240 class that reads and writes XML
//=====================================
        String s3 = "";
        String s4 = "";
        int num1 = 0;
        x2.openReaderXML("XML_test.xml");
        s1 = (String) x2.ReadObject();
        s2 = (String) x2.ReadObject();
     //   num = (Integer) x2.ReadObject();
        x2.closeReaderXML();
        //these statements above just open an xml file, read 3 lines in the file, then close it.
        //it is reading the XML file
        JButton b2 = new JButton("The three characters are: " + s1);
        add(b2);
        JButton b3 = new JButton("The three themes are: " + s2);
        add(b3);
    //    JButton b4 = new JButton("contents of num = " + num);
    //    add(b4);
	}

    @Override
    public void actionPerformed(ActionEvent ae) {
        
    }
}
