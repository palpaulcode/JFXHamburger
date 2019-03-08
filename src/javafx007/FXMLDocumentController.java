/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx007;

import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.transitions.hamburger.HamburgerSlideCloseTransition;
import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 *
 * @author TURNKEY
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private JFXHamburger ham1;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        HamburgerSlideCloseTransition transition = new HamburgerSlideCloseTransition(ham1);
        transition.setRate(-1);
        ham1.addEventHandler(javafx.scene.input.MouseEvent.MOUSE_CLICKED, (e) -> {
        transition.setRate(transition.getRate()*-1);
        transition.play();
        });
    }    
    
}
