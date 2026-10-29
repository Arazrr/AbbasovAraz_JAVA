package semester1.Practice_8_Abbasov_Araz.practice08.homework;

public class Task2BankingHierarchy {
    public static void main(String[] args) {
        System.out.println("================ БАНКІВСЬКА ІЄРАРХІЯ РАХУНКІВ ================");
        System.out.println("1. Ощадний рахунок (початковий стан):\n");
        SavingsAccount savings = new SavingsAccount("UA101", "Олена Коваль", 5000.0, 12.0, 1000.0);
        System.out.println(savings);
        System.out.println("-> Спроба зняти 4500 грн:");
        savings.withdraw(4500.0);
        System.out.println("-> Нарахування річних відсотків (+12%)...");
        savings.applyInterest();
        System.out.println(savings);
        System.out.println("\n2. Кредитний рахунок (початковий стан):");
        CreditAccount credit = new CreditAccount("UA202", "Максим Бондар", 2000.0, 10000.0, 2.0);
        System.out.println(credit);
        System.out.print("-> Покупка на 5000 грн (3000 грн у кредит з комісією 2% = 60 грн)... ");
        if (credit.withdraw(5000.0)) {
            System.out.println("УСПІШНО!");
        }
        System.out.println(credit);
        System.out.println("==============================================================");
    }

    static class BankAccount {
        private String iban;
        private String ownerName;
        protected double balance;

        public BankAccount(String iban, String ownerName, double initialBalance) {
            this.iban = iban;
            this.ownerName = ownerName;
            this.balance = initialBalance < 0 ? 0.0 : initialBalance;
        }

        public String getIban() {
            return iban;
        }

        public String getOwnerName() {
            return ownerName;
        }

        public double getBalance() {
            return balance;
        }

        public void deposit(double amount) {
            if (amount > 0) {
                this.balance += amount;
            }
        }

        public boolean withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                this.balance -= amount;
                return true;
            } else {
                System.out.println("Відмова! Недостатньо коштів на рахунку");
                return false;
            }
        }

        @Override
        public String toString() {
            return String.format("Рахунок[%s | Власник: %s | Баланс: %.2f грн]", iban, ownerName, balance);
        }
    }

    static class SavingsAccount extends BankAccount {
        private double interestRate;
        private double minBalance;

        public SavingsAccount(String iban, String ownerName, double initialBalance, double interestRate, double minBalance) {
            super(iban, ownerName, initialBalance);
            this.interestRate = interestRate;
            this.minBalance = minBalance;
        }

        @Override
        public boolean withdraw(double amount) {
            if (balance - amount < minBalance) {
                System.out.printf("ВІДМОВА (порушення незнижуваного залишку %.2f грн)\n", minBalance);
                return false;
            }
            return super.withdraw(amount);
        }

        public void applyInterest() {
            double interest = balance * (interestRate / 100.0);
            deposit(interest);
        }

        @Override
        public String toString() {
            return String.format("SavingsAccount{%s, Ставка: %.1f%%, Мін.залишок: %.2f грн}",
                    super.toString(), interestRate, minBalance);
        }
    }

    static class CreditAccount extends BankAccount {
        private double creditLimit;
        private double feePercent;

        public CreditAccount(String iban, String ownerName, double initialBalance, double creditLimit, double feePercent) {
            super(iban, ownerName, initialBalance);
            this.creditLimit = creditLimit;
            this.feePercent = feePercent;
        }

        @Override
        public boolean withdraw(double amount) {
            if (amount <= 0) {
                return false;
            }

            if (balance >= amount) {
                return super.withdraw(amount);
            } else {
                double borrowed = amount - Math.max(0.0, balance);
                double fee = borrowed * (feePercent / 100.0);

                if (balance - amount - fee >= -creditLimit) {
                    this.balance -= (amount + fee);
                    return true;
                } else {
                    System.out.println("ВІДМОВА (перевищено кредитний ліміт)");
                    return false;
                }
            }
        }

        public double getCurrentDebt() {
            return balance < 0 ? Math.abs(balance) : 0.0;
        }

        @Override
        public String toString() {
            return String.format("CreditAccount{%s, Ліміт: %.2f грн, Борг: %.2f грн}",
                    super.toString(), creditLimit, getCurrentDebt());
        }
    }
}