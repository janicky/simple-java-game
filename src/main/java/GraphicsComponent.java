import model.Scenery;

import javax.swing.*;
import java.awt.*;

public class GraphicsComponent extends JComponent {

    private Scenery scenery;

    public GraphicsComponent(Scenery scenery) {
        this.scenery = scenery;
    }

    @Override
    public Dimension getMinimumSize() {
        return new Dimension(400, 300);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(800, 600);
    }

    @Override
    public void paintComponent(Graphics g) {
        Dimension d = getSize();
        super.paintComponent(g);
        g.setColor(Color.black);
        g.fillRect(0, 0, d.width, d.height);
        g.setColor(Color.white);
        g.fillOval(scenery.getPlayer().getX(), scenery.getPlayer().getY(), 30, 30);
    }
}
