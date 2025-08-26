package org.gamify.gym.app.streak.model;

import java.time.LocalDate;

import org.gamify.gym.app.user.model.Player;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.GenerationType;

@Entity
public class PlayerActivity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_playerActivity;

    @Column(columnDefinition = "DATE")
    private LocalDate activeDate;

    @Column
    private String status;

    @ManyToOne
    @JoinColumn(name = "player_id", nullable = false)
    private Player player;
}
