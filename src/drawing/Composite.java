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

    public void addGroupe(ArrayList<Shape> formes){
        groupe.addAll(formes);
    }

    public void removeGroupe(Shape forme){
        groupe.remove(forme);
    }

    public Shape getForme(int i){
        return groupe.get(i);
    }

    public void setOrigin(Point2D origin){
        double ancienx = this.origin.getX();
        double ancieny = this.origin.getY();
        double translatex =  origin.getX()-ancienx;
        double translatey = origin.getY()-ancieny;

        this.origin = new Point2D(origin.getX(),origin.getY());
        for(int i = 0; i < groupe.size(); i++)
        {
            double tx = translatex + groupe.get(i).getOrigin().getX();
            double ty = translatey + groupe.get(i).getOrigin().getY();
            groupe.get(i).setOrigin(tx, ty);
        }

    }

    @Override
    public void paint(GraphicsContext gc) {
        for(Shape c : groupe)
            c.paint(gc);
    }

    @Override
    public boolean isOn(Point2D p) {

        for(Shape c : groupe)
           if(c.isOn(p)) return true;
        return false;
    }
}
