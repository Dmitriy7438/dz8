package ru.netology.radio;

public class Radio {

    private int currentRadioStation;
    private int minRadioStation;
    private int maxRadioStation;
    private int currentVolume;
    private int minCurrentVolume;
    private int maxCurrentVolume = 100;

    public Radio(int maxRadioStation) {
        this.maxRadioStation = maxRadioStation;
    }

    public Radio() {
        this.maxRadioStation = 9;

    }
    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < minRadioStation) {
            return;
        }
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void next() {
        int newCurrentRadioStation = currentRadioStation + 1;
        if (currentRadioStation == maxRadioStation) {
            newCurrentRadioStation = minRadioStation;
        }
        setCurrentRadioStation(newCurrentRadioStation);
    }

    public void prev() {
        setCurrentRadioStation(currentRadioStation == minRadioStation ? maxRadioStation : currentRadioStation - 1);
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minCurrentVolume) {
            currentVolume = minCurrentVolume;
        }
        if (currentVolume > maxCurrentVolume) {
            currentVolume = maxCurrentVolume;
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
