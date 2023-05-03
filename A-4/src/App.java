import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class App {
    private JFrame frame;
    private JLabel backgroundOne;
    private ImageIcon imageIcon;
    private Image image;

    public App() {

        // sizes and sets up image for backgroundOne Label
        imageIcon = new ImageIcon("theme park background(1).png");
        image = imageIcon.getImage();
        imageIcon = new ImageIcon(image.getScaledInstance(1280, 1024, java.awt.Image.SCALE_SMOOTH));
        backgroundOne = new JLabel();
        backgroundOne.setIcon(imageIcon);
        backgroundOne.setLocation(0, 0);
        backgroundOne.setSize(1920, 1080);
        // adds frame and its values
        frame = new JFrame();
        frame.add(backgroundOne);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Balloon Pop");
        frame.setSize(1920, 1080);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    public static void main(String[] args) throws Exception {
        new App();

    }
}
