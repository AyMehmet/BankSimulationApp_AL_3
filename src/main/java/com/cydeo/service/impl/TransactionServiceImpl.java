package com.cydeo.service.impl;

import com.cydeo.model.Account;
import com.cydeo.model.Transaction;
import com.cydeo.service.TransactionService;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class TransactionServiceImpl implements TransactionService {
    @Override
    public Transaction makeTransfer(Account sender, Account receiver, BigDecimal amount, Date creationDate, String message) {

        validateAccount()



    }

    @Override
    public List<Transaction> findAllTransfer() {
        return null;
    }
}