package Controller;

import Model.TaskList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class StackPaneController {
	
	// attributes
	TaskList tasks;
	
	@FXML
	private Button addNewTaskButton;
	@FXML
	private Button completeTaskButton;
	@FXML
	private Button deleteTaskButton;
	@FXML
	private TableView<String> taskTable;
	@FXML
	private TextField addNewTaskField;
	
	// setters
	public void setTasks(TaskList tasks) {
		this.tasks = tasks;
	}
	
	@FXML
	void initialize() {
		
		// event handlers
		EventHandler<ActionEvent> handleANTB = e -> {
			System.out.println("Wcisnieto ANTB");
			String tempd = addNewTaskField.getText();
			System.out.println(tempd);
		};
		
		EventHandler<ActionEvent> handleCTB = e -> {
			System.out.println("Wcisnieto przywcisk");
		};
		
		EventHandler<ActionEvent> handleDTB = e -> {
			System.out.println("Wcisnieto przdycisk");
		};
		
		addNewTaskButton.addEventHandler(ActionEvent.ACTION, handleANTB);
		completeTaskButton.addEventHandler(ActionEvent.ACTION, handleCTB);
		deleteTaskButton.addEventHandler(ActionEvent.ACTION, handleDTB);
		
	}

}
