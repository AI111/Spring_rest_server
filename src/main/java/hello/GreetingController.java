package hello;

/**
 * Created by sasha on 12/20/14.
 */
import java.util.concurrent.atomic.AtomicLong;

import com.sasha.server.Application;
import com.sasha.server.repository.GeoPoint;
import com.sasha.server.repository.Guide;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class  GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();


    @RequestMapping(value = "/getCities")
    public Guide[] getCities(@RequestParam(value="id", defaultValue="007") String id){
        return Application.cities;
    }
    @RequestMapping("/getPoints")
    public GeoPoint[] getPoints(@RequestParam(value="id", defaultValue="0") int id){
        System.out.println("City id ="+id);
        return Application.points;
    }
}