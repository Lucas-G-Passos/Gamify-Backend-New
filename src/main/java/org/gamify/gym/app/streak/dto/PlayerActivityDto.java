package org.gamify.gym.app.streak.dto;

import java.time.LocalDate;
import java.util.Optional;

public class PlayerActivityDto {
    private Optional<String> workoutName;
    private LocalDate today;
    private String status;

    public LocalDate getToday() {
        return today;
    }

    public void setToday(LocalDate today) {
        this.today = today;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Optional<String> getWorkoutName() {
        return workoutName;
    }

    public void setWorkoutName(Optional<String> workoutName) {
        this.workoutName = workoutName;
    }

    public PlayerActivityDto(Optional<String> workoutName, LocalDate today, String status) {
        this.workoutName = workoutName;
        this.today = today;
        this.status = status;
    }

}
