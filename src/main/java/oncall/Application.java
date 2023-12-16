package oncall;

import oncall.controller.MainController;

public class Application {
    public static void main(String[] args) {
        try {
            MainController mainController = new MainController();
            mainController.run();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
