/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Amos Luo
 */

package ucf.assignments;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;


public class buttonFunctions {

    public class UI {

        @FXML
        ObservableList TableUI = FXCollections.observableArrayList();

        @FXML
        private ListView<String> titles;

        @FXML
        private TextField newTask;

        @FXML
        public void addClicked(ActionEvent mouseEvent) {
            //Use the makeList function
        }

        @FXML
        public void loadClicked(ActionEvent mouseEvent) {
            //Use the load function
        }

        @FXML
        public void deleteClicked(ActionEvent mouseEvent) {
            //Use the delete file function
        }

        @FXML
        public void newListClicked(ActionEvent mouseEvent) {
            //Use the newList function
        }

        @FXML
        public void saveClicked(ActionEvent mouseEvent) {
            //Use the save function
        }

        @FXML
        public void completeCheckBox(ActionEvent mouseEvent) {
            //If box is checked, show completed task that are marked by boolean
        }

        @FXML
        public void sortBy(ActionEvent mouseEvent) {
            //Show the data in table in order depending on what option is selected
        }
    }
}
