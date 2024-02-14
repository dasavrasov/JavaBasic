import java.security.PublicKey;
import java.util.HashSet;

public class Client {
    private String first_name;
    private String last_name;
    private String passport_ser;
    private String passport_num;
    private HashSet<Account> accounts;

    public Client(String first_name, String last_name, String passport_ser, String passport_num, HashSet<Account> accounts) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.passport_ser = passport_ser;
        this.passport_num = passport_num;
        this.accounts = accounts;
    }

    public Client(String first_name, String last_name, String passport_ser, String passport_num) {
        this(first_name, last_name, passport_ser, passport_num, new HashSet<Account>());
    }

    public Account getAccount(String num){
        for (Account account : accounts) {
            if (account.getNum().equals(num)) {
                return account;
            }
        }
        return null;
    }
    public HashSet<Account> getAccounts() {
        return accounts;
    }
    public Double getTotalBalance(){
        Double totalBalance = 0.0;
        for (Account account : accounts) {
            totalBalance += account.getBalance();
        }
        return totalBalance;
    }
    public HashSet<Account> getAccountsWithPositiveBalance(){
        HashSet<Account> accountsWithPositiveBalance = new HashSet<>();
        for (Account account : accounts) {
            if (account.getBalance() > 0) {
                accountsWithPositiveBalance.add(account);
            }
        }
        return accountsWithPositiveBalance;
    }
    public void deleteAccount(String num){
        accounts.remove(getAccount(num));
    }
    public void addAccount(Account account){
        accounts.add(account);
    }
    public void reduceAccountBalanceBySumm(Account account, double summ){
        account.setBalance(account.getBalance() - summ);
    }

    public void increaseAccountBalanceBySumm(Account account, double summ){
        account.setBalance(account.getBalance() + summ);
    }
}
