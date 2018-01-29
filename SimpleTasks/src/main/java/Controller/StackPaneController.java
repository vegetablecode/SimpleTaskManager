package Controller;

import Model.TaskList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
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
	private ListView<String> taskTable;
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
			String taskText = addNewTaskField.getText();
			if(taskText.equals("")!=true) {
				tasks.addNewTask(taskText, false);
			}
			addNewTaskField.setText("");
			updateTaskTable();
		};
		
		EventHandler<ActionEvent> handleCTB = e -> {
			int selectedIndex = taskTable.getSelectionModel().getSelectedIndex();
			if(selectedIndex!=-1) {
				tasks.getTask(selectedIndex).setStatus(true);
			}
			updateTaskTable();
		};
		
		EventHandler<ActionEvent> handleDTB = e -> {
			int selectedIndex = taskTable.getSelectionModel().getSelectedIndex();
			if(selectedIndex!=-1) {
				tasks.removeTask(selectedIndex);
			}
			updateTaskTable();
		};
		
		addNewTaskButton.addEventHandler(ActionEvent.ACTION, handleANTB);
		completeTaskButton.addEventHandler(ActionEvent.ACTION, handleCTB);
		deleteTaskButton.addEventHandler(ActionEvent.ACTION, handleDTB);
	}
	
	// methods
	void updateTaskTable() {
		ObservableList<String> items =FXCollections.observableArrayList ();
		for(int i=0; i<tasks.getNumbOfTasks(); i++) {
			String taskText;
			if((tasks.getTask(i).getStatus())==false)
				taskText = "[ ] ";
			else taskText = "[x]";
			taskText+=tasks.getTask(i).getNote();
			items.add(taskText);
		}
		taskTable.setItems(items);
	}

}
