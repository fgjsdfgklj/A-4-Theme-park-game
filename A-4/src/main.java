import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class main {
    private JFrame frame;
    private JLabel backgroundOne;
    private ImageIcon imageIcon;
    private Image image;

    public main() {

        // sizes and sets up image for backgroundOne Label
        imageIcon = new ImageIcon("theme park background(1).png");
        image = imageIcon.getImage();
        imageIcon = new ImageIcon(image.getScaledInstance(1280, 1024, java.awt.Image.SCALE_SMOOTH));
        // corsshair image import
        Image crosshairpng = Toolkit.getDefaultToolkit().getImage("crosshair.png");
        //setting background
        backgroundOne = new JLabel();
        backgroundOne.setIcon(imageIcon);
        backgroundOne.setLocation(0, 0);
        backgroundOne.setSize(1280, 1024);
        // adds frame and its values
        frame = new JFrame();
        frame.add(backgroundOne);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Balloon Pop");
        frame.setSize(1920, 1080);
        frame.setLayout(null);
        frame.setVisible(true);
        //set crosshair
        Point p = new Point(0, 0);
        Cursor crosshair = Toolkit.getDefaultToolkit().createCustomCursor(crosshairpng, p, "crosshair");
        backgroundOne.setCursor(crosshair);
    }

    public static void main(String[] args) throws Exception {
        new main();

    }
}
