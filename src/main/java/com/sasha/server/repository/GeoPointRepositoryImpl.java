package com.sasha.server.repository;

import org.hibernate.SessionFactory;
import org.jboss.logging.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

/**
 * Created by sasha on 30.05.15.
 */
public class GeoPointRepositoryImpl implements GeoPointRepository {
    static final org.slf4j.Logger logger = LoggerFactory.getLogger(GeoPointRepositoryImpl.class);

    @Autowired
    SessionFactory sessionFactory;

    public GeoPointRepositoryImpl() {
    }


    public GeoPointRepositoryImpl(SessionFactory sessionFactory){
        this.sessionFactory=sessionFactory;
    }
    public void createGeoPoint(GeoPoint employee) {
        logger.trace("createGeoPoint begin with Employ = {}",employee);
        sessionFactory.getCurrentSession().save(employee);
        logger.trace("createGeoPoint end");

    }
    @Transactional
    public void createGeoPoint(Set<GeoPoint> employee) {
        logger.trace("createGeoPoint begin with Employs = {}",employee);
        for(GeoPoint e:employee)sessionFactory.getCurrentSession().save(e);
        logger.trace("createGeoPoint end");
    }
    public GeoPoint getGeoPoint(long id) {
        logger.trace("getGeoPoint begin with id = {}",id);
        logger.trace("getGeoPoint end");
        return (GeoPoint)  sessionFactory.getCurrentSession().get(GeoPoint.class,id);

    }

    public void editGeoPoint(GeoPoint updatedEntity) {
        logger.trace("editGeoPoint() begin wihh updatedEntity ={}",updatedEntity);
        sessionFactory.getCurrentSession().update(updatedEntity);
        logger.trace("editGeoPoint() end");
    }

    public void removeGeoPoint(GeoPoint updatedEntity) {
        logger.trace("getAllGeoPoints() begin with updatedEntity = {}",updatedEntity);
        sessionFactory.getCurrentSession().delete(updatedEntity);
        logger.trace("getAllGeoPoints() end");
    }

    public List<GeoPoint> getAllGeoPoints() {
        logger.trace("getAllGeoPoints() begin ");
        logger.trace("getAllGeoPoints() end");
        return sessionFactory.getCurrentSession().createQuery( "FROM GeoPoint" ).list();
    }
}
