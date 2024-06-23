  
package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class Splash extends JFrame implements Runnable {
    Thread thread;

    Splash() {
        // Set the size and location of the frame
        setSize(1200, 600);
        setLocation(200, 100);

        // Load and scale the splash image
        URL imagePath = ClassLoader.getSystemResource("splash.jpg");
        ImageIcon i1 = new ImageIcon(imagePath);
        Image i2 = i1.getImage().getScaledInstance(1200, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);

        // Make the frame visible
        setVisible(true);

        // Start the thread
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        try {
            Thread.sleep(7000);
            // new Login(); // Uncomment and implement this line to open the login window
            setVisible(false);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Splash frame = new Splash();

        int x = 1;
        for (int i = 1; i <= 500; x += 7, i += 6) {
            frame.setLocation(750 - (x + 1) / 2, 400 - (i / 2));
            frame.setSize(x + i, i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
