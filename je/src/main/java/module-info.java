module com.example.je {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.je to javafx.fxml;
    exports com.example.je;
}