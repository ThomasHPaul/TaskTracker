import java.util.Scanner;

public class UserInterface {
    public static void presentTitle() {
        System.out.println("Welcome to Task Tracker!\n");
    }

    public static void presentMenu() {
        System.out.println("Please select from the options below:");
        System.out.println("1. Add a new task");
        System.out.println("2. Edit a task");
        System.out.println("3. View a task");
        System.out.println("4. View all tasks");
        System.out.println("5. Delete a task");
        System.out.println("6. Exit\n");
    }

    public static int chooseMenuItem() {
        Scanner input = new Scanner(System.in);
        int choice = Integer.valueOf(input.nextLine());
        return choice;
    }

    public static void menuRouter(int choice) {
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
}
