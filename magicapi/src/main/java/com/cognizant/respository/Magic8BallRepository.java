package com.cognizant.respository;

import com.cognizant.model.Magic8Ball;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Magic8BallRepository extends JpaRepository<Magic8Ball, Integer> {
}
