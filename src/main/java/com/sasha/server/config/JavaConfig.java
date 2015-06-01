package com.sasha.server.config;

import com.sasha.server.repository.*;
import com.sasha.server.service.ApplicationService;
import org.springframework.context.annotation.*;

import java.util.List;

/**
 * Created by sasha on 5/14/15.
 */
@Configuration
@ImportResource("beans.xml")
public class JavaConfig {

    @Bean
    @Scope(value = "singleton")
    public GuideRepository guideRepository(){
        return new GuideRepositoryImpl();
    }

    @Bean
    @Scope(value = "singleton")
    public GeoPointRepository geoPointRepository(){
        return new GeoPointRepositoryImpl();
    }

    @Bean
    @Scope
    public ApplicationService service(){
        return  new ApplicationService();
    }

}
