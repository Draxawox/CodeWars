package solo;

import java.util.ArrayList;
import java.util.HashMap;

public class Bowling {
    HashMap<String, Integer> players;

    Bowling() {
        players = new HashMap<String, Integer>();
    }

    public void addPlayer(String name, int p) {
        players.put(name, p);
    }

    public void getWinner() {
        int points = 0;
        String name = "";
        boolean first = true;
        ArrayList<String> keys = new ArrayList<>(players.keySet());
        for (int i = 0; i < players.size(); i++) {
            if (first) {
                name = keys.get(i);
                points = players.get(name);
                first = false;
            }
            if (players.get(keys.get(i)) > points) {
                name = keys.get(i);
                points = players.get(name);
            }
        }
        System.out.println(name);
    }
}

