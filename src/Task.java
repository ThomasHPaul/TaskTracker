import java.util.Date;

public class Task {
    String title;
    String note;
    boolean isComplete;
    Date dueDate;

    public Task(String title, String note, Date dueDate) {
        this.title = title;
        this.note = note;
        this.isComplete = false;
        this.dueDate = dueDate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getNote() {
        return this.note;
    }

    public void setIsComplete(boolean isComplete) {
        this.isComplete = isComplete;
    }

    public boolean getIsComplete() {
        return this.isComplete;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getDueDate() {
        return this.dueDate;
    }

    public String getDueDateAsString() {
        return this.dueDate.toString();
    }

    public String getTask() {
        String taskDetails = "Task<title=(" + this.getTitle() + "), dueDate=(" + this.getDueDateAsString() + "), isComplete=(" + this.isComplete + "), note=(" + this.getNote() + ")>";
        return taskDetails;
    }
}
