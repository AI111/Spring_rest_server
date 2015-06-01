package com.sasha.server.service;

import com.sasha.server.repository.GeoPoint;
import com.sasha.server.repository.GeoPointRepository;
import com.sasha.server.repository.Guide;
import com.sasha.server.repository.GuideRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by sasha on 31.05.15.
 */
public class ApplicationService {
    static final Logger logger = LoggerFactory.getLogger(ApplicationService.class);

    @Autowired
    GuideRepository guideRepository;

    @Autowired
    GeoPointRepository geoPointRepository;

    @Transactional
    public List<Guide> findAllGudes() {
        List<Guide> guides = guideRepository.getAllGuides();
        logger.debug("findAllGudes return {}", guides);
        return guides;
    }

    @Transactional
    public Guide findOneGuide(Long id) {
        logger.debug("findOneGuide return {}", id);
        return guideRepository.getGuide(id);
    }

    @Transactional
    public List<GeoPoint> findAllPoints() {
        List<GeoPoint> guides = geoPointRepository.getAllGeoPoints();
        logger.debug("findAllPoints return {}", guides);
        return guides;
    }

    @Transactional
    public GeoPoint findOnePoint(Long id) {
        logger.debug("findOne return {}", id);
        return geoPointRepository.getGeoPoint(id);
    }

    public Long create(Guide resource) {
        return null;
    }

    public void update(Guide resource) {
    }

    public void deleteById(Long id) {
    }

}
