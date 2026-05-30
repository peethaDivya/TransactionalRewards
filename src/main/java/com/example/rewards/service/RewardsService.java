package com.example.rewards.service;

import org.springframework.stereotype.Service;

@Service
public class RewardsService {

    public int calculateRewardPoints(double amount) {

        int points = 0;

        // 2 points for every dollar spent above 100
        if (amount > 100) {
            points += (int) ((amount - 100) * 2);
            amount = 100;
        }

        // 1 point for every dollar spent between 50 and 100
        if (amount > 50) {
            points += (int) (amount - 50);
        }

        return points;
    }
}
