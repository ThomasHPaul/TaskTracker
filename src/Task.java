import java.util.Date;

public class Task {
    int id;
    String title;
    String note;
    boolean isComplete;
    Date dueDate;

    public Task(String title, String note, Date dueDate) {
        this.id = -1;
        this.title = title;
        this.note = note;
        this.isComplete = false;
        this.dueDate = dueDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
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

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", note='" + note + '\'' +
                ", isComplete=" + isComplete +
                ", dueDate=" + dueDate +
                '}';
    }
}
