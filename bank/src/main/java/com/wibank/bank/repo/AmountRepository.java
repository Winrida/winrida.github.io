package com.wibank.bank.repo;

import com.wibank.bank.models.Amount;
import org.springframework.data.repository.CrudRepository;

public interface AmountRepository extends CrudRepository<Amount, Long> {
}
