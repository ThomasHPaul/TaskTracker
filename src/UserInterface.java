import java.util.ArrayList;
import java.util.Date;
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

    public void menuRouter(int choice) {
        switch(choice) {
            case 1:
                // call addTask method
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

    public Task createNewTask(ArrayList<String> taskAttributes) {
        // TODO:  use 3. Converting String to java.util.Date
        // https://www.baeldung.com/java-string-to-date
    }

    public void addTaskToDataRepository(Task task) {

    }
}
