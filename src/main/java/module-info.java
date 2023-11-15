module com.example.collectionsstreamapi {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.collectionsstreamapi to javafx.fxml;
    exports com.example.collectionsstreamapi;
}