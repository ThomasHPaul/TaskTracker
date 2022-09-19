import java.util.ArrayList;

public class InMemoryDataContainer implements IDataRepository {
    ArrayList<Task> tasks = new ArrayList<Task>();

    @Override
    public void addTask(Task task) {
        int id = this.tasks.size();
        task.setId(id);
        tasks.add(task);
    }

    @Override
    public void updateTask(Task oldTask, Task newTask) {
        this.tasks.set(oldTask.getId(), newTask);
    }

    @Override
    public void deleteTask(Task taskToDelete) {
        this.tasks.remove(taskToDelete);
    }

    @Override
    public Task getTask(int id) {
        Task task = this.tasks.get(id);
        return task;
    }

    @Override
    public ArrayList<Task> getAllTasks() {
        return this.tasks;
    }
}
