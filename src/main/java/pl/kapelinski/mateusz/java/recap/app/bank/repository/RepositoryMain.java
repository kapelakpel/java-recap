package pl.kapelinski.mateusz.java.recap.app.bank.repository;

import pl.kapelinski.mateusz.java.recap.app.bank.ui.model.Account;

import java.util.List;

public class RepositoryMain {
    public static void main(String[] args) {
        AccountRepository accountRepository = new AccountRepository();
        List<Account> accounts = accountRepository.listWithResource();
        System.out.println(accounts);
    }
}
