import java.util.Scanner;

public class taskTracker {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // scanner stuff
		taskList tasklist = new taskList();

		System.out.println("Welcome to TaskTracker CLI Tool!");
		boolean trackerOn = true;
		while (trackerOn) {
			System.out.println("==============================");
			System.out.println("Enter (C) to see all commands!");
			String userInput = scanner.nextLine();
			
			//CASE STATEMENT TO PRINT DEPENDING ON WHAT THEY CHOOSE -> WILL UPDATE TASKLIST FROM ARRAYLIST -> JSON
			switch(userInput.toUpperCase()){
				case "C":
					for(taskCommands taskC : taskCommands.values()){
						System.out.println(taskC + " " + taskC.commandDef);
					}
					break;
				case "ADD":
					System.out.print("ADD TASK: ");
					String addTask = scanner.nextLine();
					tasklist.addTask(addTask);
					break;

				case "DELETE":
					System.out.print("DELETE TASK: ");
					String delTask = scanner.nextLine();
					tasklist.deleteTask(delTask);
					break;

				case "UPDATE":
					System.out.println("UPDATE TASK: ");
					String updateTask = scanner.nextLine();
					System.out.println("UPDATE TO(DONE,NOT DONE,IN PROGRESS): ");
					String updatedTask = scanner.nextLine();
					tasklist.updateTask(updateTask, updatedTask.toUpperCase());
					break;

				case "PRINT":
					tasklist.printTasks();
					break;
				case "Q":
					trackerOn = false;
					break;
			}
		}

		System.out.println("WE ARE FREE!!!");
		scanner.close();
	}
}