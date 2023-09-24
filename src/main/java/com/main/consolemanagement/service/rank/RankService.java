package com.main.consolemanagement.service.rank;

import com.main.consolemanagement.model.Rank;
import com.main.consolemanagement.model.Role;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

public interface RankService {
    public Rank createRank(Rank rank);

    public Rank updateRank(Rank rank);

    public void deleteRank(Rank rank);

    public List<Rank> getAllRanks();

    public Rank getRankById(UUID id);


}
