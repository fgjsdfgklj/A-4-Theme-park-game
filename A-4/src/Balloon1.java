import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;



public class Balloon1 extends JLabel {

    private int balloonLocationX;
    private int balloonLocationY;
    private ImageIcon imageIcon;
    private Image image;

    Balloon1() {
        // sizes and sets up image for Balloon Label
        imageIcon = new ImageIcon("crosshair.png");
        image = imageIcon.getImage();
        imageIcon = new ImageIcon(image.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH));
        //setting Balloon label
        this.setIcon(imageIcon);
        this.setLocation(balloonLocationX, balloonLocationY);
        this.setSize(100, 100);
        //checking if its clicked
        this.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent e) {
               PointsLabel.points++;
                System.out.println(PointsLabel.points);
//what!??!?!
//Points.updateText();
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
        start();
    }


    public void start() {
        //adds the balloon when the game first starts in random spot
       addBalloon();
    }



    public void addBalloon() {
        //random x and y coordinates for next spawn point between those min and max values
        balloonLocationX = (int) (Math.random() * ((900-250) +1) + 250);
        balloonLocationY = (int) (Math.random() * ((800-100) +1) + 100);
        this.setLocation(balloonLocationX, balloonLocationY);
    }
}
