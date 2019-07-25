package com.oocl.packagebooking.controller;

import com.oocl.packagebooking.entity.Express;
import com.oocl.packagebooking.service.ExpressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(value = "*")
@RestController
@RequestMapping("/express")
public class ExpressController {

    @Autowired
    private ExpressService expressService;

    @PostMapping(produces = {"application/json"})
    public ResponseEntity addItem(@RequestBody Express express){
        expressService.addExpress(express);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping
    public ResponseEntity getItem(){
        List<Express> allItem=expressService.getExpress();
        return ResponseEntity.ok().body(allItem);
    }

    @PutMapping("/{id}")
    public ResponseEntity updateBookingTimeById(@PathVariable String id){
        expressService.updateBookingTimeById(id);
        return ResponseEntity.ok().build();
    }





}
