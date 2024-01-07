import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class A {
    public void run() {
        System.out.println("Task 1");
    }

    public void run1() {
        System.out.println("Task 2");
    }
}

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        // Create Runnable instances for run and run1 methods of class A
        Runnable task1 = () -> {
            new A().run();
        };

        Runnable task2 = () -> {
            new A().run1();
        };

        // Submit tasks to the ExecutorService for execution
        executorService.submit(task1);
        executorService.submit(task2);

        // Shutdown the ExecutorService to release resources after tasks are completed
        executorService.shutdown();
    }
}
