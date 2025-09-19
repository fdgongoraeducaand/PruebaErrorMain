module com.example.demomain {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demomain to javafx.fxml;
    exports com.example.demomain;
}