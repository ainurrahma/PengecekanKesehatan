/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis5;

import com.jfoenix.controls.JFXTextField;
import static java.lang.Integer.parseInt;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author SMK TELKOM
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private JFXTextField editnama;
    @FXML
    private JFXTextField edittinggi;
    @FXML
    private JFXTextField editberat;
    @FXML
    private RadioButton rdlaki;
    @FXML
    private RadioButton rdperempuan;
    @FXML
    private Button buttonproses;
    @FXML
    private Button buttonreset;
    @FXML
    private TextField beratideal;
    @FXML
    private TextArea hasil;
    @FXML
    private TextArea saran;

    /**
     * Initializes the controller class.
     */
    @FXML
    private void proses(ActionEvent event) {
        int Berat=0;
        String Analisa=null;
        String Saran=null;
        if(rdlaki.isSelected()){
            Berat=parseInt(edittinggi.getText())-105;
        }
        if(rdperempuan.isSelected()){
            Berat=parseInt(edittinggi.getText())-110;
        }
        beratideal.setText(""+Berat);
        if(Berat==parseInt(editberat.getText())){
            Analisa="ideal";
            Saran="jaga pola makan anda agar stabil";
        }
        else if(Berat<parseInt(editberat.getText())){
            Analisa="overweight";
            Saran="kurangi porsi makan anda";
        }
        else if(Berat>parseInt(editberat.getText())){
            Analisa="underweight";
            Saran="tambah pola makan anda";
        }
        hasil.setText(Analisa);
        saran.setText(Saran);
    }

    @FXML
    private void reset(ActionEvent event) {
        editnama.setText("");
        edittinggi.setText("");
        editberat.setText("");
        rdlaki.setSelected(false);
        rdperempuan.setSelected(false);
        beratideal.setText("");
        hasil.setText("");
        saran.setText("");
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    
    
}
