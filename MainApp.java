// Copyright Eric Chauvin 2018.


// Layout managers
// https://docs.oracle.com/javase/tutorial/uiswing/layout/index.html




// Text Area:
// https://docs.oracle.com/javase/tutorial/uiswing/components/textarea.html




// https://docs.oracle.com/javase/tutorial/uiswing/components/tabbedpane.html


// Swing Tutorial:
// https://docs.oracle.com/javase/tutorial/uiswing/index.html


// Menus:
// https://docs.oracle.com/javase/tutorial/uiswing/components/menu.html


// Javac:
// https://docs.oracle.com/javase/7/docs/technotes/tools/windows/javac.html

// Frames tutorial and other tutorials:
// https://docs.oracle.com/javase/tutorial/uiswing/components/frame.html





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
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;



public class MainApp implements Runnable
  {
  public static final String VersionDate = "11/15/2018";
  public JTabbedPane TabbedPane;
  public JFrame MainFrame;



  public static void main( String[] args )
    {
    // A static method in this class is creating
    // an instance of this class.
    MainApp MApp = new MainApp();

    // In the event queue.
    SwingUtilities.invokeLater( MApp );
    }



  // For the Runnable interface:
  @Override
  public void run()
    {
    SetupMainFrame();
    SetupMenus();
    AddTextPane();
    }



  public void AddTextPane()
    {
    // tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);

    JTextArea TextArea1 = new JTextArea();
    Font  F1  = new Font( Font.MONOSPACED, Font.PLAIN, 50 );
    TextArea1.setFont( F1 );
    TextArea1.setLineWrap( true );
    TextArea1.setWrapStyleWord( true );
    // TextArea1.setBackground( Color.black );
    // TextArea1.setForeground( Color.white );

    JScrollPane ScrollPane1 = new JScrollPane( TextArea1 );

    ScrollPane1.setVerticalScrollBarPolicy(
             JScrollPane.VERTICAL_SCROLLBAR_ALWAYS );

    TabbedPane.addTab( "Text 1", null, ScrollPane1,
                      "Tool tip text for 1" );
    }




  public void SetupMainFrame()
    {
    MainFrame = new JFrame( "Code Editor" );
    MainFrame.setDefaultCloseOperation(
                     WindowConstants.EXIT_ON_CLOSE );
    MainFrame.setLayout( new FlowLayout() );

    // MainFrame.add( new JLabel( "Code Editor" ));
    // MainFrame.add( new JButton( "For App" ) );

    TabbedPane = new JTabbedPane();
    MainFrame.add( TabbedPane );


    // Container c = JFrame.getContentPane();
    // c.setBackground(Color.red);
    MainFrame.getContentPane().setBackground( Color.red );
    MainFrame.getContentPane().setForeground( Color.white );

    // MainFrame.setSize()

    // Set the frame icon to an image loaded from a
    // file.
    // MFrame.setIconImage(new ImageIcon(imgURL).getImage());

    // MainFrame.pack();

    // Center it.
    // MainFrame.setLocationRelativeTo( null );

    MainFrame.setExtendedState( JFrame.MAXIMIZED_BOTH );
    MainFrame.setVisible( true );
    }



  private void SetupMenus()
    {
    JMenuBar menuBar = new JMenuBar();
    menuBar.setBackground( Color.black );

    JMenu menu = new JMenu( "A Menu" );
    menu.setMnemonic( KeyEvent.VK_A );
    // Font  f1  = new Font( Font.SERIF, Font.PLAIN, 50 );
    Font  f1  = new Font( Font.MONOSPACED, Font.PLAIN, 50 );

    menu.setFont( f1 );
    menu.setForeground( Color.white );

    menuBar.add( menu );

    JMenuItem menuItem = new JMenuItem( "A text-only menu item",
                         KeyEvent.VK_T);
    menuItem.setAccelerator( KeyStroke.getKeyStroke(
        KeyEvent.VK_1, ActionEvent.ALT_MASK ));
    menu.add( menuItem );

    menuItem = new JMenuItem( "Second one." );
    menuItem.setMnemonic( KeyEvent.VK_B );
    menu.add( menuItem );

    menu.addSeparator();

    JMenu submenu = new JMenu( "A submenu" );
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

    // System.exit( 0 );

    MainFrame.setJMenuBar( menuBar );
    }




  }
