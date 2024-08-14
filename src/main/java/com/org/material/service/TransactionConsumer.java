/**
 * © 2024 JTino Inc. Author: Joseph Tino.
 * Redistribution permitted with attribution. Provided "as is" without warranty.
 * No liability for damages. See full license for details.
 */

package com.org.material.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import com.org.material.common.Transaction;

    @Service
    public class TransactionConsumer {

        private static final Logger logger = LoggerFactory.getLogger(AuthorizationService.class);

        @Autowired
        private AuthorizationService authorizationService;

        @KafkaListener(topics = "transactions", groupId = "cc-group-id")
        public void consumeTransaction(Transaction transaction) {

            logger.info("Entering the credit card transaction listener...");
            com.org.material.entity.Transaction tEntity =
                    new com.org.material.entity.Transaction();
            tEntity.setTransactionId(transaction.getTransactionId());
            tEntity.setAmount(transaction.getAmount());
            tEntity.setCardNumber(transaction.getCardNumber());
            tEntity.setTimestamp(transaction.getTimestamp());
            tEntity.setMerchantId(transaction.getMerchantId());
           authorizationService.authorizeTransaction(tEntity);
        }


}
