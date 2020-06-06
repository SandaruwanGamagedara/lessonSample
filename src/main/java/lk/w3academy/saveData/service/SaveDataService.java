package lk.w3academy.saveData.service;

import lk.w3academy.saveData.dao.SaveDataRepository;
import lk.w3academy.saveData.entity.SaveData;
import lk.w3academy.util.AbstractService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaveDataService implements AbstractService<SaveData, Integer> {
 /*   // 1. service -> interface
    // 2. serviceImpl -> class

    //find all -|
    //          |-> read
    //find one -|
    //save (persist) -> create and update
    //delete -> delete

    public List<SaveData> findAll() {

    select * from save_data;

        return saveDataRepository.findAll();
    }
*/

    private final SaveDataRepository saveDataRepository;

    public SaveDataService(SaveDataRepository saveDataRepository) {
        this.saveDataRepository = saveDataRepository;
    }


    public List<SaveData> findAll() {
        //read
        return saveDataRepository.findAll();
    }

    public SaveData findById(Integer id) {
        //read
        return saveDataRepository.getOne(id);
    }

    public SaveData persist(SaveData saveData) {
        //create{ not id } and update{ id }
        return saveDataRepository.save(saveData);
    }

    public boolean delete(Integer id) {
        //delete
        saveDataRepository.deleteById(id);
        return true;
    }

    public List<SaveData> search(SaveData saveData) {
        //read
        return null;
    }
}
