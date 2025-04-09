public enum taskCommands {
	ADD("- Add a task to your task list!"),
	DELETE("- Delete a task from your task list!"),
	UPDATE("- Update an existing task in your task list!"),
	QUIT("- Quit the Task Tracker CLI tool!"),
	PRINT("- Print all the task you have!");

	final String commandDef;
	taskCommands(String commandDef){
		this.commandDef = commandDef;
	}
}
