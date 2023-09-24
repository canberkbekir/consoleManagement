package com.main.consolemanagement.service.rank;

import com.main.consolemanagement.model.Rank;
import com.main.consolemanagement.model.Role;

import java.util.List;
import java.util.UUID;

public interface RankService {
    Rank createRank(Rank rank);

    Rank updateRank(Rank rank);

    void deleteRank(Rank rank);

    List<Rank> getAllRanks();

    Rank getRankById(UUID id);

    Rank getRankByName(String name);

    Rank getRankByRole(Role role);

    Rank getRankByRank(int rank);


}
