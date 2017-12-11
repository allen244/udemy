package com.avs.repositories;

import com.avs.models.Partner;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartnerRepository extends CrudRepository<Partner, Long> {
}
