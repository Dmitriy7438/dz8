package ru.netology.radio;

public class Radio {

    private int currentRadioStation;
    private int currentVolume;

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > 9) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void next() {
        int newCurrentRadioStation = currentRadioStation + 1;
        if (currentRadioStation == 9) {
            newCurrentRadioStation = 0;
        }
        setCurrentRadioStation(newCurrentRadioStation);
    }

    public void prev() {
        setCurrentRadioStation(currentRadioStation == 0 ? 9 : currentRadioStation - 1);
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            currentVolume = 0;
        }
        if (currentVolume > 10) {
            currentVolume = 10;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        int newCurrentVolume = currentVolume + 1;

        setCurrentVolume(newCurrentVolume);
    }

    public void reductionVolume() {
        int newCurrentVolume = currentVolume - 1;

        setCurrentVolume(newCurrentVolume);
    }
}
