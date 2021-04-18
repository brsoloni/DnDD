/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonsandthedamned;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.util.Random;
import javafx.scene.text.Text;
import javafx.scene.Group;
import javafx.scene.control.*;
import javafx.scene.shape.*;
import javafx.scene.paint.Color;


/**
 *
 * @author henrydare
 */
public class DnD extends Application {

    private TextField characterName;
    private TextField characterLevel;
    private TextField characterAge;
    private ComboBox characterGender;
    private ComboBox characterRace;
    private ComboBox characterClass;
    private TextField characterHeight;
    private TextField characterWeight;
    private Button setVarious;

    private ComboBox inventoryArmor;
    private ComboBox inventoryShield;
    private TextField platinumCurrency;
    private TextField goldCurrency;
    private TextField silverCurrency;
    private TextField copperCurrency;
    private TextArea otherInventory;

    private TextField pickP;
    private TextField openL;
    private TextField fRTraps;
    private TextField moveS;
    private TextField hideS;
    private TextField detectN;
    private TextField climbW;
    private TextField readL;

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
    
    private Button allDie;
    private Button save;
    
    private TextField userInput;
    private TextField calcOutput;
    
    private TextField thacoBox;
//    private Text strength;
//    private Text dexterity;
    @Override
    public void start(Stage primaryStage) {

        Rectangle inventoryBasicBox = new Rectangle(140, 100, 915, 275);
        inventoryBasicBox.setStroke(Color.BLACK);
        inventoryBasicBox.setFill(null);

        Text inventoryHeaderLabel = new Text(580, 120, "Inventory");

        Text inventoryArmorLabel = new Text(155, 148, "Current Armor");
        inventoryArmor = new ComboBox();
        inventoryArmor.getItems().addAll("Leather", "Padded", "Studded Leather",
                "Ring mail","Brigandine","Scale Mail","Hide","Chain mail",
                "Split Mail","Banded Mail","Bronze Plate","Plate Mail","Field Plate","Full Plate");
        inventoryArmor.setPrefWidth(125);
        inventoryArmor.setPrefHeight(5);
        // pickP.setStyle("-fx-font-size: 28");
        inventoryArmor.setLayoutX(250);
        inventoryArmor.setLayoutY(130);

        Text inventoryShieldLabel = new Text(390, 148, "Shield");
        inventoryShield = new ComboBox();
        inventoryShield.getItems().addAll("Yes", "No");
        inventoryShield.setPrefWidth(70);
        inventoryShield.setPrefHeight(5);
        // pickP.setStyle("-fx-font-size: 28");
        inventoryShield.setLayoutX(440);
        inventoryShield.setLayoutY(130);

        Text platinumCurrencyLabel = new Text(525, 148, "Platinum");
        platinumCurrency = new TextField("");
        platinumCurrency.setPrefWidth(65);
        platinumCurrency.setPrefHeight(5);
        // pickP.setStyle("-fx-font-size: 28");
        platinumCurrency.setLayoutX(585);
        platinumCurrency.setLayoutY(130);

        Text goldCurrencyLabel = new Text(665, 148, "Gold");
        goldCurrency = new TextField("");
        goldCurrency.setPrefWidth(65);
        goldCurrency.setPrefHeight(5);
        // pickP.setStyle("-fx-font-size: 28");
        goldCurrency.setLayoutX(705);
        goldCurrency.setLayoutY(130);

        Text silverCurrencyLabel = new Text(785, 148, "Silver");
        silverCurrency = new TextField("");
        silverCurrency.setPrefWidth(65);
        silverCurrency.setPrefHeight(5);
        // pickP.setStyle("-fx-font-size: 28");
        silverCurrency.setLayoutX(830);
        silverCurrency.setLayoutY(130);

        Text copperCurrencyLabel = new Text(910, 148, "Copper");
        copperCurrency = new TextField("");
        copperCurrency.setPrefWidth(65);
        copperCurrency.setPrefHeight(5);
        // pickP.setStyle("-fx-font-size: 28");
        copperCurrency.setLayoutX(965);
        copperCurrency.setLayoutY(130);

        otherInventory = new TextArea("");
        otherInventory.setPrefWidth(885);
        otherInventory.setPrefHeight(190);
        // pickP.setStyle("-fx-font-size: 28");
        otherInventory.setLayoutX(155);
        otherInventory.setLayoutY(170);

        Group inventoryBasics = new Group(inventoryBasicBox, inventoryHeaderLabel, inventoryArmorLabel, inventoryArmor, inventoryShieldLabel, inventoryShield,
                platinumCurrencyLabel, platinumCurrency, goldCurrencyLabel, goldCurrency, silverCurrencyLabel, silverCurrency, copperCurrencyLabel, copperCurrency, otherInventory);

        //  Rectangle characterBasicBox = new Rectangle(175, 25, 790, 60);
        Rectangle characterBasicBox = new Rectangle(140, 25, 915, 60);
        characterBasicBox.setStroke(Color.BLACK);
        characterBasicBox.setFill(null);

        characterName = new TextField("Character Name");
        characterName.setPrefWidth(125);
        characterName.setPrefHeight(5);
        // pickP.setStyle("-fx-font-size: 28");
        characterName.setLayoutX(155);
        characterName.setLayoutY(40);

        Text characterAgeLabel = new Text(290, 57, "Age");
        characterAge = new TextField("0");
        characterAge.setPrefWidth(42);
        characterAge.setPrefHeight(5);
        // pickP.setStyle("-fx-font-size: 28");
        characterAge.setLayoutX(315);
        characterAge.setLayoutY(40);

        characterGender = new ComboBox();
        characterGender.getItems().addAll(
                "M", "F");
        characterGender.setValue("Sex");
        characterGender.setPrefWidth(60);
        characterGender.setPrefHeight(5);
        // pickP.setStyle("-fx-font-size: 28");
        characterGender.setLayoutX(372);
        characterGender.setLayoutY(40);

        Text characterLevelLabel = new Text(447, 57, "Level");
        characterLevel = new TextField("0");
        characterLevel.setPrefWidth(42);
        characterLevel.setPrefHeight(5);
        // pickP.setStyle("-fx-font-size: 28");
        characterLevel.setLayoutX(481);
        characterLevel.setLayoutY(40);

        characterRace = new ComboBox();
        characterRace.getItems().addAll(
                "Human",
                "Halfling",
                "Half-Elf",
                "Elf",
                "Gnome",
                "Dwarf"
        );
        characterRace.setValue("Race");
        characterRace.setPrefWidth(100);
        characterRace.setPrefHeight(5);
        // pickP.setStyle("-fx-font-size: 28");
        characterRace.setLayoutX(538);
        characterRace.setLayoutY(40);

        characterClass = new ComboBox();
        characterClass.getItems().addAll(
                "Fighter", "Paladin", "Ranger",
                "Mage", "Specialist", "Illusionist",
                "Cleric", "Mythoi", "Druid",
                "Theif", "Bard", "Multi-Class"
        );
        characterClass.setValue("Class");
        characterClass.setPrefWidth(110);
        characterClass.setPrefHeight(5);
        // pickP.setStyle("-fx-font-size: 28");
        characterClass.setLayoutX(648);
        characterClass.setLayoutY(40);

        Text heightLabel = new Text(768, 57, "Height(in)");
        characterHeight = new TextField("0");
        characterHeight.setPrefWidth(44);
        characterHeight.setPrefHeight(5);
        // pickP.setStyle("-fx-font-size: 28");
        characterHeight.setLayoutX(825);
        characterHeight.setLayoutY(40);

        Text weightLabel = new Text(877, 57, "Weight(lbs)");
        characterWeight = new TextField("0");
        characterWeight.setPrefWidth(44);
        characterWeight.setPrefHeight(5);
        // pickP.setStyle("-fx-font-size: 28");
        characterWeight.setLayoutX(944);
        characterWeight.setLayoutY(40);

        setVarious = new Button("Set");
        setVarious.setId("setVarious");
        setVarious.setLayoutX(1005);
        setVarious.setLayoutY(40);
   setVarious.setOnAction(this::randomCharacter);

        Group CharacterBasics = new Group(characterBasicBox, characterName, characterAgeLabel, characterAge, characterGender, characterLevelLabel, characterLevel,
                characterRace, characterClass, heightLabel, characterHeight, weightLabel, characterWeight, setVarious);

        Rectangle theifStats = new Rectangle(1070, 25, 330, 225);
        Text theifStatLabel = new Text(1200, 45, "Thief Stats");
        theifStats.setStroke(Color.BLACK);
        theifStats.setFill(null);

        Text pickPLabel = new Text(1085, 73, "Pick Pockets");
        pickP = new TextField("");
        pickP.setPrefWidth(35);
        pickP.setPrefHeight(5);
        // pickP.setStyle("-fx-font-size: 28");
        pickP.setLayoutX(1200);
        pickP.setLayoutY(55);

        Group pickPGroup = new Group(pickPLabel, pickP);

        Text openLLabel = new Text(1085, 123, "Open Locks");
        openL = new TextField("");
        openL.setPrefWidth(35);
        openL.setPrefHeight(5);
        //  openL.setStyle("-fx-font-size: 28");
        openL.setLayoutX(1200);
        openL.setLayoutY(105);

        Group openLGroup = new Group(openLLabel, openL);

        Text fRTrapsLabel = new Text(1085, 173, "Find/Remove Traps");
        fRTraps = new TextField("");
        fRTraps.setPrefWidth(35);
        fRTraps.setPrefHeight(5);
        //  fRTraps.setStyle("-fx-font-size: 28");
        fRTraps.setLayoutX(1200);
        fRTraps.setLayoutY(155);

        Group fRTrapsGroup = new Group(fRTrapsLabel, fRTraps);

        Text moveSLabel = new Text(1085, 223, "Move Silently");
        moveS = new TextField("");
        moveS.setPrefWidth(35);
        moveS.setPrefHeight(5);
        //  moveS.setStyle("-fx-font-size: 28");
        moveS.setLayoutX(1200);
        moveS.setLayoutY(205);

        Group moveSGroup = new Group(moveSLabel, moveS);

        Text hideSLabel = new Text(1250, 73, "Hide in Shadows");
        hideS = new TextField("");
        hideS.setPrefWidth(35);
        hideS.setPrefHeight(5);
        //  moveS.setStyle("-fx-font-size: 28");
        hideS.setLayoutX(1350);
        hideS.setLayoutY(55);

        Group hideSGroup = new Group(hideSLabel, hideS);

        Text detectNPLabel = new Text(1250, 123, "Detect Noise");
        detectN = new TextField("");
        detectN.setPrefWidth(35);
        detectN.setPrefHeight(5);
        //  moveS.setStyle("-fx-font-size: 28");
        detectN.setLayoutX(1350);
        detectN.setLayoutY(105);

        Group detectNGroup = new Group(detectNPLabel, detectN);

        Text climbWLabel = new Text(1250, 173, "Climb Walls");
        climbW = new TextField("");
        climbW.setPrefWidth(35);
        climbW.setPrefHeight(5);
        //  moveS.setStyle("-fx-font-size: 28");
        climbW.setLayoutX(1350);
        climbW.setLayoutY(155);

        Group climbWGroup = new Group(climbWLabel, climbW);

        Text rLLabel = new Text(1250, 223, "Read Languages");
        readL = new TextField("");
        readL.setPrefWidth(35);
        readL.setPrefHeight(5);
        //  moveS.setStyle("-fx-font-size: 28");
        readL.setLayoutX(1350);
        readL.setLayoutY(205);

        Group readLGroup = new Group(rLLabel, readL);

        Group theifGroup = new Group(theifStats, theifStatLabel, pickPGroup, openLGroup, fRTrapsGroup, moveSGroup, hideSGroup, detectNGroup, climbWGroup, readLGroup);

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

        allDie = new Button("Roleall");
        allDie.setId("allrole");
        allDie.setLayoutX(62);
        allDie.setLayoutY(900);
        allDie.setOnAction(this::statGenerator);
        
        save = new Button("Save");
        save.setId("Save");
        save.setLayoutX(62);
        save.setLayoutY(927);
        save.setOnAction(this::save);
        
        //Miscellenour Box
        Rectangle miscOutline = new Rectangle(140, 385, 915, 275);
        miscOutline.setStroke(Color.BLACK);
        miscOutline.setFill(null);
        
        Text miscText = new Text("Miscellaneous");
        miscText.setLayoutX(580);
        miscText.setLayoutY(400);
        
        //User Random Number
        
        Text diceSize = new Text("Size of Dice");
        diceSize.setX(155);
        diceSize.setY(420);
        
        Text output = new Text("Output");
        output.setX(230);
        output.setY(420);
        
        userInput = new TextField("0");
        userInput.setLayoutX(155);
        userInput.setLayoutY(425);
        userInput.setPrefWidth(60);

        calcOutput = new TextField("");
        calcOutput.setLayoutX(230);
        calcOutput.setLayoutY(425);
        calcOutput.setPrefWidth(40);
        calcOutput.setEditable(false);
        
        Button diceInput = new Button("Roll");
        diceInput.setLayoutX(155);
        diceInput.setLayoutY(455);
        
        diceInput.setOnAction(this::numCalc);
        
        Group userDice =  new Group(diceSize, diceInput, userInput, calcOutput, output, miscOutline, miscText);
        
        //TACH0
        Text thacoText = new Text("TACH0");
        thacoText.setLayoutX(300);
        thacoText.setLayoutY(420);
        
        thacoBox = new TextField("");
        thacoBox.setLayoutX(300);
        thacoBox.setLayoutY(420);
        thacoBox.setPrefWidth(40);
        thacoBox.setEditable(false);
        
        Button thacoBut = new Button("Update");
        thacoBut.setLayoutX(300);
        thacoBut.setLayoutY(455);
        thacoBut.setOnAction(this::thacoCalc);
        
//        thacoBox.setOnAction(event -> {
//        thacoCalc(characterClass.getValue().toString);
//        });
        
        Group thaco = new Group(thacoText, thacoBox, thacoBut);
        
 
        
        Group perceptionGroup = new Group(perceptionBox, perceptionHead, perceptionStat, perceptionDie,allDie,save);

        Group coreStats = new Group(strengthGroup, dexterityGroup, constitutionGroup, intellectGroup, wisdomGroup, charismaGroup, perceptionGroup);

        Group root = new Group(coreStats, theifGroup, CharacterBasics, inventoryBasics, userDice, thaco);

        Scene scene = new Scene(root, 1000, 1000);

        primaryStage.setTitle("Dungeons and Damned Calculations");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    
    public void save(ActionEvent event)
    {
        
        Character new1 = new Character();
        new1.setName("BOB");
        new1.save();
    
        
    }
    ublic void randomCharacter(ActionEvent event) {
        String chosenGender = characterGender.getValue().toString();
        String chosenRace = characterRace.getValue().toString();
        String chosenClass = characterClass.getValue().toString();
        String chosenAge = characterAge.getText();
        if (Integer.parseInt(strengthStat.getText()) == 0 || strengthStat.getText().trim() == null) {
            strengthStat.setText(total());
        }
        if (Integer.parseInt(dexterityStat.getText()) == 0) {
            dexterityStat.setText(total());
        }
        if (Integer.parseInt(constitutionStat.getText()) == 0) {
            constitutionStat.setText(total());
        }
        if (Integer.parseInt(intellectStat.getText()) == 0) {
            intellectStat.setText(total());
        }
        if (Integer.parseInt(wisdomStat.getText()) == 0) {
            wisdomStat.setText(total());
        }
        if (Integer.parseInt(charismaStat.getText()) == 0) {
            charismaStat.setText(total());
        }
        if (Integer.parseInt(perceptionStat.getText()) == 0) {
            int result = (Integer.parseInt(wisdomStat.getText()) + Integer.parseInt(intellectStat.getText())) / 2;
            perceptionStat.setText("" + result);
        }
        if (chosenGender.contains("Sex")) {
            Random randBinary = new Random();
            int maxInt = 2;
            int randGender = randBinary.nextInt(maxInt);
            if (randGender == 1) {
                characterGender.setValue("M");
            } else {
                characterGender.setValue("F");
            }
        }
        Random ranAge = new Random();
        if (chosenRace.contains("Race")) {
            Random randType = new Random();
            int maxInt = 6;
            int randRace = randType.nextInt(maxInt);
            if (randRace == 1) {
                characterRace.setValue("Human");
                if (chosenAge.contains("0")) {
                    int base = 15;
                    int randAge1 = ranAge.nextInt(4);
                    int dAge = base + randAge1;
                    String sAge = String.valueOf(dAge);
                    characterAge.setText(sAge);
                }
                if (characterGender.getValue() == "M") {
                    int baseH = 60;
                    int randH1 = randType.nextInt(10);
                    int randH2 = randType.nextInt(10);
                    int humanMaleH = baseH + randH1 + randH2;
                    characterHeight.setText(String.valueOf(humanMaleH));
                    int baseW = 140;
                    int randW1 = ranAge.nextInt(10);
                    int randW2 = ranAge.nextInt(10);
                    int randW3 = ranAge.nextInt(10);
                    int randW4 = ranAge.nextInt(10);
                    int randW5 = ranAge.nextInt(10);
                    int randW6 = ranAge.nextInt(10);
                    int maleW = baseW + randW1 + randW2 + randW3 + randW4 + randW5 + randW6;
                    characterWeight.setText(String.valueOf(maleW));
                } else {
                    int baseH = 59;
                    int randH1 = randType.nextInt(10);
                    int randH2 = randType.nextInt(10);
                    int humanMaleH = baseH + randH1 + randH2;
                    characterHeight.setText(String.valueOf(humanMaleH));
                    int baseW = 100;
                    int randW1 = ranAge.nextInt(10);
                    int randW2 = ranAge.nextInt(10);
                    int randW3 = ranAge.nextInt(10);
                    int randW4 = ranAge.nextInt(10);
                    int randW5 = ranAge.nextInt(10);
                    int randW6 = ranAge.nextInt(10);
                    int femaleW = baseW + randW1 + randW2 + randW3 + randW4 + randW5 + randW6;
                    characterWeight.setText(String.valueOf(femaleW));
                }
            } else if (randRace == 2) {
                characterRace.setValue("Halfling");
                if (chosenAge.contains("0")) {
                    int base = 20;
                    int randAge1 = ranAge.nextInt(4);
                    int randAge2 = ranAge.nextInt(4);
                    int randAge3 = ranAge.nextInt(4);
                    int dAge = base + randAge1 + randAge2 + randAge3;
                    String sAge = String.valueOf(dAge);
                    characterAge.setText(sAge);
                }
                if (characterGender.getValue() == "M") {
                    int baseH = 32;
                    int randH1 = randType.nextInt(8);
                    int randH2 = randType.nextInt(8);
                    int maleH = baseH + randH1 + randH2;
                    characterHeight.setText(String.valueOf(maleH));
                    int baseW = 52;
                    int randW1 = ranAge.nextInt(4);
                    int randW2 = ranAge.nextInt(4);
                    int randW3 = ranAge.nextInt(4);
                    int randW4 = ranAge.nextInt(4);
                    int randW5 = ranAge.nextInt(4);
                    int maleW = baseW + randW1 + randW2 + randW3 + randW4 + randW5;
                    characterWeight.setText(String.valueOf(maleW));
                } else {
                    int baseH = 30;
                    int randH1 = randType.nextInt(8);
                    int randH2 = randType.nextInt(8);
                    int femaleH = baseH + randH1 + randH2;
                    characterHeight.setText(String.valueOf(femaleH));
                    int baseW = 48;
                    int randW1 = ranAge.nextInt(4);
                    int randW2 = ranAge.nextInt(4);
                    int randW3 = ranAge.nextInt(4);
                    int randW4 = ranAge.nextInt(4);
                    int randW5 = ranAge.nextInt(4);
                    int femaleW = baseW + randW1 + randW2 + randW3 + randW4 + randW5;
                    characterWeight.setText(String.valueOf(femaleW));
                }
            } else if (randRace == 3) {
                characterRace.setValue("Half-Elf");
                if (chosenAge.contains("0")) {
                    int base = 15;
                    int randAge1 = ranAge.nextInt(6);
                    int dAge = base + randAge1;
                    String sAge = String.valueOf(dAge);
                    characterAge.setText(sAge);
                }
                if (characterGender.getValue() == "M") {
                    int baseH = 60;
                    int randH1 = randType.nextInt(6);
                    int randH2 = randType.nextInt(6);
                    int maleH = baseH + randH1 + randH2;
                    characterHeight.setText(String.valueOf(maleH));
                    int baseW = 110;
                    int randW1 = ranAge.nextInt(12);
                    int randW2 = ranAge.nextInt(12);
                    int randW3 = ranAge.nextInt(12);
                    int maleW = baseW + randW1 + randW2 + randW3;
                    characterWeight.setText(String.valueOf(maleW));
                } else {
                    int baseH = 58;
                    int randH1 = randType.nextInt(6);
                    int randH2 = randType.nextInt(6);
                    int femaleH = baseH + randH1 + randH2;
                    characterHeight.setText(String.valueOf(femaleH));
                    int baseW = 85;
                    int randW1 = ranAge.nextInt(12);
                    int randW2 = ranAge.nextInt(12);
                    int randW3 = ranAge.nextInt(12);
                    int femaleW = baseW + randW1 + randW2 + randW3;
                    characterWeight.setText(String.valueOf(femaleW));
                }
            } else if (randRace == 4) {
                characterRace.setValue("Elf");
                if (chosenAge.contains("0")) {
                    int base = 100;
                    int randAge1 = ranAge.nextInt(6);
                    int randAge2 = ranAge.nextInt(6);
                    int randAge3 = ranAge.nextInt(6);
                    int randAge4 = ranAge.nextInt(6);
                    int randAge5 = ranAge.nextInt(6);
                    int dAge = base + randAge1 + randAge2 + randAge3 + randAge4 + randAge5;
                    String sAge = String.valueOf(dAge);
                    characterAge.setText(sAge);
                }
                if (characterGender.getValue() == "M") {
                    int baseH = 55;
                    int randH1 = randType.nextInt(10);
                    int maleH = baseH + randH1;
                    characterHeight.setText(String.valueOf(maleH));
                    int baseW = 90;
                    int randW1 = ranAge.nextInt(10);
                    int randW2 = ranAge.nextInt(10);
                    int randW3 = ranAge.nextInt(10);
                    int maleW = baseW + randW1 + randW2 + randW3;
                    characterWeight.setText(String.valueOf(maleW));
                } else {
                    int baseH = 50;
                    int randH1 = randType.nextInt(10);
                    int femaleH = baseH + randH1;
                    characterHeight.setText(String.valueOf(femaleH));
                    int baseW = 70;
                    int randW1 = ranAge.nextInt(10);
                    int randW2 = ranAge.nextInt(10);
                    int randW3 = ranAge.nextInt(10);
                    int femaleW = baseW + randW1 + randW2 + randW3;
                    characterWeight.setText(String.valueOf(femaleW));
                }
            } else if (randRace == 5) {
                characterRace.setValue("Gnome");
                if (chosenAge.contains("0")) {
                    int base = 60;
                    int randAge1 = ranAge.nextInt(12);
                    int randAge2 = ranAge.nextInt(12);
                    int randAge3 = ranAge.nextInt(12);
                    int dAge = base + randAge1 + randAge2 + randAge3;
                    String sAge = String.valueOf(dAge);
                    characterAge.setText(sAge);
                }
                if (characterGender.getValue() == "M") {
                    int baseH = 38;
                    int randH1 = randType.nextInt(6);
                    int maleH = baseH + randH1;
                    characterHeight.setText(String.valueOf(maleH));
                    int baseW = 72;
                    int randW1 = ranAge.nextInt(4);
                    int randW2 = ranAge.nextInt(4);
                    int randW3 = ranAge.nextInt(4);
                    int randW4 = ranAge.nextInt(4);
                    int randW5 = ranAge.nextInt(4);
                    int maleW = baseW + randW1 + randW2 + randW3 + randW4 + randW5;
                    characterWeight.setText(String.valueOf(maleW));
                } else {
                    int baseH = 36;
                    int randH1 = randType.nextInt(6);
                    int femaleH = baseH + randH1;
                    characterHeight.setText(String.valueOf(femaleH));
                    int baseW = 68;
                    int randW1 = ranAge.nextInt(4);
                    int randW2 = ranAge.nextInt(4);
                    int randW3 = ranAge.nextInt(4);
                    int randW4 = ranAge.nextInt(4);
                    int randW5 = ranAge.nextInt(4);
                    int femaleW = baseW + randW1 + randW2 + randW3 + randW4 + randW5;
                    characterWeight.setText(String.valueOf(femaleW));
                }
            } else if (randRace == 6) {
                characterRace.setValue("Dwarf");
                if (chosenAge.contains("0")) {
                    int base = 40;
                    int randAge1 = ranAge.nextInt(6);
                    int randAge2 = ranAge.nextInt(6);
                    int randAge3 = ranAge.nextInt(6);
                    int randAge4 = ranAge.nextInt(6);
                    int randAge5 = ranAge.nextInt(6);
                    int dAge = base + randAge1 + randAge2 + randAge3 + randAge4 + randAge5;
                    String sAge = String.valueOf(dAge);
                    characterAge.setText(sAge);
                }
                if (characterGender.getValue() == "M") {
                    int baseH = 43;
                    int randH1 = randType.nextInt(10);
                    int maleH = baseH + randH1;
                    characterHeight.setText(String.valueOf(maleH));
                    int baseW = 130;
                    int randW1 = ranAge.nextInt(10);
                    int randW2 = ranAge.nextInt(10);
                    int randW3 = ranAge.nextInt(10);
                    int randW4 = ranAge.nextInt(10);
                    int maleW = baseW + randW1 + randW2 + randW3 + randW4;
                    characterWeight.setText(String.valueOf(maleW));
                } else {
                    int baseH = 41;
                    int randH1 = randType.nextInt(10);
                    int femaleH = baseH + randH1;
                    characterHeight.setText(String.valueOf(femaleH));
                    int baseW = 105;
                    int randW1 = ranAge.nextInt(10);
                    int randW2 = ranAge.nextInt(10);
                    int randW3 = ranAge.nextInt(10);
                    int randW4 = ranAge.nextInt(10);
                    int femaleW = baseW + randW1 + randW2 + randW3 + randW4;
                    characterWeight.setText(String.valueOf(femaleW));
                }
            }
        }
        if (chosenRace.contains("Human")) {
            int base = 15;
            int randAge1 = ranAge.nextInt(4);
            int dAge = base + randAge1;
            String sAge = String.valueOf(dAge);
            characterAge.setText(sAge);
            if (characterGender.getValue() == "M") {
                int baseH = 60;
                int randH1 = ranAge.nextInt(10);
                int randH2 = ranAge.nextInt(10);
                int humanMaleH = baseH + randH1 + randH2;
                characterHeight.setText(String.valueOf(humanMaleH));
                int baseW = 140;
                int randW1 = ranAge.nextInt(10);
                int randW2 = ranAge.nextInt(10);
                int randW3 = ranAge.nextInt(10);
                int randW4 = ranAge.nextInt(10);
                int randW5 = ranAge.nextInt(10);
                int randW6 = ranAge.nextInt(10);
                int maleW = baseW + randW1 + randW2 + randW3 + randW4 + randW5 + randW6;
                characterWeight.setText(String.valueOf(maleW));
            } else {
                int baseH = 59;
                int randH1 = ranAge.nextInt(10);
                int randH2 = ranAge.nextInt(10);
                int humanMaleH = baseH + randH1 + randH2;
                characterHeight.setText(String.valueOf(humanMaleH));
                int baseW = 100;
                int randW1 = ranAge.nextInt(10);
                int randW2 = ranAge.nextInt(10);
                int randW3 = ranAge.nextInt(10);
                int randW4 = ranAge.nextInt(10);
                int randW5 = ranAge.nextInt(10);
                int randW6 = ranAge.nextInt(10);
                int femaleW = baseW + randW1 + randW2 + randW3 + randW4 + randW5 + randW6;
                characterWeight.setText(String.valueOf(femaleW));
            }
        }
        if (chosenRace.contains("Halfling")) {
            int base = 20;
            int randAge1 = ranAge.nextInt(4);
            int randAge2 = ranAge.nextInt(4);
            int randAge3 = ranAge.nextInt(4);
            int dAge = base + randAge1 + randAge2 + randAge3;
            String sAge = String.valueOf(dAge);
            characterAge.setText(sAge);
            if (characterGender.getValue() == "M") {
                int baseH = 32;
                int randH1 = ranAge.nextInt(8);
                int randH2 = ranAge.nextInt(8);
                int maleH = baseH + randH1 + randH2;
                characterHeight.setText(String.valueOf(maleH));
                int baseW = 52;
                int randW1 = ranAge.nextInt(4);
                int randW2 = ranAge.nextInt(4);
                int randW3 = ranAge.nextInt(4);
                int randW4 = ranAge.nextInt(4);
                int randW5 = ranAge.nextInt(4);
                int maleW = baseW + randW1 + randW2 + randW3 + randW4 + randW5;
                characterWeight.setText(String.valueOf(maleW));
            } else {
                int baseH = 30;
                int randH1 = ranAge.nextInt(8);
                int randH2 = ranAge.nextInt(8);
                int femaleH = baseH + randH1 + randH2;
                characterHeight.setText(String.valueOf(femaleH));
                int baseW = 48;
                int randW1 = ranAge.nextInt(4);
                int randW2 = ranAge.nextInt(4);
                int randW3 = ranAge.nextInt(4);
                int randW4 = ranAge.nextInt(4);
                int randW5 = ranAge.nextInt(4);
                int femaleW = baseW + randW1 + randW2 + randW3 + randW4 + randW5;
                characterWeight.setText(String.valueOf(femaleW));
            }
        }
        if (chosenRace.contains("Half-Elf")) {
            int base = 15;
            int randAge1 = ranAge.nextInt(6);
            int dAge = base + randAge1;
            String sAge = String.valueOf(dAge);
            characterAge.setText(sAge);
            if (characterGender.getValue() == "M") {
                int baseH = 60;
                int randH1 = ranAge.nextInt(6);
                int randH2 = ranAge.nextInt(6);
                int maleH = baseH + randH1 + randH2;
                characterHeight.setText(String.valueOf(maleH));
                int baseW = 110;
                int randW1 = ranAge.nextInt(12);
                int randW2 = ranAge.nextInt(12);
                int randW3 = ranAge.nextInt(12);
                int maleW = baseW + randW1 + randW2 + randW3;
                characterWeight.setText(String.valueOf(maleW));
            } else {
                int baseH = 58;
                int randH1 = ranAge.nextInt(6);
                int randH2 = ranAge.nextInt(6);
                int femaleH = baseH + randH1 + randH2;
                characterHeight.setText(String.valueOf(femaleH));
                int baseW = 85;
                int randW1 = ranAge.nextInt(12);
                int randW2 = ranAge.nextInt(12);
                int randW3 = ranAge.nextInt(12);
                int femaleW = baseW + randW1 + randW2 + randW3;
                characterWeight.setText(String.valueOf(femaleW));
            }
        }
        if (chosenRace.contains("Elf")) {
            int base = 100;
            int randAge1 = ranAge.nextInt(6);
            int randAge2 = ranAge.nextInt(6);
            int randAge3 = ranAge.nextInt(6);
            int randAge4 = ranAge.nextInt(6);
            int randAge5 = ranAge.nextInt(6);
            int dAge = base + randAge1 + randAge2 + randAge3 + randAge4 + randAge5;
            String sAge = String.valueOf(dAge);
            characterAge.setText(sAge);
            if (characterGender.getValue() == "M") {
                int baseH = 55;
                int randH1 = ranAge.nextInt(10);
                int maleH = baseH + randH1;
                characterHeight.setText(String.valueOf(maleH));
                int baseW = 90;
                int randW1 = ranAge.nextInt(10);
                int randW2 = ranAge.nextInt(10);
                int randW3 = ranAge.nextInt(10);
                int maleW = baseW + randW1 + randW2 + randW3;
                characterWeight.setText(String.valueOf(maleW));
            } else {
                int baseH = 50;
                int randH1 = ranAge.nextInt(10);
                int femaleH = baseH + randH1;
                characterHeight.setText(String.valueOf(femaleH));
                int baseW = 70;
                int randW1 = ranAge.nextInt(10);
                int randW2 = ranAge.nextInt(10);
                int randW3 = ranAge.nextInt(10);
                int femaleW = baseW + randW1 + randW2 + randW3;
                characterWeight.setText(String.valueOf(femaleW));
            }
        }
        if (chosenRace.contains("Gnome")) {
            int base = 60;
            int randAge1 = ranAge.nextInt(12);
            int randAge2 = ranAge.nextInt(12);
            int randAge3 = ranAge.nextInt(12);
            int dAge = base + randAge1 + randAge2 + randAge3;
            String sAge = String.valueOf(dAge);
            characterAge.setText(sAge);
            if (characterGender.getValue() == "M") {
                int baseH = 38;
                int randH1 = ranAge.nextInt(6);
                int maleH = baseH + randH1;
                characterHeight.setText(String.valueOf(maleH));
                int baseW = 72;
                int randW1 = ranAge.nextInt(4);
                int randW2 = ranAge.nextInt(4);
                int randW3 = ranAge.nextInt(4);
                int randW4 = ranAge.nextInt(4);
                int randW5 = ranAge.nextInt(4);
                int maleW = baseW + randW1 + randW2 + randW3 + randW4 + randW5;
                characterWeight.setText(String.valueOf(maleW));
            } else {
                int baseH = 36;
                int randH1 = ranAge.nextInt(6);
                int femaleH = baseH + randH1;
                characterHeight.setText(String.valueOf(femaleH));
                int baseW = 68;
                int randW1 = ranAge.nextInt(4);
                int randW2 = ranAge.nextInt(4);
                int randW3 = ranAge.nextInt(4);
                int randW4 = ranAge.nextInt(4);
                int randW5 = ranAge.nextInt(4);
                int femaleW = baseW + randW1 + randW2 + randW3 + randW4 + randW5;
                characterWeight.setText(String.valueOf(femaleW));
            }
        }
        if (chosenRace.contains("Dwarf")) {
            int base = 40;
            int randAge1 = ranAge.nextInt(6);
            int randAge2 = ranAge.nextInt(6);
            int randAge3 = ranAge.nextInt(6);
            int randAge4 = ranAge.nextInt(6);
            int randAge5 = ranAge.nextInt(6);
            int dAge = base + randAge1 + randAge2 + randAge3 + randAge4 + randAge5;
            String sAge = String.valueOf(dAge);
            characterAge.setText(sAge);
            if (characterGender.getValue() == "M") {
                int baseH = 43;
                int randH1 = ranAge.nextInt(10);
                int maleH = baseH + randH1;
                characterHeight.setText(String.valueOf(maleH));
                int baseW = 130;
                int randW1 = ranAge.nextInt(10);
                int randW2 = ranAge.nextInt(10);
                int randW3 = ranAge.nextInt(10);
                int randW4 = ranAge.nextInt(10);
                int maleW = baseW + randW1 + randW2 + randW3 + randW4;
                characterWeight.setText(String.valueOf(maleW));
            } else {
                int baseH = 41;
                int randH1 = ranAge.nextInt(10);
                int femaleH = baseH + randH1;
                characterHeight.setText(String.valueOf(femaleH));
                int baseW = 105;
                int randW1 = ranAge.nextInt(10);
                int randW2 = ranAge.nextInt(10);
                int randW3 = ranAge.nextInt(10);
                int randW4 = ranAge.nextInt(10);
                int femaleW = baseW + randW1 + randW2 + randW3 + randW4;
                characterWeight.setText(String.valueOf(femaleW));
            }
        }
        if (chosenAge.contains("0")) {
            if (chosenRace.contains("Human")) {
                int base = 15;
                int randAge1 = ranAge.nextInt(4);
                int dAge = base + randAge1;
                String sAge = String.valueOf(dAge);
                characterAge.setText(sAge);
            } else if (chosenRace.contains("Halfling")) {
                int base = 20;
                int randAge1 = ranAge.nextInt(4);
                int randAge2 = ranAge.nextInt(4);
                int randAge3 = ranAge.nextInt(4);
                int dAge = base + randAge1 + randAge2 + randAge3;
                String sAge = String.valueOf(dAge);
                characterAge.setText(sAge);
            } else if (chosenRace.contains("Half-Elf")) {
                int base = 15;
                int randAge1 = ranAge.nextInt(6);
                int dAge = base + randAge1;
                String sAge = String.valueOf(dAge);
                characterAge.setText(sAge);
            } else if (chosenRace.contains("Elf")) {
                int base = 100;
                int randAge1 = ranAge.nextInt(6);
                int randAge2 = ranAge.nextInt(6);
                int randAge3 = ranAge.nextInt(6);
                int randAge4 = ranAge.nextInt(6);
                int randAge5 = ranAge.nextInt(6);
                int dAge = base + randAge1 + randAge2 + randAge3 + randAge4 + randAge5;
                String sAge = String.valueOf(dAge);
                characterAge.setText(sAge);
            } else if (chosenRace.contains("Gnome")) {
                int base = 60;
                int randAge1 = ranAge.nextInt(12);
                int randAge2 = ranAge.nextInt(12);
                int randAge3 = ranAge.nextInt(12);
                int dAge = base + randAge1 + randAge2 + randAge3;
                String sAge = String.valueOf(dAge);
                characterAge.setText(sAge);
            } else if (chosenRace.contains("Dwarf")) {
                int base = 40;
                int randAge1 = ranAge.nextInt(6);
                int randAge2 = ranAge.nextInt(6);
                int randAge3 = ranAge.nextInt(6);
                int randAge4 = ranAge.nextInt(6);
                int randAge5 = ranAge.nextInt(6);
                int dAge = base + randAge1 + randAge2 + randAge3 + randAge4 + randAge5;
                String sAge = String.valueOf(dAge);
                characterAge.setText(sAge);
            }
        }
        if (characterWeight.getText().equals("0")) {
            if (chosenRace.contains("Human")) {
                if (characterGender.getValue() == "M") {
                    int baseW = 140;
                    int randW1 = ranAge.nextInt(10);
                    int randW2 = ranAge.nextInt(10);
                    int randW3 = ranAge.nextInt(10);
                    int randW4 = ranAge.nextInt(10);
                    int randW5 = ranAge.nextInt(10);
                    int randW6 = ranAge.nextInt(10);
                    int maleW = baseW + randW1 + randW2 + randW3 + randW4 + randW5 + randW6;
                    characterWeight.setText(String.valueOf(maleW));
                } else {
                    int baseW = 100;
                    int randW1 = ranAge.nextInt(10);
                    int randW2 = ranAge.nextInt(10);
                    int randW3 = ranAge.nextInt(10);
                    int randW4 = ranAge.nextInt(10);
                    int randW5 = ranAge.nextInt(10);
                    int randW6 = ranAge.nextInt(10);
                    int femaleW = baseW + randW1 + randW2 + randW3 + randW4 + randW5 + randW6;
                    characterWeight.setText(String.valueOf(femaleW));
                }
            } else if (chosenRace.contains("Halfling")) {
                if (characterGender.getValue() == "M") {
                    int baseW = 52;
                    int randW1 = ranAge.nextInt(4);
                    int randW2 = ranAge.nextInt(4);
                    int randW3 = ranAge.nextInt(4);
                    int randW4 = ranAge.nextInt(4);
                    int randW5 = ranAge.nextInt(4);
                    int maleW = baseW + randW1 + randW2 + randW3 + randW4 + randW5;
                    characterWeight.setText(String.valueOf(maleW));
                } else {
                    int baseW = 48;
                    int randW1 = ranAge.nextInt(4);
                    int randW2 = ranAge.nextInt(4);
                    int randW3 = ranAge.nextInt(4);
                    int randW4 = ranAge.nextInt(4);
                    int randW5 = ranAge.nextInt(4);
                    int femaleW = baseW + randW1 + randW2 + randW3 + randW4 + randW5;
                    characterWeight.setText(String.valueOf(femaleW));
                }
            } else if (chosenRace.contains("Half-Elf")) {
                if (characterGender.getValue() == "M") {
                    int baseW = 110;
                    int randW1 = ranAge.nextInt(12);
                    int randW2 = ranAge.nextInt(12);
                    int randW3 = ranAge.nextInt(12);
                    int maleW = baseW + randW1 + randW2 + randW3;
                    characterWeight.setText(String.valueOf(maleW));
                } else {
                    int baseW = 85;
                    int randW1 = ranAge.nextInt(12);
                    int randW2 = ranAge.nextInt(12);
                    int randW3 = ranAge.nextInt(12);
                    int femaleW = baseW + randW1 + randW2 + randW3;
                    characterWeight.setText(String.valueOf(femaleW));
                }
            } else if (chosenRace.contains("Elf")) {
                if (characterGender.getValue() == "M") {
                    int baseW = 90;
                    int randW1 = ranAge.nextInt(10);
                    int randW2 = ranAge.nextInt(10);
                    int randW3 = ranAge.nextInt(10);
                    int maleW = baseW + randW1 + randW2 + randW3;
                    characterWeight.setText(String.valueOf(maleW));
                } else {
                    int baseW = 70;
                    int randW1 = ranAge.nextInt(10);
                    int randW2 = ranAge.nextInt(10);
                    int randW3 = ranAge.nextInt(10);
                    int femaleW = baseW + randW1 + randW2 + randW3;
                    characterWeight.setText(String.valueOf(femaleW));
                }
            } else if (chosenRace.contains("Gnome")) {
                if (characterGender.getValue() == "M") {
                    int baseW = 72;
                    int randW1 = ranAge.nextInt(4);
                    int randW2 = ranAge.nextInt(4);
                    int randW3 = ranAge.nextInt(4);
                    int randW4 = ranAge.nextInt(4);
                    int randW5 = ranAge.nextInt(4);
                    int maleW = baseW + randW1 + randW2 + randW3 + randW4 + randW5;
                    characterWeight.setText(String.valueOf(maleW));
                } else {
                    int baseW = 68;
                    int randW1 = ranAge.nextInt(4);
                    int randW2 = ranAge.nextInt(4);
                    int randW3 = ranAge.nextInt(4);
                    int randW4 = ranAge.nextInt(4);
                    int randW5 = ranAge.nextInt(4);
                    int femaleW = baseW + randW1 + randW2 + randW3 + randW4 + randW5;
                    characterWeight.setText(String.valueOf(femaleW));
                }
            } else if (chosenRace.contains("Dwarf")) {
                if (characterGender.getValue() == "M") {
                    int baseW = 130;
                    int randW1 = ranAge.nextInt(10);
                    int randW2 = ranAge.nextInt(10);
                    int randW3 = ranAge.nextInt(10);
                    int randW4 = ranAge.nextInt(10);
                    int maleW = baseW + randW1 + randW2 + randW3 + randW4;
                    characterWeight.setText(String.valueOf(maleW));
                } else {
                    int baseW = 105;
                    int randW1 = ranAge.nextInt(10);
                    int randW2 = ranAge.nextInt(10);
                    int randW3 = ranAge.nextInt(10);
                    int randW4 = ranAge.nextInt(10);
                    int femaleW = baseW + randW1 + randW2 + randW3 + randW4;
                    characterWeight.setText(String.valueOf(femaleW));
                }
            }
        }
        if (chosenClass.contains("Class")) {
            Random randClass = new Random();
            int maxInt = 12;
            int randClasser = randClass.nextInt(maxInt);
            if (randClasser == 1) {
                characterClass.setValue("Fighter");
            } else if (randClasser == 2) {
                characterClass.setValue("Paladin");
            } else if (randClasser == 3) {
                characterClass.setValue("Ranger");
            } else if (randClasser == 4) {
                characterClass.setValue("Mage");
            } else if (randClasser == 5) {
                characterClass.setValue("Specialist");
            } else if (randClasser == 6) {
                characterClass.setValue("Illusionist");
            } else if (randClasser == 7) {
                characterClass.setValue("Cleric");
            } else if (randClasser == 8) {
                characterClass.setValue("Mythoi");
            } else if (randClasser == 9) {
                characterClass.setValue("Druid");
            } else if (randClasser == 10) {
                characterClass.setValue("Theif");
            } else if (randClasser == 11) {
                characterClass.setValue("Bard");
            } else if (randClasser == 12) {
                characterClass.setValue("Multi-Class");
            }
        }
        if (characterName.getText().contains("Character Name")) {
            characterName.setText("Lazy the Powerful");
        }
        if (characterHeight.getText().equals("0")) {
            if (chosenRace.contains("Human")) {
                if (characterGender.getValue() == "M") {
                    int baseH = 60;
                    int randH1 = ranAge.nextInt(10);
                    int randH2 = ranAge.nextInt(10);
                    int humanMaleH = baseH + randH1 + randH2;
                    characterHeight.setText(String.valueOf(humanMaleH));
                } else {
                    int baseH = 59;
                    int randH1 = ranAge.nextInt(10);
                    int randH2 = ranAge.nextInt(10);
                    int humanMaleH = baseH + randH1 + randH2;
                    characterHeight.setText(String.valueOf(humanMaleH));
                }
            } else if (chosenRace.contains("Halfling")) {
                if (characterGender.getValue() == "M") {
                    int baseH = 32;
                    int randH1 = ranAge.nextInt(8);
                    int randH2 = ranAge.nextInt(8);
                    int maleH = baseH + randH1 + randH2;
                    characterHeight.setText(String.valueOf(maleH));
                } else {
                    int baseH = 30;
                    int randH1 = ranAge.nextInt(8);
                    int randH2 = ranAge.nextInt(8);
                    int femaleH = baseH + randH1 + randH2;
                    characterHeight.setText(String.valueOf(femaleH));
                }
            } else if (chosenRace.contains("Half-Elf")) {
                if (characterGender.getValue() == "M") {
                    int baseH = 60;
                    int randH1 = ranAge.nextInt(6);
                    int randH2 = ranAge.nextInt(6);
                    int maleH = baseH + randH1 + randH2;
                    characterHeight.setText(String.valueOf(maleH));
                } else {
                    int baseH = 58;
                    int randH1 = ranAge.nextInt(6);
                    int randH2 = ranAge.nextInt(6);
                    int femaleH = baseH + randH1 + randH2;
                    characterHeight.setText(String.valueOf(femaleH));
                }
            } else if (chosenRace.contains("Elf")) {
                if (characterGender.getValue() == "M") {
                    int baseH = 55;
                    int randH1 = ranAge.nextInt(10);
                    int maleH = baseH + randH1;
                    characterHeight.setText(String.valueOf(maleH));
                } else {
                    int baseH = 50;
                    int randH1 = ranAge.nextInt(10);
                    int femaleH = baseH + randH1;
                    characterHeight.setText(String.valueOf(femaleH));
                }
            } else if (chosenRace.contains("Gnome")) {
                if (characterGender.getValue() == "M") {
                    int baseH = 38;
                    int randH1 = ranAge.nextInt(6);

                    int maleH = baseH + randH1;
                    characterHeight.setText(String.valueOf(maleH));
                } else {
                    int baseH = 36;
                    int randH1 = ranAge.nextInt(6);
                    int femaleH = baseH + randH1;
                    characterHeight.setText(String.valueOf(femaleH));
                }
            } else if (chosenRace.contains("Dwarf")) {
                if (characterGender.getValue() == "M") {
                    int baseH = 43;
                    int randH1 = ranAge.nextInt(10);
                    int maleH = baseH + randH1;
                    characterHeight.setText(String.valueOf(maleH));
                } else {
                    int baseH = 41;
                    int randH1 = ranAge.nextInt(10);
                    int femaleH = baseH + randH1;
                    characterHeight.setText(String.valueOf(femaleH));
                }
            }
        }
        thiefSkillGenerator(Integer.parseInt(dexterityStat.getText()));
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
            thiefSkillGenerator(rollTotal);

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
        } else if ((event.getSource()).toString().contains("allrole")) {
            strengthStat.setText(total());
            dexterityStat.setText(total());
            constitutionStat.setText(total());
            intellectStat.setText(total());
            wisdomStat.setText(total());
            charismaStat.setText(total());
            int result = (Integer.parseInt(wisdomStat.getText()) + Integer.parseInt(intellectStat.getText())) / 2;
            perceptionStat.setText(""+result);
            
        }
        
    }
    public String total(){
        Random rand = new Random();
        int maxInt = 6;
        int roll1 = rand.nextInt(maxInt);
        int roll2 = rand.nextInt(maxInt);
        int roll3 = rand.nextInt(maxInt);
        int rollTotal = roll1 + roll2 + roll3;
        return Integer.toString(rollTotal);
    }
    public void thiefSkillGenerator(int dexInput) {
        String chosenRace = characterRace.getValue().toString();
        // int dexNum=Integer.parseInt(dexterityStat.getText());
        int dexNum = dexInput;
        if (dexNum < 9) {
            pickP.setText("0%");
            openL.setText("0%");
            fRTraps.setText("0%");
            moveS.setText("0%");
            hideS.setText("0%");
            detectN.setText("0%");
            climbW.setText("0%");
            readL.setText("0%");
        } else if (dexNum == 9) {
            if (chosenRace.equals("Halfling")) {
                pickP.setText("5%");
                openL.setText("5%");
                fRTraps.setText("0%");
                moveS.setText("0%");
                hideS.setText("10%");
                detectN.setText("20%");
                climbW.setText("45%");
                readL.setText("-5%");
            }
            if (chosenRace.equals("Half-Elf")) {
                pickP.setText("10%");
                openL.setText("0%");
                fRTraps.setText("-5%");
                moveS.setText("-10%");
                hideS.setText("0%");
                detectN.setText("15%");
                climbW.setText("60%");
                readL.setText("0%");
            }
            if (chosenRace.equals("Elf")) {
                pickP.setText("5%");
                openL.setText("-5%");
                fRTraps.setText("-5%");
                moveS.setText("-5%");
                hideS.setText("5%");
                detectN.setText("20%");
                climbW.setText("60%");
                readL.setText("0%");
            }
            if (chosenRace.equals("Gnome")) {
                pickP.setText("0%");
                openL.setText("5%");
                fRTraps.setText("5%");
                moveS.setText("-5%");
                hideS.setText("0%");
                detectN.setText("25%");
                climbW.setText("45%");
                readL.setText("0%");
            }
            if (chosenRace.equals("Dwarf")) {
                pickP.setText("0%");
                openL.setText("10%");
                fRTraps.setText("10%");
                moveS.setText("-10%");
                hideS.setText("-5%");
                detectN.setText("15%");
                climbW.setText("50%");
                readL.setText("-5%");
            }
            if (chosenRace.equals("Human")) {
                pickP.setText("0%");
                openL.setText("0%");
                fRTraps.setText("-5%");
                moveS.setText("-10%");
                hideS.setText("-5%");
                detectN.setText("15%");
                climbW.setText("60%");
                readL.setText("0%");
            }
        } else if (dexNum == 10) {
            if (chosenRace.equals("Halfling")) {
                pickP.setText("10%");
                openL.setText("10%");
                fRTraps.setText("0%");
                moveS.setText("5%");
                hideS.setText("15%");
                detectN.setText("20%");
                climbW.setText("45%");
                readL.setText("-5%");
            }
            if (chosenRace.equals("Half-Elf")) {
                pickP.setText("15%");
                openL.setText("5%");
                fRTraps.setText("-5%");
                moveS.setText("-5%");
                hideS.setText("5%");
                detectN.setText("15%");
                climbW.setText("60%");
                readL.setText("0%");
            }
            if (chosenRace.equals("Elf")) {
                pickP.setText("10%");
                openL.setText("0%");
                fRTraps.setText("-5%");
                moveS.setText("0%");
                hideS.setText("10%");
                detectN.setText("20%");
                climbW.setText("60%");
                readL.setText("0%");
            }
            if (chosenRace.equals("Gnome")) {
                pickP.setText("5%");
                openL.setText("10%");
                fRTraps.setText("5%");
                moveS.setText("0%");
                hideS.setText("5%");
                detectN.setText("25%");
                climbW.setText("45%");
                readL.setText("0%");
            }
            if (chosenRace.equals("Dwarf")) {
                pickP.setText("5%");
                openL.setText("15%");
                fRTraps.setText("10%");
                moveS.setText("-5%");
                hideS.setText("0%");
                detectN.setText("15%");
                climbW.setText("50%");
                readL.setText("-5%");
            }
            if (chosenRace.equals("Human")) {
                pickP.setText("5%");
                openL.setText("5%");
                fRTraps.setText("-5%");
                moveS.setText("-5%");
                hideS.setText("0%");
                detectN.setText("15%");
                climbW.setText("60%");
                readL.setText("0%");
            }
        } else if (dexNum == 11) {
            if (chosenRace.equals("Halfling")) {
                pickP.setText("15%");
                openL.setText("15%");
                fRTraps.setText("5%");
                moveS.setText("10%");
                hideS.setText("20%");
                detectN.setText("20%");
                climbW.setText("45%");
                readL.setText("-5%");
            }
            if (chosenRace.equals("Half-Elf")) {
                pickP.setText("20%");
                openL.setText("10%");
                fRTraps.setText("0%");
                moveS.setText("0%");
                hideS.setText("10%");
                detectN.setText("15%");
                climbW.setText("60%");
                readL.setText("0%");
            }
            if (chosenRace.equals("Elf")) {
                pickP.setText("15%");
                openL.setText("5%");
                fRTraps.setText("0%");
                moveS.setText("5%");
                hideS.setText("15%");
                detectN.setText("20%");
                climbW.setText("60%");
                readL.setText("0%");
            }
            if (chosenRace.equals("Gnome")) {
                pickP.setText("10%");
                openL.setText("15%");
                fRTraps.setText("10%");
                moveS.setText("5%");
                hideS.setText("10%");
                detectN.setText("25%");
                climbW.setText("45%");
                readL.setText("0%");
            }
            if (chosenRace.equals("Dwarf")) {
                pickP.setText("10%");
                openL.setText("20%");
                fRTraps.setText("15%");
                moveS.setText("0%");
                hideS.setText("5%");
                detectN.setText("15%");
                climbW.setText("50%");
                readL.setText("-5%");
            }
            if (chosenRace.equals("Human")) {
                pickP.setText("10%");
                openL.setText("10%");
                fRTraps.setText("0%");
                moveS.setText("0%");
                hideS.setText("5%");
                detectN.setText("15%");
                climbW.setText("60%");
                readL.setText("0%");
            }
        } else if (dexNum == 12) {
            if (chosenRace.equals("Halfling")) {
                pickP.setText("20%");
                openL.setText("15%");
                fRTraps.setText("10%");
                moveS.setText("15%");
                hideS.setText("20%");
                detectN.setText("20%");
                climbW.setText("45%");
                readL.setText("-5%");
            }
            if (chosenRace.equals("Half-Elf")) {
                pickP.setText("25%");
                openL.setText("10%");
                fRTraps.setText("5%");
                moveS.setText("5%");
                hideS.setText("10%");
                detectN.setText("15%");
                climbW.setText("60%");
                readL.setText("0%");
            }
            if (chosenRace.equals("Elf")) {
                pickP.setText("20%");
                openL.setText("5%");
                fRTraps.setText("5%");
                moveS.setText("10%");
                hideS.setText("15%");
                detectN.setText("20%");
                climbW.setText("60%");
                readL.setText("0%");
            }
            if (chosenRace.equals("Gnome")) {
                pickP.setText("15%");
                openL.setText("15%");
                fRTraps.setText("15%");
                moveS.setText("10%");
                hideS.setText("10%");
                detectN.setText("25%");
                climbW.setText("45%");
                readL.setText("0%");
            }
            if (chosenRace.equals("Dwarf")) {
                pickP.setText("15%");
                openL.setText("20%");
                fRTraps.setText("20%");
                moveS.setText("5%");
                hideS.setText("5%");
                detectN.setText("15%");
                climbW.setText("50%");
                readL.setText("-5%");
            }
            if (chosenRace.equals("Human")) {

                pickP.setText("15%");
                openL.setText("10%");
                fRTraps.setText("5%");
                moveS.setText("5%");
                hideS.setText("5%");
                detectN.setText("15%");
                climbW.setText("60%");
                readL.setText("0%");
            }
        } else if (dexNum >= 13 && dexNum <= 15) {
            if (chosenRace.equals("Halfling")) {
                pickP.setText("20%");
                openL.setText("15%");
                fRTraps.setText("10%");
                moveS.setText("20%");
                hideS.setText("20%");
                detectN.setText("20%");
                climbW.setText("45%");
                readL.setText("-5%");
            }
            if (chosenRace.equals("Half-Elf")) {
                pickP.setText("25%");
                openL.setText("10%");
                fRTraps.setText("5%");
                moveS.setText("10%");
                hideS.setText("10%");
                detectN.setText("15%");
                climbW.setText("60%");
                readL.setText("0%");
            }
            if (chosenRace.equals("Elf")) {
                pickP.setText("20%");
                openL.setText("5%");
                fRTraps.setText("5%");
                moveS.setText("15%");
                hideS.setText("15%");
                detectN.setText("20%");
                climbW.setText("60%");
                readL.setText("0%");
            }
            if (chosenRace.equals("Gnome")) {
                pickP.setText("15%");
                openL.setText("15%");
                fRTraps.setText("15%");
                moveS.setText("15%");
                hideS.setText("10%");
                detectN.setText("25%");
                climbW.setText("45%");
                readL.setText("0%");
            }
            if (chosenRace.equals("Dwarf")) {
                pickP.setText("15%");
                openL.setText("20%");
                fRTraps.setText("20%");
                moveS.setText("10%");
                hideS.setText("5%");
                detectN.setText("15%");
                climbW.setText("50%");
                readL.setText("-5%");
            }
            if (chosenRace.equals("Human")) {
                pickP.setText("15%");
                openL.setText("10%");
                fRTraps.setText("5%");
                moveS.setText("10%");
                hideS.setText("5%");
                detectN.setText("15%");
                climbW.setText("60%");
                readL.setText("0%");
            }
        } else if (dexNum == 16) {
            if (chosenRace.equals("Halfling")) {
                pickP.setText("20%");
                openL.setText("20%");
                fRTraps.setText("10%");
                moveS.setText("20%");
                hideS.setText("20%");
                detectN.setText("20%");
                climbW.setText("45%");
                readL.setText("-5%");
            }
            if (chosenRace.equals("Half-Elf")) {
                pickP.setText("25%");
                openL.setText("15%");
                fRTraps.setText("5%");
                moveS.setText("10%");
                hideS.setText("10%");
                detectN.setText("15%");
                climbW.setText("60%");
                readL.setText("0%");
            }
            if (chosenRace.equals("Elf")) {
                pickP.setText("20%");
                openL.setText("10%");
                fRTraps.setText("5%");
                moveS.setText("15%");
                hideS.setText("15%");
                detectN.setText("20%");
                climbW.setText("60%");
                readL.setText("0%");
            }
            if (chosenRace.equals("Gnome")) {
                pickP.setText("15%");
                openL.setText("20%");
                fRTraps.setText("15%");
                moveS.setText("15%");
                hideS.setText("10%");
                detectN.setText("25%");
                climbW.setText("45%");
                readL.setText("0%");
            }
            if (chosenRace.equals("Dwarf")) {
                pickP.setText("15%");
                openL.setText("25%");
                fRTraps.setText("20%");
                moveS.setText("10%");
                hideS.setText("5%");
                detectN.setText("15%");
                climbW.setText("50%");
                readL.setText("-5%");
            }
            if (chosenRace.equals("Human")) {
                pickP.setText("15%");
                openL.setText("15%");
                fRTraps.setText("5%");
                moveS.setText("10%");
                hideS.setText("5%");
                detectN.setText("15%");
                climbW.setText("60%");
                readL.setText("0%");
            }
        } else if (dexNum == 17) {
            if (chosenRace.equals("Halfling")) {
                pickP.setText("25%");
                openL.setText("30%");
                fRTraps.setText("10%");
                moveS.setText("25%");
                hideS.setText("25%");
                detectN.setText("20%");
                climbW.setText("45%");
                readL.setText("-5%");
            }
            if (chosenRace.equals("Half-Elf")) {
                pickP.setText("30%");
                openL.setText("25%");
                fRTraps.setText("5%");
                moveS.setText("15%");
                hideS.setText("15%");
                detectN.setText("15%");
                climbW.setText("60%");
                readL.setText("0%");
            }
            if (chosenRace.equals("Elf")) {
                pickP.setText("25%");
                openL.setText("20%");
                fRTraps.setText("5%");
                moveS.setText("20%");
                hideS.setText("20%");
                detectN.setText("20%");
                climbW.setText("60%");
                readL.setText("0%");
            }
            if (chosenRace.equals("Gnome")) {
                pickP.setText("20%");
                openL.setText("30%");
                fRTraps.setText("15%");
                moveS.setText("20%");
                hideS.setText("15%");
                detectN.setText("25%");
                climbW.setText("45%");
                readL.setText("0%");
            }
            if (chosenRace.equals("Dwarf")) {
                pickP.setText("20%");
                openL.setText("35%");
                fRTraps.setText("20%");
                moveS.setText("15%");
                hideS.setText("10%");
                detectN.setText("15%");
                climbW.setText("50%");
                readL.setText("-5%");
            }
            if (chosenRace.equals("Human")) {
                pickP.setText("20%");
                openL.setText("25%");
                fRTraps.setText("5%");
                moveS.setText("15%");
                hideS.setText("10%");
                detectN.setText("15%");
                climbW.setText("60%");
                readL.setText("0%");
            }
        } else if (dexNum == 18) {
            if (chosenRace.equals("Halfling")) {
                pickP.setText("35%");
                openL.setText("45%");
                fRTraps.setText("15%");
                moveS.setText("35%");
                hideS.setText("35%");
                detectN.setText("20%");
                climbW.setText("45%");
                readL.setText("-5%");
            }
            if (chosenRace.equals("Half-Elf")) {
                pickP.setText("40%");
                openL.setText("40%");
                fRTraps.setText("10%");
                moveS.setText("25%");
                hideS.setText("25%");
                detectN.setText("15%");
                climbW.setText("60%");
                readL.setText("0%");
            }
            if (chosenRace.equals("Elf")) {
                pickP.setText("35%");
                openL.setText("35%");
                fRTraps.setText("10%");
                moveS.setText("30%");
                hideS.setText("30%");
                detectN.setText("20%");
                climbW.setText("60%");
                readL.setText("0%");
            }
            if (chosenRace.equals("Gnome")) {
                pickP.setText("30%");
                openL.setText("45%");
                fRTraps.setText("20%");
                moveS.setText("30%");
                hideS.setText("25%");
                detectN.setText("25%");
                climbW.setText("45%");
                readL.setText("0%");
            }
            if (chosenRace.equals("Dwarf")) {
                pickP.setText("30%");
                openL.setText("50%");
                fRTraps.setText("25%");
                moveS.setText("25%");
                hideS.setText("20%");
                detectN.setText("15%");
                climbW.setText("50%");
                readL.setText("-5%");
            }
            if (chosenRace.equals("Human")) {
                pickP.setText("30%");
                openL.setText("40%");
                fRTraps.setText("10%");
                moveS.setText("25%");
                hideS.setText("20%");
                detectN.setText("15%");
                climbW.setText("60%");
                readL.setText("0%");
            }
        } else if (dexNum == 19) {
            if (chosenRace.equals("Halfling")) {
                pickP.setText("50%");
                openL.setText("65%");
                fRTraps.setText("25%");
                moveS.setText("50%");
                hideS.setText("50%");
                detectN.setText("20%");
                climbW.setText("45%");
                readL.setText("-5%");
            }
            if (chosenRace.equals("Half-Elf")) {
                pickP.setText("55%");
                openL.setText("60%");
                fRTraps.setText("20%");
                moveS.setText("40%");
                hideS.setText("40%");
                detectN.setText("15%");
                climbW.setText("60%");
                readL.setText("0%");
            }
            if (chosenRace.equals("Elf")) {
                pickP.setText("50%");
                openL.setText("55%");
                fRTraps.setText("20%");
                moveS.setText("45%");
                hideS.setText("45%");
                detectN.setText("20%");
                climbW.setText("60%");
                readL.setText("0%");
            }
            if (chosenRace.equals("Gnome")) {
                pickP.setText("45%");
                openL.setText("65%");
                fRTraps.setText("30%");
                moveS.setText("45%");
                hideS.setText("40%");
                detectN.setText("25%");
                climbW.setText("45%");
                readL.setText("0%");
            }
            if (chosenRace.equals("Dwarf")) {
                pickP.setText("45%");
                openL.setText("70%");
                fRTraps.setText("35%");
                moveS.setText("40%");
                hideS.setText("35%");
                detectN.setText("15%");
                climbW.setText("50%");
                readL.setText("-5%");
            }
            if (chosenRace.equals("Human")) {
                pickP.setText("45%");
                openL.setText("60%");
                fRTraps.setText("20%");
                moveS.setText("40%");
                hideS.setText("35%");
                detectN.setText("15%");
                climbW.setText("60%");
                readL.setText("0%");
            }
        }
    }
    
    
    public void numCalc(ActionEvent event){
        System.out.println("Roll");
        int n1 = Integer.parseInt(userInput.getText());
        if(n1!=0){
            int numGen =(int)(Math.random()*n1+1);
            calcOutput.setText(Integer.toString(numGen));
        }
        else{
        calcOutput.setText("0");
        }     
    }
    
