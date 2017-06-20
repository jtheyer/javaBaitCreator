/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitcreator;

import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Jason Heyer
 */
public class BaitCreator extends Application {

    private double paneWidth = 500;
    private double paneHeight = 300;
    BorderPane borderPane = new BorderPane();
    StackPane paneForBait = new StackPane();
    Button spinnerBait;

    @Override
    public void start(Stage primaryStage) {
        List<Integer> list = new ArrayList();
        for (int i = 0; i <= 2; i++) {
            list.add(i);
        }

        /*Horizontal Box for Steps*/
        HBox hBoxForStep = new HBox(5);
        hBoxForStep.setAlignment(Pos.CENTER);
        hBoxForStep.setPadding(new Insets(10, 10, 10, 10));
        Text title = new Text("Steps: ");
        title.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        Button step1 = new Button("1: Choose Base"); //todo: color and weight
        Button step2 = new Button("2: Choose (option)");
        Button step3 = new Button("3: Choose (option)");
        hBoxForStep.getChildren().addAll(title, step1, step2, step3);

        /*Vertical Box for Bait Base*/
        VBox vBoxForBait = new VBox(10);
        vBoxForBait.setAlignment(Pos.CENTER);
        for (int i = 0; i < 2; i++) {
            vBoxForBait.getChildren().add(new ImageView("image/" + list.get(i) + ".png"));
        }
        /*Buttons for bait bases*/

        spinnerBait = new Button("SpinnerBait");
//TODO: button background image of respective bait?| spinnerBait.setStyle("-fx-background-image: 0.png"); 
        vBoxForBait.getChildren().addAll(spinnerBait);
//        
        spinnerBait.setOnAction(e -> {
            displaySpinnerBody();
        });
//        Scene SpinnerBasePane = new Scene(, paneWidth, paneHeight);
        /*Stack Pane for Bait-in-Creation area*/

        paneForBait.setPadding(new Insets(50));

        /*Border Pane*/
        borderPane.setTop(hBoxForStep);
        borderPane.setLeft(vBoxForBait);
        borderPane.setCenter(paneForBait);

        Scene scene = new Scene(borderPane, 800, 600);

        primaryStage.setTitle("Bait Creator v1.0");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void displaySpinnerBody() {
        paneForBait.getChildren().clear();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
