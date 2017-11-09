package drawing;

import javafx.scene.control.Label;

/**
 * Created by npestell on 09/11/17.
 */
public class MyStatus extends Label implements DrawingObservers{
Drawing drawing;
public MyStatus(Drawing drawing){
    this.drawing = drawing;
    drawing.addDrawingObserver(this);
    this.setText(drawing.nbShapes()+"shape");
}

@Override
    public void update(){
    this.setText(drawing.nbShapes()+"shape");
}
}
