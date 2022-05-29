import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import java.awt.Desktop;

public class LinkOpener extends JFrame
{
    static JButton appleDev_Button; // declare globally relative to "main" so actionPerformed() can access var
    static JButton blackBoard_Button; // declare globally relative to "main" so actionPerformed() can access var
    static JButton gitHub_Button; // declare globally relative to "main" so actionPerformed() can access var
    static JButton linkedInButton; // declare globally relative to "main" so actionPerformed() can access var
    static JButton myCSUEB_Button; // declare globally relative to "main" so actionPerformed() can access var
    
    public static void main(String[] args)
    {
        appleDev_Button = new JButton(); // MyCSUEB Button
        appleDev_Button.setBounds(233, 50, 134, 25);
        appleDev_Button.setText("Apple Developer");
        appleDev_Button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                try
                {
                    Desktop desktop = java.awt.Desktop.getDesktop();
                    URI oURL = new URI("https://developer.apple.com/");
                    desktop.browse(oURL);
                }
                catch (Exception r)
                {
                    r.printStackTrace();
                }
            }
        });
        
        blackBoard_Button = new JButton(); // MyCSUEB Button
        blackBoard_Button.setBounds(250, 75, 100, 25);
        blackBoard_Button.setText("Blackboard");
        blackBoard_Button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                try
                {
                    Desktop desktop = java.awt.Desktop.getDesktop();
                    URI oURL = new URI("https://bb.csueastbay.edu/");
                    desktop.browse(oURL);
                }
                catch (Exception r)
                {
                    r.printStackTrace();
                }
            }
        });

        gitHub_Button = new JButton(); // MyCSUEB Button
        gitHub_Button.setBounds(250, 100, 100, 25);
        gitHub_Button.setText("GitHub");
        gitHub_Button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                try
                {
                    Desktop desktop = java.awt.Desktop.getDesktop();
                    URI oURL = new URI("https://github.com/login");
                    desktop.browse(oURL);
                }
                catch (Exception r)
                {
                    r.printStackTrace();
                }
            }
        });

        linkedInButton = new JButton(); // LinkedIn Button
        linkedInButton.setBounds(250, 125, 100, 25); // formula self-discovered: to place in middle: (frame width size / 2) - (button width / 2)
        linkedInButton.setText("LinkedIn");
        linkedInButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                try
                {
                    Desktop desktop = java.awt.Desktop.getDesktop();
                    URI oURL = new URI("https://www.linkedin.com");
                    desktop.browse(oURL);
                }
                catch (Exception r)
                {
                    r.printStackTrace();
                }
            }
        });

        myCSUEB_Button = new JButton(); // MyCSUEB Button
        myCSUEB_Button.setBounds(250, 150, 100, 25);
        myCSUEB_Button.setText("MyCSUEB");
        myCSUEB_Button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                try
                {
                    Desktop desktop = java.awt.Desktop.getDesktop();
                    URI oURL = new URI("https://www.csueastbay.edu/mycsueb/");
                    desktop.browse(oURL);
                }
                catch (Exception r)
                {
                    r.printStackTrace();
                }
            }
        });

        JFrame frame = new JFrame();
        frame.setTitle("Link Opener");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.add(appleDev_Button);
        frame.add(blackBoard_Button);
        frame.add(gitHub_Button);
        frame.add(linkedInButton);
        frame.add(myCSUEB_Button);
        frame.setSize(600, 400);
        frame.setVisible(true);
    }
}