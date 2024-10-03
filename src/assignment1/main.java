/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment1;

/**
 *
 * @author ilyas
 */
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class main extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Assignment 1");

        Button pathButton = new Button("View Path Shape");
        pathButton.setOnAction(e -> Controller.showPathShapeScene(primaryStage));

        Button shearButton = new Button("View Shear Transform");
        shearButton.setOnAction(e -> Controller.showShearTransformScene(primaryStage));

        VBox mainLayout = new VBox(10, pathButton, shearButton);
        mainLayout.setAlignment(Pos.CENTER);
        Scene mainScene = new Scene(mainLayout, 300, 200);

        Controller.setMainScene(mainScene);
        primaryStage.setScene(mainScene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
