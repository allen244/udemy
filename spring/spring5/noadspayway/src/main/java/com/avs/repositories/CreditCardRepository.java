package com.avs.repositories;

import com.avs.models.user.Address;
import com.avs.models.user.CreditCards;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditCardRepository extends CrudRepository<CreditCards, Long> {
}
