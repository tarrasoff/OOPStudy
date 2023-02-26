package oop.study;

import java.util.List;

public class MusicPlayer {
   private List <Music> musicList;

   public MusicPlayer(List<Music> musicList){
       this.musicList = musicList;
   }
   public void setMusicList(List<Music> musicList){
       this.musicList = musicList;
   }

   public void playMusic(){
       for (Music music : musicList){
           System.out.println("Playing: " + music.getSong());
       }
   }
   public void addMusic(Music music){
       musicList.add(music);
   }
}