    public void thacoCalc(String groupType){
        String groupT = (String) characterClass.getValue().toString();
        int userLevel = Integer.parseInt(characterLevel.getText());
        if(groupT.contains("Cleric")|| groupT.contains("Mage")){
            switch(userLevel){
                case 1:
                case 2:
                case 3:
                    thacoBox.setText("20");
                break;
                case 4:
                case 5:
                case 6:
                    thacoBox.setText("18");
                break;
                case 7:
                case 8:
                case 9:
                    thacoBox.setText("16");
                break;
                case 10:
                case 11:
                case 12:
                    thacoBox.setText("14");
                break;
                case 13:
                case 14:
                case 15:
                    thacoBox.setText("12");
                break;
                case 16:
                case 17:
                case 18:
                    thacoBox.setText("10");
                break;
                case 19:
                case 20:
                    thacoBox.setText("8");
                
            }
        } 
        else if(groupT.contains("Thief")|| groupT.contains("Bard")){
            switch(userLevel){
                case 1:
                case 2:
                    thacoBox.setText("20");
                break;
                case 3:
                case 4:
                    thacoBox.setText("19");
                break;
                case 5:
                case 6:
                    thacoBox.setText("18");
                break;
                case 7:
                case 8:
                    thacoBox.setText("17");
                break;
                case 9:
                case 10:
                    thacoBox.setText("16");
                break;
                case 11:
                case 12:
                    thacoBox.setText("15");
                break;
                case 13:
                case 14:
                    thacoBox.setText("14");
                break;
                case 15:
                case 16:
                    thacoBox.setText("13");
                break;
                case 17:
                case 18:
                    thacoBox.setText("12");
                break;
                case 19:
                case 20:
                    thacoBox.setText("11");
                break;
            }
 
        }
        else if(groupT.contains("Fighter") || groupT.contains("Paladin") || groupT.contains("Ranger")){
            int warriorNum = 21 - userLevel;
            thacoBox.setText(Integer.toString(warriorNum));
        }
        else if(groupT.contains("Mage")){
            switch(userLevel){
                case 1:
                case 2:
                case 3:
                    thacoBox.setText("20");
                break;
                case 4:
                case 5:
                case 6:
                    thacoBox.setText("19");
                break;
                case 7:
                case 8:
                case 9:
                    thacoBox.setText("18");
                break;
                case 10:
                case 11:
                case 12:
                    thacoBox.setText("17");
                break;
                case 13:
                case 14:
                case 15:
                    thacoBox.setText("16");
                break;
                case 16:
                case 17:
                case 18:
                    thacoBox.setText("14");
                break;
                case 19:
                case 20:
                    thacoBox.setText("13");
                
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
