package com.main.consolemanagement.service.rank;

import com.main.consolemanagement.model.Rank;
import com.main.consolemanagement.model.Role;
import com.main.consolemanagement.repository.rank.RankRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RankServiceImp implements RankService {

    private final RankRepository rankRepository;

    public RankServiceImp(RankRepository rankRepository) {
        this.rankRepository = rankRepository;
    }

    @Override
    public Rank createRank(Rank rank) {
        return rankRepository.save(rank);
    }

    @Override
    public Rank updateRank(Rank rank) {
    return null;
    }

    @Override
    public void deleteRank(Rank rank) {
        rankRepository.delete(rank);
    }

    @Override
    public List<Rank> getAllRanks() {
        return rankRepository.findAll();
    }

    @Override
    public Rank getRankById(UUID id) {
        return rankRepository.getReferenceById(id);
    }

    @Override
    public Rank getRankByName(String name) {
        return rankRepository.findFirstByName(name);
    }

    @Override
    public Rank getRankByRole(Role role) {
        return null;
    }

    @Override
    public Rank getRankByRank(int rank) {
        return rankRepository.findFirstByRank(rank);
    }
}
