package com.cydeo.service;

import com.cydeo.enums.AccountType;
import com.cydeo.model.Account;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface AccountService {

    Account createnewAccount(BigDecimal balance, AccountType accountType, Date creationDate, Long userId);

    List<Account> listAllAccounts();
}

