import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class UserInterface {
    Scanner input = new Scanner(System.in);

    public void presentTitle() {
        System.out.println("Welcome to Task Tracker!\n");
    }

    public void presentMenu() {
        System.out.println("Please select from the options below:");
        System.out.println("1. Add a new task");
        System.out.println("2. Edit a task");
        System.out.println("3. View a task");
        System.out.println("4. View all tasks");
        System.out.println("5. Delete a task");
        System.out.println("6. Exit\n");
    }

    public int chooseMenuItem() {
        int choice = Integer.valueOf(this.input.nextLine());
        return choice;
    }

    public void menuRouter(InMemoryDataContainer container, int choice) throws ParseException {
        switch(choice) {
            case 1:
                this.addTaskWorkflow(container);
            case 2:
                // call editTask method
            case 3:
                // call viewTask method
            case 4:
                // call viewAllTasks method
            case 5:
                // call deleteTask method
            case 6:
                // call exit method
            default:
        }
    }
    public void addTaskWorkflow(InMemoryDataContainer container) throws ParseException {
        ArrayList<String> taskDetails = this.getTaskDetailsFromUser();
        Task newTask = this.createNewTask(taskDetails);
        this.addTaskToDataRepository(newTask, container);
    }

    public ArrayList<String> getTaskDetailsFromUser() {
        ArrayList<String> taskAttributes = new ArrayList<String>();

        System.out.println("What is the title?");
        String title = this.input.nextLine();
        taskAttributes.add(title);

        System.out.println("What is the due date?");
        String dueDate = this.input.nextLine();
        taskAttributes.add(dueDate);

        System.out.println("What is the description/note?");
        String note = this.input.nextLine();
        taskAttributes.add(note);

        return taskAttributes;
    }

    public Task createNewTask(ArrayList<String> taskAttributes) throws ParseException {
        final int DATE_INDEX = 1;
        SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy", Locale.ENGLISH);
        Date dueDate = formatter.parse(taskAttributes.get(DATE_INDEX));
        String title = taskAttributes.get(0);
        String note = taskAttributes.get(2);

        Task task = new Task(title, note, dueDate);
        return task;
    }

    public void addTaskToDataRepository(Task task, InMemoryDataContainer container) {
        container.addTask(task);
    }
}
