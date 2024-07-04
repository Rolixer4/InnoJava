package ru.inno.Homework10;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@JsonPropertyOrder
public class PlayerServiceJSON implements PlayerService {

    Collection<Player> players = new LinkedList<>();
    Player currentPlayer;
    Path filePath = Path.of("Players.json");
    ObjectMapper mapper = new ObjectMapper();

    @Override
    public Player getPlayerById(int id) throws IOException {
        for (Player player : players) {
            if (player.getId() == id) {
                currentPlayer = player;
                break;
            }
        }
        mapper.writeValue(filePath.toFile(), players);
        return currentPlayer;
    }

    @Override
    public Collection<Player> getPlayers() throws IOException {
        System.out.println(players);
        mapper.writeValue(filePath.toFile(), players);
        return players;
    }

    @Override
    public int createPlayer(String nickname) throws IOException {
        players.add(new Player(players.size() + 1, nickname, 0, false));
        mapper.writeValue(filePath.toFile(), players);
        return players.size();
    }

    @Override
    public Player deletePlayer(int id) throws IOException {
        players.remove(getPlayerById(id));
        mapper.writeValue(filePath.toFile(), players);
        return getPlayerById(id);
    }

    @Override
    public int addPoints(int playerId, int points) throws IOException {
        for (Player player : players) {
            if (player.getId() == playerId) {
                player.setPoints(points);
            }
        }
        System.out.println("У игрока с id " + playerId + " " + points + " очков");
        mapper.writeValue(filePath.toFile(), players);
        return points;
    }
}
