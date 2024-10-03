/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment1;

/**
 *
 * @author 2386636
 */
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

public class Controller {

    private static Scene mainScene;

    public static void setMainScene(Scene scene) {
        mainScene = scene;
    }

    public static void showPathShapeScene(Stage primaryStage) {
        //Scene pathScene = PathShape.createPathShapeScene(primaryStage);
        //primaryStage.setScene(pathScene);
    }

    public static void showShearTransformScene(Stage primaryStage) {
        //Scene shearScene = ShearTransform.createShearTransformScene(primaryStage);
        //primaryStage.setScene(shearScene);
    }

    public static void showConfirmationDialog(Stage primaryStage) {
        Alert alert = new Alert(AlertType.CONFIRMATION, "Are you sure you want to go back?", ButtonType.OK, ButtonType.CANCEL);
        alert.showAndWait().ifPresent(response -> {
            if (response == ButtonType.OK) {
                primaryStage.setScene(mainScene);
            }
        });
    }
}
