package br.senai.jandira.mediafinal.ui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TelaMediaFinal extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        stage.setWidth(700);
        stage.setHeight(550);
        stage.setResizable(false);
        stage.setTitle("Média Final");

        // Criar o painel pricipal (root)
        BorderPane root = new BorderPane();

        // Criar objeto scene
        Scene scene = new Scene(root);


        // Criar o label com o título da tela
        Label titulo = new Label();
        titulo.setText("Escola SENAI \"Prof. Vicente Amato\" ");
        titulo.setStyle("-fx-font-size: 22; -fx-text-fill:white;");
        titulo.setPadding(new Insets(10,0,10,10));

        HBox painelSuperior = new HBox();
        painelSuperior.setStyle("-fx-background-color: #0D00B5");
        painelSuperior.getChildren().addAll(titulo);

        // Criação fomulário
        VBox painelFormulario = new VBox();
        painelFormulario.setStyle("-fx-background-color: #006DB5");
        painelFormulario.setPadding(new Insets(25));
        Label lblNomeAluno = new Label("Nome do aluno:");
        lblNomeAluno.setStyle("-fx-font-size: 22; -fx-text-fill:white;");
        Label lblNota1 = new Label("Nota 1:");
        lblNota1.setStyle("-fx-font-size: 22; -fx-text-fill:white;");
        Label lblNota2 = new Label("Nota 2:");
        lblNota2.setStyle("-fx-font-size: 22; -fx-text-fill:white;");
        Label lblNota3 = new Label("Nota 3:");
        lblNota3.setStyle("-fx-font-size: 22; -fx-text-fill:white;");
        Label lblNota4 = new Label("Nota 4:");
        lblNota4.setStyle("-fx-font-size: 22; -fx-text-fill:white;");
        TextField tfNomeAluno = new TextField();
        TextField tfNota1 = new TextField();
        TextField tfNota2 = new TextField();
        TextField tfNota3 = new TextField();
        TextField tfNota4 = new TextField();
        painelFormulario.getChildren().addAll(
                lblNomeAluno, tfNomeAluno,
                lblNota1, tfNota1,
                lblNota2, tfNota2,
                lblNota3, tfNota3,
                lblNota4, tfNota4
        );

        VBox painelBotoes = new VBox();
        painelBotoes.setPadding(new Insets(10));
        painelBotoes.setSpacing(15);
        painelBotoes.setAlignment(Pos.CENTER);
        painelBotoes.setStyle("-fx-background-color: #006DB5");
        Button btCalcularMedia = new Button("Calcular Média");
        btCalcularMedia.setStyle("-fx-font-size: 14; -fx-text-fill:Blue;");
        btCalcularMedia.setPadding(new Insets(0,10,0,0));
        btCalcularMedia.setPrefWidth(150);
        btCalcularMedia.setPrefHeight(100);
        Button btLimpar = new Button("Limpar");
        btLimpar.setStyle("-fx-font-size: 14; -fx-text-fill:Blue;");
        btLimpar.setPadding(new Insets(0,10,0,0));
        btLimpar.setPrefWidth(150);
        btLimpar.setPrefHeight(70);
        Button btSair = new Button("Sair");
        btSair.setStyle("-fx-font-size: 14; -fx-text-fill:Blue;");
        btSair.setPadding(new Insets(0,10,0,0));
        btSair.setPrefWidth(150);
        btSair.setPrefHeight(70);
        painelBotoes.getChildren().addAll(
                btCalcularMedia,
                btLimpar,
                btSair
        );

        VBox painelResultado = new VBox();
        painelResultado.setStyle("-fx-background-color: #0D00B5");
        Label lblResultados = new Label("Resultados:");
        lblResultados.setStyle("-fx-font-size: 22; -fx-text-fill:white;");
        Label lblNomeResultado = new Label("Nome do aluno:");
        lblNomeResultado.setStyle("-fx-font-size: 22; -fx-text-fill:white;");
        Label lblMediaFinal = new Label("Média Final:");
        lblMediaFinal.setStyle("-fx-font-size: 22; -fx-text-fill:white;");
        Label lblSituacao = new Label("Situação:");
        lblSituacao.setStyle("-fx-font-size: 22; -fx-text-fill:white;");
        painelResultado.getChildren().addAll(
                lblResultados,
                lblNomeResultado,
                lblMediaFinal,
                lblSituacao
        );


        // Adicionando conteúdo ao root
        root.setTop(painelSuperior);
        root.setCenter(painelFormulario);
        root.setRight(painelBotoes);
        root.setBottom(painelResultado);


        // Colocar a scene no stage
        stage.setScene(scene);
        stage.show();
    }
}
