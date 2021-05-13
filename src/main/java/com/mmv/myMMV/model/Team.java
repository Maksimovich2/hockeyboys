package com.mmv.myMMV.model;
import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "team")
public class Team {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long idTeams;
        @Column(name = "name")
        private String name;
        @Column(name = "city")
        private String city;
        @Column(name = "countPlayers")
        private String countPlayers;
        @Column(name = "nameArena")
        private String nameArena;
        @Column(name = "League_idLeagues")
        private int league_idLeagues;
}
