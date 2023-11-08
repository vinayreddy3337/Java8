package DemoLamda;

public class RunnableLambda {
    public static void main(String[] args) {
        // Using Lambda expression with Runnable
        Runnable myRunnable = () -> {
            System.out.println("Running a custom runnable.");
        };

        Thread thread = new Thread(myRunnable);
        thread.start();
    }
}
