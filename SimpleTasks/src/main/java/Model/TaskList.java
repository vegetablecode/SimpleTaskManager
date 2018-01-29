package Model;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

	private List <Task> tasks = new ArrayList <Task>();
	
	public void addNewTask(String note, Boolean status) {
		tasks.add(new Task(note, status));
	}
	
	public int getNumbOfTasks() {
		return tasks.size();
	}
	
	public void removeTask(int id) {
		tasks.remove(id);
	}
	
	public Task getTask(int id) {
		return tasks.get(id);
	}
	
	public List<Task> getTaskList(){
		return tasks;
	}
	
}
