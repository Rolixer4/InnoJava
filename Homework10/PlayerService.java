package ru.inno.Homework10;

import jakarta.xml.bind.JAXBException;

import java.io.IOException;
import java.util.Collection;

public interface PlayerService {

    // �������� ������ �� id
    Player getPlayerById(int id) throws IOException, JAXBException;

    // �������� ������ �������
    Collection<Player> getPlayers() throws IOException, JAXBException;

    // ������� ������ (���������� id ������ ������)
    int createPlayer(String nickname) throws IOException, JAXBException;

    // ������� ������ �� id'�����, ������ ���������� ������
    Player deletePlayer(int id) throws IOException, JAXBException;

    // �������� ����� ������. ���������� ����������� ����
    int addPoints(int playerId, int points) throws IOException, JAXBException;
}
