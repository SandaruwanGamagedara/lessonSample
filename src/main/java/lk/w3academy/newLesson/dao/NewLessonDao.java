package lk.w3academy.newLesson.dao;

import lk.w3academy.newLesson.entity.NewLesson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface NewLessonDao extends JpaRepository <NewLesson, Integer>{

}
