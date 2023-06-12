package sample.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXListView;
import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import sample.database.DatabaseHandler;
import sample.model.Task;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;

public class ListController {

    @FXML
    private JFXListView<Task> listTask;

    @FXML
    private JFXTextField listTaskField;

    @FXML
    private JFXTextField listDescriptionField;

    @FXML
    private JFXButton listSaveButton;

    @FXML
    private ImageView listRefreshButton;

    private ObservableList<Task> tasks;
    private ObservableList<Task> refreshedTasks;

    private DatabaseHandler databaseHandler;

    @FXML
    void initialize() throws SQLException, ClassNotFoundException {

        tasks = FXCollections.observableArrayList();

        databaseHandler = new DatabaseHandler();
        ResultSet resultSet = databaseHandler.getTaskByUser(AddItemController.userId);

        while (resultSet.next()) {
            Task task = new Task();
            task.setTaskId(resultSet.getInt("taskid"));
            task.setTask(resultSet.getString("task"));
            task.setDatecreated(resultSet.getTimestamp("datecreated"));
            task.setDescription(resultSet.getString("description"));

            tasks.addAll(task);

            System.out.println("User tasks: " + resultSet.getString("task"));
        }

//Has been remove, this lines of code is for testing purpose
//        Task myTask = new Task();
//        myTask.setTask("Clean Car");
//        myTask.setDescription("Have to clean it before it's to late!");
//        myTask.setDatecreated(Timestamp.valueOf(LocalDateTime.now()));
//
//        Task myTask2 = new Task();
//        myTask2.setTask("Clean House");
//        myTask2.setDescription("Have to clean it before it's to late!");
//        myTask2.setDatecreated(Timestamp.valueOf(LocalDateTime.now()));


        listTask.setItems(tasks);
        listTask.setCellFactory(CellController -> new CellController());

        listSaveButton.setOnAction(actionEvent -> {
            addNewTask();
        });

        listRefreshButton.setOnMouseClicked(mouseEvent -> {
            try {
                refreshList();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        });

    }

    public void refreshList() throws SQLException, ClassNotFoundException {
        System.out.println("refreshList in ListCon called");

        refreshedTasks = FXCollections.observableArrayList();

        DatabaseHandler databaseHandler = new DatabaseHandler();
        ResultSet resultSet = databaseHandler.getTaskByUser(AddItemController.userId);

        while (resultSet.next()){
            Task task = new Task();
            task.setTaskId(resultSet.getInt("taskid"));
            task.setTask(resultSet.getString("task"));
            task.setDatecreated(resultSet.getTimestamp("datecreated"));
            task.setDescription(resultSet.getString("description"));

            refreshedTasks.addAll(task);
        }

        listTask.setItems(refreshedTasks);
        listTask.setCellFactory(CellController -> new CellController());
    }

    public void addNewTask() {

        if (!listTaskField.getText().equals("") || !listDescriptionField.equals("")) {

            Calendar calendar = Calendar.getInstance();

            java.sql.Timestamp timestamp = new java.sql.Timestamp(calendar.getTimeInMillis());

            Task myNewTask = new Task();
            myNewTask.setUserId(AddItemController.userId);
            myNewTask.setTask(listTaskField.getText().trim());
            myNewTask.setDescription(listDescriptionField.getText().trim());
            myNewTask.setDatecreated(timestamp);


            databaseHandler.insertTask(myNewTask);

            listTaskField.setText("");
            listDescriptionField.setText("");

            try {
                initialize();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

    }
}


