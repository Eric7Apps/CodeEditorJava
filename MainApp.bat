// Copyright Eric Chauvin 2018.
// My blog is at:
// ericsourcecode.blogspot.com



// Javac:
// https://docs.oracle.com/javase/7/docs/technotes/tools/windows/javac.html

// Swing Tutorial:
// https://docs.oracle.com/javase/tutorial/uiswing/index.html

// Frames tutorial and other tutorials:
// https://docs.oracle.com/javase/tutorial/uiswing/components/frame.html


// Getting Started with Swing

// Using Swing Components
//    tells you how to use each of the Swing components


// "If you would like to incorporate JavaFX into your
// Swing application, please see Integrating JavaFX
// into Swing Applications."


///////////////////////////////
// javax.media.j3d.Canvas3D
//////////////////////////////


import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;


public class MainApp implements Runnable
  {

  // For the Runnable interface:
  @Override
  public void run()
    {
    // Create the window
    JFrame MFrame = new JFrame( "Code Editor" );

    MFrame.setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE );
    MFrame.setLayout( new FlowLayout() );
    MFrame.add( new JLabel( "Code Editor" ));
    MFrame.add( new JButton( "For App" ) );

    // MFrame.setSize()

    // Set the frame icon to an image loaded from a
    // file.
    // MFrame.setIconImage(new ImageIcon(imgURL).getImage());

    MFrame.pack();

    // Center it.
    MFrame.setLocationRelativeTo( null );

    MFrame.setVisible( true );
    }



  public static void main( String[] args )
    {
    // A static method in this class is creating
    // an instance of this class.
    MainApp MApp = new MainApp();

    // In the event queue.
    SwingUtilities.invokeLater( MApp );
    }



  }
  
