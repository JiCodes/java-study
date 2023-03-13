package com.example.exercise09;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;


public class Controller {
    @FXML
    private TextField textField;
    private String currentNumber = "";


    @FXML
    void btn0Clicked(ActionEvent event) {
        if (!currentNumber.equals(""))
            onNumberClicked("0");
    }
    @FXML
    void btn1Clicked(ActionEvent event) {
        onNumberClicked("1");
    }
    @FXML
    void btn2Clicked(ActionEvent event) {
        onNumberClicked("2");
    }
    @FXML
    void btn3Clicked(ActionEvent event) {
        onNumberClicked("3");
    }
    @FXML
    void btn4Clicked(ActionEvent event) {
        onNumberClicked("4");
    }
    @FXML
    void btn5Clicked(ActionEvent event) {
        onNumberClicked("5");
    }
    @FXML
    void btn6Clicked(ActionEvent event) {
        onNumberClicked("6");
    }
    @FXML
    void btn7Clicked(ActionEvent event) {
        onNumberClicked("7");
    }
    @FXML
    void btn8Clicked(ActionEvent event) {
        onNumberClicked("8");
    }
    @FXML
    void btn9Clicked(ActionEvent event) {
        onNumberClicked("9");
    }

    public void onNumberClicked(String number) {
        currentNumber += number;
        updateTextField();
    }

    public void updateTextField() {
        textField.setText(currentNumber);
    }


}
