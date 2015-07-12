import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Window;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
  public static void main ( String [] args ) {
	  MyFrame grid = new MyFrame();
      grid.setSize( 300, 300 );
      grid.setResizable( false );
      grid.setLocationRelativeTo( null );
      grid.setLayout( new GridLayout(3,3) );
  }
}
