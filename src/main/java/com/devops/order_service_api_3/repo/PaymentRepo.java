package com.devops.order_service_api_3.repo;

import com.devops.order_service_api_3.entity.Payment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PaymentRepo extends MongoRepository<Payment,String> {
}
