import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Window;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Window;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;

public class MyFrame extends JFrame {
	
	  public ArrayList<JPanel> makeGridComponents(ArrayList<JPanel> components) {

		  for ( int i = 0; i < 9; i++ )
		  {
			  JPanel temp = new JPanel();
			  temp.setSize( 300, 300 );
			  components.add( temp );
		  }
		  return components;
	  }
	  

	  public Container makeGridContainer(Container container, MyFrame grid) {
		  JPanel temp = null;
		  container = grid.getContentPane();
		  for ( int i = 0; i < 9; i++ )
		  {
			  temp = new JPanel();
			  temp.setSize( 300, 300 );
			  container.add(temp);
		  }
		  
		  return container;
		  
	  }
}
