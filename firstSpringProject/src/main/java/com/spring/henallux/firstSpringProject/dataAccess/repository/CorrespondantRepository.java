package com.spring.henallux.firstSpringProject.dataAccess.repository;

import com.spring.henallux.firstSpringProject.dataAccess.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface CorrespondantRepository extends JpaRepository<UserEntity,Integer> {

    @Query("Select correspondant from CorrespondantEntity correspondant where correspondant.langue=language")
    public List<CorrespondantEntity> getCategorieByLanguage(String language);
}