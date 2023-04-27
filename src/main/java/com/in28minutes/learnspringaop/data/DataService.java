package com.in28minutes.learnspringaop.data;

import org.springframework.stereotype.Repository;

@Repository
public class DataService {

    public int[] retrieveAllData() {
        return new int[]{11, 22, 33, 44, 55};
    }
}
