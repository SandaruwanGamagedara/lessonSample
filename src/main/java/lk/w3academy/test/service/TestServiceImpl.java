package lk.w3academy.test.service;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TestServiceImpl implements TestService {
    @Override
    public List<Object> findAll() {
        System.out.println("find all");
        return null;
    }

    @Override
    public Object findById(Integer id) {
        System.out.println("find by id");
        return null;
    }

    @Override
    public String test() {
        return "null test ";
    }
}
