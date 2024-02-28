package com.example.activity1_salonhavana;

public class Reserve {
    String name;
    String phone;
    String numPersons;
    String selectedDate;
    String cuisine;
    String event;

    public Reserve() {
    }

    public Reserve(String name, String phone, String numPersons, String selectedDate, String cuisine, String event) {
        this.name = name;
        this.phone = phone;
        this.numPersons = numPersons;
        this.selectedDate = selectedDate;
        this.cuisine = cuisine;
        this.event = event;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getNumPersons() {
        return numPersons;
    }

    public String getSelectedDate() {
        return selectedDate;
    }

    public String getCuisine() {
        return cuisine;
    }

    public String getEvent() {
        return event;
    }

    @Override
    public String toString() {
        return "name: " + name + "\nphone: " + phone + "\nnumPersons: " + numPersons +
                "\ndate: " + selectedDate +
                "\ncuisine: " + cuisine + "\nevent: " + event;
    }

    public String[] toArrayStrings() {
        String[] reserve = new String[6];

        reserve[0] = getName();
        reserve[1] = getPhone();
        reserve[2] = getNumPersons();
        reserve[3] = getSelectedDate();
        reserve[4] = getCuisine();
        reserve[5] = getEvent();

        return reserve;
    }
}
