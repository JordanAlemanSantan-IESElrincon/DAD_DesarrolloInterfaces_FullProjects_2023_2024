/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Tema2SalonHabana.dto;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Reserve {

    String name;
    String phone;
    String numPersons;
    Date selectedDate;
    String cousine;
    String event;

    public Reserve() {
    }

    public Reserve(String name, String phone, String numPersons, Date selectedDate, String cousine, String event) {
        this.name = name;
        this.phone = phone;
        this.numPersons = numPersons;
        this.selectedDate = selectedDate;
        this.cousine = cousine;
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

    public Date getSelectedDate() {
        return selectedDate;
    }

    public String getCousine() {
        return cousine;
    }

    public String getEvent() {
        return event;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setNumPersons(String numPersons) {
        this.numPersons = numPersons;
    }

    public void setSelectedDate(Date selectedDate) {
        this.selectedDate = selectedDate;
    }

    public void setCousine(String cousine) {
        this.cousine = cousine;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    @Override
    public String toString() {
        return "name: " + name + "\nphone: " + phone + "\nnumPersons: " + numPersons +
                    "\ndate: " + new SimpleDateFormat("dd/MM/yyyy").format(selectedDate) +
                    "\ncousine: " + cousine + "\nevent: " + event;
    }
    
    

    public String[] toArrayStrings() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String[] unaReserva = new String[6];

        unaReserva[0] = getName();
        unaReserva[1] = getPhone();
        unaReserva[2] = getNumPersons();
        unaReserva[3] = sdf.format(getSelectedDate());
        unaReserva[4] = getCousine();
        unaReserva[5] = getEvent();

        return unaReserva;
    }

}
