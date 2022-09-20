import java.text.ParseException;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        InMemoryDataContainer container = new InMemoryDataContainer();
        UserInterface userInterface = new UserInterface();

        userInterface.presentTitle();
        userInterface.presentMenu();
        int userChoice = userInterface.chooseMenuItem();

        userInterface.menuRouter(container, userChoice);

        Task task = container.getTask(0);
        System.out.println(task.toString());
    }
}
