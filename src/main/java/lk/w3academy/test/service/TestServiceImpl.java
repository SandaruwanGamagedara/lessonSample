package lk.w3academy.test.service;

import lk.w3academy.test.dao.TestDao;
import lk.w3academy.test.entity.Test;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {
private final TestDao testDao;

    public TestServiceImpl(TestDao testDao) {
        this.testDao = testDao;
    }

    @Override
    public List<Test> findAll() {
        return testDao.findAll();
    }

    @Override
    public Test findById(Integer id) {
        return testDao.getOne(id);
    }

    @Override
    public Test persist(Test test) {
        return testDao.save(test);
    }

    @Override
    public boolean delete(Integer id) {
        testDao.deleteById(id);
        return false;
    }

    @Override
    public List<Test> search(Test test) {
        return null;
    }
}
