package lk.w3academy.sadaruwan.service;

import lk.w3academy.sadaruwan.dao.DBSampleDao;
import lk.w3academy.sadaruwan.entity.DBSample;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DBSampleService {
    //create read update delete  CRUD
    //help DBSampleDao ->

    private final DBSampleDao dbSampleDao;

    public DBSampleService(DBSampleDao dbSampleDao) {
        this.dbSampleDao = dbSampleDao;
    }

    //1. create 3.update{ id != null}
    public void persist(DBSample dbSample) {
        dbSampleDao.save(dbSample);
    }

    //2. read
    public DBSample findById(Integer id) {
        return dbSampleDao.getOne(id);
    }

    //4. delete
    public void delete(Integer id) {
        dbSampleDao.deleteById(id);
    }

    public List<DBSample> findAll() {
    return dbSampleDao.findAll();
    }
}
