package com.bhn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bhn.model.FullfillmentreqModel;
import com.bhn.repository.FullfillmentReqRepo;
import com.bhn.xsd.Order;
import com.bhn.xsd.Orders;


@RestController
public class FullfillmentReqController {
	@Autowired
	private FullfillmentReqRepo repo;
	@GetMapping("/findFulfillment")
	public List<Order> getDetails()
	{
		return repo.findAll();
	}
	
}
