package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    public Label label;
    public TextField txt1;
    public TextField txt2;




    public void handleClick(ActionEvent actionEvent) {
        label.setText(txt1.getText()+txt2.getText());
    }

}
