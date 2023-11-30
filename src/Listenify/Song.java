package Listenify;

public class Song {

    private String songName;

    private double duration;

    private String secretPassword;

    public Song(String songName, double duration) {
        this.songName = songName;
        this.duration = duration;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName){
        this.songName = songName;
    }

    public void setSongName(String songName,String password) {

        if(password.equals(secretPassword)){
            this.songName = songName;
        }
        return;

    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String toString() {
        return "Song{" +
                "songName='" + songName + '\'' +
                ", duration=" + duration +
                '}';
    }


}