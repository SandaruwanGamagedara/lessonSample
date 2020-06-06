package lk.w3academy.sadaruwan.dao;

import lk.w3academy.sadaruwan.entity.DBSample;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DBSampleDao extends JpaRepository<DBSample, Integer> {

}
