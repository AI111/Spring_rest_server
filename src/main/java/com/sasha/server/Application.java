package com.sasha.server;

/**
 * Created by sasha on 12/20/14.
 */
import com.sasha.server.config.JavaConfig;
import com.sasha.server.repository.GeoPoint;
import com.sasha.server.repository.GeoPointRepository;
import com.sasha.server.repository.Guide;
import com.sasha.server.repository.GuideRepository;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;

@ComponentScan
@EnableAutoConfiguration
public class Application {
    public static final GeoPoint[] points={
//            new GeoPoint("Одеський національний академічний театр опери та балету", GeoPoint.PointType.HOTEL,"description","text",new String[]{"opera-theater.jpg","3650.JPG","caption.jpg"},"10. Железный.mp3",46.485438, 30.741124),
//            new GeoPoint("Одеська обласна філармонія", GeoPoint.PointType.HOTEL,"description","text",new String[]{"743366248.jpeg","odessa_philarmony.jpg","img-11271856482.jpg"},"10. Железный.mp3",46.480634, 30.742840),
//            new GeoPoint("СТЕЙКХАУЗ", GeoPoint.PointType.HOTEL,"description","text",new String[]{"timthumb.jpg",  "timthumb1.jpg"},"10. Железный.mp3",46.484419, 30.735991),
//            new GeoPoint("Одесский музей западного и восточного искусства", GeoPoint.PointType.HOTEL,"description","text",new String[]{"muzey_zapadnogo1.jpg" , "10.jpg"},"10. Железный.mp3",46.482622, 30.743108)};
            new GeoPoint("Одеський національний академічний театр опери та балету", GeoPoint.PointType.HOTEL,"description","text",
                    new HashSet<String>(Arrays.asList(new String[]{"opera-theater.jpg","3650.JPG","caption.jpg"})),"10. Железный.mp3",46.485438, 30.741124),

            new GeoPoint("Одеська обласна філармонія", GeoPoint.PointType.HOTEL,"description","text",
                    new HashSet<String>(Arrays.asList( new String[]{"743366248.jpeg","odessa_philarmony.jpg","img-11271856482.jpg"})),"10. Железный.mp3",46.480634, 30.742840),

            new GeoPoint("СТЕЙКХАУЗ", GeoPoint.PointType.HOTEL,"description","text",
                    new HashSet<String>(Arrays.asList( new String[]{"timthumb.jpg",  "timthumb1.jpg"})),"10. Железный.mp3",46.484419, 30.735991),

            new GeoPoint("Одесский музей западного и восточного искусства", GeoPoint.PointType.HOTEL,"description","text",
                    new HashSet<String>(Arrays.asList( new String[]{"muzey_zapadnogo1.jpg" , "10.jpg"})),"10. Железный.mp3",46.482622, 30.743108)
    };

