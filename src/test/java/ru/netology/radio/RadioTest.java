package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();
    Radio radio1 = new Radio(20);

    @Test
    void setCurrentVolumeOverLimit() {
        radio.setCurrentVolume(101);

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeUnderLimit() {
        radio.setCurrentVolume(-1);

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void setIncreaseVolume() {
        radio.setCurrentVolume(99);
        radio.setToIncreaseVolume();

        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void setToDecreaseVolume() {
        radio.setCurrentVolume(1);
        radio.setToDecreaseVolume();

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void setIncreaseVolumeOverLimit() {
        radio.setCurrentVolume(100);
        radio.setToIncreaseVolume();

        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void setDecreaseVolumeUnderLimit() {
        radio.setCurrentVolume(0);
        radio.setToDecreaseVolume();

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void setNextRadioStationMax() {
        radio.setCurrentRadioStation(9);
        radio.setNextRadioStation();

        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void setNextRadioStationInLimit() {
        radio.setCurrentRadioStation(8);
        radio.setNextRadioStation();

        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    void setPrevRadioStationMin() {
        radio.setCurrentRadioStation(0);
        radio.setPrevRadioStation();

        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    void setPrevRadioStationInLimit() {
        radio.setCurrentRadioStation(1);
        radio.setPrevRadioStation();

        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void setRadioStationOverMax() {
        radio.setCurrentRadioStation(10);

        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void setRadioStationUnderMin() {
        radio.setCurrentRadioStation(-1);

        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void setCurrentRadioStation() {
        radio1.setCurrentRadioStation(15);

        assertEquals(15, radio1.getCurrentRadioStation());
    }
}