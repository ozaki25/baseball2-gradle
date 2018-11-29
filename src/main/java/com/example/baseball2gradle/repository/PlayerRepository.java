package com.example.baseball2gradle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.baseball2gradle.domain.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {

}