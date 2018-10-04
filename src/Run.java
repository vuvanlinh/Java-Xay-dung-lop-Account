public class Run {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000, 4.5);
        account.withdraw(2500);
        account.deposite(3000);

        System.out.println("so du tai khoan la : " + account.getballance());
        System.out.println("tien lai hang thang la: " + account.getMonthlyInterest());
        System.out.println("ngay tao tai khoan la: " + account.getDateCreated());
    }
}
