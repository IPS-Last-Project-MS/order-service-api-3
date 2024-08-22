package com.devops.order_service_api_3.repo;

import com.devops.order_service_api_3.entity.CustomerOrder;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerOrderRepo extends MongoRepository<CustomerOrder,String> {
}
