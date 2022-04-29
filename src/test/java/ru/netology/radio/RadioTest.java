package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void setIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.setToIncreaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void setToDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.setToDecreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void setVolumeOverLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void setVolumeUnderLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void setNextRadioStationMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.setNextRadioStation();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void setNextRadioStationInLimit() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);
        radio.setNextRadioStation();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void setPrevRadioStationMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.setPrevRadioStation();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void setPrevRadioStationInLimit() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);
        radio.setPrevRadioStation();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void setRadioStationOverMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void setRadioStationUnderMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }
}