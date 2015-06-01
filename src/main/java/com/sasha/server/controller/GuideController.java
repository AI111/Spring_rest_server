package com.sasha.server.controller;

import com.sasha.server.repository.Guide;
import com.sasha.server.service.ApplicationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( value = "/guides" )
class GuideController{
   static final Logger logger = LoggerFactory.getLogger(GuideController.class);

   @Autowired
   ApplicationService service;
 
   @RequestMapping( method = RequestMethod.GET)
   @ResponseBody
   public List<Guide> findAll(){
      logger.trace("  findAll() bigin");
      logger.trace("  findAll() end");
      return service.findAllGudes();
   }
 
   @RequestMapping( value = "/{id}", method = RequestMethod.GET )
   @ResponseBody
   public Guide findOne( @PathVariable( "id" ) Long id ){
      logger.trace("findOne() bigin");
      return  service.findOneGuide( id ) ;
   }
 
   @RequestMapping( method = RequestMethod.POST )
   @ResponseStatus( HttpStatus.CREATED )
   @ResponseBody
   public Long create( @RequestBody Guide resource ){
      return service.create( resource );
   }
 
   @RequestMapping( value = "/{id}", method = RequestMethod.PUT )
   @ResponseStatus( HttpStatus.OK )
   public void update( @PathVariable( "id" ) Long id, @RequestBody Guide resource ){
      service.update( resource );
   }
 
   @RequestMapping( value = "/{id}", method = RequestMethod.DELETE )
   @ResponseStatus( HttpStatus.OK )
   public void delete( @PathVariable( "id" ) Long id ){
      service.deleteById( id );
   }
 
}