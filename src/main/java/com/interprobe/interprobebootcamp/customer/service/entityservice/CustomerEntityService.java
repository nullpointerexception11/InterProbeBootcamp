package com.interprobe.interprobebootcamp.customer.service.entityservice;

import com.interprobe.interprobebootcamp.customer.dao.CustomerDao;
import com.interprobe.interprobebootcamp.customer.entity.Customer;
import com.interprobe.interprobebootcamp.generic.service.BaseEntityService;
import org.springframework.stereotype.Service;

/**
 * @author theLostCode
 * @Date 7/5/2022
 */
@Service
public class CustomerEntityService extends BaseEntityService<Customer, CustomerDao> {
    public CustomerEntityService(CustomerDao dao) {
        super(dao);
    }
}
