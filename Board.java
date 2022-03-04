
public class Board extends JPanel {
    Image backgroundImage;
   Car c = new Car();
    Board()
    {
        ImageIcon i = new ImageIcon("background.jpeg");
        backgroundImage = i.getImage();

        ImageIcon j = new ImageIcon("car.png");
        c.carImage = j.getImage();

    }
    @Override
    public void paint(graphics g)
    {
        super.paint(g);
        g.drawImage(backgroundImage, 0, 0, this);
        g.drawImage(carImage,0,0,this);
    }

}
