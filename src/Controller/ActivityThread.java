package Controller;

public class ActivityThread implements Runnable {
    private FacebookController controller;
    private String activity;
    private int delay;

    public ActivityThread(FacebookController controller, String activity, int delay) {
        this.controller = controller;
        this.activity = activity;
        this.delay = delay;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(delay);
            controller.addActivity(activity);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

