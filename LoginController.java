import javafx.fxml.FXML;
import javafx.scene.control.*;

public class LoginController {
    @FXML private TextField txtUsuario;
    @FXML private PasswordField txtPassword;
    @FXML private Label lblMensaje;

    @FXML
    private void handleLogin() {
        String user = txtUsuario.getText();
        String pass = txtPassword.getText();

        if (user.equals("admin") && pass.equals("1234")) {
            lblMensaje.setText("¡Acceso concedido!");
            lblMensaje.setStyle("-fx-text-fill: green;");
        } else {
            lblMensaje.setText("Usuario o contraseña incorrectos.");
        }
    }
}
