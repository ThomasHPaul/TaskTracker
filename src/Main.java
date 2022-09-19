import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date testDate = new Date();
        Task test = new Task("task1", "this is a test", testDate);

        System.out.println(test.toString());
    }
}
