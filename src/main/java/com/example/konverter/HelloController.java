package com.example.konverter;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.DragEvent;
import javafx.scene.input.KeyEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private ComboBox<String> comboBox;

    @FXML
    private Label lable1;

    @FXML
    private Label lable2;

    @FXML
    private Label lable3;

    @FXML
    private TextField mass;

    @FXML
    void konvert(DragEvent event) {

    }

    @FXML
    void konvertation(KeyEvent event ) {

        float rez = Integer.parseInt(mass.getText());

       switch (comboBox.getValue()) {



           case "Тонны":
               lable1.setText(String.valueOf(rez));
               lable2.setText(String.valueOf(rez * 1000));
               lable3.setText(String.valueOf(rez * 1000000));
               break;

           case "Килограммы":
               lable1.setText(String.valueOf(rez * 0.001f));
               lable2.setText(String.valueOf(rez));
               lable3.setText(String.valueOf(rez * 1000));
               break;
           case "Граммы":
               lable1.setText(String.valueOf(rez * 0.000001f));
               lable2.setText(String.valueOf(rez * 0.001f));
               lable3.setText(String.valueOf(rez ));
               break;

       }

       }


    @FXML
    void gg(ActionEvent event) {
        float rez = Integer.parseInt(mass.getText());
        switch (comboBox.getValue()) {

            case "Тонны":

                lable1.setText(String.valueOf(rez));
                lable2.setText(String.valueOf(rez*1000));
                lable3.setText(String.valueOf(rez*1000000));
                break;
            case "Килограммы":
                lable1.setText(String.valueOf(rez * 0.001f));
                lable2.setText(String.valueOf(rez));
                lable3.setText(String.valueOf(rez * 1000));
                break;
            case "Граммы":
                lable1.setText(String.valueOf(rez * 0.000001f));
                lable2.setText(String.valueOf(rez * 0.001f));
                lable3.setText(String.valueOf(rez ));
                break;

        }
        // Как исправить ошибку когда при удалении из всех чисел из текстового поля конвертированные значения не становятся равными 0

    }

        @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        comboBox.getItems().addAll( "Тонны", "Килограммы", "Граммы");
        comboBox.setValue("Тонны");
    }
}





