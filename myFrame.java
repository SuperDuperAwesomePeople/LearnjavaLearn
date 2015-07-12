import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Window;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;

public class MyFrame extends JFrame {
	  public makeGrid() {
		  MyFrame grid = new MyFrame();
		  grid.setSize(900,900);
		  grid.setResizable( false );
		  grid.setLocationRelativeTo( null );
		  grid.setLayout( new GridLayout(3,3) );
      
		  Container container = grid.getContentPane();
		  ArrayList < JPanel > components = new ArrayList < JPanel >();
		  JPanel temp = null;

		  // Populating Arraylist object.
		  for ( int i = 0; i < 9; i++ )
		  {
			  temp = new JPanel();
			  temp.setSize( 300, 300 );
			  components.add( temp );
			  container.add(temp);
		  }
		  
		  return container;
		  return components;
		  
		  grid.setVisible( true );
		  components.get( 4 ).setBackground( Color.GREEN );
	  }
}
