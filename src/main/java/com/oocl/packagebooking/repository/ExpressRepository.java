package com.oocl.packagebooking.repository;

import com.oocl.packagebooking.entity.Express;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface ExpressRepository extends JpaRepository<Express,String> {


}
