package oop.study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Music classic = new ClassicMusic();
        Music rap = new RapMusic();
        Music rock = new RockMusic();
        Music jazz = new JazzMusic();

        List<Music> musicList = new ArrayList<Music>();
        Collections.addAll(musicList, classic, rap, rock);
        MusicPlayer musicPlayer = new MusicPlayer(musicList);
        musicPlayer.playMusic();
        System.out.println("***********************************************");
        musicPlayer.addMusic(jazz);
        musicPlayer.playMusic();
    }
}
