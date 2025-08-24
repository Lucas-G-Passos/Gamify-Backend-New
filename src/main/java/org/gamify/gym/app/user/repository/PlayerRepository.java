package org.gamify.gym.app.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.gamify.gym.app.user.model.Player;
import org.gamify.gym.app.user.model.User;

public interface PlayerRepository extends JpaRepository<Player, Long> {
    boolean existsByUser(User user);
}
