package com._520.state;

/**
 *  账号的状态
 */
public abstract class AccountState {

    // 账户
    protected Account account;

    public AccountState(Account account){
        this.account = account;
    }

    /**
     *  判断当前账号的状态
     */
    protected void stateCheck(){
        if (account.balance < -1000){
            account.setAccountState(new RedState(account));
        }else if (account.balance >= -1000 && account.balance < 0){
            account.setAccountState(new YellowState(account));
        }else {
            account.setAccountState(new GreenState(account));
        }
    }

    /**
     *  存款
     * @param amount        存款的金额
     */
    protected abstract void deposit(double amount);

    /**
     *  取款
     * @param amount        取款金额
     */
    protected abstract void withdraw(double amount);
}
