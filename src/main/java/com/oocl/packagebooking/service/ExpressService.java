package com.oocl.packagebooking.service;

import com.oocl.packagebooking.entity.Express;
import com.oocl.packagebooking.repository.ExpressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpressService {

    @Autowired
    private ExpressRepository expressRepository;

    public void addExpress(Express express) {
       expressRepository.saveAndFlush(express);
    }

    public List<Express> getExpress() {
        return expressRepository.findAll();
    }

    public void deleteById(String id) {
        expressRepository.deleteById(id);
    }

    public void updateBookingTimeById(String id) {
//        expressRepository.updateBookingTimeById(id);
    }
}
