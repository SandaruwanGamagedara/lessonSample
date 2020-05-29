package lk.w3academy.saveData.dao;

import lk.w3academy.saveData.entity.SaveData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaveDataRepository extends JpaRepository<SaveData, Integer> {
}
