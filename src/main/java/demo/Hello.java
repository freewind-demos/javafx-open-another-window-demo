package demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Hello extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello");
        VBox root = new VBox() {{
            getChildren().add(new Button("Open another window") {{
                setOnAction(event -> {
                    createAnotherStage().show();
                    primaryStage.close();
                });
            }});
        }};
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }

    private static Stage createAnotherStage() {
        Stage secondStage = new Stage();
        secondStage.setScene(new Scene(new HBox(4, new Label("Second window")), 500, 300));
        return secondStage;
    }
}

