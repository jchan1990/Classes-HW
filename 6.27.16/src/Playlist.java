import java.util.ArrayList;

/**
 * Created by Qube on 6/28/16.
 */
public class Playlist {
    String mName;
    ArrayList<Song> mSongs;

    public Playlist(String name) {
        mName = name;
        mSongs = new ArrayList<>();

    }

    public String getName() {
        return mName;
    }

    public void addSong(Song song) {
        mSongs.add(song);
    }

    public void playAll() {
        for (int i = 0; i < mSongs.size(); i++) {
            mSongs.get(i).play();

        }
    }

}
