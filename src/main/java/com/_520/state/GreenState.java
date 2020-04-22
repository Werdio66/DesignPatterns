package com._520.state;

/**
 *  如果账户中余额大于等于 0，此时账户的状态为绿色，
 *  即正常状态，表示既可以向该账户存款也可以从该账户取款。
 */
public class GreenState extends AccountState {

    public GreenState(Account account) {
        super(account);
    }

    @Override
    protected void deposit(double amount) {
        account.balance += amount;
    }

    @Override
    protected void withdraw(double amount) {
        account.balance -= amount;
        stateCheck();
    }
}
