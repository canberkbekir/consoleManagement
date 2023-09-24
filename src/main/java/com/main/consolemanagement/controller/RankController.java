package com.main.consolemanagement.controller;

import com.main.consolemanagement.model.Rank;
import com.main.consolemanagement.service.rank.RankService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("rank")
public class RankController {
    private final RankService rankService;

    public RankController(RankService rankService) {
        this.rankService = rankService;
    }

    @PostMapping(value = "create", consumes = "application/json", produces = "application/json")
    public Rank createRank(@RequestBody Rank rank) {
        return rankService.createRank(rank);
    }
    @GetMapping("getAll")
    public List<Rank> getRank() {
        return rankService.getAllRanks();
    }

    @GetMapping("getByName/{name}")
    public Rank getRankByName(@PathVariable String name) {
        return rankService.getRankByName(name);
    }

    @GetMapping("getByRank/{rank}")
    public Rank getRankByRank(@PathVariable int rank) {
        return rankService.getRankByRank(rank);
    }
}
