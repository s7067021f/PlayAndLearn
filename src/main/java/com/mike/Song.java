package com.mike;

import java.util.*;

public class Song {
    
    String title;
    String artist;
    String rating;
    
    public Song(String t, String a, String r){
        title = t;
        artist = a;
        rating = r;
    }
    
    class ArtistCompare implements Comparator<Song>{
        public int compare(Song one, Song two){
            return one.getArtist().compareTo(two.getArtist());
        }
    }
    
    class TitleCompare implements Comparator<Song>{
        public int compare(Song one, Song two){
            return one.getTitle().compareTo(two.getTitle());
        }
    }
    
    public String getTitle(){
        return title;
    }
    
    public String getArtist(){
        return artist;
    }
    
    public String getRating(){
        return rating;
    }
    
    public String toString(){
        return "Title is "+title;
    }
    
}
