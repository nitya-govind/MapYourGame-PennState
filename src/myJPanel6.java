
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nqg5169
 */
public class myJPanel6 extends JPanel { //THIS IS GAME OVER
        myJPanel1 mjp1;
        myJPanel2 mjp2;
        myJPanel3 mjp3;
        myJPanel4 mjp4;
        myJPanel5 mjp5;
    public myJPanel6(myJPanel1 a, myJPanel2 b, myJPanel3 c, myJPanel4 d, myJPanel5 e)
	{
                mjp1 = a;     //Characters (HIDDEN)
                mjp2 = b;
                mjp3 = c;
                mjp4 = d;
                mjp5 = e;
		setBackground(Color.blue);
		JTextField jf = new JTextField("Final Results");
		add(jf);
	}
}
