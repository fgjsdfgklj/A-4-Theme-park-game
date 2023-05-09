import javax.swing.*;
import java.awt.*;


public class GameLabel extends JLabel {
    private ImageIcon imageIcon;
    private Image image;
GameLabel() {
    // sizes and sets up image for backgroundOne Label
    imageIcon = new ImageIcon("theme park background(1).png");
    image = imageIcon.getImage();
    imageIcon = new ImageIcon(image.getScaledInstance(1280, 1024, java.awt.Image.SCALE_SMOOTH));
    //setting background
    this.setIcon(imageIcon);
    this.setLocation(0, 0);
    this.setSize(1280, 1024);
}


}



