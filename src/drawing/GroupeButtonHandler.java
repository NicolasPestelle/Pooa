package drawing;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Point2D;
import javafx.scene.input.MouseEvent;

/**
 * Created by npestell on 09/11/17.
 */
public class GroupeButtonHandler implements EventHandler<ActionEvent> {

    private Drawing drawing;



    public  GroupeButtonHandler(Drawing drawing){
        this.drawing = drawing;
    }

    public GroupeButtonHandler() {

    }

    @Override
    public void handle(ActionEvent event) {
        //dés que l'on clique sur une forme, on l'ajoute.

        //on récupere toute les formes
        // on les mets dans composites
        //on vide drawing
        //on met composite dans drawing
    Composite co = new Composite(new Point2D(0,0));
    co.addGroupe(drawing.shapes);
    drawing.clear();
    drawing.addShape(co);


    }
}
