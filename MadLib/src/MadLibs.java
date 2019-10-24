import java.util.Scanner;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MadLibs extends Application
{
	Group group;
	String str;
	
	@Override
	public void start(Stage primaryStage)
	{
		// Set user input
		Scanner input = new Scanner(System.in);
		
		// Set first window
		VBox box = new VBox();
		box.setPrefSize(500.0, 600.0);
		group = new Group(box);
		
		// Set the Title
		Font titleFont = new Font(50);
		Text title = new Text(15, 50, "MAD LIBS");
		title.setFont(titleFont);
		group.getChildren().add(title);
		
		// Set silly name text
		Font gameFont = new Font(15);
		Text sillyName = new Text(15,80, "Silly name:");
		sillyName.setFont(gameFont);
		group.getChildren().add(sillyName);
		
		// Set silly name textfield
		TextField txt1 = new TextField();
		txt1.setLayoutX(150);
		txt1.setLayoutY(60);
		txt1.setPrefSize(200, 15);
		group.getChildren().add(txt1);
		
		// Set silly word text
		Text sillyWord = new Text(15, 110, "Silly word:");
		sillyWord.setFont(gameFont);
		group.getChildren().add(sillyWord);
		
		// Set silly word textfield
		TextField txt2 = new TextField();
		txt2.setLayoutX(150);
		txt2.setLayoutY(90);
		txt2.setPrefSize(200, 15);
		group.getChildren().add(txt2);
		
		// Set verb text
		Text verb1 = new Text(15, 140, "Verb:");
		verb1.setFont(gameFont);
		group.getChildren().add(verb1);
		
		// Set verb textfield
		TextField txt3 = new TextField();
		txt3.setLayoutX(150);
		txt3.setLayoutY(120);
		txt3.setPrefSize(200, 15);
		group.getChildren().add(txt3);
		
		// Set noun1
		Text noun1 = new Text(15, 170, "Noun:");
		noun1.setFont(gameFont);
		group.getChildren().add(noun1);
		
		// Set noun1 textfield
		TextField txt4 = new TextField();
		txt4.setLayoutX(150);
		txt4.setLayoutY(150);
		txt4.setPrefSize(200, 15);
		group.getChildren().add(txt4);
		
		// Set body part: plural text
		Text bodyPart = new Text(15, 200, "Body part(plural):");
		bodyPart.setFont(gameFont);
		group.getChildren().add(bodyPart);
		
		// Set bodypart textfield
		TextField txt5 = new TextField();
		txt5.setLayoutX(150);
		txt5.setLayoutY(180);
		txt5.setPrefSize(200, 15);
		group.getChildren().add(txt5);
		
		// Set female name text
		Text femaleName = new Text(15, 230, "Female name:");
		femaleName.setFont(gameFont);
		group.getChildren().add(femaleName);
		
		// Set female name textfield
		TextField txt6 = new TextField();
		txt6.setLayoutX(150);
		txt6.setLayoutY(210);
		txt6.setPrefSize(200, 15);
		group.getChildren().add(txt6);
		
		// Set verb2 text
		Text verb2 = new Text(15, 260, "Verb ending in" + " ED");
		verb2.setFont(gameFont);
		group.getChildren().add(verb2);
		
		// Set verb2 textfield
		TextField txt7 = new TextField();
		txt7.setLayoutX(150);
		txt7.setLayoutY(240);
		txt7.setPrefSize(200, 15);
		group.getChildren().add(txt7);
		
		// Set noun2 text
		Text noun2 = new Text(15, 290, "Noun:");
		noun2.setFont(gameFont);
		group.getChildren().add(noun2);
		
		// Set noun2 textfield
		TextField txt8 = new TextField();
		txt8.setLayoutX(150);
		txt8.setLayoutY(270);
		txt8.setPrefSize(200, 15);
		group.getChildren().add(txt8);
		
		// Set noun3 text
		Text noun3 = new Text(15, 320, "Noun(plural):");
		noun3.setFont(gameFont);
		group.getChildren().add(noun3);
		
		// Set noun3 textfield
		TextField txt9 = new TextField();
		txt9.setLayoutX(150);
		txt9.setLayoutY(300);
		txt9.setPrefSize(200, 15);
		group.getChildren().add(txt9);
		
		// Set verb3 text
		Text verb3 = new Text(15, 350, "Verb:");
		verb3.setFont(gameFont);
		group.getChildren().add(verb3);
		
		// Set verb3 textfield
		TextField txt10 = new TextField();
		txt10.setLayoutX(150);
		txt10.setLayoutY(330);
		txt10.setPrefSize(200, 15);
		group.getChildren().add(txt10);
		
		// Set noun4 text
		Text noun4 = new Text(15, 380, "Noun:");
		noun4.setFont(gameFont);
		group.getChildren().add(noun4);
		
		// Set noun4 textfield
		TextField txt11 = new TextField();
		txt11.setLayoutX(150);
		txt11.setLayoutY(360);
		txt11.setPrefSize(200, 15);
		group.getChildren().add(txt11);
		
		// Set occupation text
		Text occupation = new Text(15, 410, "Occupation:");
		occupation.setFont(gameFont);
		group.getChildren().add(occupation);
		
		// Set occupation textfield
		TextField txt12 = new TextField();
		txt12.setLayoutX(150);
		txt12.setLayoutY(390);
		txt12.setPrefSize(200, 15);
		group.getChildren().add(txt12);
		
		// Set number text
		Text number = new Text(15, 440, "Number:");
		number.setFont(gameFont);
		group.getChildren().add(number);
		
		// Set number textfield
		TextField txt13 = new TextField();
		txt13.setLayoutX(150);
		txt13.setLayoutY(420);
		txt13.setPrefSize(200, 15);
		group.getChildren().add(txt13);
		
		// Set verb4 text
		Text verb4 = new Text(15, 470, "Verb: ");
		verb4.setFont(gameFont);
		group.getChildren().add(verb4);
		
		// Set verb4 textfield
		TextField txt14 = new TextField();
		txt14.setLayoutX(150);
		txt14.setLayoutY(450);
		txt14.setPrefSize(200, 15);
		group.getChildren().add(txt14);
		
		// Set silly word2 text
		Text sillyWord2 = new Text(15, 500, "Silly word:");
		sillyWord2.setFont(gameFont);
		group.getChildren().add(sillyWord2);
		
		// Set sillyword2 textfield
		TextField txt15 = new TextField();
		txt15.setLayoutX(150);
		txt15.setLayoutY(480);
		txt15.setPrefSize(200, 15);
		group.getChildren().add(txt15);
		
		// Set sillyName2 text
		Text sillyName3 = new Text(15, 530, "Silly Name:");
		sillyName3.setFont(gameFont);
		group.getChildren().add(sillyName3);
		
		// Set sillyName2 textfield
		TextField txt16 = new TextField();
		txt16.setLayoutX(150);
		txt16.setLayoutY(510);
		txt16.setPrefSize(200, 15);
		group.getChildren().add(txt16);
		
		// Set MAD LIBS button
		Button button = new Button("MAD LIBS!");
		button.setLayoutX(15);
		button.setLayoutY(550);
		group.getChildren().add(button);
		
		EventHandler<ActionEvent> event = new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent e)
			{
				// Set window2
				Stage window2 = new Stage();
				window2.setWidth(700.0);
				window2.setHeight(500.0);
				Group group2 = new Group();
				
				// Set title for 2nd window
				Font titleFont2 = new Font(50);
				Text title2 = new Text(15, 50, "MAD LIBS");
				title2.setFont(titleFont2);
				group2.getChildren().add(title2);
				
				// Set intro of MAD LIB
				Text intro = new Text(15, 100, "Dear Mr. and Mrs. " + txt1.getText() + " " + txt2.getText());
				intro.setFont(gameFont);
				
				// Set body of MAD LIB text
				Text body = new Text(15, 150, "Will you let me " + txt3.getText() + " your " + txt4.getText() + "? " 
						+ "Ever since I have laid " + txt5.getText() + " on " + txt6.getText() + ", I have " + txt7.getText()
						+ " madly in love with her. \n I wish that she will be the " + txt8.getText() + " of my " + txt9.getText()
						+ " and that someday we will " + txt10.getText() + " happily ever after. \n I have a " + txt11.getText()
						+ " as (a/n) " + txt12.getText() + " that pays $" + txt13.getText() + " each month. I promise to " 
						+ txt14.getText() + " " + txt6.getText() + " with kindness and respect.");
				body.setFont(gameFont);
				
				// Set outtro of MAD LIB
				Text outtro = new Text(15, 300, "Sincerely, \n" + txt15.getText() + " " + txt16.getText());
				group2.getChildren().add(body);
				group2.getChildren().add(outtro);
				group2.getChildren().add(intro);
				
				// Set scene
				Scene scene2 = new Scene(group2, Color.TURQUOISE);
				window2.setScene(scene2);
				window2.show();
				
			}
			
		};
		button.setOnAction(event); // Second window will appear when user presses button
		
		
		// Set Scene 1st window
		Scene scene = new Scene(group, Color.TURQUOISE);
		primaryStage.setScene(scene);
		primaryStage.show();
		input.close();
	}
	
	
	
	public static void main(String[] args) 
	{
		launch(args);
	}

}
