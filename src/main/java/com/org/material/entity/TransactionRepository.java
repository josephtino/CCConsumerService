/**
 * © 2024 JTino Inc. Author: Joseph Tino.
 * Redistribution permitted with attribution. Provided "as is" without warranty.
 * No liability for damages. See full license for details.
 */


package com.org.material.entity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, String> {
}
