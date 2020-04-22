package com._520.state;

/**
 *  如果账户中余额小于 0，并且大于等于 1000 则账户的状态为黄色,
 *  即欠费状态,此时既可以向该账户存款也可以从该账户取款。
 */
public class YellowState extends AccountState {

    public YellowState(Account account) {
        super(account);
    }

    @Override
    protected void deposit(double amount) {
        account.balance += amount;
        stateCheck();
    }

    @Override
    protected void withdraw(double amount) {
        account.balance -= amount;
        stateCheck();
    }
}
