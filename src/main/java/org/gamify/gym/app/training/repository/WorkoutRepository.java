package org.gamify.gym.app.training.repository;

import java.util.List;

import org.gamify.gym.app.training.model.Workout;
import org.gamify.gym.app.user.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkoutRepository extends JpaRepository<Workout, Long> {
    @Query("SELECT w FROM Workout w JOIN FETCH w.exercises e JOIN FETCH e.exerciseLogs WHERE w.player = :player")
    List<Workout> findByPlayerWithExercisesAndLogs(Player player);
}