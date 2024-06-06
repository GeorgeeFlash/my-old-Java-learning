import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class DragPanel extends JPanel {

    ImageIcon image = new ImageIcon("ben 15.png");
    final int WIDTH = image.getIconWidth();
    final int HEIGHT = image.getIconHeight();
    Point imageCorner;
    Point prevPt;
    
    DragPanel() {

        imageCorner = new Point(0, 0);
        ClickListener clickListener = new ClickListener();
        DragListener dragListener = new DragListener();
        this.addMouseListener(clickListener);
        this.addMouseMotionListener(dragListener);
        
    }

    // This method paints our image
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        image.paintIcon(this, g, (int)imageCorner.getX(), (int)imageCorner.getY());
    }

    // This class updates the point of our image
    public class ClickListener extends MouseAdapter {

        public void mousePressed(MouseEvent e) {
            prevPt = e.getPoint();
        }
    }

    // This class moves the image around as we move mouse
    public class DragListener extends MouseMotionAdapter {

        public void mouseDragged(MouseEvent e) {

            Point currentPt = e.getPoint();

            // This tranlates our image to a new position after dragging our mouse
            imageCorner.translate(
                (int)(currentPt.getX() - prevPt.getX()), 
                (int)(currentPt.getY() - prevPt.getY())
            );
            prevPt = currentPt;
            repaint();

        }

    }
}
