package com.example.rewards.controller;

import com.example.rewards.model.RewardResponse;
import com.example.rewards.model.Transaction;
import com.example.rewards.service.RewardsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/rewards")
public class RewardsController {

    @Autowired
    private RewardsService rewardsService;

    @PostMapping("/calculate")
    public RewardResponse calculateRewards(@RequestBody Transaction transaction) {

        int points = rewardsService.calculateRewardPoints(
                transaction.getAmount());

        return new RewardResponse(
                transaction.getCustomerId(),
                points);
    }
}