   public static final Guide[] cities = new Guide[]{
   //         new Guide(1,"Odessa", "description", "url", (byte) 5,"cashUri",new Date()),
   //         new Guide(2,"Odessa", "description", "url", (byte) 5,"cashUri",new Date())
//            new Guide(1,"Odessa Ukraine", "The RecyclerView widget is a more advanced and flexible version of ListView. This widget is a container for displaying large data sets that can be scrolled very efficiently by maintaining a limited number of views. Use the RecyclerView widget when you have data collections whose elements change at runtime based on user action or network events."
//                    , "https://lh4.googleusercontent.com/mpT2fS5KIINuNf34o2-yx-MqWmt2KVMepE_PPb51pBUPoHs9OMPKoUvRYa-gbIpsrN6boRklzXU=w1896-h831", (byte) 5, "urlCash","https://mega.co.nz/#!FEk2TIIb!rhlwEhAj-UC6KIsesfeqzqkyl560SbzSEhlvUu2_bEg",new Date()),
//            new Guide(2,"Odessa", "description", "https://lh6.googleusercontent.com/J7VDWxde_cxmg5XRJ1wVXxcO1fpn0m2QA4kocOg0Il6v3FjmV0RJviZQdL8Ki3Sx5wPdtkISqG8=w1896-h831", (byte) 5, "urlCash","mapCash",new Date()),
//            new Guide(3,"Odessa", "description", "https://lh5.googleusercontent.com/JoX1VMZFRK3BBZTenVtQMKFAYRqCnWaxDXtcvOc74nmX4sr8laC3VybJZhR4iBPNwfheZvNTGQI=w1896-h831", (byte) 5, "urlCash","mapCash",new Date()),
//            new Guide(4,"Odessa", "description", "https://lh5.googleusercontent.com/9EX6XTHS8cy01NKYo4-bvI1f18p4iPotJ3RBKeLwx9MYlMLujNnNuSDGkXqt8zn8h7Xh46jiA0s=w1896-h831", (byte) 5, "urlCash","mapCash",new Date()),
//            new Guide(5,"Odessa", "description", "https://lh5.googleusercontent.com/wucda5xvvkeW09P-JCLJAAezaMHy2e6Ig2g0VHakM9MDaKnqggw0qbzexkgoYk6On1Z8dMA88PY=w1896-h831", (byte) 5, "urlCash","mapCash",new Date()),
//            new Guide(6,"Odessa", "description", "https://lh5.googleusercontent.com/1rIaHGeVDFnORoK_2QZot4jljHx9Q6WKtc4P9pq4ozT60weRvGQ-brnaKSC8JV9bIZE0IOzqJbE=w1896-h831", (byte) 5, "urlCash","mapCash",new Date()),
//            new Guide(7,"Odessa", "description", "https://lh5.googleusercontent.com/K-4eyhQiumzugfnOKWa4ApRIvRzj90nQpD50rBC7uB-Fdnbh-qxN2mKML-hueLRDbaqDk2stq84=w1896-h874" , (byte) 5, "urlCash","mapCash",new Date())
           new Guide("Odessa", 46.46901973, 30.7406044, "The RecyclerView widget is a more advanced and flexible version of ListView. " +
                   "This widget is a container for displaying large data sets that can be scrolled very efficiently by " +
                   "maintaining a limited number of views. Use the RecyclerView widget when you have data collections whose elements change at runtime based on user action or network events.\n" +
                   "\n" +
                   "The RecyclerView class simplifies the display and handling of large data sets by providing:\n" +
                   "\n" +
                   "Layout managers for positioning items\n" +
                   "Default animations for common item operations, such as removal or addition of items\n" +
                   "You also have the flexibility to define custom layout managers and animations for RecyclerView widgets.The adapter provides access to the items in your data set, creates views for items, and replaces the content of some of the views with new data items when the original item is no longer visible. The following code example shows a simple implementation for a data set that consists of an array of strings displayed using TextView " +
                   "widgets:"
                   , "https://lh5.googleusercontent.com/-_KVTFQacp3M/VM6bDTC5TZI/AAAAAAAAEGQ/eTr1wep-MT8/w280-h210-no/IMG_20130822_221423.JPG","https://lh6.googleusercontent.com/-hWrHTKA8dsg/UhdiOTmhNwI/AAAAAAAAA40/jCx8Hvd-3FU/w1148-h861-no/IMG_20130822_221423.JPG", (byte) 5, "https://mega.co.nz/#!8Y1DVBTY!E2Nztgn5Nqsjt6E6R_8ehkjZ7aM0DnrqnkQkV7coEfk","https://mega.co.nz/#!NJEHDZbC!_RnqWf-V0hPDfv43wAsUXRbBWi58QDh4-tgkh9v2AlI",new Date()),
           new Guide("Lviv",46.475137, 30.740480, "description", "https://lh3.googleusercontent.com/-7-3FPBNYa1I/VM6bDaMpWSI/AAAAAAAAEGc/Sq6xqZmzyKc/w280-h210-no/IMG_20140128_165152.jpg","https://lh3.googleusercontent.com/-uBoUoxp7UlI/UulvyaCs4FI/AAAAAAAABvM/-AsvxSpV6z0/w1148-h861-no/IMG_20140128_165152.jpg", (byte) 5, "urlCash","https://mega.co.nz/#!FEk2TIIb!rhlwEhAj-UC6KIsesfeqzqkyl560SbzSEhlvUu2_bEg",new Date()),
           new Guide("Kiev",46.475137, 30.740480, "description", "https://lh4.googleusercontent.com/-0KjaKBQABOw/VM6bDFsNdBI/AAAAAAAAEGU/pYdjBOsWHFU/w280-h210-no/IMG_20140712_065329.jpg","https://lh4.googleusercontent.com/-azMH99iPn54/U8EgSHUKp_I/AAAAAAAAC2o/dJSlhP1QDu4/w1148-h861-no/IMG_20140712_065329.jpg", (byte) 5, "https://mega.co.nz/#!FEk2TIIb!rhlwEhAj-UC6KIsesfeqzqkyl560SbzSEhlvUu2_bEg","dataCash",new Date()),
           new Guide("Ivano-Frankivsk",46.475137, 30.740480, "description", "https://lh3.googleusercontent.com/-bP5EKroOzj8/VM6bDjYgEbI/AAAAAAAAEGM/GGnCYfr9R_c/w280-h210-no/IMG_20140712_083445.jpg","https://lh6.googleusercontent.com/-Qwqhx0tlkoA/U8EgdZaBRcI/AAAAAAAAC3Y/UDbwxISQvNA/w1148-h861-no/IMG_20140712_083445.jpg", (byte) 5, "https://mega.co.nz/#!FEk2TIIb!rhlwEhAj-UC6KIsesfeqzqkyl560SbzSEhlvUu2_bEg","dataCash",new Date()),
           new Guide("Kharkiv",46.475137, 30.740480, "description", "https://lh3.googleusercontent.com/-NhZN8TI1HaQ/VM6bD-EBbEI/AAAAAAAAEGI/A-_a23ClueE/w280-h210-no/IMG_20140715_175055.jpg","https://lh5.googleusercontent.com/-2s5UEzq0cxU/U8ersgIt9sI/AAAAAAAADIw/c4AC9x1l8-Q/w1148-h861-no/IMG_20140715_175055.jpg", (byte) 5, "https://mega.co.nz/#!FEk2TIIb!rhlwEhAj-UC6KIsesfeqzqkyl560SbzSEhlvUu2_bEg","dataCash",new Date()),
           new Guide("name5",46.475137, 30.740480, "description", "https://lh5.googleusercontent.com/-KR0PhYddFZs/VM6bEBiYLEI/AAAAAAAAEGA/PzyujSmydbs/w280-h210-no/IMG_20140715_181906.jpg","https://lh3.googleusercontent.com/-dUXkS84RWOI/U8esAXMcSxI/AAAAAAAADLI/eCMHmYJEo1s/w1148-h861-no/IMG_20140715_181906.jpg", (byte) 5, "https://mega.co.nz/#!FEk2TIIb!rhlwEhAj-UC6KIsesfeqzqkyl560SbzSEhlvUu2_bEg","dataCash",new Date()),
           new Guide("TEST",46.475137, 30.740480, "description", "https://lh4.googleusercontent.com/--0rVSTj2r-0/VM6bER3WzBI/AAAAAAAAEGE/EjyYoJT8G4g/w280-h210-no/IMG_20140727_175532.jpg","https://lh4.googleusercontent.com/-hNqkIS-4yf8/U9UumpPQ8XI/AAAAAAAADcw/OTzsHi5g8X8/w1148-h861-no/IMG_20140727_175532.jpg", (byte) 5, "https://mega.co.nz/#!FEk2TIIb!rhlwEhAj-UC6KIsesfeqzqkyl560SbzSEhlvUu2_bEg","https://mega.co.nz/#!NJEHDZbC!_RnqWf-V0hPDfv43wAsUXRbBWi58QDh4-tgkh9v2AlI",new Date())
};
    public static void main(String[] args) {
//        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
//        GuideRepository guideRepository = (GuideRepository)context.getBean("guideRepository");
//        GuideService service = (GuideService)context.getBean("guideService");
//        GeoPointRepository geoPointRepository = (GeoPointRepository)context.getBean("geoPointRepository");
//        cities[0].setPoints(Arrays.asList(points));
//        guideRepository.createGuide(Arrays.asList(cities));
//        geoPointRepository.createGeoPoint(new HashSet<GeoPoint>(Arrays.asList(points)));
//          System.out.println(service.findAll());
          SpringApplication.run(Application.class, args);

    }
}