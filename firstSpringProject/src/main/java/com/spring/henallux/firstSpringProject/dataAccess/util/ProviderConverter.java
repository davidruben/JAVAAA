package com.spring.henallux.firstSpringProject.dataAccess.util;

import com.spring.henallux.firstSpringProject.Model.Correspondant;
import com.spring.henallux.firstSpringProject.Model.Langue;
import com.spring.henallux.firstSpringProject.Model.User;
import com.spring.henallux.firstSpringProject.dataAccess.entity.CorrespondantEntity;
import com.spring.henallux.firstSpringProject.dataAccess.entity.LangueEntity;
import com.spring.henallux.firstSpringProject.dataAccess.entity.UserEntity;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.springframework.stereotype.Component;

@Component
public class ProviderConverter {
    private final MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();

    private final MapperFacade mapper = mapperFactory.getMapperFacade();

    public ProviderConverter() {
        classMapBidirectional(UserEntity.class,User.class);
        classMapBidirectional(CorrespondantEntity.class,Correspondant.class);
    }

    private void classMapBidirectional(Class<?> c1, Class<?> c2) {
        mapperFactory.classMap(c1, c2);
        mapperFactory.classMap(c2, c1);
    }


    public UserEntity userModelToEntity(User user){
        UserEntity userEntity = new UserEntity();
        userEntity.setUsername(user.getUsername());
        userEntity.setPassword(user.getPassword());
        userEntity.setAdresse(user.getAdresse());
        userEntity.setEmail(user.getEmail());
        userEntity.setNom(user.getNom());
        userEntity.setPrenom(user.getPrenom());
        userEntity.setTelephone(user.getTelephone());
        return userEntity;
    }

    public User userEntityToModel(UserEntity userEntity){
        User user= new User();
        user.setUsername(userEntity.getUsername());
        user.setUsername(userEntity.getUsername());
        user.setPassword(userEntity.getPassword());
        user.setAdresse(userEntity.getAdresse());
        user.setEmail(userEntity.getEmail());
        user.setNom(userEntity.getNom());
        user.setPrenom(userEntity.getPrenom());
        user.setTelephone(userEntity.getTelephone());
        return user;
    }

    public LangueEntity langueModelToEntity(Langue langue){
        LangueEntity langueEntity = new LangueEntity();
        langueEntity.setId(langue.getId());
        return langueEntity;
    }

    public Correspondant correspodantEntityToModel(CorrespondantEntity correspondantEntity){
        Correspondant correspondant= mapper.map(correspondantEntity,Correspondant.class);
        return correspondant;
    }

    public Langue langueEntityToModel(LangueEntity langueEntity) {
        Langue langue= mapper.map(langueEntity,Langue.class);
        return langue;
    }


}
