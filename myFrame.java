import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Window;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;

public class MyFrame extends JFrame {
	
	  public ArrayList<JPanel> makeGridComponents(ArrayList<JPanel> components, JPanel temp) {

		  temp.setSize( 300, 300 );
		  for ( int i = 0; i < 9; i++ )
		  {
			  components.add(temp);
		  }
		  return components;
	  }
	  

	  public Container makeGridContainer(Container container, JPanel temp) {
		  
		  temp.setSize( 300, 300 );;
		  for ( int i = 0; i < 9; i++ )
		  {
			  container.add(temp);
		  }
		  
		  return container;
		  
	  }
}
