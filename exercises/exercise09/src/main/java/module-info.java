module com.example.exercise09 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exercise09 to javafx.fxml;
    exports com.example.exercise09;
}