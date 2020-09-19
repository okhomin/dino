package world.ucode.main;
/*
 * This Java source file was generated by the Gradle 'init' task.
 */

import javafx.application .Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import world.ucode.window.ScreenController;


public class App extends Application {

    public void start(Stage stage) {
        try {
            ScreenController screenController = ScreenController.getScreenController().init(stage);

            screenController.addScreen(ScreenController.GameScene.MAIN_MENU, new FXMLLoader(getClass().getClassLoader().getResource("scenes/mainMenu.fxml")));
            screenController.addScreen(ScreenController.GameScene.GAME_PLAY, new FXMLLoader(getClass().getClassLoader().getResource("scenes/playField.fxml")));
            screenController.activate(ScreenController.GameScene.MAIN_MENU);
            stage.setTitle("Hello");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }

}