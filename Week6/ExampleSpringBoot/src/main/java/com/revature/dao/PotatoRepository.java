package com.revature.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.bean.Potato;

@Repository
public interface PotatoRepository extends JpaRepository<Potato, Integer> {

}
