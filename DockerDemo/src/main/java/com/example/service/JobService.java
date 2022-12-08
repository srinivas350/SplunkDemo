package com.example.service;
import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.example.entity.JobStatus;
import com.example.entity.Order;
import com.example.util.Mapper;

@Service
public class JobService {

    Logger logger = LogManager.getLogger(JobService.class);

    public JobStatus process(Order order)  {
        logger.info("JobService:process request {} ", Mapper.mapToJsonString(order));
        if (otherApiResults()) {
            //rest call
            return JobStatus.SUCCESS;
        } else {
            return JobStatus.FAILED;
        }
    }

    private boolean otherApiResults() {
        return new Random().nextBoolean();
    }
}