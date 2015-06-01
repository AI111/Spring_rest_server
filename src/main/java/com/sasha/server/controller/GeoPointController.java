package com.sasha.server.controller;

import com.sasha.server.repository.GeoPoint;
import com.sasha.server.repository.GeoPoint;
import com.sasha.server.service.ApplicationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by sasha on 31.05.15.
 */
@RestController
@RequestMapping( value = "/points" )
public class GeoPointController {
    static final Logger logger = LoggerFactory.getLogger(GeoPointController.class);

    @Autowired
    ApplicationService service;

    @RequestMapping( method = RequestMethod.GET)
    @ResponseBody
    public List<GeoPoint> findAll(){
        logger.trace("  findAll() bigin");
        logger.trace("  findAll() end");
        return service.findAllPoints();
    }

    @RequestMapping( value = "/{id}", method = RequestMethod.GET )
    @ResponseBody
    public GeoPoint findOne( @PathVariable( "id" ) Long id ){
        logger.trace("findOne() bigin");
        return  service.findOnePoint(id) ;
    }

    @RequestMapping( method = RequestMethod.POST )
    @ResponseStatus( HttpStatus.CREATED )
    @ResponseBody
    public Long create( @RequestBody GeoPoint resource ){
    //    return service.create( resource );
        return null;
    }

    @RequestMapping( value = "/{id}", method = RequestMethod.PUT )
    @ResponseStatus( HttpStatus.OK )
    public void update( @PathVariable( "id" ) Long id, @RequestBody GeoPoint resource ){
      //  service.update( resource );
    }

    @RequestMapping( value = "/{id}", method = RequestMethod.DELETE )
    @ResponseStatus( HttpStatus.OK )
    public void delete( @PathVariable( "id" ) Long id ){
        service.deleteById( id );
    }

}
