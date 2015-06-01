package com.sasha.server.controller;




import com.sasha.server.repository.Guide;
import org.junit.Test;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by sasha on 31.05.15.
 */
public class GuideControllerTest {



    @Test
    public void testFindAll() throws Exception {
       Guide[] cityGuides=null;
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
        try {
            cityGuides =restTemplate.getForObject( "http://192.168.0.101:8080/guides", Guide[].class);

        } catch (Exception e) {
            //Toast.makeText(getActivity(),"Connection errror",Toast.LENGTH_SHORT).show();
            e.printStackTrace();

        }
        ArrayList<Guide> list = new ArrayList<Guide>(Arrays.asList(cityGuides));
        System.out.println(list);
        assertNotNull(cityGuides);
    }

    @Test
    public void testFindOne() throws Exception {
        Guide guide = null;

    }
}