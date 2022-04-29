package ru.netology.radio;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void setToIncreaseVolume() {
        currentVolume++;
    }


    public void setToDecreaseVolume() {
        currentVolume--;

    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation <= 0)
            return;
        if (currentRadioStation > 9)
            return;
        this.currentRadioStation = currentRadioStation;
    }

    public void setNextRadioStation() {
        currentRadioStation++;
        if (currentRadioStation > 9) {
            currentRadioStation = 0;
        }
    }

    public void setPrevRadioStation() {
        currentRadioStation--;
        if (currentRadioStation < 0) {
            currentRadioStation = 9;
        }
    }

}


