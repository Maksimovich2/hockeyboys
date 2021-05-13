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
import java.util.Set;

@Data
@Entity
@Table(name = "league")
public class League {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLeagues;
    @Column(name = "leaguesname")
    private String leaguesName;
    @Column(name = "countmembers")
    private String countMembers;
    @Column(name = "country")
    private String country;
    @OneToMany(mappedBy = "league_idLeagues", cascade = CascadeType.ALL)
    private Set<Team> teams;
}