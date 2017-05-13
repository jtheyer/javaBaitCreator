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
import javafx.stage.Stage;

/**
 *
 * @author Jason Heyer
 */
public class BaitCreator extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        List<Integer> list = new ArrayList();
        for (int i=0; i<=2; i++){
            list.add(i);
        }
        
        /*Horizontal Box for Steps*/
        HBox hBoxForStep = new HBox(5);
        hBoxForStep.setAlignment(Pos.CENTER);
        Button step1 = new Button("Step 1");
        Button step2 = new Button("Step 2");
        Button step3 = new Button("Step 3");
        hBoxForStep.getChildren().addAll(step1,step2,step3);
        
        /*Vertical Box for Bait Base*/
        VBox vBoxForBait = new VBox(10);
        vBoxForBait.setAlignment(Pos.CENTER);
        for (int i=0; i<2; i++){
            vBoxForBait.getChildren().add(new ImageView("image/" + list.get(i) + ".png"));
        }
        
        /*Stack Pane for Bait-in-Creation area*/
        StackPane paneForBait = new StackPane();
        paneForBait.setPadding(new Insets(50));
        
        /*Border Pane*/
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(hBoxForStep);
        borderPane.setLeft(vBoxForBait);
        borderPane.setCenter(paneForBait);  
        
        Scene scene = new Scene(borderPane, 800, 600);
        
        primaryStage.setTitle("Bait Creator v1.0");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
