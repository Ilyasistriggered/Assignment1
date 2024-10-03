/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author ilyas
 */
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Shear;
import javafx.stage.Stage;

public class ShearTransform {

    public static Scene createShearTransformScene(Stage primaryStage) {

        Rectangle rect1 = new Rectangle(200, 100, 200, 100);
        rect1.setStroke(Color.BLACK);
        rect1.setFill(Color.LIGHTGREY);
        Rectangle rect2 = new Rectangle(-225, 0, 200, 100);
        rect2.setStroke(Color.BLACK);
        rect2.setFill(Color.LIGHTGREY);
        rect2.setOpacity(0.5);
        rect2.getTransforms().add(new Shear(0.5, 0.5));
        
        Label codeLabel = new Label();
        codeLabel.setVisible(false);

        Button showCodeButton = new Button("View Code");
        showCodeButton.setOnAction(e -> {
            if (codeLabel.isVisible()) {
                codeLabel.setVisible(false);
                showCodeButton.setText("View Code");
            } 
            else {
                codeLabel.setText(
                    "Rectangle rect1 = new Rectangle(100, 100, 200, 100);\n" +
                    "rect1.setStroke(Color.BLACK);\n" +
                    "rect1.setFill(Color.LIGHTGREY);\n" +
                    "Rectangle rect2 = new Rectangle(-225, 0, 200, 100);\n" +
                    "rect2.setStroke(Color.BLACK);\n" +
                    "rect2.setFill(Color.LIGHTGREY);\n" +
                    "rect2.setOpacity(0.5);\n" +
                    "rect2.getTransforms().add(new Shear(0.5, 0.5));"
                );
                codeLabel.setVisible(true);
                showCodeButton.setText("Hide Code");
            }
        });

        Button backButton = new Button("Back");
        backButton.setOnAction(e -> Controller.showConfirmationDialog(primaryStage));

        HBox buttonBox = new HBox(10);
        buttonBox.setAlignment(Pos.BASELINE_CENTER);

        buttonBox.getChildren().addAll(showCodeButton, backButton);

        HBox.setHgrow(showCodeButton, Priority.ALWAYS);
        showCodeButton.setAlignment(Pos.BASELINE_LEFT);
        HBox.setHgrow(backButton, Priority.ALWAYS);
        backButton.setAlignment(Pos.BASELINE_RIGHT);

        VBox layout = new VBox(10, rect1, rect2, buttonBox, codeLabel);
        layout.setPadding(new Insets(10));
        layout.setAlignment(Pos.CENTER);

        return new Scene(layout, 400, 400);
    }
}
