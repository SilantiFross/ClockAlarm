package com.example.silan.clockalarm;

import java.util.ArrayList;
import java.util.List;

class ModelItem {
    private String clockTimeFormat;
    private String nameMusic;

    ModelItem(String clockTime, String nameMusic) {
        this.clockTimeFormat = clockTime;
        this.nameMusic = nameMusic;
    }

    public String getNameMusic() {
        return nameMusic;
    }

    public String getClockTimeFormat() {
        return clockTimeFormat;
    }

    public static List<ModelItem> getFakeItems() {
        ArrayList<ModelItem> itemsList = new ArrayList<>();
        itemsList.add(new ModelItem("12:43", "Drake"));
        itemsList.add(new ModelItem("12:45", "Kendrick"));
        itemsList.add(new ModelItem("12:46", "Azizi"));
        itemsList.add(new ModelItem("12:48", "Basta"));
        return itemsList;
    }
}
