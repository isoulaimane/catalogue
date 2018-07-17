package com.socomoto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.socomoto.entities.Player;

/**
 * @Author mahdchek.
 */
public interface PlayerRepository extends JpaRepository<Player, Long> {
}
