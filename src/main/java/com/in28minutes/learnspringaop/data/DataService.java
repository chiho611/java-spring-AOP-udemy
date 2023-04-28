package com.in28minutes.learnspringaop.data;

import com.in28minutes.learnspringaop.annotations.TrackTime;
import org.springframework.stereotype.Repository;

@Repository
public class DataService {

    @TrackTime
    public int[] retrieveAllData() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return new int[]{11, 22, 33, 44, 55};
    }
}
