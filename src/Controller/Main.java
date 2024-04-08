package Controller;

import Model.FacebookModel;
import View.FacebookView;

public class Main {
    public static void main(String[] args) {
        // Khởi tạo model, view và controller
        FacebookModel model = new FacebookModel();
        FacebookView view = new FacebookView();
        FacebookController controller = new FacebookController(model, view);

        // Tạo và khởi chạy luồng để thêm hoạt động vào lịch sử
        Thread thread1 = new Thread(new ActivityThread(controller, "User A posted a photo", 2000));
        Thread thread2 = new Thread(new ActivityThread(controller, "User B liked a post", 3000));
        Thread thread3 = new Thread(new ActivityThread(controller, "User C commented on a photo", 4000));

        thread1.start();
        thread2.start();
        thread3.start();

        // Chờ cho tất cả các luồng hoàn thành
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Hiển thị lịch sử hoạt động
        controller.displayActivityHistory();
    }
}
