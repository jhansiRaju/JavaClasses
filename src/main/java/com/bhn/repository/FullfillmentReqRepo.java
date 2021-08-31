package com.bhn.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bhn.model.FullfillmentreqModel;
import com.bhn.xsd.Order;

public interface FullfillmentReqRepo extends MongoRepository<Order, Integer>{

}
