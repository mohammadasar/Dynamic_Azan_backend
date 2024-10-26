package com.example.demo.controller;

import com.exaple.demo.modal.DynamicAzanTime;
import com.example.demo.Service.DynamicAzanTimeService;
import com.example.demo.repo.DynamicAzanTimeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/AzanTime")
public class DynamicAzanTimeController {

    private final DynamicAzanTimeRepo azanTimeRepo;

    @Autowired
    public DynamicAzanTimeController(DynamicAzanTimeRepo azanTimeRepo) {
        this.azanTimeRepo = azanTimeRepo;
    }
    
    @Autowired
    private DynamicAzanTimeService azanTimeService;

    // Get all azan times
//    @GetMapping(value="/gell/all")
//    public List<DynamicAzanTime> getAllAzanTimes() {
//        return azanTimeRepo.findAll();
//    }
    
    @GetMapping("/all")
    public ResponseEntity<List<DynamicAzanTime>> getAllAzanTimes() {
        try {
            List<DynamicAzanTime> azanTimes = azanTimeService.findAllTimes();
            if (azanTimes.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(azanTimes, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<DynamicAzanTime> getAzanTimeById(@PathVariable("id") String id) {
        Optional<DynamicAzanTime> azanTimeData = azanTimeService.getdynamicAzanTimebyId(id);

        if (azanTimeData.isPresent()) {
            return new ResponseEntity<>(azanTimeData.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Get azan time by ID
//    @GetMapping(value="/{id}")
//    public DynamicAzanTime getAzanTimeById(@PathVariable String id) {
//        return azanTimeService.getdynamicAzanTimebyId(id);
//    }

    // Create a new azan time
//    @PostMapping(value="/add")
//    @ResponseStatus(HttpStatus.CREATED)
//    public DynamicAzanTime createAzanTime(@RequestBody DynamicAzanTime azanTime) {
//        return azanTimeService.addTime(azanTime);
//    }
    
    @PostMapping("/add")
    public ResponseEntity<?> addAzanTime(@RequestBody DynamicAzanTime azanTime) {
        try {
        	azanTimeService.addTime(azanTime);
            return new ResponseEntity<>("Azan time added successfully", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
    
    @GetMapping("/page")
    public Page<DynamicAzanTime> getDynamicAzanTimes(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "1") int size) {
        return azanTimeService.getDynamicAzanTime(page, size);
    }
    
    

//    // Update an existing azan time
//    @PutMapping("/{id}")
//    public DynamicAzanTime updateAzanTime(@PathVariable String id, @RequestBody DynamicAzanTime updatedAzanTime) {
//        updatedAzanTime.setId(id); // Ensure the ID is set for update
//        return azanTimeRepository.save(updatedAzanTime);
//    }
//
//    // Delete an azan time by ID
//    @DeleteMapping("/{id}")
//    public void deleteAzanTime(@PathVariable String id) {
//        azanTimeRepository.deleteById(id);
//    }
}
