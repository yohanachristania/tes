/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package percabanganjfx1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;

/**
 *
 * @author LIKMI
 */
public class FXMLDocumentController implements Initializable {
    
    private Model dt = new Model();
    
    @FXML
    private TextField txtjumlah;
    @FXML
    private CheckBox chkwarna;
    @FXML
    private ToggleButton tgbjilid;
    @FXML
    private RadioButton rdbpelajar;
    @FXML
    private TextField txtbayar;
    
    private void handleButtonAction(ActionEvent event) {
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void hitungklik(ActionEvent event) {
        int harga=200;
        int biaya=0;
        dt.setJumlah(Integer.parseInt(txtjumlah.getText()));
        dt.setWarna(chkwarna.isSelected());
        dt.setJilid(tgbjilid.isSelected());
        dt.setPelajar(rdbpelajar.isSelected());
        if(dt.isWarna())harga+=100;
        if(dt.isJilid())biaya=10000;
        if(dt.isPelajar())harga-=50;
        int bayar=harga*dt.getJumlah()+biaya;
        txtbayar.setText(String.valueOf(bayar));
    }

    @FXML
    private void hapusklik(ActionEvent event) {
        txtjumlah.setText("");
        chkwarna.setSelected(false);
        tgbjilid.setSelected(false);
        rdbpelajar.setSelected(false);
        txtbayar.setText("");
    }

    @FXML
    private void keluarklik(ActionEvent event) {
        System.exit(0);
    }
    
}
