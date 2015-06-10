package com.sasha.server.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by sasha on 5/14/15.
 */
@Repository
public class GuideRepositoryImpl implements GuideRepository {
    static final Logger logger = LoggerFactory.getLogger(GuideRepositoryImpl.class);

    @Autowired
    SessionFactory sessionFactory;

    public GuideRepositoryImpl() {
    }

    public GuideRepositoryImpl(SessionFactory sessionFactory){
        this.sessionFactory=sessionFactory;
    }
    public void createGuide(Guide guide) {
        logger.trace("createGuide begin with Employ = {}",guide);
        sessionFactory.getCurrentSession().save(guide);
        logger.trace("createGuide end");

    }
    @Transactional
    public void createGuide(List<Guide> guide) {
        logger.trace("createGuide begin with Employs = {}",guide);
        Session session=sessionFactory.getCurrentSession();
        for(Guide e:guide)session.save(e);
        logger.trace("createGuide end");
    }
    public Guide getGuide(long id) {
        logger.trace("getGuide begin with id = {}",id);
        logger.trace("getGuide end");
        return (Guide)  sessionFactory.getCurrentSession().get(Guide.class,id);

    }

    public void editGuide(Guide updatedEntity) {
        logger.trace("editGuide() begin wihh updatedEntity ={}",updatedEntity);
        sessionFactory.getCurrentSession().update(updatedEntity);
        logger.trace("editGuide() end");
    }

    public void removeGuide(Guide updatedEntity) {
        logger.trace("getAllGuides() begin with updatedEntity = {}",updatedEntity);
        sessionFactory.getCurrentSession().delete(updatedEntity);
        logger.trace("getAllGuides() end");
    }

    public List<Guide> getAllGuides() {
        logger.trace("getAllGuides() begin ");
        logger.trace("getAllGuides() end");
        return sessionFactory.getCurrentSession().createQuery( "FROM Guide" ).list();
    }

}
