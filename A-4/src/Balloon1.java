import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Timer;
import java.util.TimerTask;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class Balloon1 extends JLabel {
    // adding all of the variables
    public static Component pointlabel;
    private int balloonLocationX;
    private int balloonLocationY;
    private ImageIcon imageIcon;
    private ImageIcon imageIcon2;
    private ImageIcon imageIcon3;
    private ImageIcon imageIcon4;
    private Image image;
    private Image image2;
    private Image image3;
    private Image image4;
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
        // sizes and sets up image for deathBalloon Label
        imageIcon4 = new ImageIcon("deathBalloon.png");
        image4 = imageIcon4.getImage();
        imageIcon4 = new ImageIcon(image4.getScaledInstance(100, 110, java.awt.Image.SCALE_SMOOTH));
        // setting Balloon label
        this.setIcon(imageIcon);
        this.setLocation(balloonLocationX, balloonLocationY);
        this.setSize(100, 110);
        // checking if its clicked if so it sends the value of the balloon clicked to
        // pointLabel to add to the counter and then calls the addBalloon method to add
        // another balloon
        this.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                Game.pointLabel.updatePoints(value);
                playMusic();
                addBalloon();

            }

            // checking if its pressed instead of just clicked in case the player holds down
            // on the mouse when clicked the balloons(does the same thing as if clicked)
            @Override
            public void mousePressed(MouseEvent e) {
                Game.pointLabel.updatePoints(value);
                playMusic();
                addBalloon();
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
        // sets Balloon at start of game to a random spot
        addBalloon();
    }

    public void addBalloon() {
        // random x and y coordinates for next spawn point between those min and max
        // values
        balloonLocationX = (int) (Math.random() * ((900 - 250) + 1) + 250);
        balloonLocationY = (int) (Math.random() * ((800 - 100) + 1) + 100);
        this.setLocation(balloonLocationX, balloonLocationY);
        // gets a random number and if its a certain size it changes the image of the
        // balloon and its also sets the value of the balloon based on the image set
        random = (int) (Math.random() * 100);
        if (random <= 70) {
            this.setIcon(imageIcon);
            value = 1;
        } else if (random > 70 && random <= 85) {
            this.setIcon(imageIcon2);
            value = 3;
        } else if (random > 85 && random <= 90) {
            this.setIcon(imageIcon3);
            value = 5;
        } else if (random > 90 && random <= 100) {
            this.setIcon(imageIcon4);
            value = -10;
            // timer is set for 3 seconds and after its done it deletes the death balloon
            // and replaces it with a different one
            Timer timer = new Timer();
            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    addBalloon();
                }
            };
            timer.schedule(task, 3000);

        }

    }

    public void playMusic() {
        try {
            // gets the audio file and plays it
            if (random > 90 && random <= 100) {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(new File("wrong-47985.wav"));
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();
            } else {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(new File("pop2-84862.wav"));
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();
            }

        }
        // ifthe file is not found it will print that it cant play the sound
        catch (Exception e) {

            System.out.println("cant play sound");
        }

    }
}
