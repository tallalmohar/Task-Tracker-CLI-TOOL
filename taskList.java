
import java.util.HashMap;


public class taskList {
	private HashMap<String,String> task = new HashMap<>();
	final String ACTIVE = "ACTIVE";
	
	public void printTasks(){
		for(String tasks : task.keySet()){
			String taskName = tasks;
			String taskStatus = task.get(tasks);
			System.out.println(taskName + ": " + taskStatus);
		}
	}
	public void addTask(String taskToAdd){
		task.put(taskToAdd,ACTIVE);
	}

	public void updateTask(String taskToUpdate, String update){
		if(task.containsKey(taskToUpdate)){
			task.put(taskToUpdate,update);
			
		}else{
			System.out.println(taskToUpdate + " does not exist!");
		}
		
	}
	
	public void deleteTask(String taskToDelete){
		if(task.containsKey(taskToDelete)){
			task.remove(taskToDelete);
		}else{
			System.out.println(taskToDelete + " does not exist!");
		}
		
	}
}
