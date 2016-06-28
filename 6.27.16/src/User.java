import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 * Created by Qube on 6/28/16.
 */
public class User {
    String mName;
    HashMap<String, Playlist> mPlaylists;

    public User(String name) {
        mName = name;
        mPlaylists = new HashMap<>();
    }

    public void addPlayList(Playlist playlist) {
        mPlaylists.put(playlist.getName(), playlist);
    }

    public List<String> getAllPlaylistNames() {
        Set<String> names = mPlaylists.keySet();
        List<String> list = new ArrayList<>();
        list.addAll(names);

        return list;
    }

    public Playlist getPlaylistByName(String name) {
        return mPlaylists.get(name);
    }

    public String getUserName() {
        return mName;
    }

}
