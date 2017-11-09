package drawing;

import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;

import java.util.ArrayList;

/**
 * Created by npestell on 09/11/17.
 */
public class Composite extends Shape {

    ArrayList<Shape> groupe;

    public Composite(Point2D origin) {
        super(origin);
        groupe = new ArrayList<>();
    }

    public void addGroupe(Shape forme){
        groupe.add(forme);
    }

    public void removeGroupe(Shape forme){
        groupe.remove(forme);
    }

    public Shape getForme(int i){
        return groupe.get(i);
    }

    @Override
    public void paint(GraphicsContext gc) {
        for(Shape c : groupe)
            c.paint(gc);
    }

    @Override
    public boolean isOn(Point2D p) {
        Boolean tmp = false;
        for(Shape c : groupe)
            tmp = c.isOn(p);
        return tmp;
    }
}
