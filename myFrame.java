import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Window;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;

public class MyFrame extends JFrame {
  public static void main ( String [] args ) {
	  MyFrame grid = new MyFrame();
	  grid.setSize(300,300);
      grid.setResizable( false );
      grid.setLocationRelativeTo( null );
      grid.setLayout( new GridLayout(5,5) );
      
      Container container = grid.getContentPane();
      ArrayList < JPanel > components = new ArrayList < JPanel >();
      JPanel temp = null;

      // Populating Arraylist object.
      for ( int i = 0; i < 25; i++ )
      {
          temp = new JPanel();
          temp.setSize( 60, 60 );
          components.add( temp );
          container.add(temp);
      }

      grid.setVisible( true );
      components.get( 0 ).setBackground( Color.BLACK );
      components.get( 1 ).setBackground( Color.CYAN );
      components.get( 2 ).setBackground( Color.DARK_GRAY );
      components.get( 3 ).setBackground( Color.GRAY );
      components.get( 4 ).setBackground( Color.LIGHT_GRAY );
      components.get( 5 ).setBackground( Color.BLUE );
      components.get( 6 ).setBackground( Color.MAGENTA );
      components.get( 7 ).setBackground( Color.ORANGE );
      components.get( 8 ).setBackground( Color.GREEN );
  }
}
