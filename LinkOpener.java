import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import java.awt.Desktop;

public class LinkOpener extends JFrame //implements ActionListener
{

    static JButton linkedInButton; // declare globally relative to "main" so actionPerformed() can access var
    static JButton myCSUEB_Button;
    
    public static void main(String[] args)
    {
        linkedInButton = new JButton(); // LinkedIn Button
        linkedInButton.setBounds(250, 100, 100, 25); // formula self-discovered: to place in middle: (frame width size / 2) - (button width / 2)
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
        myCSUEB_Button.setBounds(250, 125, 100, 25);
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
        frame.add(linkedInButton);
        frame.add(myCSUEB_Button);
        frame.setSize(600, 400);
        frame.setVisible(true);
    }
}