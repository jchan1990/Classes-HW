import java.util.List;

/**
 * Created by Qube on 6/28/16.
 */
public class Main {

    public static void main(String[] args) {
        User user = new User("Jason");

        Song song1 = new Song("Be My Escape", "Relient K", "Rock");
        Song song2 = new Song("Who I Am Hates Who I've Been", "Relient K", "Rock");
        Song song3 = new Song("Sadie Hawkins Dance", "Relient K", "Rock");
        Song song4 = new Song("Collapsible Lung", "Relient K", "Rock");
        Song song5 = new Song("Candlelight", "Relient K", "Rock");

        Playlist pList1 = new Playlist("Male Artists");
        pList1.addSong(song1);
        pList1.addSong(song2);
        pList1.addSong(song3);
        pList1.addSong(song4);
        pList1.addSong(song5);
        Playlist pList2 = new Playlist("Female Artists");

        user.addPlayList(pList1);
        user.addPlayList(pList2);

        System.out.println("User: " + user.getUserName() + "\n");
        List<String> playlistNames = user.getAllPlaylistNames();
        for (String name : playlistNames) {
            System.out.println("Playlist Name: " + name);
            Playlist plist = user.getPlaylistByName(name);
            plist.playAll();
            System.out.println();

        }

    }
}
