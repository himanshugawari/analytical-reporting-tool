package com.himanshu.art.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.himanshu.art.entity.Item;


public interface ItemRepository extends JpaRepository<Item, Integer> {

}
