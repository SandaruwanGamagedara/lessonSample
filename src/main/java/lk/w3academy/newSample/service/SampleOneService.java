package lk.w3academy.newSample.service;

import lk.w3academy.newSample.dao.SampleOneRepository;
import lk.w3academy.newSample.entity.SampleOne;
import lk.w3academy.util.AbstractService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SampleOneService implements AbstractService<SampleOne, Integer> {
    //find all -|
    //          |-> read
    //find one -|
    //save (persist) -> create and update
    //delete -> delete
/*
    public List<SampleOne> findAll() {
        */
    /*select * from save_data;*//*

        return sampleOneRepository.findAll();
    }
*/

    private final SampleOneRepository sampleOneRepository;

    public SampleOneService(SampleOneRepository sampleOneRepository) {
        this.sampleOneRepository = sampleOneRepository;
    }

    public List<SampleOne> findAll() {
        return sampleOneRepository.findAll();
    }

    public SampleOne findById(Integer id) {
        return sampleOneRepository.getOne(id);
    }

    public SampleOne persist(SampleOne saveData) {
        return sampleOneRepository.save(saveData);
    }

    public boolean delete(Integer id) {
        sampleOneRepository.deleteById(id);
        return true;
    }

    public List<SampleOne> search(SampleOne saveData) {
        return null;
    }
}
