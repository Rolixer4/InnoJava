package ru.inno.Homework10;

import jakarta.xml.bind.annotation.*;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import java.util.List;
import java.util.Objects;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Players {

    @XmlElement(name = "Player")
    private List<Player> playersCollection;

    public Players(List<Player> playersCollection) {
        this.playersCollection = playersCollection;
    }

    public Players() {

    }

    public List<Player> getPlayersCollection() {
        return playersCollection;
    }

    public void setPlayersCollection(List<Player> playersCollection) {
        this.playersCollection = playersCollection;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Players players = (Players) o;
        return Objects.equals(playersCollection, players.playersCollection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playersCollection);
    }

    @Override
    public String toString() {
        return "Players{" +
                "playersCollection=" + playersCollection +
                '}';
    }
}
