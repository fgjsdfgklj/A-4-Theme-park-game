import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class App {
    private JFrame frame;
    private JLabel backgroundOne;
    private ImageIcon icon;

    public App() {

        icon = new ImageIcon(this.getClass().getResource("theme park background(1).png"));
        backgroundOne = new JLabel(icon);
        backgroundOne.setSize(1920,1080);

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
