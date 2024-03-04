04-03-2024



  948. Bag of Tokens
Solved
Medium
Topics
Companies
You start with an initial power of power, an initial score of 0, and a bag of tokens given as an integer array tokens, where each tokens[i] donates the value of tokeni.

Your goal is to maximize the total score by strategically playing these tokens. In one move, you can play an unplayed token in one of the two ways (but not both for the same token):

Face-up: If your current power is at least tokens[i], you may play tokeni, losing tokens[i] power and gaining 1 score.
Face-down: If your current score is at least 1, you may play tokeni, gaining tokens[i] power and losing 1 score.
Return the maximum possible score you can achieve after playing any number of tokens.

 




  public class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int low = 0;
        int high = tokens.length - 1;
        int score = 0;
        Arrays.sort(tokens);

        while (low <= high) {
            // When we have enough power, play lowest token face-up
            if (power >= tokens[low]) {
                score += 1;
                power -= tokens[low];
                low += 1;
            // We don't have enough power to play a token face-up
            // If there is at least one token remaining,
            // and we have enough score, play highest token face-down
            } else if (low < high && score > 0) {
                score -= 1;
                power += tokens[high];
                high -= 1;
            // We don't have enough score, power, or tokens 
            // to play face-up or down and increase our score
            } else {
                return score;
            }
        }
        return score;
    }
}
