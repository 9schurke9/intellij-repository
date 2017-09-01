package MP3Downloader;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

public class View extends BorderPane{
    ListView<String> listViewConvertList, listViewDownloadList;
    Button addsongs,deletesong, download;
    GridPane upperframe,downframe,rightframe,midframe;
    TextField title,interpret;
    Text titleText;
    Text intepretText;
    Text titleForConvertList,titleForDownloadList;
    TextField insertUrl;
    Button paste,convert;
    Text tutorial;
    Button goToPath;
    public View(){
        setMaxSize(1024,1024);

        //Mid
        midframe = new GridPane();
        midframe.setVgap(30);
        midframe.setHgap(30);

        titleForConvertList = new Text("        MP3 Download List");
        titleForConvertList.setFont(new Font("Verdana",15));
        midframe.add(titleForConvertList,0,1);

        titleForDownloadList = new Text("       Finished Downloads");
        titleForDownloadList.setFont(new Font("Verdana",15));
        midframe.add(titleForDownloadList,1,1);

        listViewConvertList = new ListView<>();
        listViewConvertList.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        listViewConvertList.setPrefHeight(500);
        listViewConvertList.setStyle("-fx-font: 14px Verdana");
        midframe.add(listViewConvertList,0,2);

        listViewDownloadList = new ListView<>();
        listViewDownloadList.setPrefHeight(500);
        listViewDownloadList.setStyle("-fx-font: 14px Verdana");
        midframe.add(listViewDownloadList,1,2);


        //downframe
        downframe = new GridPane();
        downframe.setVgap(30);
        downframe.setHgap(30);

        addsongs= new Button("Start Download");
        addsongs.setPadding(new Insets(10,10,10,10));
        downframe.add(addsongs,2,0);

        goToPath = new Button("Open Download Path");
        goToPath.setPadding(new Insets(10,10,10,10));
        downframe.add(goToPath,8,0);

        //upperframe
        upperframe = new GridPane();
        insertUrl = new TextField();
        insertUrl.setPromptText("Copy/paste your Youtube link here...");
        insertUrl.setPadding(new Insets(10,10,10,10));
        insertUrl.setPrefWidth(500);
        insertUrl.setStyle("-fx-prompt-text-fill: darkorange");
        upperframe.add(insertUrl,0,2);

        paste = new Button("Paste");
        paste.setPadding(new Insets(10,10,10,10));
        upperframe.add(paste,1,2);

        convert = new Button("Add to MP3 Download List");
        convert.setPadding(new Insets(10,20,10,10));
        upperframe.add(convert,2,2);

        //rightframe
        rightframe = new GridPane();
        rightframe.setMinSize(200,500);

        titleText = new Text("Title");
        rightframe.add(titleText,0,4);

        title = new TextField();
        title.setPadding(new Insets(5,20,5,5));
        rightframe.add(title,0,5);

        intepretText = new Text("Interpret");
        rightframe.add(intepretText,0,9);

        interpret = new TextField();
        interpret.setPadding(new Insets(5,20,5,5));
        rightframe.add(interpret,0,10);


        download = new Button("Set Download Path");
        download.setPadding(new Insets(10,10,10,10));
        rightframe.add(download,0,14);


        deletesong = new Button("Delete Song from list");
        deletesong.setPadding(new Insets(10,0,10,0));
        deletesong.setPrefWidth(200);
        rightframe.add(deletesong,0,18);

        tutorial = new Text();
        tutorial.setFont(Font.font(20));
        tutorial.setFont(Font.font("Comic Sans MS", FontWeight.EXTRA_LIGHT,18));
        tutorial.setText(" Tutorial\n\n 1. Set Download Path\n\n 2. Paste Youtube link\n\n 3. Start Download");
        rightframe.add(tutorial,0,22);
        VBox vBox = new VBox(5);
        vBox.setMinWidth(200);

        rightframe.setHgap(10);
        rightframe.setVgap(10);

        rightframe.getColumnConstraints().add(new ColumnConstraints(125));

        //Alignments
        setRight(rightframe);
        setBottom(downframe);
        setTop(upperframe);
        setCenter(midframe);
      //  setCenter(listViewDownloadList);
      //  setLeft(listViewConvertList);

    }
}
