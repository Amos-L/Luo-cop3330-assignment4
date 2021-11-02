/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Amos Luo
 */

package ucf.assignments;

public class MakingList {
    String title;
    String task;
    String date;
    String combined;

    public String ListName() {
        //String userinput;
        //Scanf("user input of title", &userinput);
        //newListTitle = userinput
        return title;
    }

    public String getTask(){
        //String userinput;
        //Scanf("user input of task", &userinput);
        //newTask = userinput
        return task;
    }

    public String date(){
        //Get date from calendar from javaFx
        return date;
    }

    public String combine() {
        //Combine all inputs such as task, date, and "completed" and merge into one for table
        //Once all inputs are in, the save button can save the data to the table and add to collection
        //this.combined = ListofCombined
        return combined;
    }
}
