module com.himel.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.himel.demo to javafx.fxml;
    exports com.himel.demo;
}