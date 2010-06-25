
import java.awt.Graphics;
import java.awt.Image;
import java.util.List;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import org.apache.commons.collections.CollectionUtils;

import com.google.common.collect.Lists;


public class TestApplet extends JApplet {

    private static final long serialVersionUID = 5043065920751625426L;

    public void init() {
        //Execute a job on the event-dispatching thread; creating this applet's GUI.
        try {
            SwingUtilities.invokeAndWait(new Runnable() {
                public void run() {
                    Image image = getImage(getCodeBase(), "images/test.gif");
                    Icon icon = new ImageIcon(image);
                    
                    JButton button = new JButton(icon);
                    JLabel label = new JLabel("Welcome in Java Applet. V.2.0-RC01");
                    List<String> strings = Lists.newArrayList(); 
                    
                    JLabel label2 = new JLabel("Using 3 party libraries(guava-r03.jar,commons-collections-3.2.1.jar) in Applet");
                    JLabel label3 = new JLabel("Is collection empty: " + CollectionUtils.isEmpty(strings));
                    JLabel label4 = new JLabel("Факультет вычислительной техники и информатики (ФВТИ)");
                    JPanel panel = new JPanel();
                    
                    panel.add(button);
                    panel.add(label);
                    panel.add(label2);
                    panel.add(label3);
                    panel.add(label4);
                    
                    getContentPane().add(panel);
                    
                }
            });
        } catch (Exception e) {
            System.err.println("createGUI didn't complete successfully");
        }
    }

    
//    public void paint(Graphics g) {
//        g.drawString("Welcome in Java Applet. V.1.0-RC01", 40, 20);
//        List<String> strings = Lists.newArrayList(); 
//        
//        g.drawString("Using 3 party libraries(guava-r03.jar,commons-collections-3.2.1.jar) in Applet", 40, 40);
//        g.drawString("Is collection empty: " + CollectionUtils.isEmpty(strings), 40, 60);
//        g.drawString("Факультет вычислительной техники и информатики (ФВТИ)", 40, 80);
//        
//    }

}
