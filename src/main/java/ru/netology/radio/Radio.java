package ru.netology.radio;

public class Radio {
    private int id;
    private String name;
    private int maxVolume;
    private int minVolume;
    private boolean on;
    private int currentVolume;
    private int currentRadioStation ;
    private int counterRadioStation = 10;

    public Radio(int counterRadioStation) {
        this.counterRadioStation = counterRadioStation;
    }

    public Radio() {
    }



    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;

    }

    public void setToIncreaseVolume() {
        currentVolume++;
        if (currentVolume > 100) {
            currentVolume = 100;
        }

    }

    public void setToDecreaseVolume() {
        currentVolume--;
        if (currentVolume < 0) {
            currentVolume = 0;
        }
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation <= 0)
            return;
        if (currentRadioStation > (counterRadioStation - 1))
            return;
        this.currentRadioStation = currentRadioStation;
    }

    public void setNextRadioStation() {
        currentRadioStation++;
        if (currentRadioStation > (counterRadioStation - 1)) {
            currentRadioStation = 0;
        }
    }

    public void setPrevRadioStation() {
        currentRadioStation--;
        if (currentRadioStation < 0) {
            currentRadioStation = (counterRadioStation - 1);
        }
    }

}


