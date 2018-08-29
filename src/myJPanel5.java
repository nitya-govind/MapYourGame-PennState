import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class myJPanel5 extends JPanel implements ActionListener //CREDITS
{
        myJPanel1 mjp1;
        myJPanel2 mjp2;
        myJPanel3 mjp3;
        myJPanel4 mjp4;
        myJPanel6 mjp6;
        JButton BTH5;
	public myJPanel5(myJPanel1 a, myJPanel2 b, myJPanel3 c, myJPanel4 d, myJPanel6 e)
	{
                mjp1 = a;     //Characters (HIDDEN)
                mjp2 = b;
                mjp3 = c;
                mjp4 = d;
                mjp6 = e;
                BTH5 = new JButton ("Back To Home Page");
                BTH5.setBackground(Color.white);
                add(BTH5);
		setBackground(Color.blue);
		JTextField jf = new JTextField("Game Creaters: Nitya, Michala, Shambhavi");
		add(jf);
	}

    @Override
    public void actionPerformed(ActionEvent ae) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
