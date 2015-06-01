package com.sasha.server.repository;

import java.util.List;
import java.util.Set;

/**
 * Created by sasha on 30.05.15.
 */
public interface GeoPointRepository {
    void createGeoPoint(GeoPoint employee);
    void createGeoPoint(Set<GeoPoint> employee);
    GeoPoint getGeoPoint(long id);
    void editGeoPoint(GeoPoint updatedEntity);
    void removeGeoPoint(GeoPoint updatedEntity);
    List<GeoPoint> getAllGeoPoints();
}
