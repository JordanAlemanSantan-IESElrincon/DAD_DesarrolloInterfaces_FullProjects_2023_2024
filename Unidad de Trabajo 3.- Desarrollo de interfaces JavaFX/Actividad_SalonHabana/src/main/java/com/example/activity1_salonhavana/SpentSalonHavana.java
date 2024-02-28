package com.example.activity1_salonhavana;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.util.ResourceBundle;

public class SpentSalonHavana extends Application implements Initializable {
    final String BUTTON_NOT_CLICKED = "-fx-background-color: white; -fx-text-fill: black;";
    final String BUTTON_CLICKED = "-fx-background-color: #4e4f56; -fx-text-fill: white;";

    final int DATES_SUCCESS = 5;

    static int controlDatesCorrect = 0;


    String name;
    String phone;
    String numPersons;
    String numberPersonsAux;
    String selectedDate;
    String cuisine;
    String eventOption;

    Reserve reserve;
    AdministrationSalonHavana administrationSalonHavanaController;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        initComponentsPersonalDates();
        initComponentNumberPersons();
        initComponentsDate();
        initComponentTypeCuisine();
        initComponentTypeEvent();
    }

    public void setAdministrationSalonHavana(AdministrationSalonHavana controller) {
        this.administrationSalonHavanaController = controller;
    }

    private void initComponentsPersonalDates() {
        textErrorName.setVisible(false);
        textErrorNameIncorrect.setVisible(false);
        textErrorPhone.setVisible(false);

        stackPanePlaceholderName.setDisable(true);
        stackPanePlaceholderName.setVisible(textFieldClientName.getText().isEmpty());

        textFieldClientName.textProperty().addListener((observable, oldValue, newValue) -> {
            stackPanePlaceholderName.setVisible(newValue.isEmpty());
            if (!newValue.isEmpty())
                textErrorNameIncorrect.setVisible(!newValue.matches("[a-zA-ZÀ-ÿ\\s']+"));
            else
                textErrorNameIncorrect.setVisible(false);

            textErrorName.setVisible(newValue.isEmpty());
        });

        stackPanePlaceholderPhone.setDisable(true);
        stackPanePlaceholderPhone.setVisible(textFieldClientPhone.getText().isEmpty());

        textFieldClientPhone.textProperty().addListener((observable, oldValue, newValue) -> {
            stackPanePlaceholderPhone.setVisible(newValue.isEmpty());

            if (!newValue.matches("\\d*"))
                textFieldClientPhone.setText(newValue.replaceAll("\\D", ""));

            if (newValue.length() > 9)
                textFieldClientPhone.setText(oldValue);

            textErrorPhone.setVisible(newValue.isEmpty());
        });
    }

    // Initializes the component related to the number of persons
    private void initComponentNumberPersons() {
        // Setting initial values for number of persons
        numPersons = "2";
        numberPersonsAux = "2";

        // Styling the button for 2 persons as clicked
        buttonNumberPerson2.setStyle(BUTTON_CLICKED);

        // Disabling the spinner for number of persons
        spinnerNumberPersons.setDisable(true);

        // Setting up the Spinner for selecting the number of persons
        SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(9, 300, 0);
        spinnerNumberPersons.setValueFactory(valueFactory);
        spinnerNumberPersons.getEditor().setAlignment(Pos.CENTER_RIGHT);

        // Handling button clicks for various number of persons
        Button[] listButtons = {
                buttonNumberPerson1,
                buttonNumberPerson2,
                buttonNumberPerson3,
                buttonNumberPerson4,
                buttonNumberPerson5,
                buttonNumberPerson6,
                buttonNumberPerson7,
                buttonNumberPerson8};

        for (Button button : listButtons) {
            button.setOnAction(this::handleButtonClick);
        }

        // Handling checkbox and spinner changes for number of persons
        checkBoxNumberPersons.setOnAction(this::handleCheckBoxSpinnerChange);
        spinnerNumberPersons.valueProperty().addListener((observable, oldValue, newValue) -> {
            if (checkBoxNumberPersons.isSelected()) {
                if (newValue < 9) {
                    newValue = oldValue;
                    spinnerNumberPersons.getEditor().setText(oldValue.toString());
                }
                numPersons = newValue.toString();

                if (rectangleNumberPersons.isVisible())
                    rectangleNumberPersons.setVisible(false);
            }
        });

        spinnerNumberPersons.getEditor().textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("\\d*")) {
                try {
                    int value = Integer.parseInt(oldValue);
                    spinnerNumberPersons.getEditor().setText(Integer.toString(value));
                } catch (NumberFormatException e) {
                    spinnerNumberPersons.getEditor().setText(numPersons);
                }
            } else {
                int value = Integer.parseInt(newValue);
                if (value > 300)
                    spinnerNumberPersons.getEditor().setText(oldValue);
            }
        });
    }

    @FXML
    private void handleButtonClick(ActionEvent event) {
        // Handling button click events for different number of persons
        Button[] listButtons = {
                buttonNumberPerson1,
                buttonNumberPerson2,
                buttonNumberPerson3,
                buttonNumberPerson4,
                buttonNumberPerson5,
                buttonNumberPerson6,
                buttonNumberPerson7,
                buttonNumberPerson8};

        Button clickedButton = (Button) event.getSource();
        numPersons = clickedButton.getText();
        numberPersonsAux = clickedButton.getText();

        checkBoxNumberPersons.setSelected(false);
        spinnerNumberPersons.setDisable(true);

        for (Button button : listButtons)
            button.setStyle(BUTTON_NOT_CLICKED);

        clickedButton.setStyle(BUTTON_CLICKED);
    }

    // Handling changes in checkbox and spinner related to number of persons
    private void handleCheckBoxSpinnerChange(ActionEvent event) {
        spinnerNumberPersons.setDisable(!checkBoxNumberPersons.isSelected());

        Button[] listButtons = {
                buttonNumberPerson1,
                buttonNumberPerson2,
                buttonNumberPerson3,
                buttonNumberPerson4,
                buttonNumberPerson5,
                buttonNumberPerson6,
                buttonNumberPerson7,
                buttonNumberPerson8};

        for (Button button : listButtons)
            button.setStyle(BUTTON_NOT_CLICKED);

        if (checkBoxNumberPersons.isSelected()) {
            numPersons = spinnerNumberPersons.getValue().toString();
        } else {
            numPersons = numberPersonsAux;

            for (Button button : listButtons)
                if ((button.getText()).equals(numberPersonsAux))
                    button.setStyle(BUTTON_CLICKED);
        }
    }

    // Initializes components related to date selection
    private void initComponentsDate() {
        selectedDate = "";

        labelDateChoose.setOnMouseClicked(event -> datePicker.show());

        // Getting the current date
        LocalDate currentDate = LocalDate.now();

        // Calculating the day after tomorrow
        LocalDate dayBeforeTomorrow = currentDate.plusDays(1);

        // Setting up date picker properties
        datePicker.setDayCellFactory(picker -> new DateCell() {
            @Override
            public void updateItem(LocalDate date, boolean empty) {
                super.updateItem(date, empty);
                // Disabling dates before the day after tomorrow
                setDisable(date.isBefore(dayBeforeTomorrow));

                // Setting background color for disabled dates
                if (date.isBefore(dayBeforeTomorrow)) {
                    setStyle("-fx-background-color: #ffcccc;");
                }

            }
        });


        datePicker.setShowWeekNumbers(false);
        datePicker.getEditor().setAlignment(Pos.CENTER_RIGHT);
        datePicker.getEditor().setVisible(false);

        // Handling date selection in the date picker
        datePicker.valueProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue.isAfter(LocalDate.now())) {
                // Formatting and displaying the selected date
                LocalDate selectedLocalDate = datePicker.getValue();

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                selectedDate = selectedLocalDate.format(formatter);

                labelDateChoose.setText(selectedDate);

                if (rectangleSelectDate.isVisible())
                    rectangleSelectDate.setVisible(false);
            }
        });
    }


    private void initComponentTypeCuisine() {
        cuisine = buttonOwnChoose.getText();
        buttonOwnChoose.setStyle(BUTTON_CLICKED);

        Button[] listButtons = {
                buttonBuffet,
                buttonCard,
                buttonChef,
                buttonOwnChoose};

        for (Button button : listButtons)
            button.setOnAction(this::handleButtonClickCuisine);

    }

    @FXML
    private void handleButtonClickCuisine(ActionEvent event) {
        // Handling button click events for different number of persons
        Button[] listButtons = {
                buttonBuffet,
                buttonCard,
                buttonChef,
                buttonOwnChoose};

        Button clickedButton = (Button) event.getSource();
        cuisine = clickedButton.getText();

        for (Button button : listButtons)
            button.setStyle(BUTTON_NOT_CLICKED);

        clickedButton.setStyle(BUTTON_CLICKED);

        String imgName = String.format("img/%s.jpg", clickedButton.getText());
        imgViewHall.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream(imgName))));
    }

    private void initComponentTypeEvent() {
        eventOption = buttonFeast.getText();
        buttonFeast.setStyle(BUTTON_CLICKED);

        buttonRoomNo.setDisable(true);
        buttonRoomYes.setDisable(true);

        SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 100, 1);
        spinnerRoomDays.setValueFactory(valueFactory);
        spinnerRoomDays.getEditor().setAlignment(Pos.CENTER_RIGHT);

        spinnerRoomDays.setDisable(true);

        Button[] listButtons = {
                buttonFeast,
                buttonDayWork,
                buttonCongress};

        for (Button button : listButtons)
            button.setOnAction(this::handleButtonClickEvent);

        Button[] listButtonsNoYes = {
                buttonRoomNo,
                buttonRoomYes
        };

        for (Button button : listButtonsNoYes)
            button.setOnAction(this::handleButtonClickEventNoYes);

        spinnerRoomDays.valueProperty().addListener((observable, oldValue, newValue) -> eventOption = "Congreso (" + newValue.toString() + " días)");
    }

    @FXML
    private void handleButtonClickEvent(ActionEvent event) {
        // Handling button click events for different number of persons
        Button[] listButtons = {
                buttonFeast,
                buttonDayWork,
                buttonCongress};

        Button[] listButtonsNoYes = {
                buttonRoomNo,
                buttonRoomYes
        };

        Button clickedButton = (Button) event.getSource();
        eventOption = clickedButton.getText();

        for (Button button : listButtons)
            button.setStyle(BUTTON_NOT_CLICKED);

        clickedButton.setStyle(BUTTON_CLICKED);

        spinnerRoomDays.setDisable(true);

        if (clickedButton.getText().equals(buttonCongress.getText())) {
            eventOption = "Congreso (0 días)";

            for (Button button : listButtonsNoYes) {
                button.setDisable(false);
                button.setStyle(BUTTON_NOT_CLICKED);
            }

            buttonRoomNo.setStyle(BUTTON_CLICKED);
        } else {
            for (Button button : listButtonsNoYes) {
                button.setDisable(true);
                button.setStyle(BUTTON_NOT_CLICKED);
            }
        }
    }

    @FXML
    private void handleButtonClickEventNoYes(ActionEvent event) {
        Button[] listButtonsNoYes = {
                buttonRoomNo,
                buttonRoomYes
        };

        Button clickedButton = (Button) event.getSource();

        for (Button button : listButtonsNoYes)
            button.setStyle(BUTTON_NOT_CLICKED);

        clickedButton.setStyle(BUTTON_CLICKED);

        if (clickedButton.getText().equals(buttonRoomYes.getText())) {
            spinnerRoomDays.setDisable(false);
            eventOption = "Congreso (" + spinnerRoomDays.getValue().toString() + " días)";
        } else {
            spinnerRoomDays.setDisable(true);
            eventOption = "Congreso (0 días)";
        }
    }

    @FXML
    private void handleButtonReserve() {
        name = textFieldClientName.getText();
        phone = textFieldClientPhone.getText();
        controlDatesCorrect = 0;

        if (name.isEmpty())
            textErrorName.setVisible(true);
        else
            controlDatesCorrect++;

        if (!textErrorNameIncorrect.isVisible())
            controlDatesCorrect++;

        if (phone.isEmpty())
            textErrorPhone.setVisible(true);
        else
            controlDatesCorrect++;

        if (selectedDate.isEmpty())
            rectangleSelectDate.setVisible(true);
        else
            controlDatesCorrect++;

        if ((checkBoxNumberPersons.isSelected() && spinnerNumberPersons.getEditor().getText().isEmpty())) {
            rectangleNumberPersons.setVisible(true);
        } else {
            controlDatesCorrect++;
        }

        if (controlDatesCorrect == DATES_SUCCESS) {
            reserve = new Reserve(name, phone, numPersons, selectedDate, cuisine, eventOption);

            System.out.println(reserve);

            administrationSalonHavanaController.addToReservationTable(reserve);

            Stage stage = (Stage) buttonReserve.getScene().getWindow();
            stage.close();
        }
    }


    @FXML
    public Pane paneMain;
    @FXML
    public Pane paneTitle;
    @FXML
    public Pane paneSectionClientDates;
    @FXML
    public Pane paneClientDatesBackground;
    @FXML
    public Pane paneClientName;
    @FXML
    public Label labelClientName;
    @FXML
    public TextField textFieldClientName;
    @FXML
    public StackPane stackPanePlaceholderName;
    @FXML
    public Text textPlaceholderName;
    @FXML
    public Text textErrorName;
    @FXML
    public Text textErrorNameIncorrect;
    @FXML
    public Pane paneClientPhone;
    @FXML
    public Label labelClientPhone;
    @FXML
    TextField textFieldClientPhone;
    @FXML
    public StackPane stackPanePlaceholderPhone;
    @FXML
    public Text textPlaceholderPhone;
    @FXML
    public Text textErrorPhone;
    @FXML
    public Pane paneSection2_HallDates;
    @FXML
    public Pane paneNumberPersons;
    @FXML
    public Label labelNumberPersons;
    @FXML
    public CheckBox checkBoxNumberPersons;
    @FXML
    public Pane paneNumberPersonsChoose;
    @FXML
    public Button buttonNumberPerson1;
    @FXML
    public Button buttonNumberPerson2;
    @FXML
    public Button buttonNumberPerson3;
    @FXML
    public Button buttonNumberPerson4;
    @FXML
    public Button buttonNumberPerson5;
    @FXML
    public Button buttonNumberPerson6;
    @FXML
    public Button buttonNumberPerson7;
    @FXML
    public Button buttonNumberPerson8;
    @FXML
    public Rectangle rectangleNumberPersons;
    @FXML
    Spinner<Integer> spinnerNumberPersons;
    @FXML
    public Pane paneDate;
    @FXML
    public Label labelDate;
    @FXML
    public DatePicker datePicker;
    @FXML
    public Rectangle rectangleSelectDate;
    @FXML
    public Label labelDateChoose;
    @FXML
    public Pane paneCuisine;
    @FXML
    public Label labelCuisine;
    @FXML
    public Button buttonBuffet;
    @FXML
    public Button buttonCard;
    @FXML
    public Button buttonChef;
    @FXML
    public Button buttonOwnChoose;
    @FXML
    public Pane paneEvent;
    @FXML
    public Label labelEvent;
    @FXML
    public Button buttonFeast;
    @FXML
    public Button buttonDayWork;
    @FXML
    public Button buttonCongress;
    @FXML
    public Pane paneRoom;
    @FXML
    public Label labelRoom;
    @FXML
    public Button buttonRoomNo;
    @FXML
    public Button buttonRoomYes;
    @FXML
    public Pane paneRoomDays;
    @FXML
    public Label labelRoomDays;
    @FXML
    Spinner<Integer> spinnerRoomDays;
    @FXML
    public Label labelKindCuisine;
    @FXML
    public ImageView imgViewHall;
    @FXML
    public Button buttonReserve;


}
