package Controller;

import Model.TaskList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class StackPaneController {
	
	TaskList tasks;
	
	public void setTasks(TaskList tasks) {
		this.tasks = tasks;
	}
	
	@FXML
	private Button button;
	private ListView <String> list;
	private TextField textField;
	
	@FXML
	void initialize() {
		//textField.setText("SIEMA");
	}
	
	@FXML
	public void buttonOnClick() {
		System.out.println(textField.getText());
	}

}
