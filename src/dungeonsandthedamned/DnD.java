/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.util.Random;
import javafx.scene.text.Text;
import javafx.scene.Group;
import javafx.scene.control.TextField;
import javafx.scene.shape.*;
import javafx.scene.paint.Color;

/**
 *
 * @author henrydare
 */
public class DnD extends Application {

    private TextField strengthStat;
    private Button strengthDie;
    private TextField dexterityStat;
    private Button dexterityDie;
    private TextField constitutionStat;
    private Button constitutionDie;
    private TextField intellectStat;
    private Button intellectDie;
    private TextField wisdomStat;
    private Button wisdomDie;
    private TextField charismaStat;
    private Button charismaDie;
    private TextField perceptionStat;
    private Button perceptionDie;

//    private Text strength;
//    private Text dexterity;
    @Override
    public void start(Stage primaryStage) {

        Rectangle strengthBox = new Rectangle(50, 25, 75, 100);
        strengthBox.setStroke(Color.BLACK);
        strengthBox.setFill(null);
        Text strengthHead = new Text(63, 40, "Strength");
        strengthStat = new TextField("0");
        strengthStat.setPrefWidth(70);
        strengthStat.setPrefHeight(70);
        strengthStat.setStyle("-fx-font-size: 28");
        strengthStat.setLayoutX(52.5);
        strengthStat.setLayoutY(44);
//    strength = new Text(75,165,"0");
//    strength.setStyle("-fx-font-size: 36");
//Ellipse strengthReroll = new Ellipse(87, 200, 30, 15);
// strengthReroll.setStroke(Color.BLACK);
        // strengthReroll.setFill(Color.WHITE);
        //Text rollStrength = new Text(61,203, "(Re-)Roll");
        strengthDie = new Button("(Re-)Roll");
        strengthDie.setId("str");
        strengthDie.setLayoutX(54);
        strengthDie.setLayoutY(115);
        strengthDie.setOnAction(this::statGenerator);

        Group strengthGroup = new Group(strengthBox, strengthHead, strengthStat, strengthDie);

        Rectangle dexterityBox = new Rectangle(50, 150, 75, 100);
        dexterityBox.setStroke(Color.BLACK);
        dexterityBox.setFill(null);
        Text dexterityHead = new Text(63, 165, "Dexterity");
        dexterityStat = new TextField("0");
        dexterityStat.setPrefWidth(70);
        dexterityStat.setPrefHeight(70);
        dexterityStat.setStyle("-fx-font-size: 28");
        dexterityStat.setLayoutX(52.5);
        dexterityStat.setLayoutY(169);
//    dexterity = new Text(75,290,"0");
//    dexterity.setStyle("-fx-font-size: 36");
        dexterityDie = new Button("(Re-)Roll");
        dexterityDie.setId("dex");
        dexterityDie.setLayoutX(54);
        dexterityDie.setLayoutY(240);
        dexterityDie.setOnAction(this::statGenerator);

        Group dexterityGroup = new Group(dexterityBox, dexterityHead, dexterityStat, dexterityDie);

        Rectangle constitutionBox = new Rectangle(50, 275, 75, 100);
        constitutionBox.setStroke(Color.BLACK);
        constitutionBox.setFill(null);
        Text constitutionHead = new Text(53, 290, "Constitution");
        constitutionStat = new TextField("0");
        constitutionStat.setPrefWidth(70);
        constitutionStat.setPrefHeight(70);
        constitutionStat.setStyle("-fx-font-size: 28");
        constitutionStat.setLayoutX(52.5);
        constitutionStat.setLayoutY(294);
        constitutionDie = new Button("(Re-)Roll");
        constitutionDie.setId("const");
        constitutionDie.setLayoutX(54);
        constitutionDie.setLayoutY(365);
        constitutionDie.setOnAction(this::statGenerator);

        Group constitutionGroup = new Group(constitutionBox, constitutionHead, constitutionStat, constitutionDie);

        Rectangle intellectBox = new Rectangle(50, 400, 75, 100);
        intellectBox.setStroke(Color.BLACK);
        intellectBox.setFill(null);
        Text intellectHead = new Text(64, 415, "Intellect");
        intellectStat = new TextField("0");
        intellectStat.setPrefWidth(70);
        intellectStat.setPrefHeight(70);
        intellectStat.setStyle("-fx-font-size: 28");
        intellectStat.setLayoutX(52.5);
        intellectStat.setLayoutY(419);
        intellectDie = new Button("(Re-)Roll");
        intellectDie.setId("intell");
        intellectDie.setLayoutX(54);
        intellectDie.setLayoutY(490);
        intellectDie.setOnAction(this::statGenerator);

        Group intellectGroup = new Group(intellectBox, intellectHead, intellectStat, intellectDie);

        Rectangle wisdomBox = new Rectangle(50, 525, 75, 100);
        wisdomBox.setStroke(Color.BLACK);
        wisdomBox.setFill(null);
        Text wisdomHead = new Text(63, 540, "Wisdom");
        wisdomStat = new TextField("0");
        wisdomStat.setPrefWidth(70);
        wisdomStat.setPrefHeight(70);
        wisdomStat.setStyle("-fx-font-size: 28");
        wisdomStat.setLayoutX(52.5);
        wisdomStat.setLayoutY(544);
        wisdomDie = new Button("(Re-)Roll");
        wisdomDie.setId("wisd");
        wisdomDie.setLayoutX(54);
        wisdomDie.setLayoutY(615);
        wisdomDie.setOnAction(this::statGenerator);

        Group wisdomGroup = new Group(wisdomBox, wisdomHead, wisdomStat, wisdomDie);

        Rectangle charismaBox = new Rectangle(50, 650, 75, 100);
        charismaBox.setStroke(Color.BLACK);
        charismaBox.setFill(null);
        Text charismaHead = new Text(63, 665, "Charisma");
        charismaStat = new TextField("0");
        charismaStat.setPrefWidth(70);
        charismaStat.setPrefHeight(70);
        charismaStat.setStyle("-fx-font-size: 28");
        charismaStat.setLayoutX(52.5);
        charismaStat.setLayoutY(669);
        charismaDie = new Button("(Re-)Roll");
        charismaDie.setId("charis");
        charismaDie.setLayoutX(54);
        charismaDie.setLayoutY(740);
        charismaDie.setOnAction(this::statGenerator);

        Group charismaGroup = new Group(charismaBox, charismaHead, charismaStat, charismaDie);

        Rectangle perceptionBox = new Rectangle(50, 775, 75, 100);
        perceptionBox.setStroke(Color.BLACK);
        perceptionBox.setFill(null);
        Text perceptionHead = new Text(60, 790, "Perception");
        perceptionStat = new TextField("0");
        perceptionStat.setPrefWidth(70);
        perceptionStat.setPrefHeight(70);
        perceptionStat.setStyle("-fx-font-size: 28");
        perceptionStat.setLayoutX(52.5);
        perceptionStat.setLayoutY(794);
        perceptionDie = new Button("Reset");
        perceptionDie.setId("percep");
        perceptionDie.setLayoutX(62);
        perceptionDie.setLayoutY(865);
        perceptionDie.setOnAction(this::statGenerator);

        Group perceptionGroup = new Group(perceptionBox, perceptionHead, perceptionStat, perceptionDie);
        
        Group coreStats = new Group(strengthGroup, dexterityGroup, constitutionGroup, intellectGroup, wisdomGroup, charismaGroup, perceptionGroup);

        Group root = new Group(coreStats);

        Scene scene = new Scene(root, 1000, 1000);

        primaryStage.setTitle("Dungeons and Damned Calculations");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public void statGenerator(ActionEvent event) {

        Random rand = new Random();
        int maxInt = 6;
        int roll1 = rand.nextInt(maxInt);
        int roll2 = rand.nextInt(maxInt);
        int roll3 = rand.nextInt(maxInt);
        int rollTotal = roll1 + roll2 + roll3;
        String tot = Integer.toString(rollTotal);

        if ((event.getSource()).toString().contains("str")) {
            strengthStat.setText(tot);

        } else if ((event.getSource()).toString().contains("dex")) {
            dexterityStat.setText(tot);
        } else if ((event.getSource()).toString().contains("const")) {
            constitutionStat.setText(tot);
        } else if ((event.getSource()).toString().contains("intell")) {
            intellectStat.setText(tot);
            if (Integer.parseInt(wisdomStat.getText()) == 0) {
                perceptionStat.setText(tot);
            } else {
                int result = (rollTotal + Integer.parseInt(wisdomStat.getText())) / 2;
                perceptionStat.setText("" + result);
            }
        } else if ((event.getSource()).toString().contains("wisd")) {
            wisdomStat.setText(tot);
            if (Integer.parseInt(intellectStat.getText()) == 0) {
                perceptionStat.setText(tot);
            } else {
                int result = (rollTotal + Integer.parseInt(intellectStat.getText())) / 2;
                perceptionStat.setText("" + result);
            }
        } else if ((event.getSource()).toString().contains("charis")) {
            charismaStat.setText(tot);
        } else if ((event.getSource()).toString().contains("percep")) {
            strengthStat.setText("0");
            dexterityStat.setText("0");
            constitutionStat.setText("0");
            intellectStat.setText("0");
            wisdomStat.setText("0");
            charismaStat.setText("0");
            perceptionStat.setText("0");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
