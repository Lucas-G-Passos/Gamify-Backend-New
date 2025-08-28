package org.gamify.gym.app.streak.model;

import java.time.LocalDate;

import org.gamify.gym.app.training.model.Workout;
import org.gamify.gym.app.user.model.Player;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
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
    @JsonBackReference
    private Player player;

    @OneToOne
    @JoinColumn(name = "workout_id", nullable = true)
    private Workout workout;

    public long getId_playerActivity() {
        return id_playerActivity;
    }

    public LocalDate getActiveDate() {
        return activeDate;
    }

    public void setActiveDate(LocalDate activeDate) {
        this.activeDate = activeDate;
    }

    public Workout getWorkout() {
        return workout;
    }

    public void setWorkout(Workout workout) {
        this.workout = workout;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
