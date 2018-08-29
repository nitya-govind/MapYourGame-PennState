import java.awt.*;
import javax.swing.*;

public class myJFrame extends JFrame
{
	myJTabbedPane mjp;
	public myJFrame ()
	{
		super ("My First Frame");
    	mjp = new myJTabbedPane();
		getContentPane().add(mjp,"Center");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize (1449, 680);
		setVisible(true);
	}
}
