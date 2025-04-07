import java.lang.reflect.Array;
import java.util.ArrayList;

public class taskList {
	private ArrayList<String> task = new ArrayList<>();

	public int taskListSize(){
		return task.size();
	}
	public void addTask(String taskToAdd){
		task.add(taskToAdd);
	}

	public void updateTask(String taskToUpdate, String updatedTask){
		if(task.contains(taskToUpdate)){
			int index = task.indexOf(taskToUpdate);
			task.set(index,updatedTask);
		}
		System.out.println(taskToUpdate + " does not exist!");
	}
	
	public void deleteTask(String taskToDelete){
		if(task.contains(taskToDelete)){
			task.remove(taskToDelete);
		}
		System.out.println(taskToDelete + " does not exist!");
	}
}
