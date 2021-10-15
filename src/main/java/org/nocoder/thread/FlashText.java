// FIXME 在java8以上环境下不能运行
//package org.nocoder.thread;
//
//import javafx.application.Application;
//import javafx.application.Platform;
//import javafx.scene.Scene;
//import javafx.scene.control.Label;
//import javafx.scene.layout.StackPane;
//import javafx.stage.Stage;
//
///**
// * @author jason
// * @date 18/4/7.
// */
//public class FlashText extends Application {
//    private String text = "";
//
//
//    @Override
//    public void start(Stage primaryStage) throws Exception {
//        StackPane pane = new StackPane();
//        Label label = new Label("Programming is fun");
//        pane.getChildren().add(label);
//
//        new Thread(() -> {
//            try {
//                while (true) {
//                    if (label.getText().trim().length() == 0) {
//                        text = "Welcome";
//                    } else {
//                        text = "";
//                    }
//
//                    Platform.runLater(new Runnable() {
//                        @Override
//                        public void run() {
//                            label.setText(text);
//                        }
//                    });
//                    Thread.sleep(200);
//                }
//            } catch (InterruptedException ex) {
//
//            }
//        }).start();
//
//        Scene scene = new Scene(pane, 200, 50);
//        primaryStage.setTitle("FlashText");
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    }
//}
