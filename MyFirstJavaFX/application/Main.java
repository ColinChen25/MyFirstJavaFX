package application;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
  @Override
  public void start(Stage primaryStage) {
    try {
      Label greetingLabel = new Label("Hello World!");
      Label label1 = new Label("CS400 MyFirstJavaFX");
      ImageView myFace = new ImageView(new Image("98.12.15.jpg"));
      myFace.setFitWidth(500);
      myFace.setPreserveRatio(true);
      BorderPane root = new BorderPane();
      Scene scene = new Scene(root, 400, 400);
      root.setTop(greetingLabel);
      root.setLeft(
          new ComboBox(FXCollections.observableArrayList("Option 1", "Option 2", "Option 3")));
      root.setCenter(myFace);
      root.setRight(new TextField());
      scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
      primaryStage.setScene(scene);
      primaryStage.setTitle("Colin's First JavaFX program");
      primaryStage.show();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    launch(args);
  }
}
