package DemoLamda;

import java.util.Arrays;
import java.util.List;

 class Transaction {

        private String type;
        private double amount;

        public Transaction(String type, double amount) {
            this.type = type;
            this.amount = amount;
        }

        public double getAmount() {
            return amount;
        }
    }

    public class FilterAndSumTransactions {
        public static void main(String[] args) {
            List<Transaction> transactions = Arrays.asList(
                    new Transaction("Deposit", 1000.0),
                    new Transaction("Withdrawal", 500.0),
                    new Transaction("Deposit", 2000.0),
                    new Transaction("Withdrawal", 300.0)
            );

            // Filter and sum high-value transactions
            double sum = transactions.stream()
                    .filter(transaction -> transaction.getAmount() > 1000.0)
                    .mapToDouble(Transaction::getAmount)
                    .sum();

            System.out.println("Sum of high-value transactions: " + sum);
        }
    }

