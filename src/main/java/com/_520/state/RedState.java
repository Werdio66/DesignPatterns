package com._520.state;

/**
 *  如果账户中余额小于 -1000 ,那么账户的状态为红色，
 *  即透支状态，此时用户只能向该账户存款,不能再从中取款。
 */
public class RedState extends AccountState {

    public RedState(Account account) {
        super(account);
    }

    @Override
    protected void deposit(double amount) {
        account.balance += amount;
        stateCheck();
    }

    @Override
    protected void withdraw(double amount) {
        System.out.println("账户被冻结，取款失败");
    }
}
