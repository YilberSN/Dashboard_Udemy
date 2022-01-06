package com.repositories;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.OrderRecieved;

@Repository
@Qualifier(value="OrderRecievedRepository")
public interface OrderRecievedRepository extends JpaRepository<OrderRecieved,Long>{

}
