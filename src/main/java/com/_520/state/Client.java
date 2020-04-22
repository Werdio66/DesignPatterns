package com._520.state;

public class Client {
    public static void main(String[] args) {

        Account account = new Account("段誉", 5);
        // 存款
        account.deposit(100);
        // 取款
        account.withdraw(200);
        account.deposit(1000);
        account.withdraw(2000);
        account.withdraw(100);
    }
}
