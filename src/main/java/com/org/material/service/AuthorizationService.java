package com.org.material.service;
import com.org.material.entity.Transaction;
import com.org.material.entity.TransactionRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

    @Service
    public class AuthorizationService {

        @Autowired
        private TransactionRepository transactionRepository;
        private static final Logger logger = LoggerFactory.getLogger(AuthorizationService.class);

        /**
         * Authorizing Transaction - Simple Validation
         * @param tr
         */
        public void authorizeTransaction(Transaction tr) {
            logger.info("Authorizing Transaction... ");
            // Simple validation for POC
            boolean authorized = tr.getAmount() <= 500;
            tr.setStatus(authorized ? "AUTHORIZED" : "DECLINED");
            if(!authorized){
                logger.warn("Transaction Declined [Amount should be greater than 500]");
            }else {
                logger.info("Transaction Authorized");
            }
            transactionRepository.save(tr);
        }
    }

