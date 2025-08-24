package org.gamify.gym.app.training.repository;

import org.gamify.gym.app.training.model.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExerciseRepository extends JpaRepository<Exercise, Long> {
}
