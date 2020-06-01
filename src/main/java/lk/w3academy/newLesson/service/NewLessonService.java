package lk.w3academy.newLesson.service;

import lk.w3academy.newLesson.dao.NewLessonDao;
import lk.w3academy.newLesson.entity.NewLesson;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewLessonService {

    private final NewLessonDao newLessonDao;

    public NewLessonService(NewLessonDao newLessonDao) {
        this.newLessonDao = newLessonDao;
    }

    public List<NewLesson> findAll() {
        return newLessonDao.findAll();
    }

    public NewLesson findById(Integer id) {
        return newLessonDao.getOne(id);
    }

    public NewLesson persist(NewLesson newLesson){
        return newLessonDao.save(newLesson);
    }

    public void delete(Integer id){
        newLessonDao.deleteById(id);
    }
    //1.create
    //2.read
    //3.update
    //4.delete
    //create = save, update = persist

}
