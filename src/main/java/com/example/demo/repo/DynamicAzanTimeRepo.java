package com.example.demo.repo;

import com.exaple.demo.modal.DynamicAzanTime;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DynamicAzanTimeRepo extends MongoRepository<DynamicAzanTime, String> {

    // Find all entries within a date range
    List<DynamicAzanTime> findByCurrentDateBetween(String startDate, String endDate);

    // Find all entries by a specific date
    List<DynamicAzanTime> findByCurrentDate(String currentDate);

    // Custom query to find entries by specific prayer time
    List<DynamicAzanTime> findByFnamaz(String fnamaz);

    // Add more custom queries as needed

}
