// Copyright Eric Chauvin 2018.
// My blog is at:
// ericsourcecode.blogspot.com


// Menus:
// https://docs.oracle.com/javase/tutorial/uiswing/components/menu.html


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
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.KeyStroke;
import java.awt.Font;
import java.awt.Color;



public class MainApp implements Runnable
  {
  public static final String VersionDate = "4/18/2018";

  // https://docs.oracle.com/javase/7/docs/api/javax/swing/JMenuBar.html
  private JMenuBar menuBar;
  private JMenu menu;
  private JMenu submenu;
  private JMenuItem menuItem;



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

    // Container c = JFrame.getContentPane();
    // c.setBackground(Color.red);
    MFrame.getContentPane().setBackground( Color.red );
    MFrame.getContentPane().setForeground( Color.white );


    menuBar = new JMenuBar();
    menuBar.setBackground( Color.black );

    menu = new JMenu( "A Menu" );
    menu.setMnemonic( KeyEvent.VK_A );
    // Font  f1  = new Font( Font.SERIF, Font.PLAIN, 50 );
    Font  f1  = new Font( Font.MONOSPACED, Font.PLAIN, 50 );

    menu.setFont( f1 );
    menu.setForeground( Color.white );


    menuBar.add( menu );

    menuItem = new JMenuItem( "A text-only menu item",
                         KeyEvent.VK_T);
    menuItem.setAccelerator( KeyStroke.getKeyStroke(
        KeyEvent.VK_1, ActionEvent.ALT_MASK ));
    menu.add( menuItem );

    menuItem = new JMenuItem( "Second one." );
    menuItem.setMnemonic( KeyEvent.VK_B );
    menu.add( menuItem );

    // menu.addSeparator();

    menu.addSeparator();
    submenu = new JMenu( "A submenu" );
    submenu.setMnemonic(KeyEvent.VK_S);

    menuItem = new JMenuItem("An item in the submenu");
    menuItem.setAccelerator(KeyStroke.getKeyStroke(
        KeyEvent.VK_2, ActionEvent.ALT_MASK));
    submenu.add(menuItem);

    menuItem = new JMenuItem("Another item");
    submenu.add(menuItem);
    menu.add(submenu);

    menu = new JMenu("Another Menu");
    menu.setMnemonic(KeyEvent.VK_N);
    menuBar.add(menu);


    MFrame.setJMenuBar( menuBar );




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
  
