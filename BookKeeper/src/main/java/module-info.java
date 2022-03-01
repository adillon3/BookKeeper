module com.example.bookkeeper {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bookkeeper to javafx.fxml;
    exports com.example.bookkeeper;
}
