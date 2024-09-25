
// https://leetcode.com/problems/richest-customer-wealth/description/
public class MaximumWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1, 2, 3},
                {3, 2, 1}
        };

        int result = maximumWealth(accounts);
        System.out.println(result);
    }

    // find the maximum wealth owned by a person,
    // in all the bank accounts
    static int maximumWealth(int[][] accounts) {
        // assume minimum value as maximum wealth
        int maxWealth = Integer.MIN_VALUE;
        // iterate through the accounts
        for (int[] person : accounts) {
            int balanceSum = 0;
            // iterate through bank accounts,
            // and add the balance
            for (int bankAccount : person) {
                // add all the wealth from all the bank accounts
                balanceSum = balanceSum + bankAccount;
            }
            // compare balanceSum with maxWealth,
            // and update accordingly
            if (balanceSum > maxWealth) {
                maxWealth = balanceSum;
            }
        }
        return maxWealth;
    }
}
