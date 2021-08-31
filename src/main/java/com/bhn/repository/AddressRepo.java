package com.bhn.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bhn.model.AddressModel;
import com.bhn.model.OrderCentralModel;

public interface AddressRepo extends MongoRepository<OrderCentralModel, Integer> {

}
