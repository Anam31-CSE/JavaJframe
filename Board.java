import javax.swing.*;
import java.awt.*;

public class Board extends JPanel {
    Image backgroundImage;
    Image carImage;
    Board(){
        ImageIcon i = new ImageIcon("background.jpeg");
        backgroundImage = i.getImage();

        ImageIcon j = new ImageIcon("car.png");
        carImage = j.getImage();

    }


   @Override
    public void paint(Graphics g){
        super.paint(g);
        g.drawImage(backgroundImage, 0, 0, this);
        g.drawImage(carImage, 0, 280, this);
    }
}
