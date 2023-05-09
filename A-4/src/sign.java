import javax.swing.*;
import java.awt.*;

public class sign extends JLabel {
    private ImageIcon imageIcon;
    private Image image;

    sign() {
        // sizes and sets up image for the points sign Label
        imageIcon = new ImageIcon("sign.png");
        image = imageIcon.getImage();
        imageIcon = new ImageIcon(image.getScaledInstance(250, 110, java.awt.Image.SCALE_SMOOTH));
        this.setIcon(imageIcon);
        this.setLocation(1000, 200);
        this.setSize(250, 110);
    }

}
