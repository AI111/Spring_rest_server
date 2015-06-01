package com.sasha.server.repository;

import java.util.List;

/**
 * Created by sasha on 4/28/15.
 */
public interface GuideRepository {
    void createGuide(Guide employee);
    void createGuide(List<Guide> employee);
    Guide getGuide(long id);
    void editGuide(Guide updatedEntity);
    void removeGuide(Guide updatedEntity);
    List<Guide> getAllGuides();


}
