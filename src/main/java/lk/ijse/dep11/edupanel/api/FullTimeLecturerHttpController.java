
package lk.ijse.dep11.edupanel.api;

import org.springframework.web.bind.annotation.*;

// REST controller for handling HTTP requests related to full-time lecturers
@RestController
@RequestMapping("/api/v1/lecturers/full-time")
@CrossOrigin
public class FullTimeLecturerHttpController {

    // Endpoint to handle HTTP PATCH requests for arranging the order of full-time lecturers
    @PatchMapping("/ranks")
    public void arrangeFullTimeLecturersOrder(){
        System.out.println("arrangeFullTimeLecturersOrder()");
    }

    // Endpoint to handle HTTP GET requests for retrieving all full-time lecturers
    @GetMapping
    public void getAllFullTimeLecturers(){
        System.out.println("getAllFullTimeLecturers()");
    }
}