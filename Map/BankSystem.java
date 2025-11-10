import java.util.*;

public class BankSystem {
    public static void main(String[] args) {
        Map<String, Double> accounts = new HashMap<>();
        accounts.put("A101", 5000.0);
        accounts.put("A102", 15000.0);
        accounts.put("A103", 8200.0);
        accounts.put("A104", 32000.0);
        accounts.put("A105", 12000.0);

        // Deposit
        String acc = "A101";
        accounts.put(acc, accounts.get(acc) + 2500);

        // Withdraw (check balance)
        String withdrawAcc = "A102";
        double withdrawAmt = 20000;
        if (accounts.get(withdrawAcc) >= withdrawAmt) {
            accounts.put(withdrawAcc, accounts.get(withdrawAcc) - withdrawAmt);
            System.out.println("Withdrawal successful!");
        } else {
            System.out.println("Insufficient balance for " + withdrawAcc);
        }

        // Sort by descending balance
        List<Map.Entry<String, Double>> list = new ArrayList<>(accounts.entrySet());
        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        System.out.println("\nCustomers sorted by balance:");
        for (Map.Entry<String, Double> e : list) {
            System.out.println(e.getKey() + " → " + e.getValue());
        }

        
        System.out.println("\nTop 3 customers:");
        for (int i = 0; i < Math.min(3, list.size()); i++) {
            System.out.println(list.get(i).getKey() + " → " + list.get(i).getValue());
        }
    }
}
