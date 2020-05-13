package layouts;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ExLayouts extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		GridPane gp = new GridPane();
		gp.setVgap(10);
		Scene scn=new Scene(gp, 600, 300);
		
		Label lblId = new Label("Id");
		gp.add(lblId, 0, 0);
		
		TextField txtId = new TextField("");
		gp.add(txtId, 1, 0);
		
		Label lblNome = new Label("Nome");
		gp.add(lblNome, 0, 1);

		TextField txtNome = new TextField("");
		gp.add(txtNome, 1, 1);
		
		Label lblTelefone = new Label("Telefone");
		gp.add(lblTelefone, 0, 2);

		TextField txtTelefone = new TextField("");
		gp.add(txtTelefone, 1, 2);
		
		FlowPane fp = new FlowPane();
		
		Button btnSalvar = new Button("Salvar");
		fp.getChildren().add(btnSalvar);
		
		Button btnPesquisar = new Button("Pesquisar");
		fp.getChildren().add(btnPesquisar);
		fp.setMaxWidth(200);
		
		gp.add(fp, 0, 3);
		
		stage.setScene(scn);
		stage.setTitle("Cadastro...");
		stage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(ExLayouts.class, args);
	}

}
