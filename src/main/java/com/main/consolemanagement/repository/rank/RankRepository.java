package com.main.consolemanagement.repository.rank;

import com.main.consolemanagement.model.Rank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RankRepository extends JpaRepository<Rank, UUID> {
}
