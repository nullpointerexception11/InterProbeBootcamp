package com.interprobe.interprobebootcamp.customer.dao;

import com.interprobe.interprobebootcamp.customer.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author theLostCode
 * @Date 7/4/2022
 */
@Repository
public interface CustomerDao extends JpaRepository<Customer, Long> {
}
