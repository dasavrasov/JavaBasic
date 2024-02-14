import java.util.*;

public class MyProg {

        public static void main(String[] args) {
            Account acc1 = new Account("40702810011112233333", 1000);
            System.out.println(acc1.getNum()+" "+acc1.getBalance());
            acc1.setBalance(2000);
            System.out.println(acc1.getNum()+" "+acc1.getBalance());
            Client cl1 = new Client("Иван", "Иванов", "1234", "123456", new HashSet<Account>());
            cl1.addAccount(acc1);
            Account acc_ref=cl1.getAccount("40702810011112233333");
            HashSet<Account> accounts = cl1.getAccounts();
            System.out.println(acc_ref.getNum()+" "+acc_ref.getBalance());
            Double totalBalance = cl1.getTotalBalance();
            HashSet<Account> accountsPlus = cl1.getAccountsWithPositiveBalance();
            cl1.deleteAccount("40702810011112233333");
            cl1.addAccount(acc1);
            cl1.reduceAccountBalanceBySumm(acc1, 100);
            System.out.println(acc1.getNum()+" "+acc1.getBalance());
            cl1.increaseAccountBalanceBySumm(acc1, 100);
            System.out.println(acc1.getNum()+" "+acc1.getBalance());
        }
    }
