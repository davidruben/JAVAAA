package com.spring.henallux.firstSpringProject.dataAccess.dao;

import com.spring.henallux.firstSpringProject.Model.Correspondant;
import com.spring.henallux.firstSpringProject.dataAccess.entity.CorrespondantEntity;
import com.spring.henallux.firstSpringProject.dataAccess.repository.CorrespondantRepository;
import com.spring.henallux.firstSpringProject.dataAccess.util.ProviderConverter;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.*;

@Service
@Transactional
public class CorrespondantDao {

    private CorrespondantRepository  correspondantRepository;
    private ProviderConverter providerConverter;

    public CorrespondantDao(CorrespondantRepository correspondantRepository,ProviderConverter providerConverter) {
        this.correspondantRepository = correspondantRepository;
        this.providerConverter=providerConverter;
    }

    public List<Correspondant> getAllCategories(String langue){
        List<Correspondant> correspondant = new ArrayList<>();
        List<CorrespondantEntity> categories = correspondantRepository.getCategorieByLanguage(langue);
       for(int i = 0;i < categories.size();i++){
           correspondant.add(providerConverter.correspodantEntityToModel(categories.get(i)));
       }
        return correspondant;

    }
}
