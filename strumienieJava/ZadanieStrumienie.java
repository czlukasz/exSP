package czarnotalukasz.strumienieJava;

import java.util.Comparator;

public class ZadanieStrumienie {
    public static void main(String[] args) {
        loopVersion();
        streamVersion();
    }
    private static void loopVersion() {
        double highestRanking = 0;
        BoardGame bestGame = null;
        for (BoardGame game : BoardGame.games) {
            if (game.name.contains("a")) {
                if (game.rating > highestRanking) {
                    highestRanking = game.rating;
                    bestGame = game;
                }
            }
        }
        System.out.println(bestGame.name);
    }
    private static void streamVersion() {
        BoardGame bestGame = BoardGame.games.stream()
                .filter(g -> g.name.contains("a")).max(Comparator.comparingDouble(g1 -> g1.rating)).get();
        System.out.println(bestGame.name);
    }
}
