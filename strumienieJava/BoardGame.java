package czarnotalukasz.strumienieJava;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class BoardGame {
    public final String name;
    public final double rating;
    public final BigDecimal price;
    public final int minPlayers;
    public final int maxPlayers;

    public BoardGame(String name, double rating, BigDecimal price, int minPlayers, int maxPlayers) {
        this.name = name;
        this.rating = rating;
        this.price = price;
        this.minPlayers = minPlayers;
        this.maxPlayers = maxPlayers;
    }

    public static final List<BoardGame> games = Arrays.asList(
            new BoardGame("Terraforming Mars", 8.38, new BigDecimal("123.49"), 1, 5),
            new BoardGame("Codenames", 7.82, new BigDecimal("64.95"), 2, 8),
            new BoardGame("Puerto Rico", 8.07, new BigDecimal("149.99"), 2, 5),
            new BoardGame("Terra Mystica", 8.26, new BigDecimal("252.99"), 2, 5),
            new BoardGame("Scythe", 8.3, new BigDecimal("314.95"), 1, 5),
            new BoardGame("Power Grid", 7.92, new BigDecimal("145"), 2, 6),
            new BoardGame("7 Wonders Duel", 8.15, new BigDecimal("109.95"), 2, 2),
            new BoardGame("Dominion: Intrigue", 7.77, new BigDecimal("159.95"), 2, 4),
            new BoardGame("Patchwork", 7.77, new BigDecimal("75"), 2, 2),
            new BoardGame("The Castles of Burgundy", 8.12, new BigDecimal("129.95"), 2, 4)
    );

    public static void main(String[] args) {

        for(BoardGame game : games) {
            if(game.maxPlayers > 4) {
                if (game.rating > 8) {
                    if(new BigDecimal(150).compareTo(game.price) > 0) {
                        System.out.println("Propozycja: " + game.name.toUpperCase());
                    }
                }
            }
        }
        System.out.println("*******************************************************");
        Stream<BoardGame> gamesStream = games.stream();
        gamesStream//albo po prostu zamiast tego od razu wpisać: games.stream()
                .filter(g -> g.maxPlayers > 4)
                .filter(g -> g.rating > 8)
                .filter(g -> new BigDecimal(150).compareTo(g.price) > 0)
                .map(g -> g.name.toUpperCase())
                .forEach(System.out::println);
        System.out.println("**********************************************************");
        //Rozpisując to na poszczególne strumienie może to wyglądać tak
        Stream<BoardGame> filteredStream = gamesStream
                .filter(g -> g.maxPlayers > 4)
                .filter(g -> g.rating > 8)
                .filter(g -> new BigDecimal(150).compareTo(g.price) > 0);
        Stream<String> namesStream = filteredStream
                .map(g -> g.name.toUpperCase());
        namesStream.forEach(System.out::println);
    }
}
