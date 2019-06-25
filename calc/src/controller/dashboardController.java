package controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.lang.reflect.Modifier;
import java.net.URL;
import java.util.ResourceBundle;


public class dashboardController implements Initializable {
    public TextField txtInput;

    @FXML
    private JFXTextField txtDisplay;

    @FXML
    private Button btn7;

    @FXML
    private Button btn8;

    @FXML
    private Button btn9;

    @FXML
    private Button btnDivide;

    @FXML
    private Button btn4;

    @FXML
    private Button btn5;

    @FXML
    private Button btn6;

    @FXML
    private Button btnMul;

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Button btn3;

    @FXML
    private Button btnSub;

    @FXML
    private Button btn0;

    @FXML
    private Button btnClear;

    @FXML
    private Button btnEqual;

    @FXML
    private Button btnAdd;

    public double secondnum;
    public double firstnum;
    public String operator;
    public double result;

    @FXML
    void btn0_OnAction(ActionEvent event) {
        String enternumber=txtDisplay.getText()+btn0.getText();
        txtDisplay.setText(enternumber);
    }

    @FXML
    void btn1_OnAction(ActionEvent event) {
        String enternumber=txtDisplay.getText()+btn1.getText();
        txtDisplay.setText(enternumber);
    }

    @FXML
    void btn2_OnAction(ActionEvent event) {
        String enternumber=txtDisplay.getText()+btn2.getText();
        txtDisplay.setText(enternumber);
    }

    @FXML
    void btn3_OnAction(ActionEvent event) {
        String enternumber=txtDisplay.getText()+btn3.getText();
        txtDisplay.setText(enternumber);
    }

    @FXML
    void btn4_OnAction(ActionEvent event) {
        String enternumber=txtDisplay.getText()+btn4.getText();
        txtDisplay.setText(enternumber);
    }

    @FXML
    void btn5_OnAction(ActionEvent event) {
        String enternumber=txtDisplay.getText()+btn5.getText();
        txtDisplay.setText(enternumber);
    }

    @FXML
    void btn6_OnAction(ActionEvent event) {
        String enternumber=txtDisplay.getText()+btn6.getText();
        txtDisplay.setText(enternumber);
    }

    @FXML
    void btn7_OnAction(ActionEvent event) {
        String enternumber=txtDisplay.getText()+btn7.getText();
        txtDisplay.setText(enternumber);
    }


    @FXML
    void btn8_OnAction(ActionEvent event) {
        String enternumber=txtDisplay.getText()+btn8.getText();
        txtDisplay.setText(enternumber);
    }


    @FXML
    void btn9_OnAction(ActionEvent event) {
        String enternumber=txtDisplay.getText()+btn9.getText();
        txtDisplay.setText(enternumber);
    }

    @FXML
    void btnAdd_OnAction(ActionEvent event) {
        firstnum = Double.parseDouble(txtDisplay.getText());
        txtDisplay.setText("");
        operator="+";
    }

    @FXML
    void btnClear_OnAction(ActionEvent event) {
        txtDisplay.setText("");
    }

    @FXML
    void btnDivide_OnAction(ActionEvent event) {
        firstnum = Double.parseDouble(txtDisplay.getText());
        txtDisplay.setText("");
        operator="/";
    }

    @FXML
    void btnEqual_OnAction(ActionEvent event) {
        String answer;
        secondnum=Double.parseDouble(txtDisplay.getText());
        if(operator == "+"){
            result = firstnum + secondnum;
            answer = String.format("%.0f", result);
            txtDisplay.setText(answer);

        }
        secondnum=Double.parseDouble(txtDisplay.getText());
        if(operator == "-"){
            result = firstnum - secondnum;
            answer = String.format("%.0f", result);
            txtDisplay.setText(answer);

        }
        secondnum=Double.parseDouble(txtDisplay.getText());
        if(operator == "*"){
            result = firstnum * secondnum;
            answer = String.format("%.0f", result);
            txtDisplay.setText(answer);

        }
        secondnum=Double.parseDouble(txtDisplay.getText());
        if(operator == "/"){
            result = firstnum / secondnum;
            answer = String.format("%.0f", result);
            txtDisplay.setText(answer);

        }

    }

    @FXML
    void btnMul_OnAction(ActionEvent event) {
        firstnum = Double.parseDouble(txtDisplay.getText());
        txtDisplay.setText("");
        operator="*";
    }

    @FXML
    void btnSub_OnAction(ActionEvent event) {
        firstnum = Double.parseDouble(txtDisplay.getText());
        txtDisplay.setText("");
        operator="-";
    }

    @FXML
    void txtDisplay_OnAction(ActionEvent event) {

    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }


}


