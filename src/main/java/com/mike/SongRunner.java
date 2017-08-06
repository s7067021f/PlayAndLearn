package com.mike;

import java.util.ArrayList;

public class SongRunner {
    
    ArrayList<Song> alSongs = new ArrayList<Song>();
    
    public void go(){
        Song a = new Song("Title of song", "Artist of song", "Rating of song");
        alSongs.add(a);
        System.out.println(a.toString());
    }
    
    public static void main(String[] args){
        SongRunner songRunner = new SongRunner();
        songRunner.go();        
    }
}
