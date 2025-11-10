import java.util.*;

public class VotingCount {
    public static void main(String[] args) {
        Map<String, Integer> votes = new HashMap<>();

        String[] votesCast = {"A", "B", "C", "A", "B", "A", "C", "A", "B", "A"};

        for (String candidate : votesCast) {
            votes.put(candidate, votes.getOrDefault(candidate, 0) + 1);
        }

        String winner = null;
        int maxVotes = 0;

        for (Map.Entry<String, Integer> entry : votes.entrySet()) {
            if (entry.getValue() > maxVotes) {
                maxVotes = entry.getValue();
                winner = entry.getKey();
            }
        }

        System.out.println("Votes: " + votes);
        System.out.println("Winner: " + winner + " with " + maxVotes + " votes");
    }
}
