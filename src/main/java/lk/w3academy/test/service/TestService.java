package lk.w3academy.test.service;

import lk.w3academy.test.entity.Test;

import java.util.List;

public interface TestService{

  List<Test> findAll();
  Test findById(Integer id);
  Test persist(Test test);
  boolean delete(Integer id);
  List<Test> search(Test test);

}
