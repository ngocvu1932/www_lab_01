package vn.edu.iuh.fit.www_lab_week_01.services;

import vn.edu.iuh.fit.www_lab_week_01.entities.Account;
import vn.edu.iuh.fit.www_lab_week_01.repositories.AccountRepository;

public class AccountServices {
    private AccountRepository accountRepository;

    public AccountServices (){
        accountRepository = new AccountRepository();
    }

    public boolean insertAcc (Account account) {

        //return accountRepository.insertAcc(account);
        return false;
    }
}
