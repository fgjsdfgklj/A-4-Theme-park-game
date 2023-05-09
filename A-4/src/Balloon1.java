import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Balloon1 extends JLabel {

    private int balloonLocationX;
    private int balloonLocationY;
    private ImageIcon imageIcon;
    private ImageIcon imageIcon2;
    private ImageIcon imageIcon3;
    private Image image;
    private Image image2;
    private Image image3;
    private int random;
    private int value = 1;

    Balloon1() {
        // sizes and sets up image for redBalloon Label
        imageIcon = new ImageIcon("redBalloon.png");
        image = imageIcon.getImage();
        imageIcon = new ImageIcon(image.getScaledInstance(100, 110, java.awt.Image.SCALE_SMOOTH));
        // sizes and sets up image for blueBalloon Label
        imageIcon2 = new ImageIcon("blueBalloon.png");
        image2 = imageIcon2.getImage();
        imageIcon2 = new ImageIcon(image2.getScaledInstance(100, 110, java.awt.Image.SCALE_SMOOTH));
        // sizes and sets up image for purpleBalloon Label
        imageIcon3 = new ImageIcon("purpleBalloon.png");
        image3 = imageIcon3.getImage();
        imageIcon3 = new ImageIcon(image3.getScaledInstance(100, 110, java.awt.Image.SCALE_SMOOTH));
        // setting Balloon label
        this.setIcon(imageIcon);
        this.setLocation(balloonLocationX, balloonLocationY);
        this.setSize(100, 110);
        // checking if its clicked
        this.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                PointsLabel.points+= value;
                System.out.println(PointsLabel.points);
                // what!??!?!
                // Points.updateText();
                addBalloon();

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        addBalloon();
    }

    public void addBalloon() {
        // random x and y coordinates for next spawn point between those min and max
        // values
        balloonLocationX = (int) (Math.random() * ((900 - 250) + 1) + 250);
        balloonLocationY = (int) (Math.random() * ((800 - 100) + 1) + 100);
        this.setLocation(balloonLocationX, balloonLocationY);
        //gets a random number and if its a certain size it changes the image of the Balloon
        random = (int) (Math.random() * 100);
        if (random <= 70) {
            this.setIcon(imageIcon);
            value = 1;
        } else if (random > 70 && random < 85) {
            this.setIcon(imageIcon2);
            value = 3;
        } else if (random > 85 && random < 90) {
            this.setIcon(imageIcon3);
            value = 5;
        }
    }
}
