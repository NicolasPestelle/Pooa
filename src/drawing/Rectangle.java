package drawing;

import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * Created by lewandowski on 07/09/2017.
 */
public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(Point2D origin, double width, double height) {
        super(origin);
        this.width = width;
        this.height = height;
    }

    @Override
    public void paint(GraphicsContext gc) {
        gc.setFill(Color.GREENYELLOW);
        gc.setStroke(Color.GREEN);
        gc.setLineWidth(3);
        gc.fillRect(origin.getX(), origin.getY(), width, height);
        gc.strokeRect(origin.getX(), origin.getY(), width, height);
    }

    @Override
    public boolean isOn(Point2D p) {
        return (p.getX() > origin.getX() && p.getX() < origin.getX()+width &&
                p.getY() > origin.getY() && p.getY() < origin.getY()+height);
    }
}
