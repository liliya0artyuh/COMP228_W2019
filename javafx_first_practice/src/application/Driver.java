package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Driver extends Application {
	@Override
	public void start(Stage primaryStage) throws IOException {
		//the file name below has to match your fxml file name 
		String fxmlFileName = "Main.fxml";
        Parent root = FXMLLoader.load(getClass().getResource(fxmlFileName));
        
        Scene scene = new Scene(root);
        
        primaryStage.setScene(scene);
        primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}