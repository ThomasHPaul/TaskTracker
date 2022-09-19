import java.util.ArrayList;

public interface IDataRepository {
    public void addTask(Task task);
    public void updateTask(Task oldTask, Task newTask);
    public void deleteTask(Task taskToDelete);
    public Task getTask(int id);
    public ArrayList<Task> getAllTasks();
}
