package lk.w3academy.test.service;

import java.util.List;

public interface TestService {
  List<Object> findAll();

  Object findById(Integer id);

  String test();
}
