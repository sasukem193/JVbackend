public class Musics {
    private String songName;
    private String writer;

    public Musics(String songName, String writer) {
        this.songName = songName;
        this.writer = writer;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }
}
