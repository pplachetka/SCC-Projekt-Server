package com.scc.speiseplan.data;


public class MenuItemSchedule {

    private int date;
    private int position;
    private int menuItemID;

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getMenuItemID() {
        return menuItemID;
    }

    public void setMenuItemID(int menuItemID) {
        this.menuItemID = menuItemID;
    }

    @Override
    public String toString() {
        return "MenuItemSchedule{" +
                "date=" + date +
                ", position=" + position +
                ", menuItemID=" + menuItemID +
                '}';
    }
}