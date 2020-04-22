package com._520.state;

/**
 * 银行账户
 */
public class Account {

    // 账户的状态
    private AccountState accountState;

    // 账户余额
    public double balance;

    // 账户名称
    private final String name;


    public Account(String name, double initAmount) {
        this.accountState = new GreenState(this);
        this.name = name;
        this.balance = initAmount;
        System.out.println(this.name + "开户，初始金额为：" + balance);
        System.out.println("===========================================================");
    }

    /**
     *  存款
     * @param amount        存款的金额
     */
    public void deposit(double amount){
        System.out.println(name + "存款：" + amount);
        accountState.deposit(amount);
        System.out.println("现在余额为：" + balance);
        System.out.println("现在账户的状态为：" + accountState.getClass().getSimpleName());
        System.out.println("===========================================================");
    }

    /**
     *  取款
     * @param amount        取款金额
     */
    public void withdraw(double amount){
        System.out.println(name + "取款：" + amount);
        accountState.withdraw(amount);
        System.out.println("现在余额为：" + balance);
        System.out.println("现在账户的状态为：" + accountState.getClass().getSimpleName());
        System.out.println("===========================================================");
    }

    public void setAccountState(AccountState accountState) {
        this.accountState = accountState;
    }
}
