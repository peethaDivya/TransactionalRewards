package com.example.rewards.model;

public class RewardResponse {

    private String customerId;
    private int rewardPoints;

    public RewardResponse() {
    }

    public RewardResponse(String customerId, int rewardPoints) {
        this.customerId = customerId;
        this.rewardPoints = rewardPoints;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public int getRewardPoints() {
        return rewardPoints;
    }

    public void setRewardPoints(int rewardPoints) {
        this.rewardPoints = rewardPoints;
    }
}
