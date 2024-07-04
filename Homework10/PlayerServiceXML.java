package ru.inno.Homework10;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.nio.file.Path;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class PlayerServiceXML implements PlayerService {

    Collection<Player> players = new LinkedList<>();
    Player currentPlayer;
    Players playersCollection = new Players((List<Player>) players);
    Path filePath = Path.of("Players.xml");
    JAXBContext context = JAXBContext.newInstance(Player.class, Players.class);
    Marshaller marshaller = context.createMarshaller();
    Unmarshaller unmarshaller = context.createUnmarshaller();
    public PlayerServiceXML() throws JAXBException {
    }

    @Override
    public Player getPlayerById(int id) throws JAXBException {
        for (Player player : players) {
            if (player.getId() == id) {
                currentPlayer = player;
                break;
            }
        }
        marshaller.marshal(playersCollection, filePath.toFile());
        return currentPlayer;
    }

    @Override
    public Collection<Player> getPlayers() throws JAXBException {
        System.out.println(players);
        marshaller.marshal(playersCollection, filePath.toFile());
        return players;
    }

    @Override
    public int createPlayer(String nickname) throws JAXBException {
        players.add(new Player(players.size() + 1, nickname, 0, false));
        marshaller.marshal(playersCollection, filePath.toFile());
        return players.size();
    }

    @Override
    public Player deletePlayer(int id) throws JAXBException {
        players.remove(getPlayerById(id));
        marshaller.marshal(playersCollection, filePath.toFile());
        return getPlayerById(id);
    }

    @Override
    public int addPoints(int playerId, int points) throws JAXBException {
        for (Player player : players) {
            if (player.getId() == playerId) {
                player.setPoints(points);
            }
        }
        System.out.println("У игрока с id " + playerId + " " + points + " очков");
        marshaller.marshal(playersCollection, filePath.toFile());
        return points;
    }
}
