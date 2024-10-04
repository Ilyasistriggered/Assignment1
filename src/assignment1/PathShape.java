/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment1;

/**
 *
 * @author giosakha
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
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.QuadCurveTo;
import javafx.stage.Stage;

public class PathShape {

    public static Scene createPathShapeScene(Stage primaryStage) {

        Path path = new Path();
        path.getElements().add(new MoveTo(50, 50));
        path.getElements().add(new LineTo(250, 50));
        path.getElements().add(new LineTo(250, 150));
        path.getElements().add(new QuadCurveTo(200, 100, 150, 150));
        path.getElements().add(new QuadCurveTo(100, 200, 50, 150));
        path.getElements().add(new LineTo(50, 50));
        path.setStroke(Color.BLACK);
        path.setFill(Color.TRANSPARENT);

        Label codeLabel = new Label();
        codeLabel.setVisible(false);


        Button showCodeButton = new Button("View Code");
        showCodeButton.setOnAction(e -> {
            if (codeLabel.isVisible()) {
                codeLabel.setVisible(false);
                showCodeButton.setText("View Code");
            } else {
                codeLabel.setText(
                    "Path path = new Path();\n" +
                    "path.getElements().add(new MoveTo(50, 50));\n" +
                    "path.getElements().add(new LineTo(250, 50));\n" +
                    "path.getElements().add(new LineTo(250, 150));\n" +
                    "path.getElements().add(new QuadCurveTo(200, 100, 150, 150));\n" +
                    "path.getElements().add(new QuadCurveTo(100, 200, 50, 150));\n" +
                    "path.getElements().add(new LineTo(50, 50));"
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

        VBox layout = new VBox(10, path, buttonBox, codeLabel);
        layout.setPadding(new Insets(10));
        layout.setAlignment(Pos.CENTER);

        return new Scene(layout, 400, 400);
    }
}
