package App;

import Controller.StackPaneController;
import Model.TaskList;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class Main extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		// attirbutes
		TaskList tasks;
		FXMLLoader loader;
		Pane stackPane;
		StackPaneController controller;
		Scene scene;
		
		// objects & setup
		tasks = new TaskList();
		loader = new FXMLLoader();
		
		loader.setLocation(this.getClass().getResource("/fxml/StackPaneWindow.fxml"));
		stackPane = loader.load();
		
		controller = loader.getController();
		controller.setTasks(tasks);
		
		scene = new Scene(stackPane);
		scene.getStylesheets().add("/styles/dark.css");
		primaryStage.setScene(scene);
		primaryStage.setTitle("SimpleTasks");
		primaryStage.show();
		
	}

}
