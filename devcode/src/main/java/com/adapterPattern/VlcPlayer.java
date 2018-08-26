package com.adapterPattern;

/**
 * Created by mithun on 23/04/18.
 */
public class VlcPlayer implements AdvancedMediaPlayer {

    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    public void playMp4(String fileName) {
        //do nothing
    }
}
