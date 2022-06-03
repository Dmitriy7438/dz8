package ru.netology.radio;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    void radioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(5);

        int actual = rad.getCurrentRadioStation();
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    void radioStation2() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(0);

        int actual = rad.getCurrentRadioStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void radioStation3() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(9);

        int actual = rad.getCurrentRadioStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void next() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(9);

        rad.next();

        int actual = rad.getCurrentRadioStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void prev() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(0);

        rad.prev();

        int actual = rad.getCurrentRadioStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void Volume() {
        Radio vol = new Radio();
        vol.setCurrentVolume(5);

        int actual = vol.getCurrentVolume();
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    void Volume1() {
        Radio vol = new Radio();
        vol.setCurrentVolume(0);

        int actual = vol.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void Volume2() {
        Radio vol = new Radio();
        vol.setCurrentVolume(10);

        int actual = vol.getCurrentVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    void Volume3() {
        Radio vol = new Radio();
        vol.setCurrentVolume(12);

        int actual = vol.getCurrentVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    void Volume4() {
        Radio vol = new Radio();
        vol.setCurrentVolume(-1);

        int actual = vol.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void increaseVolume() {
        Radio vol = new Radio();
        vol.setCurrentVolume(2);

        vol.increaseVolume();

        int actual = vol.getCurrentVolume();
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    void reductionVolume() {
        Radio vol = new Radio();
        vol.setCurrentVolume(2);

        vol.reductionVolume();

        int actual = vol.getCurrentVolume();
        int expected = 1;

        assertEquals(expected, actual);
    }
}
