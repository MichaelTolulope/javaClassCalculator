package com.example.gui;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TicTacToev1 extends Application implements EventHandler {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    Button[][] btnMultiArray;

    int count = 0;

    @Override
    public void start(Stage stage) throws Exception {
        btn1 = new Button();
        btn1.setPrefHeight(100);
        btn1.setPrefWidth(100);
        btn1.setOnAction(this);

        btn2 = new Button();
        btn2.setPrefHeight(100);
        btn2.setPrefWidth(100);
        btn2.setOnAction(this);


        btn3 = new Button();
        btn3.setPrefHeight(100);
        btn3.setPrefWidth(100);
        btn3.setOnAction(this);


        btn4 = new Button();
        btn4.setPrefHeight(100);
        btn4.setPrefWidth(100);
        btn4.setOnAction(this);


        btn5 = new Button();
        btn5.setPrefHeight(100);
        btn5.setPrefWidth(100);
        btn5.setOnAction(this);


        btn6 = new Button();
        btn6.setPrefHeight(100);
        btn6.setPrefWidth(100);
        btn6.setOnAction(this);


        btn7 = new Button();
        btn7.setPrefHeight(100);
        btn7.setPrefWidth(100);
        btn7.setOnAction(this);


        btn8 = new Button();
        btn8.setPrefHeight(100);
        btn8.setPrefWidth(100);
        btn8.setOnAction(this);


        btn9 = new Button();
        btn9.setPrefHeight(100);
        btn9.setPrefWidth(100);
        btn9.setOnAction(this);



        GridPane btnGrid = new GridPane();
        btnGrid.addRow(1,btn1,btn2,btn3);
        btnGrid.addRow(2,btn4,btn5,btn6);
        btnGrid.addRow(3,btn7,btn8,btn9);

//        {{btn1,btn2,btn3},{btn4,btn5,btn6},{btn7,btn8,btn9}}

        btnMultiArray = new Button[][]{{btn1,btn2,btn3},{btn4,btn5,btn6},{btn7,btn8,btn9}};

        BorderPane root = new BorderPane();
        root.setCenter(btnGrid);

        Scene scene = new Scene(root,300,350);
        stage.setScene(scene);
        stage.setTitle("Tic - Tac - Toe");
        stage.show();
    }

    @Override
    public void handle(Event event) {
        count++;
        Button btnClicked = (Button) event.getSource();
        if(btnClicked.getText().isBlank() || btnClicked.getText().isEmpty()){
           if(isOdd()) {
               btnClicked.setText("X");
           }else{
               btnClicked.setText("O");
           }



        }
        checkWin();
        System.out.println(btnClicked.getText());
    }

    private void endGame() {
        for(int i = 0; i<btnMultiArray.length; i++){
            for (int j = 0; j<btnMultiArray[i].length; j++){
                btnMultiArray[i][j].setDisable(true);
            }

        }
    }

    public boolean isOdd(){
        if(count%2==0){
            return false;
        }else{
            return true;
        }

    }

    public void checkWin(){
        checkRowWin();
    }

    private void checkRowWin() {
        for (int row = 0; row < 3; row++) {

            if(!btnMultiArray[row][0].getText().isEmpty() &&
                    btnMultiArray[row][0].getText().equals(btnMultiArray[row][1].getText())
                    &&
                    btnMultiArray[row][0].getText().equals(btnMultiArray[row][2].getText()
                    )){
                System.out.println("You Won!");
            }


        }
    }

}
