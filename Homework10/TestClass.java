package ru.inno.Homework10;

import jakarta.xml.bind.JAXBException;

import java.io.IOException;
import java.util.Collection;

public class TestClass {

    public static void main(String[] args) throws IOException, JAXBException {

        // Начало работы с JSON сервисом
        PlayerService service = new PlayerServiceJSON();

        int playerId = service.createPlayer("WinMaster_777");
        service.addPoints(playerId, 100);
        int playerId1 = service.createPlayer("Rolixer");
        service.addPoints(playerId1, 55);
        int playerId2 = service.createPlayer("Bolfjorn");
        service.addPoints(playerId2, 16);
        int playerId3 = service.createPlayer("Superman");
        service.addPoints(playerId3, 32);
        int playerId4 = service.createPlayer("Spider-man");
        service.addPoints(playerId4, 78);

        Player currentPlayer = service.getPlayerById(4);
        System.out.println(currentPlayer);

        Collection<Player> players = service.getPlayers();

        System.out.println(players);

        Player deletePlayer3 = service.deletePlayer(3);

        System.out.println(deletePlayer3);

        // Начало работы с XML сервисом
        PlayerService xmlService = new PlayerServiceXML();

        int xmlPlayerId1 = xmlService.createPlayer("Captain Marvel");
        service.addPoints(xmlPlayerId1, 123);
        int xmlPlayerId2 = xmlService.createPlayer("Captain America");
        service.addPoints(xmlPlayerId2, 321);
        int xmlPlayerId3 = xmlService.createPlayer("Captain Britain");
        service.addPoints(xmlPlayerId3, 222);
        int xmlPlayerId4 = xmlService.createPlayer("Captain Nemo");
        service.addPoints(xmlPlayerId4, 999);

        Player xmlCurrentPlayer = xmlService.getPlayerById(4);
        System.out.println(xmlCurrentPlayer);

        Collection<Player> xmlPlayers = xmlService.getPlayers();

        System.out.println(xmlPlayers);

        Player xmlDeletePlayer3 = xmlService.deletePlayer(3);

        System.out.println(xmlDeletePlayer3);
    }
}
