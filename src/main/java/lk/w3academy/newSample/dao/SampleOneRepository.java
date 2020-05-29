package lk.w3academy.newSample.dao;

import lk.w3academy.newSample.entity.SampleOne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SampleOneRepository extends JpaRepository<SampleOne, Integer>{
}
