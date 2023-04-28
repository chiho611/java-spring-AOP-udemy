package com.in28minutes.learnspringaop.business;

import com.in28minutes.learnspringaop.data.DataService;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class BusinessService {

    private DataService dataService;

    public BusinessService(DataService dataService) {
        this.dataService = dataService;
    }

    public int findMax() {
        int[] data = dataService.retrieveAllData();

        //throw new RuntimeException("Something Went Wrong");
        return Arrays.stream(data).max().orElse(0);
    }

}
